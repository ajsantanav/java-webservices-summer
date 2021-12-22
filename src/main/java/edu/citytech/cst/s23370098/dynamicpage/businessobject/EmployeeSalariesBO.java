package edu.citytech.cst.s23370098.dynamicpage.businessobject;

import edu.citytech.cst.s23370098.dynamicpage.model.EmployeeSalaries;
import edu.citytech.cst.s23370098.dynamicpage.repository.EmployeeSalaryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeSalariesBO {
    public List<EmployeeSalaries> findAll(String status) {

        EmployeeSalaryRepository es = new EmployeeSalaryRepository();
        List<EmployeeSalaries> list = es.findAll();

        Function<EmployeeSalaries, EmployeeSalaries> ids = id -> {

            id.getId();

            return id;
        };

        Function<EmployeeSalaries, EmployeeSalaries> taxFunction = salary -> {

            if(salary.getStatus().equalsIgnoreCase("S")) {
//                salary.setTaxOwed(0.30f);
                if(salary.getSalary() >= 0 && salary.getSalary() < 9950) {
                    salary.setTaxOwed(.10f);
                }
                else if(salary.getSalary() >= 9950 && salary.getSalary() < 40525) {
                    salary.setTaxOwed(.12f);
                }
                else if(salary.getSalary() >= 40525  && salary.getSalary() < 86375) {
                    salary.setTaxOwed(.22f);
                }
                else if(salary.getSalary() >= 86375  && salary.getSalary() < 164925 ) {
                    salary.setTaxOwed(.24f);
                }
                else if(salary.getSalary() >= 164925  && salary.getSalary() < 209425 ) {
                    salary.setTaxOwed(.32f);
                }
                else if(salary.getSalary() >= 209425  && salary.getSalary() < 523600) {
                    salary.setTaxOwed(.35f);
                }
                else if(salary.getSalary() >= 523600  && salary.getSalary() < 3000000) {
                    salary.setTaxOwed(.37f);
                }
            }

            else if(salary.getStatus().equalsIgnoreCase("MFJ")) {
//                salary.setTaxOwed(0.32f);

                if(salary.getSalary() >= 0 && salary.getSalary() < 19900) {
                    salary.setTaxOwed(.10f);
                }
                else if(salary.getSalary() >= 19900 && salary.getSalary() < 81050) {
                    salary.setTaxOwed(.12f);
                }
                else if(salary.getSalary() >= 81050  && salary.getSalary() < 172750) {
                    salary.setTaxOwed(.22f);
                }
                else if(salary.getSalary() >= 172750  && salary.getSalary() < 329850 ) {
                    salary.setTaxOwed(.24f);
                }
                else if(salary.getSalary() >= 329850  && salary.getSalary() < 418850 ) {
                    salary.setTaxOwed(.32f);
                }
                else if(salary.getSalary() >= 418850  && salary.getSalary() < 628300) {
                    salary.setTaxOwed(.35f);
                }
                else if(salary.getSalary() >= 628300  && salary.getSalary() < 3000000) {
                    salary.setTaxOwed(.37f);
                }


            }
            else if(salary.getStatus().equalsIgnoreCase("HH")) {
//                salary.setTaxOwed(0.35f);
                if(salary.getSalary() >= 0 && salary.getSalary() < 14200) {
                    salary.setTaxOwed(.10f);
                }
                else if(salary.getSalary() >= 14200 && salary.getSalary() < 54200) {
                    salary.setTaxOwed(.12f);
                }
                else if(salary.getSalary() >= 54200  && salary.getSalary() < 86350) {
                    salary.setTaxOwed(.22f);
                }
                else if(salary.getSalary() >= 86350  && salary.getSalary() < 164900 ) {
                    salary.setTaxOwed(.24f);
                }
                else if(salary.getSalary() >= 164900  && salary.getSalary() < 209400 ) {
                    salary.setTaxOwed(.32f);
                }
                else if(salary.getSalary() >= 209400  && salary.getSalary() < 523600) {
                    salary.setTaxOwed(.35f);
                }
                else if(salary.getSalary() >= 523600  && salary.getSalary() < 3000000) {
                    salary.setTaxOwed(.37f);
                }
            }
            salary.setAmountOwed(salary.getTaxOwed() * salary.getSalary());

            return salary;
        };

        var filterList = list
                .stream()
                .map(taxFunction)
                .filter(e -> e.getStatus().equals(status))
                .collect(Collectors.toList());

        return filterList;

    }
}
