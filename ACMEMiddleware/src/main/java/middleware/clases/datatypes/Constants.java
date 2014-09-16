package middleware.clases.datatypes;

/***
 * 
 * @author Cristiano
 *	Contiene posibles valores de atributos.
 */
public class Constants {

	public static String dateFormat = "ddmmyy";
	public static String timeFormat = "hhmmss";
	public static String[] transactionTypes = new String[]{"compra", "deposito", "consulta de saldo"};
	public static String[] cardTypes = new String[]{"debito", "credito", "prepaga"};
	public static String[] currencyTypes = new String[] {"UY","USD"};
	public static String[] deviceTypes = new String[] {"POS","WEB","ATM"};
	public static int release = 10;
	
}
