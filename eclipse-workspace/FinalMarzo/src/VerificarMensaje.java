
public class VerificarMensaje {
	private boolean ocurrencia[];
	
	
	public boolean[] verificar(String frase, String[] posiblesOcultas) {
		this.ocurrencia=new boolean[posiblesOcultas.length];
		int i=0;
		String fraseAux=new String(frase);
		///System.out.println(fraseAux[0]);
		for (String string : posiblesOcultas) {
			///System.out.println(string);
			///int encontrado=string.indexOf(frase);
			if(fraseAux.contains(string)) {
				fraseAux.replaceAll(string,"");
				this.ocurrencia[i]=true;
				System.out.println(fraseAux);
			}else {
				char [] l = string.toCharArray();
				int cont=l.length;
				
				for (char string2 : l) {
					
					String aux=String.valueOf(string2);
					
					if(frase.contains(aux))
						cont-=1;
				}
				
				if(cont==0) {
					this.ocurrencia[i]=true;
				}else
					this.ocurrencia[i]=false;
			}
				
			
			i++;
			/*
			if(encontrado==-1)
				this.ocurrencia[i]=false;
			else
				this.ocurrencia[i]=true;
			i++;
			*/
		}
		return this.ocurrencia;
	
		
		
	}
	public static void main(String[] args) {
		String frase = "Tengo amigos conscientes de lo oscura que es la noche";//conscientes";/// de lo oscura que es la noche";
		String [] posiblesOcultas = {"Te", "amo", "con", "locura"};
		boolean vec[];
		VerificarMensaje f = new VerificarMensaje();
		vec=f.verificar(frase, posiblesOcultas);
		
		for(int i=0;i<vec.length;i++)
			System.out.println(vec[i]);
	}

}
