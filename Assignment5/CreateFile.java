import java.io.*;

public class CreateFile {

    public static void main(String[] args) {
        //open buffered reader and writer to read from console and write to file, respectively
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File f = new File("command_line_input.txt");
            if (!f.exists()) {
                f.createNewFile(); //check to see if file already exists; if not; create it
            }
            br = new BufferedReader(new InputStreamReader(System.in)); //br to read from input
            bw = new BufferedWriter(new FileWriter("command_line_input.txt")); //bw accesses the file specified

            System.out.println(">>input data for file " + f.getName());
            String end = "@q";
            String input = br.readLine(); //read the first thing inputted to console
            while (!input.equals(end)) {
                bw.write(input); //write the input to file
                bw.newLine(); //add a new line to file
                input = br.readLine(); //loop the input variable to the next one
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
