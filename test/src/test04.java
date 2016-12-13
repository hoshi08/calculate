import java.util.StringTokenizer;

public class test04 {



	public static void main(String[] args) throws Exception {
	    String str = "abc,,def,ghi,jkl,mno,";
	    StringTokenizer st = new StringTokenizer(str, ",");
	    int i = 0;

	    int[] id1,
		id = new int[5];
	    int[] id = {

	    while (st.hasMoreTokens()) {
	        System.out.println(i++ + " 番目 :" + st.nextToken());
	    }
	}
}
