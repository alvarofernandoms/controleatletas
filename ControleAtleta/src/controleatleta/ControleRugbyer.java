package controleatleta;

import java.util.ArrayList;

public class ControleRugbyer {

    private ArrayList<Rugbyer> listaRugbyers;

    public ControleRugbyer() {
        this.listaRugbyers = new ArrayList<Rugbyer>();
    }
    
    public ArrayList<Rugbyer> getListaRugbyers() {
        return listaRugbyers;
    }
    
    public void adicionar(Rugbyer umRugbyer) {
        listaRugbyers.add(umRugbyer);
    }
    
    public void remover(Rugbyer umRugbyer) {
        listaRugbyers.remove(umRugbyer);
    }
    
    public Rugbyer pesquisar(String nome) {
        for (Rugbyer r: listaRugbyers) {
            if (r.getNome().equalsIgnoreCase(nome)) return r;
        }
        return null;
    }
}