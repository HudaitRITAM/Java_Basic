//FIND THE NUMBER OF WAYS IN WHICH YOU CAN INVITE N PEOPLE TO YOUR PARTY,SINGLE OR IN PAIRS
public class Recursion_invitePeople {
    public static int callGuests(int n) {
        if(n <= 1){
           return 1;
             }
      //single
         int ways1 = callGuests(n-1);

      //pair
         int ways2 = (n-1) *callGuests(n-2);
       return ways1 + ways2;
       }
    public static void main(String args[]) {
      int n=4;
      System.out.println(callGuests(n));
    }

    
}