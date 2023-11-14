class Main {
    public static void main(String[] args) {


    Inicio.escolhaUsuario();
    }
}





public class Funcionario {

    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}





import javax.swing.JOptionPane;
public class Inicio {
    public Funcionario cadastroFuncionarios = new Funcionario();
    public static void escolhaUsuario() {
        String[] arrayEScolhaInicio = {"funcionarios"};
        int respostaArrayE = JOptionPane.showOptionDialog(
                null,
                "oque você deseja fazer?",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, arrayEScolhaInicio, arrayEScolhaInicio[0]);


        if(respostaArrayE==0){
            String[] arrayFuncaoFuncionario = {"Cadastrar", "Ver"};
            int respostaArrayF = JOptionPane.showOptionDialog(
                    null,
                    "oque você deseja fazer?",
                    "funcioarios",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, arrayFuncaoFuncionario, arrayFuncaoFuncionario[0]);

            if (respostaArrayF == 0){
                cadastroFuncionarios.getIdade(JOptionPane.showInputDialog("qual a idade do funcionario?"));
            }else if (respostaArrayF == 1){

            }
        }
    }


}
