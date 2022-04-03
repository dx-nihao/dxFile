package p2;
class Student{
	private String name;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class Senier extends Student{
	void message() {
		System.out.println("学生name"+getName()+"\n"+"学生age:  "+age);
	}
}
class Graduate extends Student{
	void message() {
		System.out.println("学生name:"+getName()+"\n"+"学生age：  "+age);
	}
}
public class TestJicheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Senier sn = new Senier();
		Graduate g = new Graduate ();
		sn.age = 11;
		sn.setName("李四");
		sn.message();
		g.age = 19;
		g.setName("小李");
		g.message();
	}

}
