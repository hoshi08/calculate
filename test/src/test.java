import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class test {
	public static void main(String[] args) {

		int a = 0;

		 if(a == 0) {



		 File file = new File("C:\\office\\office.txt");
		 file.exists();
		 System.out.println("を保持しました");
		 FileReader fr = new FileReader(file);
		  BufferedReader br = new BufferedReader(fr);
		  String s;
		  while((s = br.readLine()) != null) {
			  System.out.println(s + "を保持しました");
		  }
		 }
	}
}



