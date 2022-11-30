package alpahabeta;

class Gamma extends Beta {
String getType() { return "gamma"; }


public static void main(String[] args) {
	Alpha a1=new Beta();
///Gamma g2 = new Beta();
	Beta b1=new Gamma();
Gamma g3= new Gamma();

///Beta b1 = new Beta();
///Alpha a1 = new Alpha();
///Gamma g4= new Gamma();
System.out.println(g3.getType());
///System.out.println(g1.getType() + " "+ g2.getType());
}
}

///https://sites.google.com/site/pro012iessanandres/java/constructores-y-herencia

///OPCION CORRECTA COMPILATION FAILS
