package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_pedidos")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPedido;
	private Date data;
	
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido> itens;
	
	public Pedido() {
		itens = new ArrayList<>();
	}

	public Pedido(Integer codPedido, Date data) {
		super();
		this.codPedido = codPedido;
		this.data = data;
		itens = new ArrayList<>();
	}

	
	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", data=" + data + "]";
	}

	public BigDecimal precoTotal() {
		BigDecimal soma = new BigDecimal("0.00");
		for (ItemPedido x : itens) {
			soma = soma.add(x.subTotal());
		}
		return soma;
	}
}
