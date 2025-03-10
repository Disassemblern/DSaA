import java.util.ArrayList;
import java.util.Scanner;

public class task2 {

    public static class NoAnswerException extends Exception {
        public NoAnswerException(String message) {
            super(message);
        }
    }

    public static int getSecondSmallest(int[] arr) throws NoAnswerException {
        if (arr == null || arr.length < 2) {
            throw new NoAnswerException("There is no second smallest element.");
        }

        int smallest = arr[0];
        Integer second_smallest = null;

        for (int i = 1; i < arr.length; i++) {
            int curr_val = arr[i];

            if (curr_val < smallest) {
                second_smallest = smallest;
                smallest = curr_val;
            } else if (curr_val > smallest && (second_smallest == null || curr_val < second_smallest)) {
                second_smallest = curr_val;
            }
        }
        if (second_smallest == null) {
            throw new NoAnswerException("There is no second smallest number in the array.");
        }

        return second_smallest;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (one per line). Enter 'q' to stop and get the result:");

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                continue;
            }

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        scanner.close();

        int[] arr = numbers.stream().mapToInt(i -> i).toArray();

        try {
            int result = getSecondSmallest(arr);
            System.out.println("\nSecond smallest value: " + result);
        } catch (NoAnswerException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}