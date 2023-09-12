import javax.swing.JOptionPane;

public class FIAS {
    public static void main(String[] args) {

        inicio();

    }

    static void inicio() {

        String[] array = {"msg Leonardo", "msg Mário", "msg Joao"};
        int controle = JOptionPane.showOptionDialog(
                null,
                "Qual mensagem vc quer?",
                "clique",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, array, array[0]);
        switch (controle) {
            case 0:
                leonardoEsc();
                break;
            case 1:
                marioEsc();
                break;
            case 2:
                joaoEsc();
                break;

            default:
                sair();
        }
    }

    static void leonardoEsc() {

        String[] arrayLeo = {"Leonardo", "Mário", "Joao"};
        int controleLeo = JOptionPane.showOptionDialog(
                null,
                "Qual seu nome?",
                "vá",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, arrayLeo, arrayLeo[0]);

        switch (controleLeo) {

            case 0:
                JOptionPane.showMessageDialog(null, "você é mt gostoso");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Você é legal");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Você é um lixo");
                break;
        }
        inicio();
    }

    static void marioEsc() {
        String[] arrayMario = {"Leonardo", "Mário", "Joao"};
        int controleMario = JOptionPane.showOptionDialog(
                null,
                "Qual seu nome?",
                "vá",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, arrayMario, arrayMario[0]);

        switch (controleMario) {

            case 0:
                JOptionPane.showMessageDialog(null, "quero doce");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "5");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "toma agua");
                break;
        }
        inicio();
    }

    static void joaoEsc() {

        String[] arrayJoao = {"Leonardo", "Mário", "Joao"};
        int controleJoao = JOptionPane.showOptionDialog(
                null,
                "Qual seu nome?",
                "vá",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, arrayJoao, arrayJoao[0]);

        switch (controleJoao) {

            case 0:
                JOptionPane.showMessageDialog(null, "Você é paia");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Você é do nordeste");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Você é um lindão");
                break;
        }
        inicio();
    }

    static void sair() {
        JOptionPane.showMessageDialog(null, "ta");
    }
}
