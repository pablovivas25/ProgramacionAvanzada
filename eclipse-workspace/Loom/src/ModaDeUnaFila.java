import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class ModaDeUnaFila {
	public int devolverClave(int maximoValor,Map<Integer,Integer>mapa) {
		Integer claveMayor=Integer.MIN_VALUE;
		for(Integer key : mapa.keySet()){
	        if(mapa.get(key)==maximoValor){
	            if(key>claveMayor)
	            	claveMayor=key;
	        }
	    }
		return claveMayor;
	}
	public int [] devolverModas(int[][] mat) {
		//Almaceno los numeros y su ocurrencias
		Map<Integer,Integer> mapa =new HashMap<Integer,Integer>();
		//Lo uso para ordenar el mapa por el valor mayor
		List<Entry<Integer, Integer>> list = new ArrayList<>(mapa.entrySet());
		//Aca almaceno las modas
		int moda[]=new int[mat.length];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mapa.put(mat[i][j],1)!=null)
					mapa.put(mat[i][j], mapa.get(mat[i][j])+1);
			}
			
		
			list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
			Integer maximo=Collections.max(mapa.values());
			if(maximo==1)
				moda[i]=Collections.max(mapa.keySet());
			else {
				moda[i]=devolverClave(maximo,mapa);
			}
			mapa.clear();
		}
		return moda;
		
	}
	public static void main(String[] args) {
		int vec[][]= {{1,2,3,4},{5,-6,-6,20},{1,1,10,10}};
		int vec2[][]= {{1,2,3,4},{-5,-6,-6,20},{1,1,1,10}};
		int vec3[][]= {{0,0,-1,-1},{-5,-6,-6,-5},{0,0,1,1}};
		int vec4[][]= {{1,2,3,4},{100,100,200,300},{0,0,1,10}};
		
		
		
		ModaDeUnaFila m=new ModaDeUnaFila();
		for(Integer i:m.devolverModas(vec))
			System.out.println(i);
			
		
	}

}
