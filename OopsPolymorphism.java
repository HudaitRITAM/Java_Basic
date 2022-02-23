//compiler Time Polymorphism 
class Student{
    String name;
    int age;
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name,int age){
        System.out.println(name + " " +age);
    }
   
} 
//-------------------------------------------------------
//Runtime Polymorphism
/*
class Shape{
    public void area(){
        System.out.println("display the area:");
    }
}
class Triangle extends Shape(){
    public void area(int h,int b){
        System.out.println((1/2)*b*h);
    }
}
class Circle extends shape(){
    public void area(int r){
        System.out.println((3.14)*r*r);
    }

}  */



















public class OopsPolymorphism {
    
}
