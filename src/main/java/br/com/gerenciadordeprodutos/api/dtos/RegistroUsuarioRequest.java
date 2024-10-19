package br.com.gerenciadordeprodutos.api.dtos;

public record RegistroUsuarioRequest(
        String nomeCompleto,
        String cpf,
        String email,
        String senha
) {
}
