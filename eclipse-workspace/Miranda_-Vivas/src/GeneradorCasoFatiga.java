import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GeneradorCasoFatiga {
	
	static final private int C=50000;
	static final private int A=1000;
	private PrintWriter salida;
	
	public void crearArchivoFatiga() {
		File fatiga=new File("fatiga.in");
		try {
			salida=new PrintWriter(fatiga);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		salida.println(C+" "+A);
		for(int i=0;i<C;i++) {
			int cantAplicaciones=(int) ((Math.random()%A)+1);
			salida.print(cantAplicaciones+" ");
		}
		
		
	}
	

}
