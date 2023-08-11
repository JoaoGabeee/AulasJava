import javax.swing.JOptionPane;
class Main {

    static String retornaNome(){
        String nomeUsuario = JOptionPane.showInputDialog("entre com seu nome ");
        return nomeUsuario;
    }
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Seja bem vindo " + retornaNome());
    }
}
