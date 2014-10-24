package categoriasSintacticas;

import mundo.SimboloLexico;
/**
 * clase que representa la categoria sintactica paquete
 * @author USUARIO
 *
 */
public class Paquete
{
	/**
	 * categoria lexica pacc
	 */
	private SimboloLexico pacc;
	/**
	 * categoria lexica cadena 
	 */
	private SimboloLexico cadena;
	/**
	 * categoria lexica terminal
	 */
	private SimboloLexico terminal;
	/**
	 * Constructor sin parametros
	 */
	public Paquete()
	{
		
	}
	/**
	 * Constructor con parametros
	 * @param pacc
	 * @param cadena
	 * @param terminal
	 */
	public Paquete(SimboloLexico pacc, SimboloLexico cadena,SimboloLexico terminal)
	{
		this.pacc=pacc;
		this.cadena=cadena;
		this.terminal=terminal;
	}
	/**
	 * metodo que permite obtener el atributo pacc
	 * @return simbolo lexico pacc
	 */
	public SimboloLexico getPacc() 
	{
		return pacc;
	}
	/**
	 * metodo que permite modificar el atributo pacc
	 * @param pacc
	 */
	public void setPacc(SimboloLexico pacc) 
	{
		this.pacc = pacc;
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
	 * @param simbolo lexico cadena
	 */
	public void setCadena(SimboloLexico cadena) 
	{
		this.cadena = cadena;
	}
	/**
	 * metodo que permite obtener el atributo terminal
	 * @return simbolo lexico terminal
	 */
	public SimboloLexico getTerminal() 
	{
		return terminal;
	}
	/**
	 * metodo que permite modificar el atributo terminal
	 * @param simbolo lexico terminal
	 */
	public void setTerminal(SimboloLexico terminal)
	{
		this.terminal = terminal;
	}
}
