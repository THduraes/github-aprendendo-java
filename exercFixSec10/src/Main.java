import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            System.out.println("Balance: ");
            Float balance = sc.nextFloat();
            Pessoa pessoa = new Pessoa(name, id, balance);
            list.add(pessoa);
        }
        for(Pessoa pessoa : list){
            System.out.println(pessoa);
        }
    }
}