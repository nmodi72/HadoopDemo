import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner("XYZ");
        int test = -1;
        try {
            int x = sc.nextInt();
            test = 0;
        } catch (NullPointerException e) {
            test = 1;
        } catch (InputMismatchException e) {
            test = 2;
        } catch (Exception e) {
            test = 3;
        }
    }

}
