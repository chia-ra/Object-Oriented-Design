import java.io.*;

public class CreateFile {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter("command_line_input.txt"));
            File f = new File("command_line_input.txt");
            if (!f.exists()) {
                f.createNewFile();
            }

            System.out.println(">>input data for file " + f.getName());
            String end = "@q";
            String input = br.readLine();
            while (!input.equals(end)) {
                bw.write(input);
                bw.newLine();
                input = br.readLine();
            }
            bw.close();
            br.close();

        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } finally {
            System.out.println(">>done");
        }

    }
}
