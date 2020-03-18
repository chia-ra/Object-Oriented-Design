import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            //br to access the filereader for the specific file: NOTE: file path must be specified for my computer
            br = new BufferedReader(new FileReader("C:\\Users\\chiar\\Downloads\\quote.txt"));
            System.out.println(">>extracted data from file " + "quote.txt :");
            String contentLine = br.readLine(); //read from quote.txt
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = br.readLine(); //print from file until the end of file
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
