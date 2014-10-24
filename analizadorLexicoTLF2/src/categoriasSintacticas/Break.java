package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica break
 * @author USUARIO
 *
 */
public class Break
{
	/**
	 * categoria lexica break
	 */
	private SimboloLexico paus;
	/**
	 * constructor sin parametros
	 */
	public Break()
	{
		
	}
	/**
	 * constructor con parametros
	 * @param paus
	 */
	public Break(SimboloLexico paus) 
	{	
		this.paus = paus;
	}
	/**
	 * metodo que permite obtener el atributo paus
	 * @return simbolo lexico paus
	 */
	public SimboloLexico getPaus()
	{
		return paus;
	}
	/**
	 * metodo que permite modificar el atributo paus
	 * @param paus
	 */
	public void setPaus(SimboloLexico paus)
	{
		this.paus = paus;
	}
}
