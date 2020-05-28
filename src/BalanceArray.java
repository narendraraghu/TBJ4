public class BalanceArray {

    //VMVare
    boolean getBalanceArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j <= i; j++) {
                leftSum = leftSum + arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum = rightSum + arr[j];
            }
            if (leftSum == rightSum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // int [] arr =  {1, 2, 3,  9, 1, 5};
        int[] arr = {11, 10, 1, 5, 5};

        BalanceArray solution = new BalanceArray();
        int length = arr.length;
        System.out.print(solution.getBalanceArray(arr));
    }
}
