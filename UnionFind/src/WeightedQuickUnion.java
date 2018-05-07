
public class WeightedQuickUnion {
	private int[] id;
	private int[] sz;
	public WeightedQuickUnion(int N) {
		id = new int[N];
		sz = new int[N];
		//set id of each object to itself
		for (int i=0; i<N; i++) {
			id[i] = i;
			sz[i] = i;
		}
	}
	//change root of p to point to root of q (depth of p and q array accesses)
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		if (i==j) return;
		if (i > j) {
			id[j] = i;
			sz[i] +=sz[j];
		} else {
			id[i] = j;
			sz[j] +=sz[i];
		}
	}
	public int root(int i) {
		while (id[i] != i) i = id[i];
		return i;
	}
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
}
