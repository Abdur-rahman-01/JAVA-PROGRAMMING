import javax.swing.*;
public class jbuttons{
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example"); // Create a new JFrame with the title "JButton Example"
        JButton button = new JButton("you are gay"); // Create a new JButton with the label "Click Me!"
        
        button.setBounds(100, 100, 200, 50); // Set the position and size of the button (x, y, width, height)
        
        frame.add(button); // Add the button to the frame
        frame.setSize(400, 400); // Set the size of the frame (width, height)
        frame.setLayout(null); // Set the layout manager to null for absolute positioning
        frame.setVisible(true); // Make the frame visible
    }
}
