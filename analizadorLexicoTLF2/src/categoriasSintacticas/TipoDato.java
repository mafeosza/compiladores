package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica tipo de dato
 * @author USUARIO
 *
 */
public class TipoDato 
{
	/**
	 * categoria lexica palabraReservada
	 */
	private SimboloLexico tipoDato;
	/**
	 * constructor sin parametros
	 */
	public TipoDato() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param tipoDato
	 */
	public TipoDato(SimboloLexico tipoDato) 
	{
		super();
		this.tipoDato = tipoDato;
	}
	/**
	 * metodo que permite obtener el atributo tipo de dato
	 * @return simbolo lexico tipoDato
	 */
	public SimboloLexico getTipoDato() 
	{
		return tipoDato;
	}
	/**
	 * metodo que permite modificar el atributo tipoDato
	 * @param tipoDato
	 */
	public void setTipoDato(SimboloLexico tipoDato) 
	{
		this.tipoDato = tipoDato;
	}
}
