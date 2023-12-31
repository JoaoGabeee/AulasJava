import javax.swing.JOptionPane;
import java.util.*;


public class Main {

    private static String nomeUsuario, senhaUsuario, ruaUsuario, ciadadeUsuario, numeroCasaUsuario;


    public static void main(String[] args) {
        String[] array = {"Cadastrar", "Entrar", "Continuar anonimo", "Sair"};

        String resposta = (String) JOptionPane.showInputDialog(
                null,

                "Você deseja?",
                "Bem-vindo a PizzIF",
                JOptionPane.PLAIN_MESSAGE,

                null,
                array,
                array[0]
        );

        switch (resposta) {
            case "Cadastrar" -> cadastroConta();
            case "Entrar" -> entrarConta();
            case "Continuar anonimo" -> continuarAnonimo();
            default -> {
                JOptionPane.showMessageDialog(null, "Saindo...");
                return;
            }

        }
    }

    static void cadastroConta() {

        JOptionPane.showMessageDialog(null, "Iremos ajudar a criar sua conta!");

        nomeUsuario = JOptionPane.showInputDialog("Qual será o nome do usuario?");
        ciadadeUsuario = JOptionPane.showInputDialog("Qual sua cidade?");
        ruaUsuario = JOptionPane.showInputDialog("Qual sua rua?");
        numeroCasaUsuario = JOptionPane.showInputDialog("Qual o numero da sua casa?");
        senhaUsuario = JOptionPane.showInputDialog("Qual a senha do seu cadastro?");

        LinkedHashMap<String, String> usuario = new LinkedHashMap<>();
        usuario.put("nome", nomeUsuario);
        usuario.put("cidade", ciadadeUsuario);
        usuario.put("rua", ruaUsuario);
        usuario.put("casa", numeroCasaUsuario);
        usuario.put("senha", senhaUsuario);

        for (var valor: usuario.values()) {
            System.out.printf(valor);
        }
        TesteArquivo.anexarAoarquivo(usuario);
    }

    static void cardapioPizzif(){
        ArrayList<String> saboresPizza = new ArrayList<String>();

        saboresPizza.add("");

    }

    public static void entrarConta() {}
    public static void continuarAnonimo() {}

}





import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class TesteArquivo {
    public static void main(String[] args) {
        File arquivo = new File("TesteArquivo.txt");
        LinkedHashMap<String, String> infos = new LinkedHashMap<>();



        try(FileWriter fileWriter = new FileWriter(arquivo, false)) {
            arquivo.createNewFile();

            for (var info: infos.values()) {
                fileWriter.append(info);
            }

            fileWriter.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void anexarAoarquivo(LinkedHashMap<String, String> info){

        for (var i: info.values()) System.out.println(i);
    }
}
