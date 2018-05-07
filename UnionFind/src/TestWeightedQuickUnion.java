
public class TestWeightedQuickUnion {
	public static void main(String[] args) {
		WeightedQuickUnion qu = new WeightedQuickUnion(10);
		qu.union(1, 2);
		qu.union(3, 4);
		qu.union(1, 4);
		qu.union(8, 2);
		qu.union(1, 7);
		qu.union(6, 2);
		qu.union(2, 9);
		System.out.println(qu.connected(9, 7));
		
		
	}
}
