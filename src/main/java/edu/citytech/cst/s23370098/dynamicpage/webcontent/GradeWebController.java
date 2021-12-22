package edu.citytech.cst.s23370098.dynamicpage.webcontent;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.AlphabetsBO;
import edu.citytech.cst.s23370098.dynamicpage.businessobject.GradingBO;
import edu.citytech.cst.s23370098.dynamicpage.model.ABC;
import edu.citytech.cst.s23370098.dynamicpage.model.Grades;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GradeWebController {

    @GetMapping("/grades")
    public String gradeReport(@RequestParam(defaultValue = "All") String letterGrade,  Model model) {

        System.out.println(letterGrade);
        List<Grades> list = new GradingBO().findGrades(letterGrade);
        model.addAttribute("grades", list);
        return "gradingReport";
    }


}
