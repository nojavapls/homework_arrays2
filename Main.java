public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Затраты составили "+ sum);
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
