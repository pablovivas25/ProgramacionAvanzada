import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;





public class Aplicacion {
	private Scanner in;
	private PrintWriter out;
	private int cantAplicaciones;
	private int megasTotales;
	private ArrayList<Integer> memoriaAplicacion;
	
	public Aplicacion(File entrada,File salida){
		try {
			in=new Scanner(entrada);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out=new PrintWriter(salida);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void obtenerDatos() {
		cantAplicaciones=in.nextInt();
		megasTotales=in.nextInt();
		System.out.println(this.cantAplicaciones+" "+this.megasTotales);
		this.memoriaAplicacion=new ArrayList<Integer>();
		for(int i=0;i<this.cantAplicaciones;i++) {
			this.memoriaAplicacion.add(in.nextInt());
			System.out.println(this.memoriaAplicacion.get(i));
		}
	}
	
	public void resolver() {
		if(comprobar()<this.megasTotales) {
			out.println("espacio insuficiente");
		}
		else {
		if(this.memoriaAplicacion.contains(this.megasTotales)) {
			out.println(1);
		}else
		{
			
			int minimo=this.cantAplicaciones;
			for(int i=0;i<this.cantAplicaciones;i++) {
				int sum=this.memoriaAplicacion.get(i);
				int cont=1;
				
				for(int j=i+1;j<this.cantAplicaciones;j++) {
					if(sum<=this.megasTotales) {
						sum+=this.memoriaAplicacion.get(j);
						cont++;
					}
					
				}
				if(cont<minimo&&sum>=this.megasTotales) {
					minimo=cont;
					
				}
			}
			out.println(minimo);
		}
		}
		out.close();
	}
	
	public void resolucion() {
		obtenerDatos();
		resolver();
	}
	
	public int comprobar() {
		int valor=0;
		for(int i=0;i<this.cantAplicaciones;i++) {
			valor+=this.memoriaAplicacion.get(i);
		}
		return valor;
	}

}
