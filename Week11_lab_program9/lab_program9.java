package practice;
class BMS implements Runnable{
	Thread T;
	String Name;
	public BMS(String name){
		this.Name=name;
		T=new Thread(this,this.Name);
		T.start();
	}
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("BMS college of engineering");
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}
}
class CSE implements Runnable{
	Thread t;
	String name;
	CSE(String name){
		this.name=name;
		t=new Thread(this,this.name);
		t.start();
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("CSE");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}

}
public class week11lab {
	public static void main(String[] args) throws Exception {
		new BMS("Thread 1");
		new CSE("Thread 2");
		// t1.join();
		// t2.join();
	}
} 