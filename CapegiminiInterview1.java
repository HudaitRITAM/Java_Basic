// There is a 5 employees,they have their name,age,salary.
//among them whom age is grater than 25 increase their salry by 10% 
import java.util.*;
import java.util.stream.Collectors;
public class CapegiminiInterview1 {
    static class Employee{
        private String name;
        private int age;
        private double salary;

        public Employee(String name,int age,double salary){       //constructor
            this.name = name;
            this.salary = salary;
            this.age = age;
            
        }

        
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
        public String toString(){           //Override
            return "Employee[salary =" + salary +"] ";
        }

    }
    public static void main(String args[]){
        
        List<Employee> employees = new ArrayList<Employee>();

        Employee e1 = new Employee("abc", 22, 40000);
        Employee e2 = new Employee("xyz", 26, 55000);
        Employee e3 = new Employee("mno", 21, 60000);
        Employee e4 = new Employee("pqr", 29, 38000);
        Employee e5 = new Employee("ghi", 28, 48000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        
        System.out.println("Original Salary: ");
        System.out.println(employees);
        
        List<Employee> incrementedSalary =  employees.stream().map(e ->{
            if(e.getAge()>25){
                e.setSalary(e.getSalary()*1.10);
            }
            return e;

        }).collect(Collectors.toList());
        System.out.println("Incremented salary: ");
        System.out.println(incrementedSalary);


    }
}
//INCOMPLETE