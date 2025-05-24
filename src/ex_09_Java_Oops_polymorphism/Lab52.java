package ex_09_Java_Oops_polymorphism;

public class Lab52 {
    public static void main(String[] args) {

        bankaccount b1 = new bankaccount();
        bankaccount b2 = new savingaccount();
        bankaccount b3  = new fdaccount();

        System.out.println("rate on bank ac: "+b1.interestrate());
        System.out.println("rate on savings ac: "+b2.interestrate());
        System.out.println("rate on fd  ac: "+b3.interestrate());

    }
}
