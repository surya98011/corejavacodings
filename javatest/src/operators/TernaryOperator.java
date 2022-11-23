package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=50;
int b = 55;
 System.out.println(maxNumber(a,b)); 
 System.out.println(maxNumTernary(a,b));

	}
	// max number with if else 
	public static int  maxNumber(int a , int b) {
	 
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static int maxNumTernary(int a , int b) {
		
		return a>b?a:b;
		//here if a is greater then a will be return else
		// after column : b will be return
	}

}
