package br.com.ecommerce.ejunior.domain.enums;

public enum TipoCliente {

	PessoaFisica(1),
	PessoaJuridica (2);
	
	//Criar duas variaveis internas
	private final int cod;

	//Construtor 
	//Obs: o construtor de um enum tem que ser do tipo private
	private TipoCliente(int cod) {
		this.cod = cod;
	}

	//Fazer apenas o método get
	public int getCod() {
		return cod;
	}
	
	//Fazer uma operação que recebe um código e me retorna um objeto do TipoCliente já instanciado conforme solicitado.
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código inválido: " + cod);
	}
}
