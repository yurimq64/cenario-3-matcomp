import java.util.ArrayList;
import java.util.List;

class Estacionamento {
    private List<Veiculo> veiculosRegistrados; // Lista para armazenar os objetos Veiculo

    public Estacionamento() {
        this.veiculosRegistrados = new ArrayList<>();
    }

    public void registrarEntradaVeiculo(String placa) {
        try {
            Veiculo novoVeiculo = new Veiculo(placa); // Cria o veículo, que já identifica o estado no construtor
            this.veiculosRegistrados.add(novoVeiculo); // Adiciona o novo veículo à lista

            System.out.println("\nVeículo com placa " + novoVeiculo.getPlaca() + " registrado com sucesso!");
            System.out.println("Estado de Origem: " + novoVeiculo.getEstado());

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao registrar veículo: " + e.getMessage());
        }
    }

    public void exibirVeiculosRegistrados() {
        System.out.println("\n--- VEÍCULOS REGISTRADOS ---");
        if (veiculosRegistrados.isEmpty()) {
            System.out.println("Nenhum veículo registrado ainda.");
        } else {
            System.out.printf("%-15s | %-25s%n", "Placa", "Estado de Origem");
            System.out.println("-------------------------------------------");
            for (Veiculo veiculo : veiculosRegistrados) {
                System.out.printf("%-15s | %-25s%n",
                        veiculo.getPlaca(),
                        veiculo.getEstado());
            }
        }
        System.out.println("------------------------------");
    }
}