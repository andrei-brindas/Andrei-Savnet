package problemapkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

	public static void computePaths(Oras source) {

		source.distanceMin = 0;
		PriorityQueue<Oras> orase = new PriorityQueue<>();
		orase.add(source);

		while (!orase.isEmpty()) {
			Oras o = orase.poll();

			// Visit each edge exiting
			for (Drum d : o.vecini) {
				Oras oras = d.target;
				double weight = d.distance;
				double distance = o.distanceMin + weight;
				if (distance < oras.distanceMin) {
					orase.remove(oras);

					oras.distanceMin = distance;
					oras.previous = o;
					orase.add(oras);
				}
			}
		}
	}

	private static List<Oras> getShortestPathTo(Oras target) {

		List<Oras> path = new ArrayList<>();
		Oras oras = target;
		while (oras != null) {
			path.add(oras);
			oras = oras.previous;
		}

		Collections.reverse(path);
		return path;
	}

	public static void main(String[] args) {

		Oras A = new Oras("A");
		Oras B = new Oras("B");
		Oras D = new Oras("D");
		Oras F = new Oras("F");
		Oras K = new Oras("K");
		Oras J = new Oras("J");
		Oras M = new Oras("M");
		Oras O = new Oras("O");
		Oras P = new Oras("P");
		Oras R = new Oras("R");
		Oras Z = new Oras("Z");

		// Vecinii
		A.vecini = new Drum[] { new Drum(M, 8) };
		B.vecini = new Drum[] { new Drum(D, 11) };
		D.vecini = new Drum[] { new Drum(B, 11) };
		F.vecini = new Drum[] { new Drum(K, 23) };
		K.vecini = new Drum[] { new Drum(O, 40) };
		J.vecini = new Drum[] { new Drum(K, 25) };
		M.vecini = new Drum[] { new Drum(R, 8) };
		O.vecini = new Drum[] { new Drum(K, 40) };
		P.vecini = new Drum[] { new Drum(Z, 18) };
		R.vecini = new Drum[] { new Drum(P, 15) };
		Z.vecini = new Drum[] { new Drum(P, 18) };

		computePaths(A);
		System.out.println("Distance to " + Z + ": " + Z.distanceMin);
		List<Oras> path = getShortestPathTo(Z);
		System.out.println("Path: " + path);

	}
}
