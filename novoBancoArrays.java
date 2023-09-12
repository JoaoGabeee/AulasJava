import javax.swing.*;
import java.util.*;

public class Main {

    static String nomeUsuario, senhaUsuario, supostaSenhaDoUser;
    static int resposta, saldo, depositoInicial;

    static Random aleatorio = new Random();

    public static void main(String[] args) {
        criarConta();

    }

    static void inicio() {
        String[] array = {"Saldo", "Sacar", "Deposito", "Sair"};

        resposta = JOptionPane.showOptionDialog(null,
                "Escolha a operação que deseja realizar " + nomeUsuario,
                "Banco",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, array, array[0]);

        switch (resposta) {

            case 0:
                saldoBanco();
                break;

            case 1:
                saqueBanco();
                break;

            case 2:
                depositoBanco();
                break;

            default:
                sairPrograma();
        }
    }

    static void saldoBanco() {

        JOptionPane.showMessageDialog(null, "Seu saldo é de R$:" + saldo);
        inicio();
    }

    static void saqueBanco() {
        supostaSenhaDoUser = JOptionPane.showInputDialog("Digite sua senha para proseguir.");

        if (supostaSenhaDoUser.equals(senhaUsuario)) {
            int valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja sacar? saldo R$:" + saldo));
            if (saldo >= valorSaque && valorSaque > 0) {
                saldo -= valorSaque;
                JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.\nSaldo atual R$:" + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
        inicio();
    }

    static void depositoBanco() {
        supostaSenhaDoUser = JOptionPane.showInputDialog("Digite sua senha para proseguir.");

        if (supostaSenhaDoUser.equals(senhaUsuario)) {
            int deposito = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar?"));
            saldo += deposito;
            JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso.\n saldo atual R$:" + saldo);
            inicio();
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
        inicio();
    }

    static void sairPrograma() {
        JOptionPane.showMessageDialog(null, "Obrigado pela preferencia, volte sempre!");
    }

    static void criarConta() {
        JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo.\nIremos ajudar a criar sua conta!");
        nomeUsuario = JOptionPane.showInputDialog("Qual seu nome?");
        senhaUsuario = JOptionPane.showInputDialog("Digite uma senha.");
        primeiroDeposito();
        while (depositoInicial < 10) {
            JOptionPane.showMessageDialog(null, "Valor abaixo do minimo.\nTente novamente.");
            primeiroDeposito();
        }
        JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso!");
        saldo = depositoInicial;
        JOptionPane.showMessageDialog(null, "NOME: " + nomeUsuario + "\nSENHA: *********" + "\nVALOR DEPOSITADO: " + depositoInicial);
        inicio();
    }

    static void primeiroDeposito() {
        depositoInicial = Integer.parseInt(JOptionPane.showInputDialog("Deposite um valor para ativar sua conta (o valor deve ser maior que R$:10)."));

    }
}
