import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Resolver  {


	public static void main(String[] args) {
		String vec[]= {"hola","hola","hola","pablo","pablo","pablo","pablo","hola","hola"};
		String vec2[]= {"Hola","pa","blo","roman","Roberto","abecedario"};
		
		Arrays.sort(vec2,(str1,str2)->str2.length()-str1.length());
		int longitud=0;
		int n=4;
		for(int i=0;i<n-1;i++) {
			longitud+=vec2[i].toString().length();
		}
		System.out.println(longitud);
		
	
}
class Sortbyroll implements Comparator<String> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(String a, String b)
    {
       if(a.toString().length() > b.toString().length())
    	   return -1;
       if(a.toString().length() < b.toString().length())
    	   return 1;
       return 0;
    }
}
}