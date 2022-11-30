import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneraFatiga {
	public static final int C=50000;
	public static final int A=1000;
	
	
	static void GenerarFatiga(String path) {
		PrintWriter pr;
		
		try {
			pr=new PrintWriter(new File(path));
			pr.println(C+ " "+A);
			pr.print(2+ " ");
			for(int i=1;i<C-10000;i++) {
				pr.print(1+ " ");
			}
			for(int j=C-10001;j<C;j++) {
				pr.print(1+ " ");
			}
			pr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
