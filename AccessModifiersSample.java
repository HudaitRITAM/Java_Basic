/*public class AccessModifiers { */
class Account {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String password){
        this.password = password;
    }
}
public class AccessModifiersSample {
    public static void main(String args[]){
        Account a1 = new Account();
        a1.name = "Ritam";
        a1.setPassword("1234");
        a1.email = "1905797@kiit.ac.in";
    }
}
