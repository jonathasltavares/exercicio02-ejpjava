
public class Invoice {
	private String id;
	private String descricao;
	private int quant;
	private double valorUnid;
	
	
	public Invoice(String id, String descricao, int quant, double valorUnid) {
		this.id = id;
		this.descricao = descricao;
		if (quant < 0) {
			quant = 0;
		}
		if (valorUnid<0.0) {
			valorUnid= 0;
		}
		this.quant = quant;
		this.valorUnid = valorUnid;
	}

	public double getInvoiceAmount() {
		return quant*valorUnid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getValorUnid() {
		return valorUnid;
	}

	public void setValorUnid(double valorUnid) {
		this.valorUnid = valorUnid;
	}
	
}
