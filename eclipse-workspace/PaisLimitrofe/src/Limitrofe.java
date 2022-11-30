
public class Limitrofe implements Comparable<Limitrofe> {
	private String p1;
	private String p2;

	public Limitrofe(String p1, String p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	

	public String getP1() {
		return p1;
	}

	public String getP2() {
		return p2;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
		result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Limitrofe other = (Limitrofe) obj;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		return true;
	}



	@Override
	public int compareTo(Limitrofe o) {
		if(this.p1.equals(o.p1))
			return this.p2.compareTo(o.p2);
		return this.p1.compareTo(o.p1);
	}



	




}
