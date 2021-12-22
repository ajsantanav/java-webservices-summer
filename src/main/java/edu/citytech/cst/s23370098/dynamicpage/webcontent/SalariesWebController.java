package edu.citytech.cst.s23370098.dynamicpage.webcontent;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.EmployeeSalariesBO;
import edu.citytech.cst.s23370098.dynamicpage.model.EmployeeSalaries;
import edu.citytech.cst.s23370098.dynamicpage.model.form.SalaryForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class SalariesWebController {


    @GetMapping("/salaries")
    public String getSalaryDesign(@ModelAttribute SalaryForm salaryForm, Model model) {
        String cssClass = "";

        EmployeeSalariesBO bo = new EmployeeSalariesBO();
        List<EmployeeSalaries> singleList = bo.findAll("S");
        List<EmployeeSalaries> mfjList = bo.findAll("MFJ");
        List<EmployeeSalaries> hhList = bo.findAll("HH");


        model.addAttribute("singleList", singleList);
        model.addAttribute("mfjList", mfjList);
        model.addAttribute("hhList", hhList);
        model.addAttribute("salaryForm", salaryForm);
        model.addAttribute("cssClass", cssClass);

        return "salaries-design";
    }
}
