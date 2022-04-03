//package learn;
//
//import java.util.List;
//import java.util.ListIterator;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class TestList {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//添加一个list集合
//		List list = new ArrayList();
//		//向末尾添加元素
//		list.add("苹果");
//		list.add("橘子");
//		list.add("香蕉");
//		list.add("香蕉");
//		list.add("草莓");
//		list.add(1,"菠萝");//插入一个元素到指定位置
//		System.out.println(list);
		//获得指定位置的元素，不能越界
//		Object object = list.get(1);
//		String str = (String)list.get(2);//也可以强转
//		System.out.println(object);
//		System.out.println(str);
//		System.out.println("list的长度："+list.size());//获得集合的长度
//		ListIterator listIterator = list.listIterator();
//		while (listIterator.hasNext()) {
//			//获得迭代的元素
//			Object object = listIterator.next();
//			System.out.println(object);
//		}
//		System.out.println("-----------");
////			反向遍历
//			while (listIterator.hasPrevious()) {
//			Object	object1 = listIterator .previous();
//			System.out.println(object1);
//				
//			}
//		while (listIterator.hasNext()) {
//		
//		String str = (String) listIterator.next();
//		if ("菠萝".equals(str)) {
//			/*迭代器给我们一个add方法避免了并发问题，
//			但只在结果后才添加进去
//			*/
//			listIterator.add("猕猴桃");
//			System.out.println(str);
			
//		}
//		}
//		System.out.println(list);
//		int size = list.size();
		//动态获得集合长度
//		for (int i= 0; i  < list.size(); i++) {//另一种遍历方法
//			Object object = list.get(i);
//			if ("橘子".equals(object)) {
//				list.add("草莓");
//			}
//			System.out.println(object);
//		}
//		int index = list.indexOf("香蕉");//返回第一次出现元素索引
//		System.out.println(index);
//		int last = list.lastIndexOf("草莓");//返回最后出现指定元素索引
//		System.out.println(last);
//		}
	

//}
