/* 
// for student Class
class Student{
    String name;
    int age;
    public void getInfo(){
        System.out.println("The name of the Student is :" + this.name);
        System.out.println("The age of the Student is :" + this.age);
    }
}  */

//for pen class
class Pen{
    String color;
    String type;
    public void penInfo(){
        System.out.println("The color of the pen: " +this.color);
        System.out.println("The type of the pen:" +this.type);
    }
}



public class OopsClassObject {
    public static void main(String args[]){
       /* student class block
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Ritam";
        s1.age = 23;

        s1.getInfo();

        s2.name = "Subham";
        s2.age = 22;

        s2.getInfo(); */

     Pen p1= new Pen();
     Pen p2 = new Pen();
     p1.color = "Blue";
     p1.type = "Ballpoint";

     p1.penInfo();

     p2.color = "Black";
     p2.type = "Gel";
     p2.penInfo();



    }
    
}
