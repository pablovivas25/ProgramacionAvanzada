
public class Mensaje {
	private String mensajeEncriptado;

	public Mensaje(String mensajeEncriptado) {
		super();
		this.mensajeEncriptado = mensajeEncriptado;
	}

	public String getMensajeEncriptado() {
		return mensajeEncriptado;
	}

	public void setMensajeEncriptado(String mensajeEncriptado) {
		this.mensajeEncriptado = mensajeEncriptado;
	}
	
	public String desencriptarCadena() {
		String cad=this.mensajeEncriptado;
		StringBuilder cadaux=new StringBuilder(cad);
		
		int posParentesisIzq=-1;
		int posParentesisDer=-1;
		
		for (int i=0;i<cad.length();i++) {
			
			if(cad.charAt(i)=='(')
				posParentesisIzq=i+1;
			if(cad.charAt(i)==')')
				posParentesisDer=i;
			
			if(posParentesisIzq!=-1 && posParentesisDer!=-1) {
				StringBuilder cadAModificar=new StringBuilder(cadaux.substring(posParentesisIzq, posParentesisDer));
				cadAModificar.reverse();
				cadaux.replace(posParentesisIzq, posParentesisDer, cadAModificar.toString());
				//cadaux.deleteCharAt(posParentesisIzq-1);
				//System.out.println(cadaux.toString());
				//cadaux.deleteCharAt(posParentesisIzq-1);
				//cadaux.deleteCharAt(posParentesisDer);
				//cadaux.deleteCharAt(0);
				//cadaux.deleteCharAt(cad.length()-1);
				
				
				posParentesisIzq=-1;
				posParentesisDer=-1;
			}
		}
		String cad1=cadaux.toString();
		String cad2=cad1.replace('(', ' ');
		String cad3=cad2.replace(')', ' ');
		String result = cad3.replaceAll("\\s+"," ");
	
		
		//System.out.println(cadaux.toString());
		
		
		
		return result;
	}
}
