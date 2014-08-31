package acmelegacy.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;


/***
 * Clase responsable de insertar en la base de datos legacy.
 * @author Cristiano
 *
 */
public class ACMELegacy {
	
	/**Estructura de la tabla
	 * CREATE TABLE middleware.transactions
		(
			id					BIGINT NOT NULL PRIMARY KEY,
			datetime 			DATETIME NOT NULL,
			transaction_type	CHAR(1) NOT NULL,
			commerce_code		VARCHAR(20) NOT NULL,
			commerce_name		VARCHAR(20) NOT NULL,
			card_number			VARCHAR(20) NOT NULL,
			card_type			CHAR(1) NOT NULL,
			currency_code		CHAR(3) NOT NULL,
			amount				NUMERIC(15,2) NOT NULL
		);
	 * 
	 */
	
	private static String INSERT_QUERY = "INSERT INTO transactions VALUES(?,?,?,?,?,?,?,?,?)";
	
	/***
	 * Inserta los datos en la base de datos
	 * @param db Instancia de base de datos a utilizar.
	 * @param data
	 * @throws Exception 
	 */
	public static void insert(DbHelper db, DTTransaction data) throws Exception{
		
		if(data == null){
			throw new Exception("Data no puede ser null");
		}
		
		Connection con = db.getOrCreate();
		PreparedStatement query = con.prepareStatement(INSERT_QUERY);
		int i = 1;
		
		query.setObject(i++, data.getId());
		query.setString(i++, data.getFechaYHora());
		query.setString(i++, String.valueOf(data.getTipo()));
		query.setString(i++, data.getCodigoComercio());
		query.setString(i++, data.getNombreComercio());
		query.setString(i++, data.getNumeroTarjeta());
		query.setString(i++, String.valueOf(data.getTipoTarjeta()));
		query.setString(i++, data.getCodigoMoneda());
		query.setBigDecimal(i++, data.getMonto());
		
		query.execute();			
		
	}

}
