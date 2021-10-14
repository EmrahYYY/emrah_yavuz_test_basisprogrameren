import java.util.Scanner;

public class BasicProgrammingApp {
    public static void main(String[] args) {


        Scanner myNumbers = new Scanner(System.in);
        System.out.println("give 4 numbers");
        int a = myNumbers.nextInt();
        int b = myNumbers.nextInt();
        int c = myNumbers.nextInt();
        int d = myNumbers.nextInt();

        {
            if (a > b && a > c && a > d) {
                System.out.println("the largest number:" + a);
            } else if (b > a && b > c && b > d) {
                System.out.println("the largest number:" + b);
            } else if (c > a && c > b && c > d) {
                System.out.println("the largest number:" + c);
            } else if (d > a && d > b && d > c) {
                System.out.println("the largest number:" + d);
            } else {
                System.out.println("the greatest numbers are equal");
            }
        }
        {
            if (a < b && a < c && a < d) {
                System.out.println("the smallest number:" + a);
            } else if (b < a && b < c && b < d) {
                System.out.println("the smallest number:" + b);
            } else if (c < a && c < b && c < d) {
                System.out.println("the smallest number:" + c);
            } else if (d < a && d < b && d < c) {
                System.out.println("the smallest number:" + d);
            } else {
                System.out.println("the smallest numbers are equal");
            }

        }

        {
            {
                System.out.println("van kleinste tot het gemiddelde van de 4 getallen:");
            }
            for (int x = 0; x <= (a + b + c + d) / 4; x++)


                if (x > a) System.out.println(x);
                else if (x > b) System.out.println(x);
                else if (x > c) System.out.println(x);
                else if (x > d) System.out.println(x);
        }
        {  //do {
            {
                System.out.println("wanner je een van de 4 getallen tegenkomt:");
            }
            for (int k = 0; k < 2000; k++)


                if (k < a && k < b && k < c && k < d) {
                    System.out.println(k);
                }


            //while ( k<a && k<b && k<c && k<d  );


        }

        //for (int t = 0; t < 100; t++)


        // for (int y = 100; y > 0; y--)


        //if ( t>50) System.out.println(t+y);


    }
}
