//Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contain only the method printArea( ) that prints the area of the given shape.

import java.util.*;
class InputScanner{
    Scanner s1=new Scanner(System.in);
}

abstract class Shape extends InputScanner{
double a;
double b;
abstract void getInput();
abstract void displayArea();
}

class Rectangle extends Shape{
       void getInput(){
        System.out.println("enter the value of a");
        a=s1.nextDouble();
        System.out.println("enter the value of b:");
        b=s1.nextDouble();
       }
       void displayArea(){
        System.out.println("area of rectangle is"+(a*b));
       }
    }

class Triangle extends Shape{
    void getInput(){

    System.out.println("enter the value of a");
        a=s1.nextDouble();
        System.out.println("enter the value of b:");
        b=s1.nextDouble();
       }

       void displayArea(){
        System.out.println("area of triangle is"+(a*b/2));
        
       }
}

class Circle extends Shape{
    void getInput(){

    
        System.out.println("enter the value of b:");
        b=s1.nextDouble();
       }

      void displayArea(){
        System.out.println("area of circle is"+ (b*b*3.14));
      
       }
}

class AbstractDemo{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Triangle t=new Triangle();

    
       r.getInput();
       r.displayArea();

       
       c.getInput();
       c.displayArea();
        
        t.getInput();
        t.displayArea();

        System.out.println("name:Sohan T Sanjeev");
        System.out.println("usn:2023BMS02532");

    }
}




