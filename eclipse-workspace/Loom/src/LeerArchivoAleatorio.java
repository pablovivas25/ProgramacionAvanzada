import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerArchivoAleatorio {
	private int cantidadNumeros;
	private int []numerosAleatorios;
	private int suma=0;
	
	public LeerArchivoAleatorio(String pathEntrada) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(pathEntrada));
		this.cantidadNumeros=entrada.nextInt();
		this.numerosAleatorios=new int[this.cantidadNumeros];

		
		for(int i=0;i<this.cantidadNumeros;i++) {
			suma+=this.numerosAleatorios[i]=entrada.nextInt();
			
		}
		entrada.close();
	}
	
	public void generarSalidaPromMinMax(String pathSalida) throws FileNotFoundException {
		PrintWriter salida=new PrintWriter(new File(pathSalida));
		
		int min=calcularMinimo();
		int max=calcularMaximo();
		int prom=calcularPromedio();
		
		
		
		salida.println("+------------+-------+");
		salida.printf("| %-10s | %5d |\n","Máximo",max);
		salida.println("+------------+-------+");
		salida.printf("| %-10s | %5d |\n","Mínimo",min);
		salida.println("+------------+-------+");
		salida.printf("| %-10s | %5d |\n","Promedio",prom);
		salida.println("+------------+-------+");
	
		
		
		
		salida.close();
		
	}
	public int getSuma() {
		return this.suma;
	}
	public int getCantidadNumeros() {
		return cantidadNumeros;
	}
	
	public int calcularMaximo() {
		int mayor=this.numerosAleatorios[0];
		
		for(int i=0;i<this.cantidadNumeros;i++) {
			if(mayor<this.numerosAleatorios[i])
				mayor=this.numerosAleatorios[i];
		}
		return mayor;
	}
	public int  calcularMinimo() {
		int menor=this.numerosAleatorios[0];
		
		for(int i=0;i<this.cantidadNumeros;i++) {
			if(menor>this.numerosAleatorios[i])
				menor=this.numerosAleatorios[i];
		}
		return menor;
	}
	
	public int calcularPromedio() {
		return this.suma/this.cantidadNumeros;
	}
	public void setCantidadNumeros(int cantidadNumeros) {
		this.cantidadNumeros = cantidadNumeros;
	}
	
	public int[] getNumerosAleatorios() {
		return numerosAleatorios;
	}

	public void setNumerosAleatorios(int[] numerosAleatorios) {
		this.numerosAleatorios = numerosAleatorios;
	}

	public static void main(String[] args) throws FileNotFoundException {
		LeerArchivoAleatorio l=new LeerArchivoAleatorio("Archivos/salida.out");
		System.out.println(l.getCantidadNumeros());
		System.out.println(l.getSuma());
		System.out.println(l.calcularMinimo());
	
		System.out.println(l.calcularMaximo());
		
		System.out.println(l.calcularPromedio());
		
		l.generarSalidaPromMinMax("salida1.out");
	}

}
