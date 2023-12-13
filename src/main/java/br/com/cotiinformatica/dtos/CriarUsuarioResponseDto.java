package br.com.cotiinformatica.dtos;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class CriarUsuarioResponseDto {
	private UUID idUsuario;
	private String email;
	private String senha;
	private Date dataHoraCadastro;

}
