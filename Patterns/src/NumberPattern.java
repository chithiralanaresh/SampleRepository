import java.util.Scanner;

public class NumberPattern {
	
	private void upperPart(){
		int num=12;
		int f=2;
		int g=num-1;
		for (int i=1;i<=(num/2);i++) {
			for (int j=1;j<=num;j++) {
				if(j>=f&&j<=g) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			f=f+1;
			g=g-1;
			System.out.println();
		}
	}
	
	private void lowerPart(){
		int num1=11;
		int f1=1;
		int g1=num1;
		for (int i=1;i<=(num1/2)+1;i++) {
			for (int j=1;j<=num1;j++) {
				if((j>=f1&&j<=g1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			f1=f1+1;
			g1=g1-1;
			System.out.println();
		}
	}

	public static void main(String [] args){
		NumberPattern np = new NumberPattern();
		np.upperPart();
		np.lowerPart();
      
	}
	
}
