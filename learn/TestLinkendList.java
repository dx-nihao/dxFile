package learn;

import java.util.LinkedList;

public class TestLinkendList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		linkedList.add("����");
		linkedList.add("����");
		linkedList.add("����");
		linkedList.addFirst("����");//��ָ��Ԫ��׷�ӵ���ͷ
		linkedList.addLast("����");
		linkedList.removeFirst();//�Ƴ���һ��Ԫ��
		linkedList.removeLast();//�Ƴ����һ��Ԫ��
		Object object = linkedList.pop();//��Ԫ���س�ջ����ͷ��ʼ
		System.out.println("��ջԪ����"+object);
		linkedList.push("�˾�");//��Ԫ��������б�����ʾ�Ķ�ջ
		System.out.println(linkedList);
		
	}

}
