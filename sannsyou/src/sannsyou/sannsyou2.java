package sannsyou;

class Point {
	int x;
	int y;
}

class sannsyou2 {
	public static void main(String[] args){
		Point[] points = new Point[10];
		for(int i = 0; i < 8; i++){
			points[i] = new Point();
			points[i].x = i;
			points[i].y = i*i;
		}
		for(int i = 1; i < 10; i++){
			if(points[i] == null){
				System.out.println("points["+ i + "]は参照がありません");

			} else {
				System.out.println("points["+ i + "]の座標は(" + points[i].x + "," + points[i].y + ")");
			}
		}
	}
}