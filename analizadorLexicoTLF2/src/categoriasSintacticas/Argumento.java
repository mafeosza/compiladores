package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica argumento
 * @author USUARIO
 *
 */
public class Argumento
{
	/**
	 * categoria lexica idvariable
	 */
	private SimboloLexico idVariable;
	/**
	 * categoria sintactica termino
	 */
	private Termino termino;
	/**
	 * constructor sin parametros
	 */
	public Argumento() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param idVariable
	 * @param termino
	 */
	public Argumento(SimboloLexico idVariable, Termino termino) 
	{
		this.idVariable = idVariable;
		this.termino = termino;
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
	 * metodo que permite obtener el atributo termino
	 * @return categoria lexica termino
	 */
	public Termino getTermino() 
	{
		return termino;
	}
	/**
	 * metodo que permite modificar el atributo termino
	 * @param termino
	 */
	public void setTermino(Termino termino) 
	{
		this.termino = termino;
	}
}
