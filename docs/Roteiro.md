# Roteiro do projeto
## Lógica de alocação
### Quando um carro entra:

- Verificar se a placa é válida (formato Mercosul).

- Identificar se pertence ao seu grupo de estados.

- Alocar em uma vaga livre da matriz.

- Registrar hora de entrada.

### Quando um carro sai:

- Informar a placa.

- Calcular tempo de permanência e valor.

- Liberar a vaga.

- Gerar o ticket.

## Regras de Negócio
### Cobrança
- 15 minutos de tolerância.

- 3h: valor fixo R$ X,XX.

- A cada hora extra (ou fração): acréscimo de R$ Y,YY.

- Use Math.ceil() para aplicar a função teto.

### Formato da Placa Mercosul
- Formato: LLLNLNN, onde:

    - L = letra

    - N = número

- Exemplo: ABC1D23

- Os 3 primeiros caracteres definem o estado da placa.

## Identificação de Estado
* Criar um mapa (HashMap) com as combinações de placas dos 3 estados do nosso grupo:
#### Combinações por estado:
- Mato Grosso: JXZ a KAU, NIY a NJW, NPC a NPQ, NTX a NUG, OAP a OBS, QBA a QCZ, RAK a RAZ, RRI a RRZ
- Mato Grosso do Sul: HQF a HTW, NRF a NSD, OOG a OOU, QAA a QAZ, REW a REZ, RWA a RWJ
- Tocantins: MVL a MXG, OLH a OLN, OYA a OYC, QKA a QKM, QWA a QWF, RSA a RSF