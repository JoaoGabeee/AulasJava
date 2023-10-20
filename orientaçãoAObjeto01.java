import javax.swing.*;

class Conta {


    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public void debito(double valor) {
        if (valor < this.saldo) {
            setSaldo(saldo - valor);

            return;
        }

        JOptionPane.showMessageDialog(null, "INVALIDO");
    }

    public void credito(double valor){
        this.saldo += valor;
    }
}





















import javax.swing.JOptionPane;

public class testeConta {
    public static void main(String[] args) {

        Conta contaBanco = new Conta();

        contaBanco.setNumero(001);
        contaBanco.setSaldo(10000);

        JOptionPane.showMessageDialog(null, "saldo " + contaBanco.getSaldo());
        contaBanco.debito(80);
        JOptionPane.showMessageDialog(null, "saldo " + contaBanco.getSaldo());
        contaBanco.debito(30);
    }
}
