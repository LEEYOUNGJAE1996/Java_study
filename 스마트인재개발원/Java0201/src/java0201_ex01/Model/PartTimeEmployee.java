package java0201_ex01.Model;

public class PartTimeEmployee extends Employee {
    private int workDay;

    public PartTimeEmployee() {
        System.out.println("직원 고용");
    }

    public PartTimeEmployee(String empId, String name, int pay, int workDay) {
        this.empId = empId;
        this.name = name;
        this.pay = pay;
        this.workDay = workDay;

    }

    @Override
    public int payment() {
        return pay * workDay;
    }

    // getter
    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getPay() {
        return pay;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
