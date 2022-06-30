package controller;

import business.ContaBusiness;
import business.UsuarioBusiness;
import repository.ContaRepository;

public class ContaController {
	
	public ContaRepository contaRepository;
	public UsuarioBusiness usuarioBusiness;

	public static void main(String[] args) throws Exception {
		ContaBusiness conta = new ContaBusiness();
		conta.depositar(100D);
		try {
			conta.sacar(150D);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	
	public Double consultaSaldoTransferencia() throws Exception {
		try {
			final UsuarioBusiness usuario = new UsuarioBusiness();
			usuario.setDocumento("134.874.816.85");
			usuario.setNome("Tiago");
			var usuarioId = usuario.getUsuarioId();
			if(usuarioId == null) {
				throw new Exception("Usuário não localizado");
			}
			return this.contaRepository.findSaldoUsuario(usuarioId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
