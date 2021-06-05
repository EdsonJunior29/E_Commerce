package br.com.ecommerce.ejunior.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ecommerce.ejunior.domain.enums.EstadoPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //um tebela para cada subclasse.
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private Integer estado;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "pedido_id")
	@MapsId
	private Pedido pedido;
	
	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		this.id = id;
		this.estado = (estado == null) ? null : estado.getCod();
		this.pedido = pedido;
	}
}
