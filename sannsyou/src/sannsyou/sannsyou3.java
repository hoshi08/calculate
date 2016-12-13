class Point{
	int x;
	int y;

	//現在の座標を表示出力する
	void printPosition(){
		System.out.println("座標は(" + this.x + ", " + this.y + ")です");
		}
}

public class sannsyou3 {
	public static void main(String[] args){
		Point p1 = new Point();
		p1.y = 5;

		Point p2 = new Point();
		p2.x = 5;
		p2.y = 2;

		System.out.println("p1のprintPositionメソッドの呼び出し");
		p1.printPosition();

		System.out.println("p2のprintPositionメソッドの呼び出し");
		p2.printPosition();

		System.out.println("プログラムを終わります");

	}
}

