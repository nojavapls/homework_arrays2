public class task3 {

    public static void main(String[] args) {

        double average = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            average +=arr[i];
        }
        System.out.println("В среднем потрачено за день "+ (average/(arr.length)));
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
