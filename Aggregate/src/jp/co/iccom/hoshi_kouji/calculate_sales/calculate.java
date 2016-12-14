package jp.co.iccom.hoshi_kouji.calculate_sales;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class calculate {
	private static String str;

	public static void main(String[] args) {
		System.out.println(args[0]);
		File file = new File(args[0], "blanch.lst");
		File file1 = new File(args[0], "commodity.lst");




		// existsはフォルダの存在があるかないかを確認するメソッド
		if (file.exists()) {

			System.out.println("ファイルは存在します");
		} else {
			System.out.println("ファイルは存在しません");
		}

		HashMap<String, String> blanchcode = new HashMap<String, String>();

		// Hashmapを宣言する
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new  BufferedReader(fr);
			while((str = br.readLine()) != null) {
				String array[] = str.split(",");

				if (array[0].matches("^\\d{3}")) {
					System.out.println("チェック結果：OK");
				} else {
					System.out.println("支店定義ファイルが不正です");
				}

				blanchcode.put(array[0], array[1]);
				System.out.println( blanchcode.entrySet());
			}
			br.close();
		} catch(IOException e) {
			System.out.println(e);


		}

			if (file1.exists()) {

				System.out.println("支店定義ファイルは存在します");
		} else {
			System.out.println("支店定義ファイルは存在しません");
		}


		HashMap<String, String> commodity = new HashMap<String,String>();

		try {
			FileReader fr = new FileReader(file1);
			BufferedReader br = new  BufferedReader(fr);
			while((str = br.readLine()) != null) {
				String array[] = str.split(",");
				commodity.put(array[0], array[1]);
			}
			System.out.println( commodity.entrySet());

			br.close();
		} catch(IOException a) {

		}
		}
	}