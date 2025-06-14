import java.awt.*;
public class frame{
    public static void main(String[] args) {
    Frame frame = new  Frame("Hello World Applet"); // Create a new Frame with the title "Hello World Applet" 
    frame.resize(400, 400); 
    frame.setBackground(Color.red);
      // Call the drawstring method to draw "Hello World" at (100, 100)
    // Set the size of the Frame to 400x400 pixels
     frame.show();
    }
}
