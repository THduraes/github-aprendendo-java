package Aplication;
import java.util.Random;

public class Banco {
    private String name;
    private int numberCount;
    private float balance;

    public Banco(){

    }

    public Banco(String name, int numberCount, float balance){
        this.name = name;
        this.numberCount = numberCount;
        this.balance = balance;
    }
    public Banco(String name, int numberCount){
        this.name = name;
        this.numberCount = numberCount;
    }

    public void getDate(){
        System.out.println("--ACCOUNT INFO--\nAccount owner: "+this.name+"\nAccount number: "+this.numberCount+
                "\nAccount balance: "+this.balance+"\n");
    }
    public void setName(String name){
        this.name = name;
    }
    public void addBalance(float balance){
        this.balance += balance;
        System.out.println("Deposit made successfully!\n");
    }
    public void delBalance(float balance){
        this.balance -= balance+5;
        System.out.println("Sake made successfully!\n");
    }
    public String toString(){
        return "Account owner: "+name+"\nNumber Account: "+numberCount+
                "\nBalance Account: "+balance;
    }

}
