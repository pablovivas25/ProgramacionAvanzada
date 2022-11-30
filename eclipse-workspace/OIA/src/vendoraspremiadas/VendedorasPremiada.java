package vendoraspremiadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VendedorasPremiada {
	private int cantidadVendedoras;
	private int cantidadImportesVendedoras;
	private List<Vendedora> vendedoras;
	private int [] importesVendedoras;
	private int ventasConsecutivas;
	
	
	public List<Vendedora> getVendedoras() {
		return vendedoras;
	}

	public void setVendedoras(List<Vendedora> vendedoras) {
		this.vendedoras = vendedoras;
	}

	public VendedorasPremiada(String path) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File(path));
		this.cantidadVendedoras=entrada.nextInt();
		this.vendedoras=new ArrayList<Vendedora>();
		
		for(int i=0;i<this.cantidadVendedoras;i++) {
			this.cantidadImportesVendedoras=entrada.nextInt();
			this.importesVendedoras=new int[this.cantidadImportesVendedoras];
			
			for(int j=0;j<this.cantidadImportesVendedoras;j++) {
				this.importesVendedoras[j]=entrada.nextInt();
			}
			this.vendedoras.add(new Vendedora(i+1,this.cantidadImportesVendedoras,this.importesVendedoras));
		}
		this.ventasConsecutivas=entrada.nextInt();
		entrada.close();
		
	}
	
	public void  resolver(String pathsalida) throws FileNotFoundException {
		
		//Iterator<Vendedora> itr1 = this.vendedoras.iterator();
		
		boolean hayEmpate=true;
		Vendedora ganadora=null;
		int importe;
		int importeMax=0;
		
			
			for(int i=0;i<this.vendedoras.size();i++) {
				Vendedora aux=this.vendedoras.get(i);
				
				if(aux.getCantVentas()<this.cantidadImportesVendedoras) {
					this.vendedoras.remove(aux);
					//itr1.remove();
					i--;
				}
					
				else {
					importe=importeConsecutivo(aux.getImporteVentas(),ventasConsecutivas);
					
					if(importe>importeMax) {
						importeMax=importe;
						ganadora=aux;
						hayEmpate=false;
						
					}else if(importe<importeMax) {
						this.vendedoras.remove(aux);
						//itr1.remove();
						i--;
					}else {
						hayEmpate=true;
					}
						
					
				}
				this.ventasConsecutivas++;
			}
			
			if(ganadora==null)
				System.out.println("No hay ganadoras");
			else
				System.out.println(ganadora.getNumeroVendora());
	
			
		PrintWriter salida=new PrintWriter(new File(pathsalida));
		if(importeMax==0)
			salida.println("No hay ganadoras");
		else if(hayEmpate)
			salida.println("No se puede desempatar");
		else if(!hayEmpate) {
			salida.println(ganadora.getNumeroVendora());
			salida.println(this.ventasConsecutivas-1+" "+importeMax);
		}
			
		salida.close();
	}
	public int importeConsecutivo(int []importes,int ventasConsecutivas) {
		int suma;
		int importeMax=0;
		
		for(int i=0;i<importes.length-ventasConsecutivas+1;i++) {
			suma=0;
			
			for(int j=0;j<ventasConsecutivas;j++)
				suma+=importes[i+j];
			if(suma>importeMax)
				importeMax=suma;
			
		}
		return importeMax;
		
	
	}
	public static void main(String[] args) throws FileNotFoundException {
		VendedorasPremiada v=new VendedorasPremiada("Entrada/caso02.in");
		v.resolver("Salida/caso02.out");
		

	}

}
