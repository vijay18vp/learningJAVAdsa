// to see whether the change is reflected in the main method or not 
public class changeValue {
    public static void main(String[] args) {
        int[] marks = {97 , 98 , 95};
        System.out.println("The value of the marks is before change is :" + marks[0]);
        change(marks);
    }
    static void change(int[] arr){
        arr[0] = 100 ;
        System.out.println("The value of the marks after change is : " + arr[0]);
    }
}