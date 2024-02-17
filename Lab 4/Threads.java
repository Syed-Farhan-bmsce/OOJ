// Write a program which creates two threads, one thread displaying “BMS College of Engineering” once every ten seconds and another displaying “CSE” once every two seconds.

class Bms extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("BMS College of Engineering");
            try{
               Thread.sleep(10000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
     }
}

 class Cse extends Thread{
    public void run(){
        
       for(int i=0;i<10;i++){
          System.out.println("cse");
           try{
              Thread.sleep(2000);
           }
           catch(InterruptedException e){
               System.out.println(e);
           }
           
       }
    }
}

public class Threads{
    public static void main(String args[]){
        Bms b=new Bms();
        Cse c=new Cse();
        b.start();
        c.start();
}
}