import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chiar\\Downloads\\quote.txt"));
            System.out.println(">>extracted data from file " + "quote.txt :");
            String contentLine = br.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            System.out.println("error with file");
            e.printStackTrace();
        } finally {
            System.out.println(">>done");
        }
    }
}
