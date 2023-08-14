import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] array = {"abc", "def", "ghi", "jkl"};
        int x = JOptionPane.showOptionDialog(
                null,
                "escolha",
                "clique",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, array, array[0]);

    }
}
