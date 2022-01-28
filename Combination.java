import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,nr;

        System.out.print("Enter n: ");
        n = input.nextInt();

        System.out.print("Enter r: ");
        r = input.nextInt();

        nr=n-r;

        for(int i =1;i<n;i++){
            n=i*n;
        }
        for(int i =1;i<r;i++){
            r=i*r;
        }
        for(int i =1;i<nr;i++){
            nr=i*nr;
        }
        System.out.println(n/r*nr);


    }
}
