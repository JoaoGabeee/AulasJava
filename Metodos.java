import javax.swing.*;

public class Metodos {
    static int somar(int a, int b) {

        int resultado = a + b;
        return resultado;
    }

    static char clasificarNota(double nota) {

        if (nota >= 9.0) {
            return 'A';
        } else if (nota >= 8.0) {
            return 'B';
        } else if (nota >= 6.0) {
            return 'C';
        }
        return 'D';
    }

    public static boolean isPar(int n) {

        return n % 2 == 0;
    }

    static void pArray() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("digite um valor para o array de numero: " + i));
        }
        exibirArray(array);
    }

    static void exibirArray(int[] array) {
        String todosValores = "";
        for (int i = 0; i < array.length; i++) {

           todosValores += "\n" + array[i];
        }
        JOptionPane.showMessageDialog(null,todosValores);
    }
}