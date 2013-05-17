package controleatleta;

import java.util.ArrayList;

public class ControleBoxeador {

	private ArrayList<Boxeador> listaBoxeadores;

	public ControleBoxeador() {
		this.listaBoxeadores = new ArrayList<Boxeador>();
	}

	public ArrayList<Boxeador> getListaBoxeadores() {
		return listaBoxeadores;
	}

	public void adicionar(Boxeador umBoxeador) {
		listaBoxeadores.add(umBoxeador);
	}

	public void remover(Boxeador umBoxeador) {
		listaBoxeadores.remove(umBoxeador);
	}

	public Boxeador pesquisar(String nome) {
		for (Boxeador b : listaBoxeadores) {
			if (b.getNome().equalsIgnoreCase(nome))
				return b;
		}
		return null;
	}
}
