import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main() {
        System.out.println("Please enter a list of numeric values separated by one space:");
        Scanner sc = new Scanner(System.in);
        System.out.println("The average of the numbers you entered is: " + calculateAverage(sc.nextLine()));
    }

    public static int calculateAverage(String userInput) {
        ArrayList<String> userArray = new ArrayList<>(Arrays.asList(userInput.split(" ")));
        int sum = 0;
        for (String number : userArray) {
            sum += Integer.parseInt(number);
        }
        return sum / userArray.size();
    }
}