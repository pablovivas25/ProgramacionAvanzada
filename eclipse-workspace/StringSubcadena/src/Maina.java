
public class Maina {
	public static void main(String[] args) {
		String cad="16345678";
		String subcadena="3456";
		int final_1;
		
		System.out.println(cad.length());
		for(int i=0;i<cad.length();i++) {
			String sub_axu=cad.substring(i, 4);
			System.out.println(sub_axu);
		}
	}
}
