public class Tax{

	public static void processTax(int userid){
		
	try{
	for (int i =userid;i> 0 ;i-- ) {Thread.sleep(i);}
	}
	catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args){
		 System.out.println("1");
		 System.out.println(Thread.currentThread().getName());
		new Thread(() -> {processTax(20);}).start();
		 System.out.println("2");
		new Thread(() -> {processTax(40);}).start();
		 System.out.println("3");
	}

}