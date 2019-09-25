package hotel;

public class Estadia {

	private Animal animal;
	private int dias;
	private double valor;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.dias = dias;
		this.valor = valor;
	}

	public int getDias() {
		return dias;
	}

	public double getValor() {
		return valor;
	}
	
	public String getNome() {
		return animal.getNome();
	}
	
	public String getTipo() {
		return animal.getTipo();
	}
	
	public int getIdade() {
		return animal.getIdade();
	}
	
	public String toString() {
		String msg = getNome() + ", " + getTipo() + ", " + this.dias + " dias com o preco de R$ " + this.valor + 0;
		return msg;
	}
}
