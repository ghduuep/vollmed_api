package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record dadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf, Endereco endereco) {

    public dadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}
