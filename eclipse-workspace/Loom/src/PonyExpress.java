
public class PonyExpress {
	int jinetes(int[] estaciones) {
		/*
		int cantidadJin = 1;
		int acumMillas = 0;

		if (estaciones.length == 0)
			return 0;

		for (int i = 0; i < estaciones.length; i++) {
			if (acumMillas + estaciones[i] >= 100) {
				cantidadJin++;
				acumMillas = estaciones[i];
			} else {
				acumMillas += estaciones[i];
			}
		}
		return cantidadJin;
		*/
		int kilometros = 0;
		int jinetes = 1;
		for (int i = 0; i < estaciones.length; i++) {
			if (kilometros + estaciones[i] > 100) { // si la suma de los kilometros recorridos, mas la suma de los
													// quilometros por recorrer es mayor a 100, entonces, restablezco
													// los kilometros y sumo un jinete extra
				jinetes++;
				kilometros = 0;
			}
			kilometros += estaciones[i];
		}
		return jinetes;
		
	}

	public static void main(String[] args) {
		PonyExpress p = new PonyExpress();
		System.out.println(p.jinetes(new int[] { 18, 15 }));
		System.out.println(p.jinetes(new int[] { 43, 23, 40, 13 }));
		System.out.println(p.jinetes(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		System.out.println(p.jinetes(new int[] { 51, 51, 51 }));
		System.out.println(p.jinetes(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
		System.out.println(p.jinetes(new int[] { 101}));
	}

}
