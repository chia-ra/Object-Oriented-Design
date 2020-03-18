import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntToHex {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(">>Enter an integer to be converted to hex");
            int input = Integer.parseInt(br.readLine());
            System.out.println(input + " to hex: " + Integer.toHexString(input));
            br.close();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: enter an integer");
            e.printStackTrace();
        } finally {
            System.out.println(">>done");
        }
        }
}
