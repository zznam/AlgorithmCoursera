
public class TestQuickFind {

	public static void main(String[] args) {
		QuickFindUF qf = new QuickFindUF(10);
		qf.union(1, 2);
		qf.union(5, 6);
		qf.union(8, 4);
		qf.union(1, 9);
		qf.union(1, 8);
		qf.union(2, 7);
		System.out.println(qf.connected(2, 1));
		
	}

}
