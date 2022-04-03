package p1;
/*
	   *
	  ***
     *****





*/
public class PrintStar {
	void display() {
		int n = 4;
		for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=n-i;j++) { 
			System.out.print(" ");	}
		for(int k = 1;k<2*(i-1);k++) {
				System.out.print("*");
			}
		
			System.out.println();
		}	
	}
	void display1() {
		int n = 4;
		for(int i = 1;i<=n;i++) {
		for(int j = 2;j>=n-i;j--) { 
			System.out.print(" ");	}
		for(int k = 4;k>=2*(i-1);k--) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStar p = new PrintStar();
		p.display();
		p.display1();
		
		
		
	}
	

}
