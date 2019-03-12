import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMySql extends Conexao {
	private Connection con;

	@Override
	public void carregarDriver(String d) {
		try {
			Class.forName(d);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void abrirConexao(String url) {
		try {
			if (!(con.isClosed())) {
				try {
					con = DriverManager.getConnection(url);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void verificarStatus() {
		try {
			if(!con.isClosed()) {
				System.out.print("ATIVA");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

	@Override
	public void logarAberturaDaconexao(String mensagem) {

		Logger.getGlobal().log(Level.ALL, mensagem);

	}

}
