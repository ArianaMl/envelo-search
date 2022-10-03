import java.sql.SQLException;

public class Main {

    private static boolean search(int[] numbers, int x){
        if ((x > numbers[0]) && (x < numbers[numbers.length-1])) {

            return false;
        }
        else {
            for (int number : numbers) {
                if (x == number) {

                    return true;
                }
            }
        }
       return false;
    }
    public static void main(String[] args)  {
      
    }
}
