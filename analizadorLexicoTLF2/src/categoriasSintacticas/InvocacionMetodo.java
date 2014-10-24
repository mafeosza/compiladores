package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica invocacionMetodo
 * @author USUARIO
 *
 */
public class InvocacionMetodo 
{
	/**
	 * categoria lexica idMetodo
	 */
	private SimboloLexico idMetodo;
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC;
	/**
	 * categoria lexica terminal
	 */
	private SimboloLexico terminal;
	/**
	 * categoria sintactica lista argumentos
	 */
	private ListaArgumentos listaArgumentos;
	/**
	 * constructor sin parametros
	 */
	public InvocacionMetodo() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param idMetodo
	 * @param parentesisA
	 * @param parentesisC
	 * @param terminal
	 * @param listaArgumentos
	 */
	public InvocacionMetodo(SimboloLexico idMetodo, SimboloLexico parentesisA,
			ListaArgumentos listaArgumentos, SimboloLexico parentesisC, SimboloLexico terminal) 
	{
		this.idMetodo = idMetodo;
		this.parentesisA = parentesisA;
		this.listaArgumentos = listaArgumentos;
		this.parentesisC = parentesisC;
		this.terminal = terminal;
	}
	
	public InvocacionMetodo(SimboloLexico idMetodo, SimboloLexico parentesisA,
			SimboloLexico parentesisC, SimboloLexico terminal) 
	{
		this.idMetodo = idMetodo;
		this.parentesisA = parentesisA;
		this.listaArgumentos = listaArgumentos;
		this.parentesisC = parentesisC;
		this.terminal = terminal;
	}
	/**
	 * metodo que permite obtener el atributo idMetodo
	 * @return simbolo lexico idmetodo
	 */
	public SimboloLexico getIdMetodo() 
	{
		return idMetodo;
	}
	/**
	 * metodo que permite modificar el atributo idMetodo
	 * @param idMetodo
	 */
	public void setIdMetodo(SimboloLexico idMetodo) 
	{
		this.idMetodo = idMetodo;
	}
	/**
	 * metodo que permite obtener el atributo parentesis apertura
	 * @return simbolo lexico parentesisA
	 */
	public SimboloLexico getParentesisA() 
	{
		return parentesisA;
	}
	/**
	 * metodo que permite modificar el atributo parentesis apertura
	 * @param parentesisA
	 */
	public void setParentesisA(SimboloLexico parentesisA) 
	{
		this.parentesisA = parentesisA;
	}
	/**
	 * metodo que permite obtener el atributo parentesis cierre
	 * @return simbolo lexico parentesisC
	 */
	public SimboloLexico getParentesisC()
	{
		return parentesisC;
	}
	/**
	 * metodo que permite modificar el atributo parentesis cierre
	 * @param parentesisC
	 */
	public void setParentesisC(SimboloLexico parentesisC) 
	{
		this.parentesisC = parentesisC;
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
	 * @param terminal
	 */
	public void setTerminal(SimboloLexico terminal) 
	{
		this.terminal = terminal;
	}
	/**
	 * metodo que permite obtener el atributo lista argumentos
	 * @return ctegria sintactica lista argumentos
	 */
	public ListaArgumentos getListaArgumentos() 
	{
		return listaArgumentos;
	}
	/**
	 * metodo que permite modificar el atributo lista argumentos
	 * @param listaArgunmentos
	 */
	public void setListaArgumentos(ListaArgumentos listaArgumentos) 
	{
		this.listaArgumentos = listaArgumentos;
	}	
}
