import java.util.*;

public class condition1 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        //Adult or Not Adult
       /* int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");

        }else{
            System.out.println("Not Adult");
        }*/
        //Even or Odd
       /* int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even");

        }else{
            System.out.println("Odd");
        }*/
        //A,B which Greater
        /*int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("A and B equel");

        }else if(a>b){
                System.out.println("A is greater");
            }
        else{
             System.out.println("B is greater");
            }*/
        //Using Switch Case
        int button=sc.nextInt();
         switch(button){
             case 1:System.out.println("Hello");
             break;
             case 2:System.out.println("Namaste");
             break;
             case 3:System.out.println("Bonjour");
             break;
             default : System.out.println("Invalid Button");
         }



    }

    
}
