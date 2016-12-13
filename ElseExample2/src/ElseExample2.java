
public class ElseExample2 {
    public static void main(String[] args) {
    	int age;
    	age = 60;
    	if(age < 4) {
    		  System.out.println("入場料は無料です");
    	} else if(age < 13) {
    		  System.out.println("子供料金で入場できます");
    	} else if(age < 60) {
    	   	System.out.println("大人料金が必要です");
    	} else {
    		  System.out.println("シニア料金が必要です");


    	}

    }
}
