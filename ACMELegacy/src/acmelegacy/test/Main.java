package acmelegacy.test;

import java.math.BigDecimal;

import acmelegacy.logic.ACMELegacy;
import acmelegacy.logic.DTTransaction;
import acmelegacy.logic.DbHelper;

public class Main {

	public static void main(String[] args) {
		System.out.println("Test");
		
		DbHelper db = new DbHelper();
		
		try{
			
			DTTransaction data = new DTTransaction();
			
			data.setId(30);
			data.setFechaYHora("2014-08-29 09:39:31");//"27/05/2014 22:32:01", NO SOPORTADA POR MYSQL
			data.setTipo('C');
			data.setCodigoComercio("codigo");
			data.setNombreComercio("poronga");
			data.setNumeroTarjeta("1234");
			data.setTipoTarjeta('D');
			data.setCodigoMoneda("USD");
			data.setMonto(new BigDecimal("123.3"));
			
			ACMELegacy.insert(db, data);
			
			db.close();
		}
		catch(Throwable t){
			t.printStackTrace();
		}

	}

}
