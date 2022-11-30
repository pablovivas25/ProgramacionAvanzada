package vendoraspremiadas;

import java.util.Arrays;

public class Vendedora {
	private int numeroVendora;
	private int cantVentas;
	private int [] importeVentas;
	
	public Vendedora(int numeroVendora, int cantVentas, int[] importeVentas) {
		super();
		this.numeroVendora = numeroVendora;
		this.cantVentas = cantVentas;
		this.importeVentas = importeVentas;
	}
	
	public int getNumeroVendora() {
		return numeroVendora;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public int[] getImporteVentas() {
		return importeVentas;
	}

	@Override
	public String toString() {
		return "Vendedora [numeroVendora=" + numeroVendora + ", cantVentas=" + cantVentas + ", importeVentas="
				+ Arrays.toString(importeVentas) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
