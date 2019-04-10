package problemapkg;

public class Oras implements Comparable<Oras> {

	public final String name;
	public Drum[] vecini;
	public double distanceMin = Double.POSITIVE_INFINITY;
	public Oras previous;

	@Override
	public String toString() {
		return name;
	}

	public Oras(String name) {
		this.name = name;
	}

	public int compareTo(Oras o) {
		return Double.compare(distanceMin, o.distanceMin);
	}
}
