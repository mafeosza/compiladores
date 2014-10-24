package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica declaracion de clase
 * @author USUARIO
 *
 */
public class DeclaracionClase 
{
	/**
	 * categoria lexica clase
	 */
	private SimboloLexico clase;
	/**
	 * categoria lexica indentificadorClase
	 */
	private SimboloLexico idClase;
	/**
	 * categoria lexica llave apertura
	 */
	private SimboloLexico llaveA;
	/**
	 * categoria lexica llave cierre
	 */
	private SimboloLexico llaveC;
	/**
	 * categoria sintactica Bloque clase
	 */
	private BloqueClase bloqueClase;
	/**
	 * constructor sin parametros
	 */
	public DeclaracionClase() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param clase
	 * @param idClase
	 * @param llave
	 * @param bloqueClase
	 */
	public DeclaracionClase(SimboloLexico clase, SimboloLexico idClase,
			SimboloLexico llave, BloqueClase bloqueClase, SimboloLexico llavec) 
	{
		this.clase = clase;
		this.idClase = idClase;
		this.llaveA = llave;
		this.bloqueClase = bloqueClase;
		this.llaveC=llavec;
	}
	/**
	 * metodo que permite obtener el atributo clase
	 * @return categoria lexica clase
	 */
	public SimboloLexico getClase() {
		return clase;
	}
	/**
	 * metodo que permite modificar el atributo clase
	 * @param Clase
	 */
	public void setClase(SimboloLexico clase) {
		this.clase = clase;
	}
	/**
	 * metodo que permite obtener el atributo identificador de clase
	 * @return categoria lexica identificador de clase
	 */
	public SimboloLexico getIdClase() {
		return idClase;
	}
	/**
	 * metodo que permite modificar el atributo identificador de clase
	 * @param identificador de Clase
	 */
	public void setIdClase(SimboloLexico idClase) {
		this.idClase = idClase;
	}
	/**
	 * metodo que permite obtener el atributo llave apertura
	 * @return categoria lexica llave
	 */
	public SimboloLexico getLlaveA() {
		return llaveA;
	}
	/**
	 * metodo que permite modificar el atributo llave
	 * @param llave
	 */
	public void setLlaveA(SimboloLexico llave) {
		this.llaveA = llave;
	}
	/**
	 * metodo que permite obtener el atributo bloqueclase
	 * @return categoria sintactica bloqueclase
	 */
	public BloqueClase getBloqueClase() {
		return bloqueClase;
	}
	/**
	 * metodo que permite modificar el atributo bloque clase
	 * @param bloqueClase
	 */
	public void setBloqueClase(BloqueClase bloqueClase) {
		this.bloqueClase = bloqueClase;
	}
	/**
	 * metodo que permite obtener el atributo llave
	 * @return categoria lexica llave
	 */
	public SimboloLexico getLlaveC() {
		return llaveC;
	}
	/**
	 * metodo que permite modificar el atributo llave cierre
	 * @param llave
	 */
	public void setLlaveC(SimboloLexico llaveC) {
		this.llaveC = llaveC;
	}
}
