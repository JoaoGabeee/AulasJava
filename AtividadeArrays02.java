import javax.swing.JOptionPane;

public class AtividadeArrays02 {

    public static void main(String[] args) {
        float media = 0;
        String alunosNomes = "";

        String alunos[] = new String[12];
        float alunosNota[] = new float[12];

        for (int i = 0; i < 12; i++) {
            alunos[i] = JOptionPane.showInputDialog("qual o nome do " + (i + 1) + "º" + " aluno?");
            alunosNota[i] = Float.parseFloat(JOptionPane.showInputDialog("qual a nota dele?"));

        }
        for (int i = 0; i < 12; i++) {

            media += alunosNota[i];
        }
        media = media / 12;

        JOptionPane.showMessageDialog(null, "a media da turma foi: " + media);

        for (int i = 0; i < media; i++) {

            if (media > alunosNota[i]) {

                alunosNomes += "\n" + alunos[i] + " - " + alunosNota[i];
                
            }
        }
        JOptionPane.showMessageDialog(null, "os aluno(a)s: " + alunosNomes + "\n ficou a baixo da media");
    }
}
