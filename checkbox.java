import java.awt.*; // Importing the AWT package for GUI components
public class checkbox{
    checkbox(){
        Frame f = new Frame("Checkbox Example"); // Create a new Frame with the title "Checkbox Example"
        Checkbox c1 = new Checkbox("C+++"); // Create a Checkbox with the label "C++"
        c1.setBounds(100, 100, 50, 50); // Set the position and size of the Checkbox
        Checkbox c2 = new Checkbox("Java", true); // Create a Checkbox with the label "Java" and set it as selected
        c2.setBounds(100, 150, 50, 50); // Set the position and size of the Checkbox
        f.add(c1); // Add the first Checkbox to the Frame
        f.add(c2); // Add the second Checkbox to the Frame
        f.setSize(200, 200); // Set the size of the Frame to 400x400 pixels
        f.setLayout(null); // Set the layout manager to null for absolute positioning
        f.setVisible(true); // Make the Frame visible

    }
public static void main(String[] args) {
    new checkbox(); // Create a new instance of the checkbox class to display the GUI
    // The constructor of the checkbox class is called, which sets up the Frame and Checkboxes
    // The main method serves as the entry point for the program
    // It creates an instance of the checkbox class, which in turn creates and displays the GUI components
    // The program will run until the user closes the Frame window
    // The main method is static, allowing it to be called without creating an instance of the class
    // This is a common practice in Java for starting a program
}
}
