import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        String[][] correctArray = { {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3" }};
        String[][] longArray1 = { {"0", "1", "2", "3", "4"}, {"0", "1", "2", "3", "4"}, {"0", "1", "2", "3", "4"}, {"0", "1", "2", "3", "4"}};
        String[][] longArray2 = { {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}};
        String[][] wrongValueArray = { {"0", "1", "2", ";"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3" }};

        List<String[][]> testingArray = new ArrayList<>();
        testingArray.add(correctArray);
        testingArray.add(longArray1);
        testingArray.add(longArray2);
        testingArray.add(wrongValueArray);

        testingArray.forEach(array -> {
            try {
                System.out.println(sumArray(array));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        });
    }

    static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(array.length > 4 || array[0].length > 4){
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}