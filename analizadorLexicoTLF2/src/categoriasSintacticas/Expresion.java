package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica expresion
 * @author USUARIO
 *
 */
public class Expresion 
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
	 * categoria lexica idVariable
	 */
	private SimboloLexico idVariable;
	/**
	 * categoria sintactica expresion aritmetica
	 */
	private ExpresionAritmetica expresionAritmetica;
	/**
	 * categoria sintactica expresion relacional
	 */
	private ExpresionRelacional expresionRelacional;
	/**
	 * constructor sin parametros
	 */
	public Expresion() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param real
	 * @param entero
	 * @param idVariable
	 * @param expresionAritmetica
	 * @param expresionRelacional
	 */
	public Expresion(SimboloLexico expresion) 
	{
		if(expresion.getToken().equals("real"))
		{
			this.real = real;
		}
		if(expresion.getToken().equals("entero"))
		{
			this.entero = entero;
		}
		if(expresion.getToken().equals("idVariable"))
			this.idVariable = idVariable;
	}
	
	public Expresion(ExpresionAritmetica expresionAritmetica) 
	{
		this.expresionAritmetica = expresionAritmetica;
	}
	public Expresion(ExpresionRelacional expresionRelacional) 
	{
		this.expresionRelacional = expresionRelacional;
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
	 * metodo que permite modificar el atributo idvariable
	 * @param idvariable
	 */
	public void setIdVariable(SimboloLexico idVariable)
	{
		this.idVariable = idVariable;
	}
	/**
	 * metodo que permite obtener el atributo expresion aritmetica
	 * @return categoria sintactica expresion aritmetica
	 */
	public ExpresionAritmetica getExpresionAritmetica() 
	{
		return expresionAritmetica;
	}
	/**
	 * metodo que permite modificar el atributo expresion aritmetica
	 * @param expresion aritmetica
	 */
	public void setExpresionAritmetica(ExpresionAritmetica expresionAritmetica)
	{
		this.expresionAritmetica = expresionAritmetica;
	}
	/**
	 * metodo que permite obtener el atributo expresion relacional
	 * @return categoria sintactica expresion relacionaL 
	 */
	public ExpresionRelacional getExpresionRelacional() 
	{
		return expresionRelacional;
	}
	/**
	 * metodo que permite modificar el atributo expresion relacional
	 * @param expresion relacional
	 */
	public void setExpresionRelacional(ExpresionRelacional expresionRelacional)
	{
		this.expresionRelacional = expresionRelacional;
	}
}
