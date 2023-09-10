
public class Conta {
	private String nomeTitular;
	private String numeroConta;
	private double valor = 0;
	
	public void depositar(double deposito) {
		if(deposito > 50) {
			this.valor = deposito;
			System.out.println("Deposito realizado com sucesso");
		}else {
			System.out.println("Não foi possivel realizar deposito");
			System.out.println("Só é permitido depositos acima de 50 $");
		}
	}
	
	public void consultarSaldo() {
		System.out.printf("Saldo: %.2f ", this.valor);
	}
	
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
