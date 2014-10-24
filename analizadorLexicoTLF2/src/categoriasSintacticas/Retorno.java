package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica Retorno
 * @author USUARIO
 *
 */
public class Retorno 
{
	/**
	 * categoria lexica retorno
	 */
	private SimboloLexico retorno;
	/**
	 * constructor sin parametros
	 */
	public Retorno() 
	{
	
	}
	/**
	 * constructor con parametros
	 * @param retorno
	 */
	public Retorno(SimboloLexico retorno) 
	{
		this.retorno = retorno;
	}
	/**
	 * metodo que permite obtener el atributo retorno
	 * @return simbolo lexico retorno
	 */
	public SimboloLexico getRetorno()
	{
		return retorno;
	}
	/**
	 * metodo que permite modificar el atributo retorno
	 * @param retorno
	 */
	public void setRetorno(SimboloLexico retorno)
	{
		this.retorno = retorno;
	}
}
