 import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the circle: ");
        double radius = sc.nextDouble();

        // now use formula for calculating area of circle 
        double areaOfCircle = 3.14*(radius*radius);
        System.out.println("The Area of the circle is " + areaOfCircle );
sc.close();
        
    }
}
