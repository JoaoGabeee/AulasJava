import javax.swing.JOptionPane;

class Main {

    static double calculoMedia(double nota01, double nota02) {
        double media = (nota01 + nota02) / 2;
        return media;
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Para calsular sua média, insira duas notas do bimestre");
        double nota01 = Double.parseDouble(JOptionPane.showInputDialog("qual a primeira nota?"));
        double nota02 = Double.parseDouble(JOptionPane.showInputDialog("qual a segunda nota?"));
        JOptionPane.showMessageDialog(null, "sua média é " + calculoMedia(nota01, nota02));

    }
}
