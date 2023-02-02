package ex03;

public class Korea implements Language {

    @Override
    public String menu() {
        // TODO Auto-generated method stub
        return "====자판기 프로그램====";
    }

    @Override
    public String inputMoney() {
        // TODO Auto-generated method stub
        return "돈을 입력하세요 >>";
    }

    @Override
    public String menuList() {
        // TODO Auto-generated method stub
        return "1.콜라(500) 2.물(800) 3.비타민워터(1500)";
    }

    @Override
    public String menuChoice() {
        // TODO Auto-generated method stub
        return "메뉴를 선택하세요 >>";
    }

    @Override
    public String lackOfMoney() {
        // TODO Auto-generated method stub
        return "잔돈이 부족합니다.";
    }

    @Override
    public String change100() {
        // TODO Auto-generated method stub
        return "\n100원 갯수 : ";
    }

    @Override
    public String change1000() {
        // TODO Auto-generated method stub
        return "\n1000원 갯수 :  ";
    }

    @Override
    public String change500() {
        // TODO Auto-generated method stub
        return "\n500원 갯수 : ";
    }

}
