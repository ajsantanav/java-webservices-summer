package edu.citytech.cst.s23370098.dynamicpage.model;

public class EmployeeSalaries {

    private String id;
    private float salary;
    private String status;
    private float taxOwed;
    private float amountOwed;

    public EmployeeSalaries() {
    }

    public EmployeeSalaries(String id, float salary, String status) {
        this.id = id;
        this.salary = salary;
        this.status = status;
    }

    public EmployeeSalaries(String row) {
        String columns[] = row.split(",");
        this.id = columns[0];
        this.salary = Float.parseFloat(columns[1]);
        this.status = columns[2];

    }

    public String getId() {
        return id;
    }

    public float getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public float getTaxOwed() {
        return taxOwed;
    }

    public void setTaxOwed(float taxOwed) {
        this.taxOwed = taxOwed;
    }

    public float getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(float amountOwed) {
        this.amountOwed = amountOwed;
    }

    @Override
    public String toString() {
        return "EmployeeSalaries{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                ", taxOwed=" + taxOwed +
                ", amountOwed=" + amountOwed +
                '}';
    }
}
