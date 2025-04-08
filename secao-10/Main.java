import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Employee #%d\n", i+1);

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Funcionario(id, name, salary));
            System.out.print("\n");
        }

        System.out.print("Enter the employee id that will have a salary increase: ");
        int id = sc.nextInt();
        List<Funcionario> result = list.stream().filter(Funcionario -> Funcionario.id == id).toList();

        System.out.print("Enter the percentage: ");
        int percent = sc.nextInt();
        result.getFirst().raise(percent);
        System.out.print("\n");

        System.out.println("List of employees:");
        for(Funcionario x : list){
            System.out.println(x);
        }

        sc.close();

    }
}