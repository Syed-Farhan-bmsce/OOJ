// Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the age and throws the exception WrongAge( ) when the input age<0. In Son class, implement a constructor that cases both father and son’s age and throws an exception if son’s age is >=father’s age.

import java.util.Scanner;

class WrongAge extends Exception{
public WrongAge(String A){
    super(A);
}
}

class Father{
int fatherAge;
Scanner sc=new Scanner(System.in);
public void validAge() throws WrongAge{
System.out.println("Enter Fathers age");
fatherAge=sc.nextInt();
if(fatherAge<=0){
    throw new WrongAge("Invalid fathers age");
}
}
}

class Son extends Father{
int sonAge;
Scanner sc=new Scanner(System.in);
public void validAge() throws WrongAge{
    System.out.println("Enter sons age");
    sonAge=sc.nextInt();
    super.validAge();
    if (sonAge>=fatherAge) {
        throw new WrongAge("Sons age cant be greater than Fathers age");  
    }
    else if(sonAge<0){
        throw new WrongAge("Invalid son age");
    }
}

}

public class Exceptions{
    public static void main(String[] args) {
        Son obj = new Son();
        try{
            obj.validAge();
        }
        catch(WrongAge e){
            System.out.println("Exception "+e.getMessage());
        }
       
    }
}