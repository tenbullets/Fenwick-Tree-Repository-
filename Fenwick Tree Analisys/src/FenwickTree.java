import java.util.Arrays;

public class FenwickTree {
    int[] sum;
    int[] inputArray;

    public FenwickTree(int[] arr) {
        this.inputArray = Arrays.copyOf(arr, arr.length);
        sum = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            update(i, arr[i]);
        }
    }

    public void printFenwickTree() {
        System.out.println(Arrays.toString(sum));
    }
    public void printInputArray() {
        System.out.println(Arrays.toString(inputArray));
    }

    public int prefixSum(int index) {
        int sum = 0;

        index = index + 1;
        while (index > 0) {
            sum += this.sum[index];
            index -= index & (-index);
        }
        return sum;
    }

    // return sum of the given range
    public int rangeSum(int from, int to) {
        if (from >= 0 && to >= 0 && to >= from) {
            return prefixSum(to) - prefixSum(from - 1);
        } else {
            return -1;
        }
    }

    public int update(int index, int val) {
        int  k = 0;
        inputArray[index] = val;

        index = index + 1;
        while (index <= sum.length) {
            sum[index] += val;
            index += index & (-index);
            k++;
        }
        return k;
    }

    public int delete(int index) {
        int k = 0;
        int val = inputArray[index];
        inputArray[index] = 0;

        index = index + 1;
        while (index <= sum.length) {
            sum[index] -= val;
            index += index & (-index);
            k++;
        }
        return k;
    }

//    public boolean elSearch(int el) {
//        for (int j : inputArray) {
//            if (el != j)
//                return false;
//        }
//        return true;
//    }

    public int elSearch(int el) {
        int k = 0;
        for (int j : inputArray) {
            if (el == j) {
                break;
            } else {
                k++;
            }
        }
        return k;
    }


}