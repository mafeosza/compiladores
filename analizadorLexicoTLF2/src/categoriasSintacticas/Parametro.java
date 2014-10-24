package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica parametro
 * @author USUARIO
 *
 */
public class Parametro
{
	/**
	 * categoria lexica idvariable
	 */
	private SimboloLexico idVariable;
	/**
	 * categoria sintactica tipo dato
	 */
	private TipoDato tipoDato;
	/**
	 * constructor sin parametros
	 */
	public Parametro()
	{
		
	}
	/**
	 * constructor con parametros
	 * @param idVariable
	 * @param tipoDato
	 */
	public Parametro(SimboloLexico idVariable, TipoDato tipoDato) 
	{
		this.idVariable = idVariable;
		this.tipoDato = tipoDato;
	}
	/**
	 * metodo que permite obtener el atributo idvariable
	 * @return simbolo lexico idvariable
	 */
	public SimboloLexico getIdVariable() 
	{
		return idVariable;
	}
	/**
	 * metodo que permite modificar el atributo idvariable
	 * @param idvariable
	 */
	public void setIdVariable(SimboloLexico idVariable) 
	{
		this.idVariable = idVariable;
	}
	/**
	 * metodo que permite obtener el atributo pacc
	 * @return simbolo sintactico tipoDato
	 */
	public TipoDato getTipoDato() 
	{
		return tipoDato;
	}
	/**
	 * metodo que permite modificar el atributo tipodato
	 * @param tipodato
	 */
	public void setTipoDato(TipoDato tipoDato)
	{
		this.tipoDato = tipoDato;
	}	
}
