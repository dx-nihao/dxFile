//package learn;
////��̬ʵ���Ż�
//abstract class Teacher{
//	int age;
//	String name;
//	public abstract void teach();
//}
//class MathTeacher extends Teacher{
//	public void teach() {
//		System.out.println(name+"����ѧ");
//	}
//}
//class JavaTeacher extends Teacher{
//	public void teach() {
//		System.out.println(name+"��java");
//	}
//}
//class Leader{
//	public void check(Teacher t) {
//		//�жϽ��յĶ���
//		/*if(t instanceof JavaTeacher) {
//			System.out.println("javaTeacher�ڽ�");
//		}
//		if(t instanceof MathTeacher) {
//			System.out.println("MatherTeacher�ڽ�");
//		}
//		*/
//		System.out.println("��ʼ����");
//		t.teach();
//		System.out.println("���");
//	}
//}
//public class DuoTai1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		JavaTeacher jt = new JavaTeacher();
//		jt.name = "����";
////		jt.teach();
//		MathTeacher mt = new MathTeacher();
//		mt.name = "����";
////		mt.teach();
//		Leader l = new Leader();
//		l.check(jt);
//		System.out.println("---------------");
//		l.check(mt);
//	}
//
//}
