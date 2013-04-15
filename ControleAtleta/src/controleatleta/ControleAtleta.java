package controleatleta;

import javax.swing.JOptionPane;

public class ControleAtleta {

    public static void main(String[] args) {
     	
    	String tipo;    	
    	
    	tipo = JOptionPane.showInputDialog("Digite o tipo de Atleta que deseja cadastrar: ");
    	
    	if (tipo.equalsIgnoreCase("boxeador")){
    		CadastroBoxeador cadastro = new CadastroBoxeador();
    		cadastro.setVisible(true);
    	}
    	else if (tipo.equalsIgnoreCase("rugbyer")){
    		CadastroRugbyer cadastro = new CadastroRugbyer();
            cadastro.setVisible(true);
    	}
    }
}
