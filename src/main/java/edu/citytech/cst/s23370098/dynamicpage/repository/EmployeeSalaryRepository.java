package edu.citytech.cst.s23370098.dynamicpage.repository;

import edu.citytech.cst.s23370098.dynamicpage.businessobject.RandomNumbers;
import edu.citytech.cst.s23370098.dynamicpage.model.EmployeeSalaries;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalaryRepository {

    public List<EmployeeSalaries> findAll() {

        var list = findAll("S", 1000, 9000);
        list.addAll(findAll("S", 5000, 19000));
        list.addAll(findAll("S", 20_000, 50_000));
        list.addAll(findAll("S", 70_000, 150_000));
        list.addAll(findAll("S", 150_000, 170_000));
        list.addAll(findAll("S", 200_000, 250_000));
        list.addAll(findAll("S", 250_000, 500_000));
        list.addAll(findAll("S", 500_000, 600_000));

        list.addAll(findAll("MFJ", 1000, 9000));
        list.addAll(findAll("MFJ", 5000, 19000));
        list.addAll(findAll("MFJ", 20_000, 50_000));
        list.addAll(findAll("MFJ", 70_000, 150_000));
        list.addAll(findAll("MFJ", 150_000, 170_000));
        list.addAll(findAll("MFJ", 200_000, 250_000));
        list.addAll(findAll("MFJ", 250_000, 500_000));
        list.addAll(findAll("MFJ", 500_000, 600_000));

        list.addAll(findAll("HH", 1000, 9000));
        list.addAll(findAll("HH", 5000, 19000));
        list.addAll(findAll("HH", 20_000, 50_000));
        list.addAll(findAll("HH", 70_000, 150_000));
        list.addAll(findAll("HH", 150_000, 170_000));
        list.addAll(findAll("HH", 200_000, 250_000));
        list.addAll(findAll("HH", 250_000, 500_000));
        list.addAll(findAll("HH", 500_000, 600_000));


        return list;
    }

    private List<EmployeeSalaries> findAll(String status, int start, int end) {

        var list = new ArrayList<EmployeeSalaries>();
        for (int i = 0; i < 18 ; i++) {
            var salary = RandomNumbers.getRandomNumbers(start, end);
            var id = "" + RandomNumbers.getRandomNumbers(100, 600);
            var employee = new EmployeeSalaries(id, salary, status);
            list.add(employee);
        }


        return list;
    }
}
