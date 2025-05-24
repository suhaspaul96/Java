package ex_12_Java_Oops_Encapsulation;

public class Lab54 {

    public static void main(String[] args) {

        bankaccount suhas = new bankaccount("suhasraje", 10);
        System.out.println(suhas.getBal());

        boolean isCashier = true;
        suhas.setBal(100, isCashier);
        System.out.println(suhas.getBal());
    }
}

class bankaccount {

    private String name;
    private int bal;

    public bankaccount(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to set the balance");
        }
    }
}