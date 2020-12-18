package practice;
class Table{
    int n;
    synchronized void SetTable(int n) {
        this.n=n;
    }
    synchronized void printable(){
        int i=1;
        while(i<11){
            System.out.println(n+"x"+i+"="+(n*i));
            i++;
        }
    }
}
public class labprogram9 {
    public static void main (String[] args)  {
        Table tab=new Table();
        Thread t=new Thread(()->{
            tab.SetTable(5);
            tab.printable();
        });      
        t.start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                tab.SetTable(100);
                tab.printable();
            }
        }).start();       
    }
}