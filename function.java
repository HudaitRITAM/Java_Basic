import java.util.*;
public class function{
    // print the name
  /*  public static void printMyName(String name){
        System.out.println(name);
        return;
    } */
    // add two num
    /* public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum; 
    } */
    // product of two num
   /* public static int calculateProduct(int a,int b){
        return a*b;
    } */
    //factorial of a number
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("Invali Input");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            
            factorial = factorial *i;
        }
       System.out.println(factorial);
       return;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   // int a = sc.nextInt();
    //int b = sc.nextInt();
    //int sum = calculateSum(a,b);//call function
      int n = sc.nextInt();
    //System.out.println("product of two num :"+calculateProduct(a,b));
    calculateFactorial(n);
  }
}