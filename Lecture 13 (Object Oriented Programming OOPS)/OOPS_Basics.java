public class OOPS_Basics {
    public static void main(String[] args) {
        Pen p1 = new Pen();   // create a Pen object called p1
        p1.setColor("Red");
        // System.out.println(p1.color);    // show error because i make color as private
        System.out.println(p1.getColor());
        p1.setTip(4);
        // System.out.println(p1.tip);      // show error because i make tip as private
        System.out.println(p1.getTip());

        Bank_Account myAccount = new Bank_Account();
        myAccount.username = "Kartikeya";
        // myAccount.password = "Kartikeya";   // this not working show error because we try to use private object
        myAccount.setPass("harhar");
    }
}

class Bank_Account{
    public String username;
    private String password;
    protected void setPass(String newPass){
        password = newPass;
    }
}

class Pen {
    private String color;
    private int tip;

    // GETTERS
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    // SETTERS
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}