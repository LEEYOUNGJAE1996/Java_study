package java0201_ex01.Model;

public class RegularEmployee extends Employee {
    private int bonus;

    public RegularEmployee() {
        System.out.println("직원 고용");
    }

    public RegularEmployee(String empId, String name, int pay, int bonus) {
        this.empId = empId;
        this.name = name;
        this.pay = pay;
        this.bonus = bonus;

    }

    @Override
    public int payment() {
        return (pay + bonus) / 12;
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
        return bonus;
    }

    public void setWorkDay(int bonus) {
        this.bonus = bonus;
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
