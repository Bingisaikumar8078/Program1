import java.util.Scanner;

//import java.util.Scanner;
//
//public class Helloworld {
//    public static void main(String[] args) {
//        System.out.println("Sai");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if(a>b)
//            System.out.println(a);
//        else
//            System.out.println(b);
//
//
//    }
//}
public  class Helloworld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 ==0) &&( year%100!=0) || (year % 400==0))
            System.out.println("Leap year "+year);
        else
            System.out.println("not a leap year "+year);
    }
}