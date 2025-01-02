//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Aplication.Banco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco account = new Banco();
        Scanner sc = new Scanner(System.in);
        System.out.println("----WELCOME TO THE BANK----\n\n");
        System.out.println("REGISTER YOUR ACCOUNT...\n");
        System.out.printf("Name of owner account: ");
        String name = sc.nextLine();
        System.out.printf("Number account: ");
        int numberAccount = sc.nextInt();
        System.out.printf("Do you wish deposit money initially?\n1-Yes\n2-No\n\nOption: ");
        int op = sc.nextInt();
        if(op==1){
            System.out.printf("How much: ");
            float balance = sc.nextFloat();
            account = new Banco(name, numberAccount, balance);
            System.out.println("Register sucessful!\n\n");
        } else if (op==2) {
            System.out.println("Your balance initially is 0,0$");
            account = new Banco(name, numberAccount);
            System.out.println("Register sucessful!\n\n");
        }else{
            System.out.println("Option invalid.");
            System.exit(0);
        }
        System.out.println("--Menu Options--");
        do {

            System.out.printf("1-Perform deposity\n2-Make a withdrawal" +
                    "\n3-Change name the account\n4-Exit program\nOption:");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.printf("How much: ");
                    account.addBalance(sc.nextFloat());
                    account.getDate();
                    break;

                case 2:
                    System.out.printf("How much: ");
                    account.delBalance(sc.nextFloat());
                    account.getDate();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.printf("What a new name: ");
                    account.setName(sc.nextLine());
                    account.getDate();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }while (op!=4);
    }
}