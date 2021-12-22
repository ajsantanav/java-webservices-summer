package edu.citytech.cst.s23370098.dynamicpage.webcontent;


import edu.citytech.cst.s23370098.dynamicpage.businessobject.NumbersBO;
import edu.citytech.cst.s23370098.dynamicpage.model.Numbers;
import edu.citytech.cst.s23370098.dynamicpage.model.form.ABCForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class NumberWebController {

    @GetMapping("/number123")
    public String get123() {
        return "123Design";
    }

    @GetMapping("/numberD123")
    public String getD123(@ModelAttribute ABCForm abcForm, Model model) {
        List<Numbers> num = NumbersBO.get123();
//        List<Numbers> num = new ArrayList<>();
        String cssClass = "abc";
//
//        if (abcForm.getDisplayMode().equals("1")) {
//            num = NumbersBO.get123();
//        }
//        else if (abcForm.getDisplayMode().equals("2")) {
//            num = NumbersBO.getTwo();
//        }
//        else if (abcForm.getDisplayMode().equals("2")) {
//            num = NumbersBO.getThree();
//        }
//        else if (abcForm.getDisplayMode().equals("4")) {
//            num = NumbersBO.getFour();
//        }
//        else if (abcForm.getDisplayMode().equals("4")) {
//            num = NumbersBO.getFive();
//        }
//        else if (abcForm.getDisplayMode().equals("6")) {
//            num = NumbersBO.getSix();
//        }
//        else if (abcForm.getDisplayMode().equals("7")) {
//            num = NumbersBO.getSeven();
//        }
//        else if (abcForm.getDisplayMode().equals("8")) {
//            num = NumbersBO.getEight();
//        }
//        else if (abcForm.getDisplayMode().equals("9")) {
//            num = NumbersBO.getNine();
//        }
//        else if (abcForm.getDisplayMode().equals("10")) {
//            num = NumbersBO.getTen();
//        }
//        else if (abcForm.getDisplayMode().equals("20")) {
//            num = NumbersBO.get20();
//        }
//        else if (abcForm.getDisplayMode().equals("25")) {
//            num = NumbersBO.get25();
//        }
//        else if (abcForm.getDisplayMode().equals("50")) {
//            nums = NumbersBO.get50();
//        }
//        else if (abcForm.getDisplayMode().equals("100")) {
//            num = NumbersBO.get100();
//        }

        abcForm.setMessage(new Date().toString());
        model.addAttribute("numbers", num);
        model.addAttribute("abcForm", abcForm);
        model.addAttribute("cssClass", cssClass);

        System.out.println(abcForm);

        return "123Design-dynamic";
    }


}
