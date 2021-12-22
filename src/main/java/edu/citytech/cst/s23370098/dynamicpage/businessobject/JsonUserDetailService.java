package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import edu.citytech.cst.s23370098.dynamicpage.model.JSONUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JsonUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        var userBO = new UserBO();
        var userInfo = userBO.getUserInfo(userId);

        if(userInfo == null)
        {
            throw new UsernameNotFoundException("Invalid UserId" + userInfo.getUserId());
        }
        var userDetail = new JSONUserDetails(userInfo);

        return userDetail;
    }
}
