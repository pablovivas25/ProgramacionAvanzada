package loop;

public class MyLoop {
	public static void main(String[] args) {
		String[] sa = {"tom ", "jerry "};
		for(int x = 0; x < 3; x++) {
			for(String s: sa) {
				//System.out.println(s);
				System.out.print(x + " " + s);
				if( x == 1) break;
				}
		}
	}
}

///x == 0  0 tom 0 jerry
  // x==1   1 tom
   //x==2  2 tom 2 jerry