package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica importacion
 * @author USUARIO
 *
 */
public class Importacion {
	/**
	 * categoria lexica impt
	 */
	private SimboloLexico importacion;
	/**
	 * categoria lexica cadena
	 */
	private SimboloLexico cadena;
	/**
	 * constructor sin parametros
	 */
	public Importacion() 
	{
	
	}
	/**
	 * Construtor con parametros
	 * @param importacion
	 * @param cadena
	 */
	public Importacion(SimboloLexico importacion, SimboloLexico cadena) 
	{
		this.importacion = importacion;
		this.cadena = cadena;
	}
	/**
	 * metodo que permite obtener el atributo importacion
	 * @return simbolo lexico importacion
	 */
	public SimboloLexico getImportacion() 
	{
		return importacion;
	}
	/**
	 * metodo que permite modificar el atributo cadena
	 * @param cadena
	 */
	public void setImportacion(SimboloLexico importacion) 
	{
		this.importacion = importacion;
	}
	/**
	 * metodo que permite obtener el atributo cadena
	 * @return simbolo lexico cadena
	 */
	public SimboloLexico getCadena()
	{
		return cadena;
	}
	/**
	 * metodo que permite modificar el atributo cadena
	 * @param cadena
	 */
	public void setCadena(SimboloLexico cadena)
	{
		this.cadena = cadena;
	}
}
