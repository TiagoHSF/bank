package controller;

import business.ContaBusiness;

public class ContaController {

	public static void main(String[] args) throws Exception {
		ContaBusiness conta = new ContaBusiness();
		conta.depositar(100D);
		try {
			conta.sacar(150D);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

}
