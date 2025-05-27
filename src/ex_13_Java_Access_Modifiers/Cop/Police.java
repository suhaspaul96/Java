package ex_13_Java_Access_Modifiers.Cop;

public class Police {

    public int gun;
    public String iCard;

    public Police(int gun) {
        this.gun = gun;
    }

   protected void CanIshoot(){

       System.out.println("Yes you can shoot");
    }
}
