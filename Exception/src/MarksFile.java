import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class MarksFile {

	public static void main(String[] args) {
		FileReader fe=null;
		try {
			fe=new FileReader("c:/User/Desktop/MarksList");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	finally {
		System.out.println("inside Finally block");
		try {
			fe.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
