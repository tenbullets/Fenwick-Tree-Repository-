public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] inArray = {1, 3, 5, 7, 9, 11};
        FenwickTree tr = new FenwickTree(inArray);
        tr.printInputArray();
        tr.printFenwickTree();

        System.out.println();

        tr.delete(0);
        tr.printInputArray();
        tr.printFenwickTree();

        System.out.println();

        tr.update(0, 1);
        tr.printInputArray();
        tr.printFenwickTree();

        System.out.println();

        System.out.println(tr.elSearch(9));
        System.out.println(tr.elSearch(24));
        System.out.println(tr.prefixSum(2));
        System.out.println(tr.rangeSum(3,5));
    }
}