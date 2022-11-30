import java.util.Arrays;

public class Lienzo {
	private int alto;
	private int ancho;
	private char lienzo[][];
	
	public Lienzo(int alt,int anc,char[][] l) {
		this.alto=alt;
		this.ancho=anc;
		this.lienzo=l;
	}
	
	public Lienzo(int alt,int anc) {
		this.alto=alt;
		this.ancho=anc;
		this.lienzo=new char[this.alto][this.ancho];
		
		for(int i=0;i<this.alto;i++)
			for(int j=0;j<this.ancho;j++)
				this.lienzo[i][j]='0';
	}
	
	@Override
	public String toString() {
		return "Lienzo [alto=" + alto + ", ancho=" + ancho + ", lienzo=" + Arrays.toString(lienzo) + "]";
	}
	public void mostar() {
		for(int i=0;i<this.alto;i++) {
			for(int j=0;j<this.ancho;j++) {
				System.out.print(this.lienzo[i][j]+ " ");
			
		}
			System.out.println();
	}	
	}

	public void resolver() {
		int inicio,fin,centro1,centro2;
		for(int i=0;i<this.alto;i++) {
			inicio=i;
			fin=this.ancho-1-i;
			centro1=this.ancho-this.alto-i;
			centro2=this.ancho-this.alto+i;
			for(int j=0;j<this.ancho;j++) {
				if(inicio==j || centro1==j || centro2==j || fin==j)
					this.lienzo[i][j]='X';
			}
			
			
		}
			
	}
	
	public static void main(String[]args) {
		Lienzo l=new Lienzo(5,9);
		System.out.println("-----MATRIZ PARA N=9-----");
		l.mostar();
		System.out.println("--------RESULTADO------------");
		l.resolver();
		l.mostar();
	}
}