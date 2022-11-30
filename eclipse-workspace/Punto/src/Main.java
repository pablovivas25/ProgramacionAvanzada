
public class Main {

	public static void main(String[] args) {
		Punto2D p2d=new Punto2D(0,0);
		Punto3D p3d=new Punto3D(0,0,1);
		Punto3D a3d=null;
		System.out.println(p2d.equals(p3d));
		System.out.println(p3d.equals(p2d));
		System.out.println(p2d.equals(a3d));
		System.out.println(p3d.equals(a3d));
		a3d=new Punto3D(0,0,0);
		System.out.println(p2d.equals(a3d));
		System.out.println(a3d.equals(p2d));
	}

}
