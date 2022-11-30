package estatico;

public class Auto {
	int contador1;
    static int contador2;
    
    public Auto() {
    	contador1=0;
    	contador2++;
    }
    public void aumenta1() {
    	contador1++;
    }
    public void aumenta2() {
    	contador2++;
    }
    
    public static void aumenta() {
    	contador1++;
    	contador2++;
    }

}
