import java.util.concurrent.TimeUnit;
import java.util.*;

public class AppleTree{
	String Treelabel;
	int NumberofApples;

	public AppleTree(String Treelabel){
		this.Treelabel = Treelabel;
		this.NumberofApples = 3;
	}


	public AppleTree(String Treelabel, int NumberofApples){
		this.Treelabel = Treelabel;
		this.NumberofApples = NumberofApples;
	}


	public int pickApples(String workername) {

		try{
			System.out.printf("%s - worker started to pick apples for the tree ->  %s \n",workername,Treelabel);
			 TimeUnit.SECONDS.sleep(1);
			//Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		return NumberofApples;
	}
	@Override
	public String toString(){
		return String.format("%s tree has %d apples",Treelabel,NumberofApples);
	}

	public static AppleTree[] garden(int size){
		AppleTree[] garden = new AppleTree[size];

		for(int i = 0; i < garden.length;i++){
			garden[i] = new AppleTree("Appletree"+i);
		} 

		return garden;

	}

	public static void main (String[] args){

		AppleTree a1 = new AppleTree("Tree1",10);
		a1.pickApples("rv");
		AppleTree[] garden = AppleTree.garden(10);
		System.out.println(Arrays.toString(garden));
		 
		
	}

}