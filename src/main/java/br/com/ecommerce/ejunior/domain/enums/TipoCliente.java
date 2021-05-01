package br.com.ecommerce.ejunior.domain.enums;

public enum TipoCliente {

	PessoaFisica(1 , "Pessoa Física"),
	PessoaJuridica (2 , "Pessoa Jurídica");
	
	//Criar duas variaveis internas
	private Integer cod;
	private String descricao;

	//Construtor 
	//Obs: o construtor de um enum tem que ser do tipo private
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	//Fazer apenas o método get
	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
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
