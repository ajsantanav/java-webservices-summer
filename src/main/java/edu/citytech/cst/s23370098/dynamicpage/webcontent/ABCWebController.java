package edu.citytech.cst.s23370098.dynamicpage.webcontent;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.AlphabetsBO;
import edu.citytech.cst.s23370098.dynamicpage.model.ABC;
import edu.citytech.cst.s23370098.dynamicpage.model.form.ABCForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ABCWebController {

    @GetMapping("/abc")
    public String getABC() {
        return "alphabets";
    }

    @GetMapping("/abcd")
    public String getABCDynamic(@ModelAttribute ABCForm abcForm, Model model) {
        List<ABC> abcList = new ArrayList<>();
        String cssClass = "abc";


        if (abcForm.getDisplayMode().equalsIgnoreCase("all")) {
            abcList = AlphabetsBO.getAll();
            cssClass= "abc-bigger";
        } else if (abcForm.getDisplayMode().equals("su")) {
            abcList = AlphabetsBO.getABC();
            cssClass = "abc-bigger";
        } else if (abcForm.getDisplayMode().equals("sl")) {
            abcList = AlphabetsBO.getAbc();
            cssClass = "abc-bigger";
        }

        ///Reversed - Exam portion

        else if (abcForm.getDisplayMode().equals("rall")) {
            abcList = AlphabetsBO.getRAll();
        } else if (abcForm.getDisplayMode().equals("rsu")) {
            abcList = AlphabetsBO.getRevABC();
            cssClass = "abc-bigger";
        } else if (abcForm.getDisplayMode().equals("rsl")) {
            abcList = AlphabetsBO.getRevAbc();
            cssClass = "abc-bigger";
        }

        abcForm.setMessage(new Date().toString());
        model.addAttribute("alphabets", abcList);
        model.addAttribute("abcForm", abcForm);
        model.addAttribute("cssClass", cssClass);


        System.out.println(abcForm);


        return "alphabets-dynamic";
    }
}