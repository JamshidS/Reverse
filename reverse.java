import java.util.*;
public class reverse{
     public static void main(String[] args) {
        System.out.println("The Program will return the reverse of entered number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to take its reverse: ");
        int num = sc.nextInt();
        int rem;
        String str = "";
        while(num>0){
            rem = num%10;
            str = str+rem;
            num /=10;
        }
        System.out.print("The Reverse of the number: "+str);
    }
}