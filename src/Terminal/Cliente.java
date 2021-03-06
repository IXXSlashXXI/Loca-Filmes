/**
 * Classe cliente a qual herda a classe Pessoas, criando um cliente com alguns atributos a mais que uma classe pessoa comum
 * @author halves
 *
 */

public class Cliente extends Pessoas {
    private boolean comFilme;
    private String filme;
    
    /**
     * Construtor padrão, para que toda vez que um novo cliente for cadastrado ele entre sem dividas e nenhum filme.
     */
    public Cliente() {
    		setComFilme(false);
    		setFilme(null);
    }
    
    public boolean isComFilme() {
        return comFilme;
    }

    public void setComFilme(boolean comFilme) {
        this.comFilme = comFilme;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
    
}
