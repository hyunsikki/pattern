package pattern.decorator.example.inputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class TestLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int c=0 ;
			InputStream in = new LowerCaseInputStream(
							new BufferedInputStream(new FileInputStream("d:\\test.txt")));

			while((c = in.read()) >= 0){
				System.out.print((char) c);
			}
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
