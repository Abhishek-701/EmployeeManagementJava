package JavaProjects;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

    HashSet<Employee> empset = new HashSet<>();

    Employee emp1 = new Employee(101 ,"Abhishek" ,21, "Manager","IT",50000);
    Employee emp2 = new Employee(102 ,"Rahul" ,25, "CO","HR",80000);
    Employee emp3 = new Employee(103 ,"Manan" ,24, "Junior Dev","IT",20000);
    Employee emp4 = new Employee(104 ,"Harry" ,27, "Senior Dev","IT",40000);
    Employee emp5 = new Employee(105 ,"Rishi" ,22, "Designer","Marketing",25000);

    Scanner sc = new Scanner(System.in);

    public EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
        empset.add(emp5);
    }

    public void viewEmployees(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }

    public void getEmployee(){
        boolean found = false;
        int id = sc.nextInt();

        for(Employee emp:empset){
            if(id == emp.getId()){
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee does not exist");
        }
    }

    public void updateEmployee(){
        boolean found = false;
        System.out.println("Enter the id to update");
        int employee = sc.nextInt();
        for (Employee emp: empset){
            if(emp.getId()==employee){
                System.out.println("Enter new name: ");
                String newName = sc.next();
                emp.setName(newName);
                System.out.println("Updated details are");
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee does not exist");
        }else{
            System.out.println("Employee details Successfully");
        }

    }

    public void addEmployee(){
        System.out.println("Enter the id :");
        int id = sc.nextInt();
        System.out.println("Enter the name :");
        String name = sc.next();
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        System.out.println("Enter the designation :");
        String designation = sc.next();
        System.out.println("Enter the department :");
        String department = sc.next();
        System.out.println("Enter the salary :");
        double sal = sc.nextDouble();

        System.out.println(empset.add(new Employee(id,name,age,designation,department,sal)));
        System.out.println("Employee added successfully!!");
    }

    public void deleteEmployee(){
        boolean found = false;
        System.out.println("Enter the id to delete");
        int id = sc.nextInt();
        for(Employee emp:empset){
            if(id == emp.getId()){
                empset.remove(emp);
                found =true;
            }
        }
        if(!found){
            System.out.println("Employee does not exist");
        }else{
            System.out.println("Employee deleted successfully");
        }

    }
}
