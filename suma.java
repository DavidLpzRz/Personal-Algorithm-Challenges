public class suma {

    public static int contar(int num) {
        int suma = 0;

        String numeros = ("" + num);
        String[] numer = numeros.split("");
        for (int i = 0; i < numer.length; i++) {
            suma += Integer.parseInt(numer[i]);
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(contar(112589));
    }
}
