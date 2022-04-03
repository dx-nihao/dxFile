package p2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求该字符串中的数字大小写字母的个数分别为多少
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
	
		System.out.println("大写字母有"+da+"个\n小写字母有"+xiao+"个\n数字有"+shu+"个");	
	}

}
