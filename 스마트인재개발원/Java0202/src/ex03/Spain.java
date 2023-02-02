package ex03;

public class Spain implements Language {

    @Override
    public String change100() {
        // TODO Auto-generated method stub
        return "\ncambio de 100 : ";
    }

    @Override
    public String change1000() {
        // TODO Auto-generated method stub
        return "\ncambio de 1000 : ";
    }

    @Override
    public String change500() {
        // TODO Auto-generated method stub
        return "\ncambio de 500 : ";
    }

    @Override
    public String inputMoney() {
        // TODO Auto-generated method stub
        return "Haga el favor de poner dinero : ";
    }

    @Override
    public String lackOfMoney() {
        // TODO Auto-generated method stub
        return "No tenemos suficiente dinero.";
    }

    @Override
    public String menu() {
        // TODO Auto-generated method stub
        return "====programa de máquinas expendedoras=====";
    }

    @Override
    public String menuChoice() {
        // TODO Auto-generated method stub
        return "Por favor, elija un menú : ";
    }

    @Override
    public String menuList() {
        // TODO Auto-generated method stub
        return "1.Cola (500) 2. Agua (800) 3. Agua vitaminada (1500)";
    }

}