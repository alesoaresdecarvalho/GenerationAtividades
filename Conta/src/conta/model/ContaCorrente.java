package conta.model;

public class ContaCorrente extends conta{
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public ContaCorrente(int gerarNumero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(gerarNumero, agencia, tipo, titular, saldo);
        this.limite = limite;
		// TODO Auto-generated constructor stub
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) { 
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
    
}
	