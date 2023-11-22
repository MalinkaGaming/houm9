public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила : " + sum + " рублей");
        System.out.println();
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int maxPayout = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (maxPayout < arr[index]) {
                maxPayout = arr[index];
            }
        }
        System.out.println("Максимальная сумма трат за день составила" + maxPayout + "рублей");


        int minPayout = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (minPayout > arr[index]) {
                minPayout = arr[index];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayout + " рублей");
    }



    public static void task3() {
        int[] arr = generateRandomArray();
        double averagePayout = 0;
        for (int i = 0; i < arr.length; i++) {
            averagePayout += arr[i] / arr.length;
        }

        System.out.println();
        System.out.println(" Средняя сумма трат за месяц составила " + averagePayout + " рублей ");
    }

    public static void task4() {

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print("  ");
            System.out.print(reverseFullName[i]);
        }
    }
}
