

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
public class test001 {
	private static String str;
	public static void main(String[] args) {
		System.out.println(args[0]);

		File file = new File(args[0], "commodity.lst");
		if (file.exists()) {

			System.out.println("商品定義ファイルは存在します");

		}else {
			System.out.println("商品定義ファイルは存在しません");
		}

		HashMap<String, String> product = new HashMap<String,String>();

		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new  BufferedReader(fr);
			while((str = br.readLine()) !=null) {
				String array[] = str.split(",");
				product.put(array[0],array[1]);
			}

			System.out.println(product.entrySet());
			br.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}