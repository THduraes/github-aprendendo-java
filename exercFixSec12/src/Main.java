import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Worker> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
        System.out.printf("Enter departament's name: ");
        String departament = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Level: ");
        String wrkLvl = sc.nextLine();
        System.out.printf("Base salary: ");
        Double salary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(wrkLvl), salary, new Department(departament));
        System.out.println("How many contracts this work? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<n;i++){
            System.out.println("Enter contract date: ");
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.printf("Value per hour: ");
            Double ValueHour = sc.nextDouble();
            System.out.printf("Duration (hour): ");
            int duration = sc.nextInt();
            worker.addContract(new HourContract(contractDate, ValueHour, duration));
        }
        sc.nextLine();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        Date date = sdf2.parse(sc.nextLine());
        int month = date.getMonth();
        int year = date.getYear();
        System.out.println(month+1);
        System.out.println(year+1900);
        list.add(worker);
        for(Worker w : list){
            System.out.println("\nWorker: "+w.getName());
            System.out.println("Department: " + w.getDepartment().getName());
            w.income(month+1, year+1900);
        }

    }
}