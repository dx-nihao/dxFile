package p2;

import java.util.Arrays;

public class Demo {
	public static void prin(int[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,43,2,6,86,7,9};
		Arrays.sort(a);
		prin(a);
		int m = Arrays.binarySearch(a, 2);
		System.out.println(m);
	}

}
