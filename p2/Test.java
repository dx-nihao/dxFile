package p2;
////封装
//class Boy{
//	public String name;
//	private int age;
////	public Boy() {
//		
////	}
//	public Boy(String name,int age) {
//	this.name = name;
//	this.age  = age;
//	}
//	public  void hi(String name,int age) {
//		System.out.println(name+" "+age);
//	}
//	void test() {
//		this.hi(name,age);
//	}
//	
//
		
/*
类的成员变量（属性）与方法、在程序中经常要对时间进行操作但是并没有时间
类型的数据。那么我们可以自己实现一个时间类来满足程序中的需要。 
定义名为MyTime的类其中应有三个整型属性时hour分minute秒second为了保证数据
的安全性这三个成员变量应声明为私有。 创建MyTime类对象并且初始化成员变量。
再定义diaplay方法用于将时间信息打印出来。 为MyTime类添加以下
方法 addSecond(int sec) addMinute(int min) 
addHour(int hou) subSecond(int sec) subMinute(int min) 
subHour(int hou) 分别对时、分、秒进行加减运算。
*/
//class MyTime{
//	private int hour;
//	private int minute;
//	private int second;
//	void addSecond(int sec){second = sec; }
//	void addMinute(int min) {minute = min;}
//	void addHour(int hou){hour = hou;} 
//	void subSecond(int sec){second++;}
//	void subMinute(int min){minute++;}
//	void subHour(int sho){hour++;}
//	void display() {
//			System.out.println("小时："+hour+"\n分钟："+minute+"\n秒："+second);
//		}
//}
//public class Test {
//	public static void main(String[] args) {
////		// TODO Auto-generated method stub
//////		Boy b = new Boy();
////		Boy b1 = new Boy("三",12);
//////		b1.hi();
////		b1.test();
//////		b.hi();
//		MyTime mt = new MyTime();
//		mt.addHour(1);
//		mt.addMinute(23);
//		mt.addSecond(40);
//		mt.display();
//	}
//
//}
