
public class Main {

	public static void main(String[] args) {
		int numero1=18,numero2=3;
		int resto,mcd=0;
		int dividiendo,divisor;
		
		dividiendo=numero1;
		divisor=numero2;
		resto=dividiendo%divisor;
		
		while(resto!=0) {
			dividiendo=divisor;
			divisor=resto;
			resto=dividiendo%divisor;
			
		}
		
		System.out.print(divisor);
		
	}
	

}
