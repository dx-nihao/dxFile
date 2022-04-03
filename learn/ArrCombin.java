package learn;

public class ArrCombin {
	public static int[] combin(int[] a,int[] a1) {	//将数组合并
		int[] a2 = new int[a.length+a1.length];
		for(int i = 0;i<a.length;i++) {
			a2[i] = a[i];
		}
		for(int i =0;i<a1.length;i++) {
			a2[a.length+i] = a1[i];
		}
		return a2;
	}
	public static void sort(int[] a) {	//将数组排序
		for(int i = 0;i<a.length-1;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
				int tmp = a[j];
				a[j] = a[j+1];
				a[j+1] = tmp;
				}
			}
		}
	}
	public static void prin(int[] a) {	//将数组打印
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,5,1,6,8};
		int[] a1 = {9,7,0,3,4};
		int[] arr = combin(a,a1);
		sort(arr);
		prin(arr);
	}

}
