import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Red {

	private List<Computadora> nodos;
	private List<Conexion> aristas;
	private List<String> respuesta;
	private List<Conexion> conexiones_establecidas;

	public Red(List<Computadora> nodos, List<Conexion> aristas) {
		super();
		this.nodos = nodos;
		this.aristas = aristas;
		this.respuesta = new ArrayList<String>();
		this.conexiones_establecidas = new ArrayList<Conexion>();
	}

	public List<Computadora> getNodos() {
		return nodos;
	}

	public void setNodos(List<Computadora> nodos) {
		this.nodos = nodos;
	}

	public List<Conexion> getAristas() {
		return aristas;
	}

	public void setAristas(List<Conexion> aristas) {
		this.aristas = aristas;
	}
	
	
	public List<String> getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(List<String> respuesta) {
		this.respuesta = respuesta;
	}

	public List<Conexion> getConexiones_establecidas() {
		return conexiones_establecidas;
	}

	public void setConexiones_establecidas(List<Conexion> conexiones_establecidas) {
		this.conexiones_establecidas = conexiones_establecidas;
	}

	public void resolver() {
		for (int i = 0; i < this.aristas.size(); i++) {
			if (this.aristas.get(i).getLetra().compareTo("C") == 0) {
				
				this.conexiones_establecidas.add(this.aristas.get(i));
			} else {
				Conexion aux = new Conexion(this.aristas.get(i).getC1(), this.aristas.get(i).getC2(), "C");
				boolean existe_con = this.existe_conexion(aux);
				
				if(existe_con==true)
					this.respuesta.add("S");
				else
					this.respuesta.add("N");
			}
		}
	}
	
	public boolean buscar_conexion_indirecta(Conexion c) {
		
		Queue<Integer>cola=new LinkedList<Integer>();
		ArrayList<Integer>visitados=new ArrayList<Integer>();
		
		cola.offer(c.getC1().getNumero());
		
		visitados.add(c.getC1().getNumero());
		
		while(!cola.isEmpty()) {
			Integer nodo=cola.peek();
			
			for(int i=0;i<this.conexiones_establecidas.size();i++) {
				if((nodo==this.conexiones_establecidas.get(i).getC1().getNumero() && !visitados.contains(c.getC2().getNumero()))) {
					if(this.conexiones_establecidas.get(i).getC2().getNumero()==c.getC2().getNumero())
						return true;
					else {
						cola.offer(this.conexiones_establecidas.get(i).getC2().getNumero());
						visitados.add(this.conexiones_establecidas.get(i).getC1().getNumero());
					}
				}
				
				if( nodo==this.conexiones_establecidas.get(i).getC2().getNumero() &&  !visitados.contains(c.getC1().getNumero()) ){
					
					if(this.conexiones_establecidas.get(i).getC2().getNumero()==c.getC2().getNumero()) {
						return true;
					}
					}else {
						cola.offer(this.conexiones_establecidas.get(i).getC1().getNumero());
						visitados.add(this.conexiones_establecidas.get(i).getC1().getNumero());
					}
					
				
			}
			nodo=cola.poll();
			
			visitados.add(nodo);
		}
		System.out.println(visitados.size());
		for(Integer vist:visitados)
			System.out.println("Nodos visitados "+ vist);
		
		return false;
		
	}
	public boolean existe_conexion(Conexion c) {
		Conexion c1=new Conexion(c.getC2(),c.getC1(),c.getLetra());
		if(this.conexiones_establecidas.contains(c)==true || this.conexiones_establecidas.contains(c1))
			return true;
		else {
			return this.buscar_conexion_indirecta(c);
		}
	}
	

}
