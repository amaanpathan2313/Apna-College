import java.util.*;

class roundno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number in point : ");
        double a = sc.nextDouble();

        a = Math.round(a);   //Math.round used to convert point value into round number
        System.out.println(a);
        
        sc.close();
    }
}