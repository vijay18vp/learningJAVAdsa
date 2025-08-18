 import java.util.Scanner;
// public class Questions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Radius of the circle: ");
//         double radius = sc.nextDouble();

//         // now use formula for calculating area of circle 
//         double areaOfCircle = 3.14*(radius*radius);
//         System.out.println("The Area of the circle is " + areaOfCircle );
// sc.close();
        
//     }
// }


// Que2 - Area Of Triangle 
public class Questions {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the hieght of The Triangle : ");
    double hieght  = sc.nextDouble();
    System.out.print("Enter the base of The Triangle : ");
    double base = sc.nextDouble();

    // formula for Triangle Area 
   double area = 0.5 *(hieght*base);
   System.out.println("The area Of the Triangle is " + area );

   }
}