
public class Hello {
	private String title ;
	private int value;
	
	public Hello() {
	
		title+="_World";
		
		
	}
	public Hello(int value) {
	
		
		///this();
		this.value=value;
		title="hello";
		///Hello();
	}
	
	public static void main(String[]args) {
		Hello c=new Hello();
		System.out.println(c.title);
		
		
	}
}
