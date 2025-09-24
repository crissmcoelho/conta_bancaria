package conta_bancaria.model;

public class ContaCorrente extends Conta {

	// Inserção de variáveis
	private float limite;
	
	
	//Inserção do método construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);

		this.limite = limite;
	}

	
	//Inserção do método Get e Set

	public float getLimite() {
		return limite;
	}


	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override	
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("Saldo insuficiente!");
			return false;		
		} 
		this.setSaldo(this.getSaldo() - valor);
		return true;
			
		}
	
	//Método override é indicador que o desenvolvedor esta sobreescrevendo o método - Utilização do polimorfismo
	@Override 
	public void visualizar() {
		super.visualizar();
		System.out.printf("Limite da conta: R$ %.2f%n", this.limite); //this é utilizado para indicar o parametro do método
	}
	

}
