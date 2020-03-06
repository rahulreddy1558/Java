import java.io.*;
import java.util.Arrays;

public class Filetest{



	public static void main(String[] args){
		System.out.println("asdasd");
		File f1 = new File(".");
		System.out.println(Arrays.toString(f1.listFiles()));
		File[] k = f1.listFiles(new FileFilter(){
			@Override
			public boolean accept(File test){
				return test.isHidden();
			}
		});
		System.out.println(Arrays.toString(k));
		System.out.println(Arrays.toString(f1.listFiles(File::isHidden)));
		

	}
}