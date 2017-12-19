
public class NoPattern {

	private void upperPart(){
		int num=9;
		int f=2;
		int x= 5;
		int g=num-1;
		for (int i=1;i<=(num/2);i++) {
			x--;
			for (int j=1;j<=num;j++) {
				if(j>=f&&j<=g) {
					System.out.print(" ");
				} else {
					System.out.print(x);
				}
			}
			f=f+1;
			g=g-1;
			System.out.println();
		}
	}
	
	private void lowerPart(){
		int num1=9;
		int x=-1;
		int f1=1;
		int g1=num1;
		for (int i=1;i<=(num1/2)+1;i++) {
			x++;
			for (int j=1;j<=num1;j++) {
				if((j>=f1&&j<=g1)) {
					System.out.print(x);
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
		NoPattern np = new NoPattern();
		np.upperPart();
		np.lowerPart();
      
	}
	
}
