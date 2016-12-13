/*入出力練習（IO）*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
	public static void main(String[] args) {
		System.out.println("あなたのお名前は");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		try{
			String name = reader.readLine();
			System.out.println("こんにちは" + name + "殿");
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}