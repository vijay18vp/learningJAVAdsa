// // Que1 - Write a program to print whether a number is even or odd, also take input from the user.
 import java.util.Scanner;

// public class allQue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double number = sc.nextDouble();

//         // using if else condition to check given number is even or odd 
//         if(number % 2 == 0){
//             System.out.println("The Given number " + number + " is Even ");
//         }else{
//             System.out.println("The Given number " + number + " is Odd ");
//         }

//         // closing 
//         sc.close();
//     }
// }



// Que2 - Take name as input and print a greeting message for that particular name.

//     // learned to integrate realtime in code 
// import java.time.LocalTime;

// public class allQue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Hello ! Enter your name please 😃: ");
//         String name = sc.nextLine();

//         //taking realTime to greet user 
//         LocalTime now = LocalTime.now();
//         int hour = now.getHour();

//         // using if condition for greeting 
//         if(hour >= 5 && hour <12){
//             System.out.println("Hey Good Morning " + name + " !");
//         }else if (hour >=12 && hour < 18) {
//             System.out.println("Hey Good Afternoon " + name + " !");
//         }else if(hour >= 18 && hour < 22){
//             System.out.println("Hey Good Evening " + name + " !");
//         }else{
//             System.out.println("Hey Good Night " + name + " !");
//         }
//  sc.close();
//     }
// }



// Que3 - Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

// public class allQue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Principal Amount: ");
//         double principalAmount = sc.nextDouble();
//         System.out.print("Enter the Rate of interest per year: ");
//         double Rate = sc.nextDouble();
//         System.out.print("Enter the TimePeriod: ");
//         double Time = sc.nextDouble();

//         double simpleInterest = (principalAmount * Rate * Time) / 100 ;
//         System.out.println("The Simple Interest will be : " + simpleInterest);
//         sc.close();
//     }
// }



//Que4 - Take in two numbers and an operator (+, -, * /) and calculate the value. (Use if conditions)

// public class allQue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter you first number: ");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter your second number: ");
//         double num2 = sc.nextDouble();
//         System.out.println("Enter the Operation: ");
//         System.out.print("Choose operator:" + "1.+ " + "2.- " + "3.* " + "4./");
//         int choose = sc.nextInt();

//         if(choose == 1){
//             double Sum = num1 + num2 ;
//             System.out.print("The Sum of Two number is " + Sum);
//         }else if(choose == 2){
//             double Difference = num1 - num2 ;
//             System.out.println("The Difference between the numbers is " + Difference);
//         }else if(choose == 3){
//             double Product = num1*num2;
//             System.out.println("The Product of two number is " + Product);
//         }else{
//             double Division = num1/num2;
//             System.out.println("The Division of two number is " + Division);
//         }

//         sc.close();

//     }
// }



//Que5 - Take 2 numbers as input and print the largest number.
public class allQue {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double num1 = sc.nextDouble();
          System.out.print("Enter the Second number: ");
        double num2 = sc.nextDouble();

        if(num1 > num2){
            System.out.println("num1 is greater than num2 ");
        }else if(num1 < num2 ){
            System.out.println("num1 is smaller than num2 ");
        }else {
           System.out.println("num1 is equal to num2 ");    
        }

        sc.close();
      }
}