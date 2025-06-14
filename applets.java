import java.awt.*;
import javax.swing.*;

public class applets extends JFrame {
    public applets() {
        // Set the title of the JFrame
        setTitle("Hello World Applet");
        setSize(400, 400); // Set the size of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on exit
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method
        g.drawString("Hello World, asads new program", 50, 50); // Draw the string
    }

    public static void main(String[] args) {
        // Create an instance of the Applets class
        applets applet = new applets();
        applet.setVisible(true); // Make the JFrame visible
    }
}
