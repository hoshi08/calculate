

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class test03 {
	public static void main(String[] args) {
		System.out.println(args[0]);

		File file = new File(args[0], "blanch.lst");
		if (file.exists()) {

			// existsはフォルダの存在があるかないかを確認するメソッド
			System.out.println("ファイルは存在します");
		} else {
			System.out.println("ファイルは存在しません");
		}

		try {


			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;


			String str = "001,002,003,004,005";
			StringTokenizer st = new StringTokenizer(str, ",");
		    int i = 0;
		    while (st.hasMoreTokens()) {
		        System.out.println(i++ + st.nextToken());


		        while ((s = br.readLine()) != null) {
					System.out.println(s + "を読み込みました");

				br.close();
			} catch (IOException e) {
			System.out.println(e);
		}
	}


