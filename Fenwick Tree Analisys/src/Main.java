import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int l = 10000;
        int[] numbers = new int[l];
        Random random = new Random();
        for(int i = 0; i < l; i++) {
            numbers[i] = random.nextInt(1000);
        }

        int[] arr = new int[l];
        FenwickTree fTree = new FenwickTree(arr);

        for(int i = 0; i < 10000; i++) {
            Thread.sleep(200);
            long startTime = System.nanoTime();
            System.out.print(fTree.update(i, numbers[i]) + " ");
            long endTime = System.nanoTime();
            System.out.println(endTime - startTime);
        }

        System.out.println();

        for(int i = 0; i < 100; i++) {
            Thread.sleep(200);
            long startTime = System.nanoTime();
            System.out.print(fTree.elSearch(random.nextInt(10000)) + " ");
            long endTime = System.nanoTime();
            System.out.println(endTime - startTime);
        }

        System.out.println();

        for(int i = 0; i < 1000; i++) {
            Thread.sleep(200);
            long startTime = System.nanoTime();
            System.out.print(fTree.delete(random.nextInt(1000)) + " ");
            long endTime = System.nanoTime();
            System.out.println(endTime - startTime);
        }



//      int[] inArray = {1, 3, 5, 7, 9, 11};
//        FenwickTree tr = new FenwickTree(inArray);
//        tr.printInputArray();
//        tr.printFenwickTree();
//
//        System.out.println();
//
//        tr.delete(0);
//        tr.printInputArray();
//        tr.printFenwickTree();
//
//        System.out.println();
//
//        tr.update(0, 1);
//        tr.printInputArray();
//        tr.printFenwickTree();
//
//        System.out.println(tr.elSearch(9));


    }
}