/**
 * Filmes é uma classe que comporta todos os filmes, ela não tem um construtor padrão pois todos os filmes devem ser devidamente preenchidos.
 * @author Higor Alves
 *
 */

public class Filmes {
	private String nome;
	private int minutos;
	private int horas;
	private int codigo;
	private int faixaEtaria;
	private boolean alugado;
	
	public Filmes() {
		setAlugado(false);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
}
