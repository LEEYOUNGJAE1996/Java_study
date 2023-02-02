package ex03;

public class English implements Language {
    @Override
    public String menu() {
        // TODO Auto-generated method stub
        return "====Vending Machine====";
    }

    @Override
    public String inputMoney() {
        // TODO Auto-generated method stub
        return "enter the money >>";
    }

    @Override
    public String menuList() {
        // TODO Auto-generated method stub
        return "1.cola(500) 2.water(800) 3.vitamine water(1500)";
    }

    @Override
    public String menuChoice() {
        // TODO Auto-generated method stub
        return "choice one >>";
    }

    @Override
    public String lackOfMoney() {
        // TODO Auto-generated method stub
        return "lack of money";
    }

    @Override
    public String change100() {
        // TODO Auto-generated method stub
        return "\n100wons : ";
    }

    @Override
    public String change1000() {
        // TODO Auto-generated method stub
        return "\n1000wons :  ";
    }

    @Override
    public String change500() {
        // TODO Auto-generated method stub
        return "\n500wons : ";
    }
}