
public class DerechaIzquierdaIguales {
	private int n;

	public DerechaIzquierdaIguales(int n) {
		this.n = n;
	}

	public static int metodo1(int n) {

		if (n < 3)
			return -1;
		for (int i = 2; i <= n; i++) {
			int sumaIzq = 0;
			for (int j = 1; j < i; j++)
				sumaIzq += j;
			int sumaDer = 0;
			for (int k = i + 1; k <= n; k++)
				sumaDer += k;
			if (sumaDer == sumaIzq)
				return i;

		}

		return -1;

	}

	public int resolver() {

		if (this.n < 3)
			return -1;

		int sumaIzq = 1, sumaDer = (n / 2) * (n + 1);

		for (int i = 1; i <= this.n; i++) {
			if (sumaIzq == sumaDer)
				return i;
			else {
				sumaIzq += i;
				sumaDer -= i;
			}
		}
		return -1;
	}

	public static int metodo2(int n) {

		if (n < 3)
			return -1;

		for (int i = 1; i <= n; i++) {

			int sumaIzq = i * (i - 1) / 2;

			int sumaDer = (n * (n + 1) / 2 - i * (i + 1) / 2);

			if (sumaDer == sumaIzq)
				return i;

		}

		return -1;

	}

	public static void main(String[] args) {
		DerechaIzquierdaIguales d = new DerechaIzquierdaIguales(6);
		System.out.println(d.resolver());

	}

}
