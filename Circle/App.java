import javax.swing.JOptionPane;

/**
 * Excercise from Starting Out With Java 5th Edition
 * Chapter 6 Quesion 7
 * 
 * Program creates a circle object, with user input,
 * and displays the area, diameter, and circumfrence
 */
public class App {
    public static void main(String[] args) {
        
        // Get radius from user
        String input = JOptionPane.showInputDialog(null, "What is the radius of your circle?");
        double radius = Double.parseDouble(input);

        // Create Circle object
        Circle circle = new Circle(radius);

        // Print area, diameter, circumfrence
        JOptionPane.showMessageDialog(null, "The area is: " + circle.getArea());
        JOptionPane.showMessageDialog(null, "The diameter is: " + circle.getDiameter());
        JOptionPane.showMessageDialog(null, "The circumfrence is: " + circle.getCircumfrence());
    }
}
