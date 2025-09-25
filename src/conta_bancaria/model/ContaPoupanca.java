package conta_bancaria.model;


public class ContaPoupanca extends Conta {
	
	
	
	//Inserção de variáveis
	private int anivesario;

	//Inserção do método construtor
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		
		this.anivesario = aniversario;
}

	//Inserção do método Get e Set
	public int getAnivesario() {
		return anivesario;
	}

	public void setAnivesario(int anivesario) {
		this.anivesario = anivesario;
	}
	
	@Override 
	public void visualizar() {
		super.visualizar();
		System.out.printf("Aniversário da conta: %d%n ", this.anivesario); //this é utilizado para indicar o parametro do método
	}
	
	
	
	
	
}
