package java0201_ex01.Model;

public class TempEmployee extends Employee {

    public TempEmployee() {
        System.out.println("직원 고용");
    }

    public TempEmployee(String empId, String name, int pay) {
        this.empId = empId;
        this.name = name;
        this.pay = pay;

    }

    @Override
    public int payment() {
        return pay / 12;
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
