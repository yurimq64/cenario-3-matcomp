class Veiculo {
    private String placa;
    private String estadoIdentificado;

    public Veiculo(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        this.placa = placa.toUpperCase();
        this.estadoIdentificado = identificarEstadoInterno();
    }

    public String getPlaca() {
        return placa;
    }

    public String getEstado() {
        return estadoIdentificado;
    }

    private String identificarEstadoInterno() {
        if (placa.length() < 3) {
            return "Placa inválida (muito curta)";
        }
        String iniciais = placa.substring(0, 3);

        if (isBetween(iniciais, "JXZ", "KAU") ||
                isBetween(iniciais, "NIY", "NJW") ||
                isBetween(iniciais, "NPC", "NPQ") ||
                isBetween(iniciais, "NTX", "NUG") ||
                isBetween(iniciais, "OAP", "OBS") ||
                isBetween(iniciais, "QBA", "QCZ") ||
                isBetween(iniciais, "RAK", "RAZ") ||
                isBetween(iniciais, "RRI", "RRZ")) {
            return "Mato Grosso (MT)";
        }

        if (isBetween(iniciais, "HQF", "HTW") ||
                isBetween(iniciais, "NRF", "NSD") ||
                isBetween(iniciais, "OOG", "OOU") ||
                isBetween(iniciais, "QAA", "QAZ") ||
                isBetween(iniciais, "REW", "REZ") ||
                isBetween(iniciais, "RWA", "RWJ")) {
            return "Mato Grosso do Sul (MS)";
        }

        if (isBetween(iniciais, "MVL", "MXG") ||
                isBetween(iniciais, "OLH", "OLN") ||
                isBetween(iniciais, "OYA", "OYC") ||
                isBetween(iniciais, "QKA", "QKM") ||
                isBetween(iniciais, "QWA", "QWF") ||
                isBetween(iniciais, "RSA", "RSF")) {
            return "Tocantins (TO)";
        }
        return "Estado não monitorado";
    }

    private boolean isBetween(String valor, String inicio, String fim) {
        return valor.compareTo(inicio) >= 0 && valor.compareTo(fim) <= 0;
    }
}