package tasks.home;

public class Repl85 {
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
//		For you to do:
//			Write a program that sums all numbers that are on even index and on even row.
		int sum=0;
for(int i=0; i<3; i++) {
	for(int j=0; j<4; j++) {
		sum=sum+a[i][j];
			
	}

}
System.out.println(sum);	

 
}
}
