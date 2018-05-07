
public class QuickUnion {
	private int[] id;
	
	public QuickUnion(int N) {
		id = new int[N];
		//set id of each object to itself
		for (int i=0; i<N; i++) {
			id[i] = i;
		}
	}
	//change root of p to point to root of q (depth of p and q array accesses)
	public void union(int p, int q) {
		int i = id[p];
		int j = id[q];
		id[i] = j;
	}
	public int root(int i) {
		while (id[i] != i) i = id[i];
		return i;
	}
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
}
