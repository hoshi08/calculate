//入力 指定フォルダーにデータを保持させる
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOtest {
	public static void main(String [] args) {
		try{
			File file = new File("C:\\test\\test_2.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);

		/*	ArrayList months = new ArrayList();
			months.add("てすと");;
			System.out.println(months.get(0)); */




			for(int i = 0; i < 5; i++) {
				System.out.println("てすと");

			/*	bw.write("[" + i + "]\r\n"); */
				bw.write("aaa \r\n");
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
