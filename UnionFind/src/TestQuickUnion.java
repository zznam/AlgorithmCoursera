
public class TestQuickUnion {
	public static void main(String[] args) {
		QuickUnion qu = new QuickUnion(10);
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
