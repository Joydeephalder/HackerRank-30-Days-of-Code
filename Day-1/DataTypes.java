import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {

            int i = 4;
                double d = 4.0;
                String s = "HackerRank ";

                Scanner scan = new Scanner(System.in);

                int a=scan.nextInt();
                double b=scan.nextDouble();
                String temp=scan.nextLine();
                String c=scan.nextLine();
                
                scan.close();

                System.out.println(i+a);
                System.out.println(d+b);
                System.out.println(s+c);
    }
}
