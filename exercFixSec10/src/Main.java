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
        System.out.println("\n---DATES---\n");
        for(Pessoa pessoa : list){
            System.out.println(pessoa);
        }
    }
    //FUNCAO COM UMA VÁRIAVEL GLOBAL #STATIC INDEX QUE PODE SER
    // ALTERADA EM QUALQUER FUNCAO DENTRO DA CLASSE MAIN (nao conhecia, aprendi ontem 04/01
    // POIS QUERIA QUE UMA FUNCAO RETORNASSE 2 VALORES
    public static boolean hasId(List<Pessoa> list, int id, boolean e){
        for(int i = 0; i<list.size();i++){
            if(list.get(i).getId()==id){
                e = true;
                index = i;
            }
        }

        return e;
    }
    // DESSA MANEIRA É PRECISO FAZER A VERIFICACAO NO IF(!= -1) QUANDO FOR USAR
    // NO MOMENTO QUE DESEJA ENCONTRAR SE JÁ EXISTE UM USER ID. E QUANDO QUISER O INDICE
    // SO USAR O RETORNO DA FUNCAO
    public static int hasId(List<Pessoa> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i; // Retorna o índice encontrado
            }
        }
        return -1; // Retorna -1 se não encontrar
    }

}