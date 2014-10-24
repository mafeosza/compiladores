package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica cadena
 * @author USUARIO
 *
 */
public class Cadena 
{
	/**
	 * categoria lexica cadena
	 */
	private SimboloLexico cadena;
	/**
	 * constructor sin parametros
	 */
	public Cadena() 
	{

	}
	/**
	 * constructor con parametros
	 * @param cadena
	 */
	public Cadena(SimboloLexico cadena) 
	{
		this.cadena = cadena;
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
