/*________________________ABSTRACT CLASS____________________
abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat() {
        System.out.println("Animal eats");

    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
} */
/*____________________________INTERFACE______________________________
interface Animal{
    void walk();
}
interface Herbivore {

}
class Horse implements Animal, Herbivor {   //multiple Inheritance,(its not with class but with interface its posible)
    public void walk(){
        System.out.println("walk on legs");
    }
} 
public class AbstractClass {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
}
}
*/

class Student {
    String name;
    static String school;
}

public class AbstractClass {
    public static void main(String args[]){
        Student.school = "JVM";
        Student student1 = new Student();
        student1.name ="Ritam";
        System.out.println(student1.school);
}
}
