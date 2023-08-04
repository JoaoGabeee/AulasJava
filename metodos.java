import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        cadastro();
    }

    static void  cadastroFrutas(){

        String nomeFruta = JOptionPane.showInputDialog("qual fruta voce deseja cadastrar");
        JOptionPane.showMessageDialog(null, "A fruta - " + nomeFruta + " foi cadastrada com sucesso");
        cadastro();
    }
    static void  cadastroVerduras(){
        String nomeVerdura = JOptionPane.showInputDialog("qual fruta vocce deseja cadastrar");
        JOptionPane.showMessageDialog(null, "A verdura - " + nomeVerdura + " foi cadastrada com sucesso");
        cadastro();
    }
    static void  sair(){
        JOptionPane.showMessageDialog(null, "obrigado por usar o sistema de cadastro de alimentos");
    }
    static void cadastro(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("sistema de cadastro de alimentos \n" + "para frutas digite: 0 \n e para verduras digite: 1"));

        switch (opcao){

            case 0:
                cadastroFrutas();

            case 1:
                cadastroVerduras();

            default:
                sair();
        }

    }
}
