
public class Conta {
	protected String nome;
	protected String cpf;
	protected int nconta;
	protected float saldo;
	public Conta(String nome, String cpf, int nconta, float saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nconta = nconta;
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNconta() {
		return nconta;
	}
	public void setNconta(int nconta) {
		this.nconta = nconta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean debitar (float valor) {
		if (valor < saldo) {
			this.saldo  =this.saldo - saldo;
			return true
		}
		else {
			return false;
		}
	}
	public void credito(float saldo) {
		this.saldo = this.saldo + saldo;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", nconta=" + nconta + ", saldo=" + saldo + "]";
	}
	
}
