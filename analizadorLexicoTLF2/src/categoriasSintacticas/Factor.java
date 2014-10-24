package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica factor
 * @author USUARIO
 *
 */
public class Factor 
{
	/**
	 * categoria lexica real
	 */
	private SimboloLexico real;
	/**
	 * categoria lexica entero
	 */
	private SimboloLexico entero;
	/**
	 * categoria lexica idvariable
	 */
	private SimboloLexico idVariable;
	/**
	 * constructor sin parametros
	 */
	public Factor() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param real
	 * @param entero
	 * @param idVariable
	 */
	public Factor(SimboloLexico factor)
	{
		if(factor.getToken().equals("real"))
		{
			this.real = real;
		}
		if(factor.getToken().equals("entero"))
		{
			this.entero = entero;
		}
		if(factor.getToken().equals("idVariable"))
			this.idVariable = idVariable;
	}
	
	/**
	 * metodo que permite obtener el atributo real
	 * @return simbolo lexico real
	 */
	public SimboloLexico getReal() 
	{
		return real;
	}
	/**
	 * metodo que permite modificar el atributo real
	 * @param real
	 */
	public void setReal(SimboloLexico real) 
	{
		this.real = real;
	}
	/**
	 * metodo que permite obtener el atributo entero
	 * @return simbolo lexico entero
	 */
	public SimboloLexico getEntero() 
	{
		return entero;
	}
	/**
	 * metodo que permite modificar el atributo entero
	 * @param entero
	 */
	public void setEntero(SimboloLexico entero) 
	{
		this.entero = entero;
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
	 * metodo que permite modificar el atributo entero
	 * @param entero
	 */
	public void setIdVariable(SimboloLexico idVariable) {
		this.idVariable = idVariable;
	}
}
