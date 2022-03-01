package jpabook.jpashop;

public class CallLombokEx {
    public static void main(String[] args) {
        LombokEx lombokEx = new LombokEx();
        lombokEx.setHello("WELCOME");
        String hello = lombokEx.getHello();
        System.out.println(hello);
    }
}
