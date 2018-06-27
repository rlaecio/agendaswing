package br.com.prowene.agenda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conexao {
	static String linha;
    
	public Conexao() {
    }


    public static Connection getConnection() throws Exception {
        try {
        	// L� arquivo de configura��o do servidor
        	try {
    			FileReader arq = new FileReader("/br/com/prowene/agenda/agenda.conf");    		
				BufferedReader lerArq = new BufferedReader(arq);
    			linha = lerArq.readLine();
    			
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        	//--------------------------------------------
        	
            Class.forName("com.mysql.jdbc.Driver");            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "usuario", "sena");
                        
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        close(conn, stmt, rs);
    }

    public static void closeConnection(Connection conn, Statement stmt) throws Exception {
        close(conn, stmt, null);
    }

    public static void closeConnection(Connection conn) throws Exception {
        close(conn, null, null);
    }

    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
