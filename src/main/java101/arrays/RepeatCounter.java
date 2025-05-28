package main.java101.arrays;

public class RepeatCounter {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] control = new boolean[arr.length];

        System.out.println("Repeated numbers.");

        for (int i = 0; i < arr.length; i++) {

            if (control[i]) {
                continue;
            }

            int number = arr[i];
            int repeated = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (number == arr[j]) {
                    repeated++;
                    control[j] = true;
                }
            }

            System.out.println("number " + number + " repeated: " + repeated);
        }

    }
}
