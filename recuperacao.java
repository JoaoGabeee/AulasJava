import javax.swing.JOptionPane;

public class Main {

    public static String[] heber = new String[10];

    public static void main(String[] args) {
        inicio();

    }

    static void inicio() {

        int controle = Integer.parseInt(JOptionPane.showInputDialog("olá, oque deseja?\n" +
                "[1]Reservar\n" +
                "[2]consultar mesas\n" +
                "[3]liberar mesa\n" +
                "[4]sair"));

        switch (controle) {

            case 1:
                reservaDeMesa();
                break;

            case 2:
                consultarMesa();
                break;

            case 3:
                liberarMesa();
                break;

            case 4:
                sair();
                break;

            default:
                sair();
        }


    }

    static void reservaDeMesa() {
        String mesas = "";
        for (int i = 0; i < heber.length; i++) {
            heber[i] = "liberada";
        }
        for (int i = 0; i < heber.length; i++) {
            if (heber[i] == "liberada") {
                mesas = "mesa " + i + ": liberada";
            } else {
                mesas = "mesa " + i + ": não está liberada";
            }

        }
        JOptionPane.showMessageDialog(null, mesas);
        JOptionPane.showInputDialog("Qual mesa deseja reservar?");
        inicio();
    }

    static void consultarMesa() {
        JOptionPane.showInputDialog("");
        inicio();
    }

    static void liberarMesa() {
        JOptionPane.showInputDialog("");
        inicio();
    }

    static void sair() {
        JOptionPane.showMessageDialog(null, "Obrigado pela prefêrencia");
    }
