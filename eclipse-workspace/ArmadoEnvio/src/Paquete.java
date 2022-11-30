import java.util.ArrayList;
import java.util.Iterator;

public class Paquete {
	
	private ArrayList<Producto> productos;
	
	public Paquete() {
		this.productos=new ArrayList<Producto>();
	}
	
	public void  agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public int capacidadPaquete() {
		return productos.size();
	}
	public void mostrarProductos() {
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}
	
	public static void main(String[] args) {
		Producto p1=new Producto("2022/08/10","Fideos","China","2022/09/11");
		Producto p2=new Producto("2022/07/10","Arroz","Argentina","2022/09/11");
		Producto p3=new Producto("2022/03/10","Lata Choclo","India","2022/09/11");
		Producto p4=new Producto("2022/02/10","Leche","Corea","2022/09/11");
		CongeladoAire a1=new CongeladoAire("2022/02/10","Yogurt","Argentina","2022/09/11",20.10,1,1,1,1);
		CongeladoAire a2=new CongeladoAire("2022/01/10","Pascualina Orali","Argentina","2022/05/11",15,1,0,0,1);
		
		Paquete p=new Paquete();
		p.agregarProducto(p1);
		p.agregarProducto(p2);
		p.agregarProducto(p3);
		p.agregarProducto(p4);
		p.agregarProducto(a1);
		p.agregarProducto(a2);
		
		p.mostrarProductos();
		
		System.out.println("---CANTIDAD DE ELEMENTOS DE MI PAQUETE-----");
		System.out.println("Mi paquete esta compuesto "+p.capacidadPaquete()+ " productos");
	}
	

}
