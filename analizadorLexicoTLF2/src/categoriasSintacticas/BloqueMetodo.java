package categoriasSintacticas;

import java.util.ArrayList;

/**
 * clase que representa la categoria sintactica bloquemetodo
 * @author USUARIO
 *
 */
public class BloqueMetodo 
{
	/**
	 * categoria sintactica declaracionvariable
	 */
	private DeclaracionVariable declaracionVariable;
	/**
	 * categoria sintactica lista de sentencias
	 */
	private ListaSentencias listaSentencias;
	/**
	 * categoria sintactica retorno
	 */
	private Retorno retorno;
	/**
	 * categoria sintactica lista de expresion
	 */
	private Expresion expresion;
	/**
	 * categoria sintactica invocacionmetodo
	 */
	private InvocacionMetodo invocacionMetodo;
	/**
	 * categoria lexica paus
	 */
	private Break paus;
	/**
	 * constructor sin parametros
	 */
	private ArrayList<DeclaracionMetodo> bloqueMetodo = new ArrayList<DeclaracionMetodo>();
	
	public BloqueMetodo(){
		
	}
	public BloqueMetodo(ArrayList<DeclaracionMetodo> bloqueMetodo)
	{
		this.bloqueMetodo=bloqueMetodo;
		
	}
	/**
	 * constructor con parametros
	 * @param declaracionVariable
	 * @param listaSentencias
	 * @param retorno
	 * @param expresion
	 * @param invocacionMetodo
	 * @param paus
	 */
	public BloqueMetodo(DeclaracionVariable declaracionVariable,
			ListaSentencias listaSentencias, Retorno retorno,
			Expresion expresion, InvocacionMetodo invocacionMetodo, Break paus) 
	{
		this.declaracionVariable = declaracionVariable;
		this.listaSentencias = listaSentencias;
		this.retorno = retorno;
		this.expresion = expresion;
		this.invocacionMetodo = invocacionMetodo;
		this.paus = paus;
	}
	/**
	 * metodo que permite obtener el atributo declaracion variable
	 * @return categoria sintactica declaracionVariable
	 */
	public DeclaracionVariable getDeclaracionVariable()
	{
		return declaracionVariable;
	}
	/**
	 * metodo que permite modificar el atributo declaracion variable
	 * @param declaracion variable
	 */
	public void setDeclaracionVariable(DeclaracionVariable declaracionVariable) 
	{
		this.declaracionVariable = declaracionVariable;
	}
	/**
	 * metodo que permite obtener el atributo listaSentencias
	 * @return categoria sintactica listasentencias
	 */
	public ListaSentencias getListaSentencias()
	{
		return listaSentencias;
	}
	/**
	 * metodo que permite modificar el atributo listaSentencias
	 * @param lista sentencias
	 */
	public void setListaSentencias(ListaSentencias listaSentencias)
	{
		this.listaSentencias = listaSentencias;
	}
	/**
	 * metodo que permite obtener el atributo retorno
	 * @return categoria sintactica retorno
	 */
	public Retorno getRetorno() 
	{
		return retorno;
	}
	/**
	 * metodo que permite modificar el atributo retorno
	 * @param retorno
	 */
	public void setRetorno(Retorno retorno)
	{
		this.retorno = retorno;
	}
	/**
	 * metodo que permite obtener el atributo pacc
	 * @return categoria sintactica expresion
	 */
	public Expresion getExpresion() 
	{
		return expresion;
	}
	/**
	 * metodo que permite modificar el atributo expresion
	 * @param expresion
	 */
	public void setExpresion(Expresion expresion)
	{
		this.expresion = expresion;
	}
	/**
	 * metodo que permite obtener el atributo invocacionMetodo
	 * @return categoria sintactica invocacionMetodo
	 */
	public InvocacionMetodo getInvocacionMetodo() 
	{
		return invocacionMetodo;
	}
	/**
	 * metodo que permite modificar el atributo invocacionMetodo
	 * @param invocacioMetodo
	 */
	public void setInvocacionMetodo(InvocacionMetodo invocacionMetodo) 
	{
		this.invocacionMetodo = invocacionMetodo;
	}
	/**
	 * metodo que permite obtener el atributo paus
	 * @return categoria sintactica break
	 */
	public Break getPaus() 
	{
		return paus;
	}
	/**
	 * metodo que permite modificar el atributo paus
	 * @param paus
	 */
	public void setPaus(Break paus) 
	{
		this.paus = paus;
	}
}
