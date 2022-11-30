package teoria;

public class Hello {

	private String title;
	private int value;

	public Hello() {
		title += " World";
	}

	public Hello(int value) {
		this.value = value;
		title = "Hello ";
		new Hello();///Ver que pasa con esto
	}

	public static void main(String[] args) {
		Hello c = new Hello(5);
		System.out.println(c.title);
		
		///Salida Hello
	}

}
