
public class Punto3D extends Punto2D {

	private int Z;

	public int getZ() {
		return Z;
	}

	public void setZ(int z) {
		Z = z;
	}

	public Punto3D(int x, int y, int z) {
		super(x, y);
		Z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Z != other.Z)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Punto2D p2D = new Punto2D(0,0);
		Punto3D p3D = new Punto3D(0,0,1);
		Punto3D a3D = null;
		System.out.println(p2D.equals(p3D));
		System.out.println(p3D.equals(p2D)); 
		System.out.println(p2D.equals(a3D)); 
		System.out.println(p3D.equals(a3D));
		a3D = new Punto3D(0,0,0);
		System.out.println(p2D.equals(a3D));
		System.out.println(a3D.equals(p2D)); 
		Punto3D b3d=new Punto3D(0,0,0);
		System.out.println(b3d.equals(a3D));
		System.out.println(a3D.equals(b3d));
		
		if(a3D==b3d)
			System.out.println("Entre a que son iguales");
		else
			System.out.println("entre por el else");

	}
	
}
