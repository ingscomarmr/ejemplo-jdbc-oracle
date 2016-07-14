package bean;

import java.sql.Date;
import java.sql.ResultSet;

public class Cliente {

	private int ID_CLIENTE;	
	private String NOMBRE;
	private Date FECHA_NACIMIENTO;
	private String TELEFONO;
	private String DIRECCION;
	private int ESTATUS;
	
	public Cliente(ResultSet r) throws Exception{
		try{
			this.ID_CLIENTE = r.getInt("ID_CLIENTE");
			this.NOMBRE = r.getString("NOMBRE");
		}catch(Exception e){			
			throw e;
		}
		
	}

	public int getID_CLIENTE() {
		return ID_CLIENTE;
	}

	public void setID_CLIENTE(int iD_CLIENTE) {
		ID_CLIENTE = iD_CLIENTE;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public Date getFECHA_NACIMIENTO() {
		return FECHA_NACIMIENTO;
	}

	public void setFECHA_NACIMIENTO(Date fECHA_NACIMIENTO) {
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
	}

	public String getTELEFONO() {
		return TELEFONO;
	}

	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public int getESTATUS() {
		return ESTATUS;
	}

	public void setESTATUS(int eSTATUS) {
		ESTATUS = eSTATUS;
	}
	
	public String toString(){
		return "ID:" + this.ID_CLIENTE
				+", Nombre:" + this.NOMBRE;
		
	}
}
