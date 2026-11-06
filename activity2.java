import java.util.*;

class activity2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Hello User, please enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Hello "+name +", your number " +num +" shows you are very lucky.");
    }
}