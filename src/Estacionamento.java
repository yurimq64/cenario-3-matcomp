import java.util.ArrayList;
import java.util.List;

class Estacionamento {
    private List<Veiculo> veiculosRegistrados;

    public Estacionamento() {
        this.veiculosRegistrados = new ArrayList<>();
    }

    public void registrarEntradaVeiculo(String placa) {
        try {
            Veiculo novoVeiculo = new Veiculo(placa);
            this.veiculosRegistrados.add(novoVeiculo);

            System.out.println("\nVeículo com placa " + novoVeiculo.getPlaca() + " registrado.");
            System.out.println("Estado: " + novoVeiculo.getEstado());

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao registrar veículo: " + e.getMessage());
        }
    }

    public void exibirVeiculosRegistrados() {
        System.out.println("\nVEÍCULOS REGISTRADOS");
        if (veiculosRegistrados.isEmpty()) {
            System.out.println("Nenhum veículo registrado ainda.");
        } else {
            for (Veiculo veiculo : veiculosRegistrados) {
                System.out.printf("%s | %s%n",
                        veiculo.getPlaca(),
                        veiculo.getEstado());
            }
        }
    }
}