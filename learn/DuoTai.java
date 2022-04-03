//package learn;
////继承多态实例
//abstract class Teacher{
//	int age;
//	String name;
//	public abstract void teach();
//}
//class MathTeacher extends Teacher{
//	public void teach() {
//		System.out.println(name+"教数学");
//	}
//}
//class JavaTeacher extends Teacher{
//	public void teach() {
//		System.out.println(name+"教java");
//	}
//}
//方法膨胀，不推荐这样写
//class Leader{
//	public void checkJavaTeacher(JavaTeacher p1) {
//		System.out.println("开始测试");
//		p1.teach();
//		System.out.println("打分");
//	}
//public void checkMathTeacher(MathTeacher p2) {
//	System.out.println("开始测试");
//	p2.teach();
//	System.out.println("打分");
//	}
//}
//public class DuoTai {
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
//		l.checkJavaTeacher(jt);
//		System.out.println("---------------");
//		l.checkMathTeacher(mt);
//	}
//
//}
