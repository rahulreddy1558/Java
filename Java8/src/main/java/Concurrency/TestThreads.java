class TestThreads implements Runnable { 

@Override
public void run(){
	System.out.println(Thread.currentThread().getName());
	System.out.println("Heloow");
}

public static void main(String[] args){

TestThreads t2 = new TestThreads();
Thread t3 = new Thread(t2);
t3.start();	

TestThread m1 = new TestThread();
m1.start();

TestThread m2 = new TestThread();
m2.k();
m2.start();

}

}

class TestThread extends Thread{
	@Override
	public void run(){
	System.out.println(Thread.currentThread().getName());
	System.out.println("Heloow");
	}

	public int k (){ return 1;}
}