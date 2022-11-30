
public class Main {

	public static void main(String[] args) {
		int vect[]= {1,3,4,5,-2,-5,10,20,40,50};
		int k=20;
		for(int i=0;i<vect.length;i++) {
			if(vect[i]<k)
				System.out.println(vect[i]);
		}
		//CC:0(n)
		System.out.println();
		int j=0;
		while(vect[j]-k<0) {
			System.out.println(vect[j]);
			j++;
		}
	}

}
