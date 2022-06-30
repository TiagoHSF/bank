package business;

import java.util.Random;

public class ContaBusiness {
	Double saldo;
	Integer conta;
	Integer digito;
	
	public ContaBusiness () {
		saldo = 0D;
		conta = this.criarConta();
		digito = this.criarDigitoConta();
	}
	
	public Integer criarConta() {
		var codigoConta = 0;
		Random conta = new Random();
		for(var i = 0; i < 6; i++) {
			codigoConta = conta.nextInt(99999);
		}
		return codigoConta;
	}
	
	public Integer criarDigitoConta() {
		var digitoConta = 0;
		Random digito = new Random();
		for(var i = 0; i < 2; i++) {
			digitoConta = digito.nextInt(99999);
		}
		return digitoConta;
	}
	
	public void depositar(Double ValorDeposito) {
		saldo += ValorDeposito;
	}
	
	public void sacar(Double valorSacar) throws Exception {
		try {
			if(valorSacar > saldo) {
				throw new Exception("Saldo para saque insuficiente");
			} else {
				saldo -= valorSacar;
			}
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Integer getConta() {
		return conta;
	}
	
	public Integer getDigitoConta() {
		return digito;
	}
}

