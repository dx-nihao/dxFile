package p2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ַ����е����ִ�Сд��ĸ�ĸ����ֱ�Ϊ����
		String str = "aisHUGbjuy743524";
		int da = 0;
		int xiao = 0;
		int shu = 0;
		for (int i = 0; i <str.length(); i++) {
			char s = str.charAt(i);
			int c= s;
			if(c>=65&&c<=90) {
				da++;
			}
			if(c>=97&&c<=122) {
				xiao++;
			}
			if(c>=48&&c<=57) {
				shu++;
			}
		}
	
		System.out.println("��д��ĸ��"+da+"��\nСд��ĸ��"+xiao+"��\n������"+shu+"��");	
	}

}
