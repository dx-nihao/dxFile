package p2;
interface Teacher{
	String name = "С��";
	public  void teach() ;
//		System.out.println(name+"�̿�");
//	
	}
class JavaTeacher implements Teacher{
	String name ;
	int age;
	public void teach() {
		System.out.println(name+"��Java");
	}
}
interface fi{
	public default void fi() {
		
	}
	public static void vi(int[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"\t");
		}
	}
}
public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fi.vi(new int [] {12,3,4});
		JavaTeacher jt = new JavaTeacher();
		jt.name = "Сɢ";
		Teacher t = new JavaTeacher();
		t = jt;
		t.teach();
//		JavaTeacher jt = (JavaTeacher)t;
//		System.out.println(jt.name);
//		System.out.println(jt.age);
	}
	

}
