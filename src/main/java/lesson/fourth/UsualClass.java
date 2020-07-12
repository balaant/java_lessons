package lesson.fourth;

interface InterFace {
    String getStr();
}

class UsualClass extends AbstrClass implements InterFace {
    void strPrint() {
        System.out.println("hi");
    }
    public String getStr() {
        return "HI";
    }

    public static void main(String[] args) {
        new UsualClass().strPrint();
    }
}