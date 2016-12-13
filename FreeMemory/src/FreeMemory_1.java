/*残りの空きメモリを確認する練習
 スタックとヒープ */

class DataSet{
	int[] data = new int[1000];

}

public class FreeMemory_1 {
	public static void main(String[] args){
		System.out.println("空きメモリサイズ:" + Runtime.getRuntime().freeMemory());
		DataSet[] data = new DataSet[100];
		for(int i = 0; i < 100; i++){
			data[i] = new DataSet();
			System.out.println("生成済みインスタンス数:" + (i + 1) + " 空きメモリサイズ:" +
					Runtime.getRuntime().freeMemory());
		}
	}
}
