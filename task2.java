public class task2 {

    public static void main(String[] args) {

    int max = 0;
    int[] arr = generateRandomArray();
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max)
                max = arr[i];
        if (arr[i] < min)
                min = arr[i];
    }
    System.out.println("Максимально потрачено в день "+ max + ", минимально потрачено в день "+ min);
}

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
