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

    // learned to integrate realtime in code 
import java.time.LocalTime;

public class allQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello ! Enter your name please 😃: ");
        String name = sc.nextLine();

        //taking realTime to greet user 
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        // using if condition for greeting 
        if(hour >= 5 && hour <12){
            System.out.println("Hey Good Morning " + name + " !");
        }else if (hour >=12 && hour < 18) {
            System.out.println("Hey Good Afternoon " + name + " !");
        }else if(hour >= 18 && hour < 22){
            System.out.println("Hey Good Evening " + name + " !");
        }else{
            System.out.println("Hey Good Night " + name + " !");
        }
 sc.close();
    }
}

