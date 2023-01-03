package JavaProjects;

import java.util.Scanner;

public class Main {

    static boolean ordering = true;

    public static void Menu(){
        System.out.println("*************** Employee Management System **************"+"\n");

        System.out.println("1. Add Employee "+
                "\n2. View Employee" +
                "\n3. Update Employee"+
                "\n4. Delete Employees"+
                "\n5. View all Employees"+
                "\n6. Exit ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        do{
            Menu();
            System.out.println("\nEnter your Choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee");
                    service.addEmployee();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.getEmployee();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmployee();
                    break;
                case 5:
                    System.out.println("view Employees");
                    service.viewEmployees();
                    break;
                case 6:
                    System.out.println("Thank you for using this application!!");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
            }
        }while (ordering);
        Menu();
    }
}
