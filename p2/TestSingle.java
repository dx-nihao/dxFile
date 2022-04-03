package p2;
//µ¥ÀýÄ£Ê½²âÊÔ
class Single{
	private static Single s;
	private Single() {
		
	}
	public static Single method() {
		if(s == null) {
			 s = new Single();
		}
		return s;
	}
}
public class TestSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s = Single.method();
		System.out.println(s);
		Single s1 = Single.method();
		System.out.println(s1);
	}

}
