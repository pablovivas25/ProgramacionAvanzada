import java.util.List;

public class Celular {
		private List<Integer> memoriaconsecutiva;

		public Celular(List<Integer> memoriaconsecutiva) {
			super();
			this.memoriaconsecutiva = memoriaconsecutiva;
		}

		public List<Integer> getMemoriaconsecutiva() {
			return memoriaconsecutiva;
		}
		
		public boolean hayMemoriaSuficiente(int memoria) {
			int sum=0;
			for(Integer i:memoriaconsecutiva)
				sum+=i;
			return sum>=memoria?true:false;
		}
}
