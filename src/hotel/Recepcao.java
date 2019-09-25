package hotel;

import java.util.ArrayList;


public class Recepcao {

	private ArrayList<Estadia> estadias;

	public Recepcao() {
		this.estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		this.estadias.add(new Estadia(nome, tipo, idade, dias, valor));
	}
	
	public void checkOut(String nome) {
		for (int i = 0; i < estadias.size(); i++) {
			if (estadias.get(i).getNome().equals(nome)) {
				estadias.remove(i);
				break;
			}
		}
	}
	
	public int getNumDeHospedes() {
		return this.estadias.size();
	}
	
	public double getLucroTotal() {
		double lucro = 0;
		for (Estadia e : estadias) {
			lucro += e.getValor();
		}
		return lucro;
	}
	
	public String toString() {
		String msg = "Estadias:" + System.lineSeparator();
		for (Estadia e : estadias) {
			msg += e.getNome() + " (" + e.getTipo() + "): " + e.getDias() + " dias com o preco de R$ " + e.getValor() + 0;
		}
		return msg;
	}
}
