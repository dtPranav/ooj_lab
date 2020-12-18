package practice;
class Car_queue{
    boolean request=false;
    synchronized void put(){
        if(request){
            try {
                wait();
            } catch (Exception e) {            }
        }   
        System.out.println("Request posted");
        request=true;
        notify();
    }
    synchronized void get(){
        if(!request){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Request collected");
        request=false;
        notify();
    }
}
class Car_Owner implements Runnable{
    Car_queue c;
    Thread t;
    Car_Owner(Car_queue c){
        this.c=c;
        t=new Thread(this);
        t.start();
    }    
    @Override
    public void run() {
        while(true){
            c.put();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            } 
        }
    }
}
class Car_Mechanic implements Runnable{
    Car_queue c;
    Thread t;
    Car_Mechanic(Car_queue c){
        this.c=c;
        t=new Thread(this);
        t.start();
    }       
    @Override
    public void run() {
        while(true){
            c.get(); 
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            } 
        } 
    }
}
public class Interthread {
    public static void main(String[] args) {
        Car_queue c=new Car_queue();
        new Car_Mechanic(c);
        new Car_Owner(c);        
    }    
}
