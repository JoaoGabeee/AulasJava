import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    static double saldo;
    static int controle;

    public static void main(String[] args) {

        Random aleatorio = new Random();

        saldo = (double) aleatorio.nextInt(100001) / 100;

        entrada();
    }

    static void entrada() {
        controle = Integer.parseInt(JOptionPane.showInputDialog("seja bem vindo ao caixa eletronico! \n [1] saldo \n [2] depósito \n [3] saque \n [4] sair"));
        switch (controle) {

            case 1:
                saldo();
                break;

            case 2:
                deposito();
                break;

            case 3:
                saque();
                break;

            case 4:
                sair();
                break;

            default:
        }
    }

    static void saldo() {
        JOptionPane.showMessageDialog(null, saldo);
        entrada();
    }

    static void deposito() {
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("quanto deseja sacar? \n seu saldo é de: R$" + saldo));
        saldo += deposito;
        JOptionPane.showMessageDialog(null, "saldo atual: R$" + saldo);
        entrada();
    }

    static void saque() {
        int saque = Integer.parseInt(JOptionPane.showInputDialog("quanto deseja sacar? \n saldo atual: R$" + saldo));
        if (saque < saldo) {
            saldo -= saque;
            JOptionPane.showMessageDialog(null, "saque efetuado com sucesso! " + saldo);
            entrada():
        } else {
            JOptionPane.showMessageDialog(null, "você não tem saldo suficiente!");
            entrada();
        }

    }

    static void sair() {
        JOptionPane.showMessageDialog(null, "volte sempre!");

    }
}
