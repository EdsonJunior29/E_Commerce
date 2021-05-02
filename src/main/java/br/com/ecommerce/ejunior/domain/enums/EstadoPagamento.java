package br.com.ecommerce.ejunior.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1),
	QUITADO(2),
	CANCELADO(3);
	
	private int cod;
	
	private EstadoPagamento(int cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return cod;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(EstadoPagamento e : EstadoPagamento.values()) {
			if(cod.equals(e.getCod())) {
				return e;
			}
		}
		throw new IllegalArgumentException("Código inválido " + cod);
		
	}
	
}
