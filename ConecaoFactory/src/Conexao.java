
public abstract class Conexao {
	
	public abstract void carregarDriver(String d);
	
	public abstract void abrirConexao(String url);
	
	public abstract void verificarStatus();
	
	public abstract void logarAberturaDaconexao(String mensagem);
	
	

}
