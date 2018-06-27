package br.com.prowene.agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author rlaecio
 */
public class AgendaDAO {
	Connection conn;

	public AgendaDAO() throws Exception {
		try {
			this.conn = Conexao.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro " + ":\n" + e.getMessage());
		}
	}

	public void salvar(AgendaBeans agenda) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		if (agenda == null)
			throw new Exception("O valor Passado não pode ser nulo.");
		try {
			String SQL = "INSERT INTO registros(nome,endereco,bairro,cidade,estado,cep,telefone,telefone2,telefone3)"
					+ "values(?,?,?,?,?,?,?,?,?)";
			con = this.conn;
			ps = con.prepareStatement(SQL);
			ps.setString(1, agenda.getNome());
			ps.setString(2, agenda.getEndereco());
			ps.setString(3, agenda.getBairro());
			ps.setString(4, agenda.getCidade());
			ps.setString(5, agenda.getEstado());
			ps.setString(6, agenda.getCep());
			ps.setString(7, agenda.getTelefone());
			ps.setString(8, agenda.getTelefone2());
			ps.setString(9, agenda.getTelefone3());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao Inserir dados" + sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}

	public void excluir(AgendaBeans agenda) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		if (agenda == null)
			throw new Exception("O valor Passado não pode ser nulo.");
		try {
			con = this.conn;
			ps = con.prepareStatement("delete from registros where nome=?");
			ps.setString(1, agenda.getNome());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao excluir dados" + sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}

	public void atualizar(AgendaBeans agenda) throws Exception {
		PreparedStatement ps = null;
        Connection con = null;        
		if (agenda == null)
			throw new Exception("O valor Passado não pode ser nulo.");
		try {
			String SQL = "UPDATE registros SET nome=?, endereco=?, bairro=?, cidade=?,"
					+ "estado=?, cep=?, telefone=?, telefone2=?, telefone3=? where registro=? ";
			con = this.conn;
			ps = con.prepareStatement(SQL);
			ps.setString(1, agenda.getNome());
			ps.setString(2, agenda.getEndereco());
			ps.setString(3, agenda.getBairro());
			ps.setString(4, agenda.getCidade());
			ps.setString(5, agenda.getEstado());
			ps.setString(6, agenda.getCep());
			ps.setString(7, agenda.getTelefone());
			ps.setString(8, agenda.getTelefone2());
			ps.setString(9, agenda.getTelefone3());
			ps.setInt(10, agenda.getRegistro());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao atualizar dados" + sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}

	public ArrayList<AgendaBeans> todosAgenda() throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = this.conn;
			ps = con.prepareStatement("SELECT * from registros ORDER BY nome ASC ");
			rs = ps.executeQuery();
			ArrayList<AgendaBeans> lista = new ArrayList<AgendaBeans>();
			while (rs.next()) {
				Integer agendaRegistro = rs.getInt(1);
				String agendaNome = rs.getString(2);
				String agendaEndereco = rs.getString(3);
				String agendaBairro = rs.getString(4);
				String agendaCidade = rs.getString(5);
				String agendaEstado = rs.getString(6);
				String agendaCep = rs.getString(7);
				String agendaTelefone = rs.getString(8);
				String agendaTelefone2 = rs.getString(9);
				String agendaTelefone3 = rs.getString(10);
				lista.add(new AgendaBeans(agendaRegistro, agendaNome, agendaEndereco, agendaBairro,
						agendaCidade, agendaEstado, agendaCep,agendaTelefone,agendaTelefone2,agendaTelefone3));
			}
			return lista;
		} catch (SQLException sqle) {
			throw new Exception("Erro ao acessar o banco de dados" + sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}

	public ArrayList<AgendaBeans> filtraAgenda(String nome) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = this.conn;
			ps = con.prepareStatement("SELECT * from registros where nome like ?");
			ps.setString(1, nome + "%");
			rs = ps.executeQuery();
			ArrayList<AgendaBeans> lista = new ArrayList<AgendaBeans>();
			while (rs.next()) {
				Integer agendaId = rs.getInt(1);
				String agendaNome = rs.getString(2);
				String agendaEndereco = rs.getString(3);
				String agendaBairro = rs.getString(4);
				String agendaCidade = rs.getString(5);
				String agendaEstado = rs.getString(6);
				String agendaCep = rs.getString(7);
				String agendaTelefone = rs.getString(8);
				String agendaTelefone2 = rs.getString(9);
				String agendaTelefone3 = rs.getString(10);
				lista.add(new AgendaBeans(agendaId, agendaNome, agendaEndereco,
						agendaBairro, agendaCidade, agendaEstado, agendaCep,
						agendaTelefone,agendaTelefone2,agendaTelefone3));
			}
			return lista;
		} catch (SQLException sqle) {
			throw new Exception("Erro ao atualizar dados" + sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}
	
	public ArrayList<AgendaBeans> filtraAgenda2(String nome) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = this.conn;
			ps = con.prepareStatement("SELECT * from registros where nome like ? ORDER BY nome ASC");
			ps.setString(1, "%" + nome + "%");
			rs = ps.executeQuery();
			ArrayList<AgendaBeans> lista = new ArrayList<AgendaBeans>();
			while (rs.next()) {
				Integer agendaId = rs.getInt(1);
				String agendaNome = rs.getString(2);
				String agendaEndereco = rs.getString(3);
				String agendaBairro = rs.getString(4);
				String agendaCidade = rs.getString(5);
				String agendaEstado = rs.getString(6);
				String agendaCep = rs.getString(7);
				String agendaTelefone = rs.getString(8);
				String agendaTelefone2 = rs.getString(9);
				String agendaTelefone3 = rs.getString(10);
				lista.add(new AgendaBeans(agendaId, agendaNome, agendaEndereco,
						agendaBairro, agendaCidade, agendaEstado, agendaCep,
						agendaTelefone,agendaTelefone2,agendaTelefone3));
			}
			return lista;
		} catch (SQLException sqle) {
			throw new Exception("Erro ao atualizar dados" + sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}

	public AgendaBeans procurarAgenda(String nome) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = this.conn;
			ps = con.prepareStatement("SELECT * from registros where nome like ?");
			ps.setString(1, "%" + nome + "%");
			rs = ps.executeQuery();

			if (!rs.next()) {
				throw new Exception("não foi encontrado nenhum "
						+ "ninguem com o nome " + nome);
			}
			Integer agendaId = rs.getInt(1);
			String agendaNome = rs.getString(2);
			String agendaEndereco = rs.getString(3);
			String agendaBairro = rs.getString(4);
			String agendaCidade = rs.getString(5);
			String agendaEstado = rs.getString(6);
			String agendaCep = rs.getString(7);
			String agendaTelefone = rs.getString(8);
			String agendaTelefone2 = rs.getString(9);
			String agendaTelefone3 = rs.getString(10);
			return new AgendaBeans(agendaId, agendaNome, agendaEndereco,
					agendaBairro, agendaCidade, agendaEstado, agendaCep,
					agendaTelefone,agendaTelefone2,agendaTelefone3);
		} catch (SQLException sqle) {
			throw new Exception(sqle);
		} finally {
			Conexao.closeConnection(con, ps);
		}
	}
}
