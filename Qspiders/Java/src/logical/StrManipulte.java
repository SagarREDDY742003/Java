package logical;
public class StrManipulte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "MALAYALAM";
		String str2 = "";
		for(int i=0; i<str1.length();i++) {
			if(str1.charAt(i)=='A') {
				str2 +="@";
			}
			else {
				str2 += str1.charAt(i);
			}
		}
		System.out.println(str2);

	}

}
