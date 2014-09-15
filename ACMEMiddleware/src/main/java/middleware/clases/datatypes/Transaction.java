package middleware.clases.datatypes;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Transaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transaction {
	
	private long id;
	private String fecha;			//Formato ddmmyy
	private String hora;			//Formato hhmmss
	private String tipo; 			//compra, deposito, consulta de saldo
	private String codigoComercio;
	private String nombreComercio;	
	private String numeroTarjeta;
	private String tipoTarjeta;		//debito, credito, prepaga
	private String codigoMoneda;	//UYU, USD
	private String tipoDispositivo;	//POS, WEB, ATM
	private BigDecimal monto;			
	
	/*
	
	public Transaction(long id, String fecha, String hora, String tipo,
			String codigoComercio, String nombreComercio, String numeroTarjeta,
			String tipoTarjeta, String codigoMoneda, String tipoDispositivo,
			BigDecimal monto) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.tipo = tipo;
		this.codigoComercio = codigoComercio;
		this.nombreComercio = nombreComercio;
		this.numeroTarjeta = numeroTarjeta;
		this.tipoTarjeta = tipoTarjeta;
		this.codigoMoneda = codigoMoneda;
		this.tipoDispositivo = tipoDispositivo;
		this.monto = monto;
	}*/
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
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
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public String getTipoDispositivo() {
		return tipoDispositivo;
	}
	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	

}
