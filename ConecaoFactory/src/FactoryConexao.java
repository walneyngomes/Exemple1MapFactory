
public class FactoryConexao {

	public Conexao criarConexao(String tipoConexao) {
		Conexao conexao = null;

		if ("mysql".equals(tipoConexao)) {

			conexao = new ConexaoMySql();
			conexao.carregarDriver("com.br.mysql");
			conexao.abrirConexao("url");
			conexao.verificarStatus();
			conexao.logarAberturaDaconexao("ABER");
		}

		return conexao;

	}

}
