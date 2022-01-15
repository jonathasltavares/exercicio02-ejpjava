import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Invoice prod = new Invoice(null, null, 0, 0);
			String i = JOptionPane.showInputDialog("Digite o código do produto: ");
			prod.setId(i);
			String d = JOptionPane.showInputDialog("Digite a descrição do produto: ");
			prod.setDescricao(d);
			String q = JOptionPane.showInputDialog("Digite a quantidade do produto: ");
			prod.setQuant(Integer.parseInt(q));
			String v = JOptionPane.showInputDialog("Digite o valor da unidade do produto: ");
			prod.setValorUnid(Double.parseDouble(v));
			
		String options[] = {"ok", "mais informações"};
		int resposta = JOptionPane.showOptionDialog(null, "Total: R$"+prod.getInvoiceAmount(),
				"Informações", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, options, options[1]);
		if (resposta == 1 ) {
			JOptionPane.showMessageDialog(null, "ID: "+prod.getId()+""
					+ "\nDescrição: "+prod.getDescricao()+"\nQuantidade: "+prod.getQuant()+
					"\nValor da unidade: R$"+prod.getValorUnid());
			System.exit(0);
		}if(resposta == 0) {
			System.exit(0);
		}
		

}
	}

