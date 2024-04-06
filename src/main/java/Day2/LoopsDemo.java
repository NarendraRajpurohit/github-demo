package Day2;

public class LoopsDemo {

    public static void main(String[] args) {

        //way1
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even numbers are " + i);
            }
        }
        System.out.println("with while loop");

        //way2
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("even numbers are " + i);
            }
            i++;
        }
        System.out.println("break");

        //way3 even number using for loop
        for ( int g = 2; g <= 100; g+=2)
        {
            System.out.println("even numbers are " + g);
        }
    }
}


