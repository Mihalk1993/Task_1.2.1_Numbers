import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 0 && number % 2 == 0) {
                filteredNumbers.add(number);
            }
        }

        filteredNumbers.sort(Comparator.naturalOrder());

        for (Integer filteredNumber : filteredNumbers) {
            System.out.println(filteredNumber);
        }

    }
}
