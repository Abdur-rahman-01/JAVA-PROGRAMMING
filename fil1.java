import java.io.File;
import java.io.IOException;
// import java.io.FileWriter;

public class fil1 {
    public static void main(String[] args) {
        try {
            File file = new File("asad.txt");   
             
            if(file.createNewFile()) {   
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            //  FileWriter writer = new FileWriter("example.txt");
            // writer.write("Hello, this is a test.");                 //  // Write to the file
            // writer.close();
            // System.out.println("Successfully wrote to the file.")
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
