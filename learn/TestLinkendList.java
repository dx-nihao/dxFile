package learn;

import java.util.LinkedList;

public class TestLinkendList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		linkedList.add("张三");
		linkedList.add("李四");
		linkedList.add("王五");
		linkedList.addFirst("赵六");//将指定元素追加到开头
		linkedList.addLast("六七");
		linkedList.removeFirst();//移除第一个元素
		linkedList.removeLast();//移除最后一个元素
		Object object = linkedList.pop();//将元素素出栈，从头开始
		System.out.println("出栈元素是"+object);
		linkedList.push("八九");//将元素推入此列表所表示的堆栈
		System.out.println(linkedList);
		
	}

}
