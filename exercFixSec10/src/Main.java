import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int index =0;
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
            Boolean exist = false;
            exist = hasId(list, id,false);
            if(exist){
                System.out.println("Another user has id, register again!");
                i--;
            }else {
                System.out.println("Balance: ");
                Float balance = sc.nextFloat();
                Pessoa pessoa = new Pessoa(name, id, balance);
                list.add(pessoa);
            }
        }

        int aux;
        System.out.println("Wish it increase salary a employe?\n" +
                "1-Yes\n2-No");
        aux = sc.nextInt();

        if(aux == 1) {
            System.out.println("How funcionary ID: ");
            n = sc.nextInt();
            boolean exist = hasId(list, n, false);
            System.out.println(index);

            if (exist) {
                System.out.println("How much %: ");
                int porcen = sc.nextInt();
                System.out.println(index);
                list.get(index).setNewBalance(porcen);
                System.out.println("Salary is a updated!");
            }
            else{
                System.out.println("Hasn't id!");
            }

        }
        System.out.println("\n--DATES--\n");
        for(Pessoa pessoa : list){
            System.out.println(pessoa);
        }
    }
    public static boolean hasId(List<Pessoa> list, int id, boolean e){
        for(int i = 0; i<list.size();i++){
            if(list.get(i).getId()==id){
                e = true;
                index = i;
            }
        }

        return e;
    }

}