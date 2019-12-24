import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantLock;

public class FieldVisibility{
	volatile static int x = 1;
	ReentrantLock lock = new ReentrantLock();

	public static void writerthread(){
		 
		new Thread(() -> {
			x++;
			System.out.println(Thread.currentThread().getName()+"||"+"write"+"||"+x);
		}).start();
		 
		
	}

	public static int readerthread(){
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName()+"||"+"read"+"||"+x); 
		}).start();
		 return x;	 
	}

	public static void main(String[] args){
		for(int i = 0; i< 20;i++){
		System.out.println("START"+i); 
		writerthread();
		readerthread();  
		System.out.println("END"+i); 

		}
	
	}
}