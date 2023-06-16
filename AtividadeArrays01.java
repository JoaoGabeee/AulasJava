import javax.swing.JOptionPane;

public class Atividade1 {

    public static void main(String[] args) {
        String mostra = " ";
        int quantidade = 0, quantidade2 = 0;

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("digite valores para " + i));

            mostra += "\n" + array[i];

            if (array[i] < 0) {
                quantidade++;
            } else if (array[i] > 0) {
                quantidade2++;
            }
        }
        JOptionPane.showMessageDialog(null, mostra);
        JOptionPane.showMessageDialog(null, "são " + quantidade + " numeros negativos\n" + "e são " + quantidade2 + " numeros poistivos " +
                "\n e " + (10-(quantidade + quantidade2)) + " zeros");

    }
}
