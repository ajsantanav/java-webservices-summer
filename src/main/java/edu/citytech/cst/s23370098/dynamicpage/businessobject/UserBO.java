package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import com.citytech.basicsecurity.SimpleEncryption;
import com.citytech.basicsecurity.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jbbwebsolutions.helper.EnvironmentUtility;
import com.jbbwebsolutions.helper.FileUtility;
import org.springframework.core.env.Environment;

import java.util.function.Function;

public class UserBO {

    final static String SECURITY_DIRECTORY = EnvironmentUtility.get("CST_4713_SECURITY");
//            "C:\\summer2021\\studentSecurity\\";

    private int loginAttempts = 0;

    private static Function<String, User> mapFunction = json -> {
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        return user;
    };

    public User getUserInfo(String userId) {
        String fileName = SECURITY_DIRECTORY + userId + ".json";
        User user = FileUtility.readAFile(fileName, mapFunction);
        return user;
    }

    public boolean isAuthenticated(String userId, String password) {
        User user = getUserInfo(userId);
//        loginAttempts = user.getLoginAttempts();
        String encryptedPassword = user.getEncryptedPassword();
        boolean status = SimpleEncryption.verifyPassword(password, encryptedPassword);


        if (status == false) {
            ++loginAttempts;
            user.setLoginAttempts(loginAttempts);
            if (loginAttempts >= 3) {
                user.setLoginAttempts(loginAttempts);
                user.setDisabled(true);
                updateFile(user);
            }
        }

        return status;
    }

    public void updateFile(User user) {
        String fileName = SECURITY_DIRECTORY + user.getUserId() + ".json";

        GsonBuilder builder = new GsonBuilder();

        Gson prettyGson = builder.setPrettyPrinting().create();

        String jsonContent = prettyGson.toJson(user);

        FileUtility.writeContent(fileName, jsonContent);

        System.out.println(user);
    }
}
