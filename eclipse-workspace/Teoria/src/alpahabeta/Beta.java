package alpahabeta;

class Beta extends Alpha {
	String getType() { return "beta"; }

public static void main(String[] args) {
Beta b1 = new Beta();
Beta b2 = new Alpha();

///Beta b1 = new Beta();
///Alpha a1 = new Alpha();
///Gamma g4= new Gamma();
System.out.println(b1.getType());
}
}