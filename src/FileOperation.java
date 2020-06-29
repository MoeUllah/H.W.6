import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {

	public static void main(String [] args) {
		
		String line;
		BufferedReader reader=null;
		
		try {
			reader=new BufferedReader(new FileReader("C:\\Users\\Shakat\\file1.txt"));
			
			try {
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("In the finally block.");
			if(reader!=null)
				try {
					reader.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			
		}
		
		
	}
}
