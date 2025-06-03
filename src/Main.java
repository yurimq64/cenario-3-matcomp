import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estacionamento meuEstacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);

        String opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Registrar entrada de veículo");
            System.out.println("2. Ver veículos registrados");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.print("Digite a placa do veículo: ");
                    String placaInput = scanner.nextLine().trim();

                    if (placaInput.length() == 7 &&
                            Character.isLetter(placaInput.charAt(0)) &&
                            Character.isLetter(placaInput.charAt(1)) &&
                            Character.isLetter(placaInput.charAt(2)) &&
                            Character.isDigit(placaInput.charAt(3)) &&
                            Character.isLetter(placaInput.charAt(4)) &&
                            Character.isDigit(placaInput.charAt(5)) &&
                            Character.isDigit(placaInput.charAt(6))) {

                        meuEstacionamento.registrarEntradaVeiculo(placaInput);
                    } else {
                        System.out.println("Formato de placa inválido. Formato correto: LLLNLNN com 7 caracteres.");
                    }
                    break;
                case "2":
                    meuEstacionamento.exibirVeiculosRegistrados();
                    break;
                case "3":
                    System.out.println("\nSistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!opcao.equals("3"));

        scanner.close();
    }
}