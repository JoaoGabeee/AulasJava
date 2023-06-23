import javax.swing.JOptionPane;

public class Estacionamento {
    public static void main(String[] args) {
        final int PRECO_HORA = 20;
        final int PRECO_MINUTO = 33;
        final int NUMERO_DE_VAGAS = 5;
        int horaDeEntrada, minutoDeEntrada, totalVazias, vagaDesejada, horaDeSaida, minutoDeSaida, diferencaHoras, diferencaMinutos;
        double valorTotal;
        String placaCarro, escolha, mostrarVagas;

        String[] vagas = new String[5];

        for (int i  = 0; i < NUMERO_DE_VAGAS; i++) {
            vagas[i] = "VAZIA";
        }

        int[] tempoEstacionado = new int[NUMERO_DE_VAGAS];
        int[] horasDeEntrada = new int[NUMERO_DE_VAGAS];
        int[] minutosDeEntrada = new int[NUMERO_DE_VAGAS];

        labelWhile:
        while (true) {
            escolha = JOptionPane.showInputDialog("Estacionamento - Vagas Totais: " + NUMERO_DE_VAGAS + "\n[0] Verificar vagas \n[1] Adicionar carro \n[2] Remover Carro \n[3] Sair");
            switch (escolha) {
                case "0":
                    totalVazias = 0;
                    mostrarVagas = "";

                    for (int i = 0; i < NUMERO_DE_VAGAS; i++) {
                        if (vagas[i].equals("VAZIA")) {
                            totalVazias += 1;
                        }

                        mostrarVagas += "\n" + "Vaga: " + i + " "+ vagas [i];
                    }

                    JOptionPane.showMessageDialog(null, "Vagas Vazias: " + totalVazias + "\nVagas Preenchidas: " + (NUMERO_DE_VAGAS - totalVazias) + "\nDisposição vagas: " + mostrarVagas);
                    break;

                case "1":
                    horaDeEntrada = Integer.parseInt(JOptionPane.showInputDialog("Qual o horário de entrada? (Apenas horas. Formato de 24 horas)"));
                    minutoDeEntrada = Integer.parseInt(JOptionPane.showInputDialog("Quais os minutos da hora: "));
                    placaCarro = JOptionPane.showInputDialog("Qual a placa do carro? ");
                    vagaDesejada = Integer.parseInt(JOptionPane.showInputDialog("Qual a vaga desejada? (0 a " + NUMERO_DE_VAGAS + ")"));

                    if (vagaDesejada <= NUMERO_DE_VAGAS && vagaDesejada >= 0) {
                        vagas[vagaDesejada] = placaCarro;
                        horasDeEntrada[vagaDesejada] = horaDeEntrada;
                        minutosDeEntrada[vagaDesejada] = minutoDeEntrada;

                    } else {
                        JOptionPane.showMessageDialog(null, "Vaga inválida!");
                    }

                    break;

                case "2":
                    horaDeSaida = Integer.parseInt(JOptionPane.showInputDialog("Qual o horário de saída? (apenas horas. Formato de 24 horas)"));
                    minutoDeSaida = Integer.parseInt(JOptionPane.showInputDialog("Quais os minutos da hora de saída: "));
                    placaCarro = JOptionPane.showInputDialog("Qual a placa do carro? ");
                    vagaDesejada = -1;

                    for (int i = 0; i < NUMERO_DE_VAGAS; i++) {
                        if (vagas[i].equals(placaCarro)) {
                            vagaDesejada = i;
                        }
                    }

                    if (vagaDesejada == -1) {
                        JOptionPane.showMessageDialog(null, "Carro não encotrado!");
                        break;
                    }
                    vagas[vagaDesejada] = "VAZIA";

                    int totalHoras = (horaDeSaida  - horasDeEntrada[vagaDesejada]) - 1;
                    int totalMinutos = minutoDeSaida - minutosDeEntrada[vagaDesejada] + 60;
                    valorTotal = (double) (totalHoras * PRECO_HORA / 100 + totalMinutos * PRECO_MINUTO) / 100;

                    labelWhileDois:
                    while(true) {

                        escolha = JOptionPane.showInputDialog("Total de horas:" + totalHoras + "\nTotal: R$" + valorTotal + "\nForma de pagamento: \n[0] Cartão de crédito \n[1] Cartão de Débito \n[2] Pix \n[3] Moeda corrente ");

                        switch (escolha) {
                            case "0":
                            case "1":
                            case "2":
                            case "3":
                                JOptionPane.showMessageDialog(null, "Pagamento efetuado com sucesso! Volte Sempre!");
                                break labelWhileDois;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção Inváilida!");
                        }
                    }

                    break;

                case "3":
                    break labelWhile;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente...");
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado pela preferência, volte sempre!");
    }
}
