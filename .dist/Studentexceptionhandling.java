import java.util.InputMismatchException;
import java.util.Scanner;
public class Studentexceptionhandling {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        int[] marks = new int[3];
        try{
            System.out.println("Enter your name: ");
            name = sc.nextLine();
            System.out.println("Enter your marks in 3 subjects(0=100):");
            for(int i=0; i<3; i++){
                marks[i] = sc.nextInt();
                if(marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Marks should be between 0 and 100.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric data.");
        } catch (IllegalArgumentException e) {
            System.out.println("validation error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for your input.");
            System.out.println("you may leave now");
        } 
        
        
         }
        
        
        
}