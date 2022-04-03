//package learn;
////接口多态
//interface Teacher{
//	
//	public void teach();
//}
//class MathTeacher implements Teacher{
//	String name;
//	int age;
//	public void teach() {
//		System.out.println(name+"教数学");
//	}
//}
//class JavaTeacher implements Teacher{
//	String name;
//	int age;
//	public void teach() {
//		System.out.println(name+"教java");
//	}
//}
//class Leader{
//	public void check(Teacher t) {
//		//判断接收的对象
//		/*if(t instanceof JavaTeacher) {
//			System.out.println("javaTeacher在教");
//		}
//		if(t instanceof MathTeacher) {
//			System.out.println("MatherTeacher在教");
//		}
//		*/
//		System.out.println("开始测试");
//		t.teach();
//		System.out.println("打分");
//	}
//}
//public class DuoTai2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		JavaTeacher jt = new JavaTeacher();
//		jt.name = "阿里";
////		jt.teach();
//		MathTeacher mt = new MathTeacher();
//		mt.name = "阿三";
////		mt.teach();
//		Leader l = new Leader();
//		l.check(jt);
//		System.out.println("---------------");
//		l.check(mt);
//	}
//
//}
	



