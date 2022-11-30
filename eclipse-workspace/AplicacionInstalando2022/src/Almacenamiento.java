
public class Almacenamiento {
	
	private int cantidadAplicaciones;
	private Aplicacion appInstalar;
	private Celular celu;
	private int cantidadAplicacionesABorrar;
	
	
	public Almacenamiento(int cantidadAplicaciones, Aplicacion appInstalar, Celular celu) {
		super();
		this.cantidadAplicaciones = cantidadAplicaciones;
		this.appInstalar = appInstalar;
		this.celu = celu;
		this.cantidadAplicacionesABorrar=-1;
	}
	
	public int getCantidadAplicacionesABorrar() {
		return cantidadAplicacionesABorrar;
	}

	public void setCantidadAplicacionesABorrar(int cantidadAplicacionesABorrar) {
		this.cantidadAplicacionesABorrar = cantidadAplicacionesABorrar;
	}

	public int getCantidadAplicaciones() {
		return cantidadAplicaciones;
	}
	
	public int sumarMemoriaTotalCelular() {
		int suma=0;
		
		for(int i=0;i<this.celu.getAplicaciones().size();i++)
			suma+=this.celu.getAplicaciones().get(i).getMemoria();
		
		return suma;
	}
	public void resolver() {
		
	  int memoriaTotal=this.sumarMemoriaTotalCelular();
	  
	  if(memoriaTotal<this.appInstalar.getMemoria()) {
		  System.out.println("aass");
		  this.setCantidadAplicacionesABorrar(0);
		  return ;
	  }
		
	  //segundo caso cubierto
	  
	   if(this.celu.getAplicaciones().contains(this.appInstalar)==true) {
		   System.out.println("entre");
		   this.setCantidadAplicacionesABorrar(1);
		   return ;
	   }
		  
	   //cuarto caso cubierto
	   
	   int minimo=this.celu.getAplicaciones().size();
	   System.out.println("minimo "+minimo);
		for(int i=0;i<this.celu.getAplicaciones().size();i++) {
			

			int sum=this.celu.getAplicaciones().get(i).getMemoria();
			int cont=1;
			
			for(int j=i+1;j<this.celu.getAplicaciones().size();j++) {
				if(sum<this.appInstalar.getMemoria()) {
					sum+=this.celu.getAplicaciones().get(j).getMemoria();
					cont++;
					//System.out.println(cont);
				}
				
			}
			if(cont<minimo && sum>=this.appInstalar.getMemoria()) {
				minimo=cont;
			
				
			}
		
		}
		this.setCantidadAplicacionesABorrar(minimo);
	  
	}


	public Aplicacion getAppInstalar() {
		return appInstalar;
	}


	public Celular getCelu() {
		return celu;
	}
	
	
	

}
