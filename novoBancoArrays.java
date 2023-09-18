import javax.swing.*;
import java.util.*;

public class Main {

    static String nomeUsuario, senhaUsuario, supostaSenhaDoUser, resposta;
    static int saldo, depositoInicial;

    static Random aleatorio = new Random();

    public static void main(String[] args) {
        jaTenhoOuNaoConta();

    }

    static void conta() {
        String[] array = {"Saldo", "Sacar", "Deposito", "Entrar em outra conta", "Criar outra conta", "Sair"};

        String resposta = (String) JOptionPane.showInputDialog(
                null,
                "O que você desejar fazer: ",
                "Operações",
                JOptionPane.PLAIN_MESSAGE,
                null,
                array,
                array[0]
        );

        switch (resposta) {
            case "Saldo" -> {
                saldoBanco();

            }
            case "Sacar" -> saqueBanco();
            case "Depositar" -> depositoBanco();
            default -> sairPrograma();
        }
    }

    static void saldoBanco() {

        JOptionPane.showMessageDialog(null, "Seu saldo é de R$:" + saldo);
        conta();
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
        conta();
    }

    static void depositoBanco() {
        supostaSenhaDoUser = JOptionPane.showInputDialog("Digite sua senha para proseguir.");

        if (supostaSenhaDoUser.equals(senhaUsuario)) {
            int deposito = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar?"));
            saldo += deposito;
            JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso.\n saldo atual R$:" + saldo);
            conta();
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
        conta();
    }

    static void sairPrograma() {
        JOptionPane.showMessageDialog(null, "Obrigado pela preferencia, volte sempre!");
    }

    static void criarConta() {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo.\nIremos ajudar a criar sua conta!");
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
        conta();
    }

    static void primeiroDeposito() {
        depositoInicial = Integer.parseInt(JOptionPane.showInputDialog("Deposite um valor para ativar sua conta (o valor deve ser maior que R$:10)."));

    }

    static void jaTenhoOuNaoConta() {

        String[] array = {"Sim", "Não", "Sair"};

        int simNaoSair = JOptionPane.showOptionDialog(
                null,
                "Você já tem uma conta em nosso banco?",
                "Olà",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, array, array[0]);

        if (simNaoSair == 0) {
            entrarConta();
        } else if (simNaoSair == 1) {
            criarConta();
        } else {
            sairPrograma();
        }
    }

    static void entrarConta() {
        String supostoNome = JOptionPane.showInputDialog("Qual o nome da sua conta?");
        if (supostoNome.equals(nomeUsuario)) {
            String supostaSenha = JOptionPane.showInputDialog("Qual sua senha?");
            if (supostaSenha.equals(senhaUsuario)) {
                conta();
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
                sairPrograma();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome não encontrado!\nTente novamente.");
            entrarConta();
        }
    }
}
