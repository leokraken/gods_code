package acmelegacy.logic;
import java.sql.*;

/***
 * Helper para crear/cerrar una conexion a mySQL.
 * @author Cristiano
 *
 */
public class DbHelper {
	
	private static String MYSQL_CONNECTION = "jdbc:mysql://";
	private static int TIMEOUT = 15;
	
	private String db = MYSQL_CONNECTION + "localhost:3306/middleware";
	private String login = "root";
	private String pw = "root";
	
	private Connection connection = null;
	
	/***
	 * Constructor vacio, usa parametros por defecto.
	 */
	public DbHelper(){
		//no hace nada
	}
	
	/***
	 * Recibe informacion de la conexion
	 * @param db conexion de la forma: localhost:3306/middleware
	 * @param login
	 * @param pw
	 * @throws Exception si algun parametro es null.
	 */
	public DbHelper(String db, String login, String pw) throws Exception{	
		
		if(db == null || login == null || pw == null){
			throw new Exception("Parametros no pueden ser null.");
		}
		
		this.db = MYSQL_CONNECTION + db;
		this.login = login;
		this.pw = pw;
	}
			
	/***
	 *
	 * @return
	 * @throws SQLException Si no se pudo abrir la conexion
	 * @throws ClassNotFoundException Si no se encuentra el driver mysql. 
	 * com.mysql.jdbc.Driver
	 */
	private Connection create() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver");        
        connection = DriverManager.getConnection(db ,login,pw);
        
        return connection;
	}
	
	/***
	 * Intenta crear la conexion a mySQL (o la retorna si ya esta creada).
	 * Lanza excepciones si falla la conexion
	 * o no se encuentra el driver.
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getOrCreate() throws ClassNotFoundException, SQLException{
		if(connection != null && connection.isValid(TIMEOUT)){			
			return connection;
		}
		else{
			return this.create();
		}
	}
	
	public void close() throws SQLException{
		if(connection != null && !connection.isClosed()){
			connection.close();
			connection = null;
		}
		else if(connection != null && connection.isClosed()){			
			connection = null;
		}
	}

}
