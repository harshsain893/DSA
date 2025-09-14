package oopsConcept;
public class practice {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);

        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "Harsh";
        // myAcc.password = " jaishreeram";
        myAcc.setPassword("cdmdkemfke");
    }
}

class Bankaccount{
     String username;
     private String password;
     public void setPassword(String pwd){
        password = pwd;
     }
}

class Pen{
    String color;
    int tip;
    //Method to set the color
    void setColor(String newColor){
        color = newColor;
    }
    //Method to set the tip size
    void setTip(int newTip){
        tip = newTip;
    }

    class Student{
        String name;
        int age;
        float percentage;

        void calculatePercentage(int phy, int chem,  int math){
            percentage = (phy + chem + math) / 3;
        }
    }
}
