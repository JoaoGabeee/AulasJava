import javax.swing.JOptionPane;

public class exerciciosRapidos {
    public static void main(String[] args) {
        controleTotal();
    }

    static void controleDaSoma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("digite outro valor"));

        JOptionPane.showMessageDialog(null, "resultado: " + Metodos.somar(a, b));
        controleTotal();
    }

    static void controleDosConceitos() {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("digite a nota"));
        JOptionPane.showMessageDialog(null, "seu conceito é " + Metodos.clasificarNota(nota));
        controleTotal();
    }

    static void controleIsPar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
        JOptionPane.showMessageDialog(null, "seu numero é " + Metodos.isPar(n));
        controleTotal();
    }

    static void controleArray() {
        Metodos.pArray();
        controleTotal();

    }

    static void sair() {
        JOptionPane.showMessageDialog(null, "Tchau!");
    }

    static void controleTotal() {
        int varControle = Integer.parseInt(JOptionPane.showInputDialog("[1] soma\n[2] conceito\n[3] par ou impar\n[4] array\n[5] sair"));

        switch (varControle) {

            case 1:
                controleDaSoma();
                break;
            case 2:
                controleDosConceitos();
                break;
            case 3:
                controleIsPar();
                break;
            case 4:
                controleArray();
                break;
            case 5:
                sair();
                break;
            default:
                JOptionPane.showMessageDialog(null, "não temos essa função!");
        }
    }
}
