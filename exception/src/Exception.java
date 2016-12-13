/*例外オブジェクト
下記実行結果になった場合例外処理が走る
・実行結果：bの値が0になった場合
┗ArithmeticException（0による割り算）
・実行結果：bの値が5になった場合
┗ArrayIndexOutOfBoundsException（配列のインデックスが範囲を超えた場合）*/

public class Exception {
	public static void main(String[] args){
		int[] scores = new int[5];
		int a = 4;
		int b = (int)(Math.random() * 10);
		System.out.println("b=" + b);
		try{
			int c = a / b;
			System.out.println("cの値は" + c);
			scores[b] = 10;
			System.out.println("処理が正常に行われました");
			}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException型の例外をキャッチしました");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException型の例外をキャッチしました");
			System.out.println(e);
		}
		System.out.println("プログラムを終了します");
		}
	}
