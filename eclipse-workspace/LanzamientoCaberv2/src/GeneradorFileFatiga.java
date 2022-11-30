import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorFileFatiga {
	public static final int CANTIDAD_CONCURSANTES=1000000;
	
	
	static void generarFile(String path ) {
		PrintWriter pr;
		
		try {
			pr=new PrintWriter(new File(path));
			
		    pr.println(CANTIDAD_CONCURSANTES);
		    
		    for(int i=0;i<CANTIDAD_CONCURSANTES*3;i++) {
		    	double distancia=Math.random()*10+1;
		    	double angulo=Math.random()*(180-(-180) +1)-180;
		    	
		    	pr.println(distancia + " "+angulo);
		    
		    }
		    pr.close();
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
