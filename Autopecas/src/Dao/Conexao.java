package Dao;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao implements Serializable {

    public static Conexao conexao = null;
    public static Connection connection;
    private String usuario;
    private String senha;
    private String url;

    public Conexao() {
        usuario = "root";
        senha = "123456";
        url = "jdbc:mysql://localhost:3306/sistema";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
    }

    public static Connection getInstance() {
        if (conexao == null) {
            synchronized (Conexao.class) {
                conexao = new Conexao();
            }
        }
        return connection;
    }

    public static void closeInstance() throws SQLException {
        if (conexao != null) {
            connection.close();
        }
    }

    public static void setAutoCommit(boolean vlr) throws SQLException {
        connection.setAutoCommit(vlr);
    }

    public static void commit() throws SQLException {
        connection.commit();
    }

    public static void rollback() throws SQLException {
        connection.rollback();
    }
}