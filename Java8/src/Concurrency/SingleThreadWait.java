import java.util.concurrent.TimeUnit;
import java.time.Instant;
import java.time.Duration;
	
public class SingleThreadWait{

public void loopthrough(int num){

	

		for(int i=num;i>0;i--){
			 
			new Thread(() -> {
				
				Instant start =  Instant.now();
				try { 
					TimeUnit.SECONDS.sleep(10);
				}
				catch(InterruptedException e){} 
			System.out.println(Thread.currentThread().getName());
			Instant end =  Instant.now();
			System.out.println(Duration.between(start, end));
			}).start();
	//System.out.println(Thread.currentThread().getName());
	}
	 
	
}

public static void main(String[] args){

	new SingleThreadWait().loopthrough(5);
}


}