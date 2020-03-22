package tasks.home;

public class Repl84 {
	public static void main (String []args) {
//		For you to do:
//			Write a program that prints the total number of elements that are negative AND odd
//
//			Output:
//			3
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		int sum=0;
for(int i=0; i<3; i++) {
	for(int j=0; j<4; j++) {
		sum=sum+a[i][j];
			
	}

}System.out.println(sum/-3);
	}
}
