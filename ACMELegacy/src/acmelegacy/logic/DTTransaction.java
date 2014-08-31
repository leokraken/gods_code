package acmelegacy.logic;

import java.math.BigDecimal;

public class DTTransaction {
	
	private long id;
	private String fechaYHora;			//Fecha en formato "dd/mm/yyyy hh:mm:ss"
	private char tipo;					//C (Compra), D (depósito), S (consulta de saldo)
	private String codigoComercio;
	private String nombreComercio;
	private String numeroTarjeta;
	private char tipoTarjeta;			//D (débito), C (crédito), P (prepaga)
	private String codigoMoneda;		//UYU, USD
	private BigDecimal monto;
		
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFechaYHora() {
		return fechaYHora;
	}
	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public String getCodigoComercio() {
		return codigoComercio;
	}
	public void setCodigoComercio(String codigoComercio) {
		this.codigoComercio = codigoComercio;
	}
	public String getNombreComercio() {
		return nombreComercio;
	}
	public void setNombreComercio(String nombreComercio) {
		this.nombreComercio = nombreComercio;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public char getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(char tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
