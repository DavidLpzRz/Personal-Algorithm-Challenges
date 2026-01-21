public class fibonacci {

    public static int fibonacci(int n) {
        int num = 0;
        int num2 = 1;
        int contador = 0;

        while (n != contador) {
            int numEx = num2;
            num += num2;

            num2 = num;
            num = numEx;

            contador++;
        }
        return num;
    }

    public static void generarFibonacci(int n) {
        int num = 0;
        int num2 = 0;
        boolean acep = false;
        int contador = 0;

        while (n != contador) {
            int numEx = num2;
            System.out.println("Paso " + (contador+1) + ": " + num + " + " + num2 + " = " + (num+num2));
            num += num2;

            num2 = num;
            num = numEx;

            if (num2 == 0) {
                num2++;
            }
            contador++;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        generarFibonacci(8);
    }
}
