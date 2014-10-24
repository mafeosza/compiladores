package categoriasSintacticas;

import mundo.SimboloLexico;
/**
 * clase que representa la categoria sintactica sentencia mientras
 * @author USUARIO
 *
 */
public class SentenciaSi {
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC;
	/**
	 * categoria lexica se
	 */
	private SimboloLexico se;
	/**
	 * categoria sintactica expresion relacional
	 */
	private ExpresionRelacional expresionRelacional;
	/**
	 * categoria lexica llave apertura
	 */
	private SimboloLexico llaveA;
	/**
	 * categoria lexica llaveCierre
	 */
	private SimboloLexico llaveC;
	/**
	 * categoria sintactica lista de sentencias
	 */
	private ListaSentencias listaSentencias;
	/**
	 * constructor sin parametros
	 */
	public SentenciaSi() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param parentesisA
	 * @param parentesisC
	 * @param se
	 * @param expresionRelacional
	 * @param llaveA
	 * @param llaveC
	 * @param listaSentencias
	 */
	public SentenciaSi(SimboloLexico parentesisA, ExpresionRelacional expresionRelacional,
			SimboloLexico parentesisC, SimboloLexico se, SimboloLexico llaveA,
			ListaSentencias listaSentencias, SimboloLexico llaveC)
	{
		this.parentesisA = parentesisA;
		this.expresionRelacional = expresionRelacional;
		this.parentesisC = parentesisC;
		this.se = se;
		this.llaveA = llaveA;
		this.listaSentencias = listaSentencias;
		this.llaveC = llaveC;
	}
	/**
	 * metodo que permite obtener el atributo parentesisApertura
	 * @return simbolo lexico parentesisApertura
	 */
	public SimboloLexico getParentesisA() 
	{
		return parentesisA;
	}
	/**
	 * metodo que permite modificar el atributo parentesisApertura
	 * @param parentesisA
	 */
	public void setParentesisA(SimboloLexico parentesisA) 
	{
		this.parentesisA = parentesisA;
	}
	/**
	 * metodo que permite obtener el atributo parntesisCierre
	 * @return simbolo lexico parentesisCierre
	 */
	public SimboloLexico getParentesisC() 
	{
		return parentesisC;
	}
	/**
	 * metodo que permite modificar el atributo parentesisCierre
	 * @param parentesisC
	 */
	public void setParentesisC(SimboloLexico parentesisC) 
	{
		this.parentesisC = parentesisC;
	}
	/**
	 * metodo que permite obtener el atributo se
	 * @return simbolo lexico se
	 */
	public SimboloLexico getSe() 
	{
		return se;
	}
	/**
	 * metodo que permite modificar el atributo se
	 * @param se
	 */
	public void setSe(SimboloLexico se)
	{
		this.se = se;
	}
	/**
	 * metodo que permite obtener el atributo expresion relacional
	 * @return categoria sintactica expresion relacional
	 */
	public ExpresionRelacional getExpresionRelacional()
	{
		return expresionRelacional;
	}
	/**
	 * metodo que permite modificar el atributo expresionRelacional
	 * @param expresionRelacional
	 */
	public void setExpresionRelacional(ExpresionRelacional expresionRelacional) 
	{
		this.expresionRelacional = expresionRelacional;
	}
	/**
	 * metodo que permite obtener el atributo llaveApertura
	 * @return simbolo lexico llaveApertura
	 */
	public SimboloLexico getLlaveA() 
	{
		return llaveA;
	}
	/**
	 * metodo que permite modificar el atributo llaveApertura
	 * @param llaveA
	 */
	public void setLlaveA(SimboloLexico llaveA)
	{
		this.llaveA = llaveA;
	}
	/**
	 * metodo que permite obtener el atributo llaveCierre
	 * @return simbolo lexico llaveCierre
	 */
	public SimboloLexico getLlaveC() 
	{
		return llaveC;
	}
	/**
	 * metodo que permite modificar el atributo llaveCierre
	 * @param llaveC
	 */
	public void setLlaveC(SimboloLexico llaveC) 
	{
		this.llaveC = llaveC;
	}
	/**
	 * metodo que permite obtener el atributo listaSentencias
	 * @return categoria sintactica listaSentencias
	 */
	public ListaSentencias getListaSentencias()
	{
		return listaSentencias;
	}
	/**
	 * metodo que permite modificar el atributo listaSentencias
	 * @param listaSentencias
	 */
	public void setListaSentencias(ListaSentencias listaSentencias) 
	{
		this.listaSentencias = listaSentencias;
	}
}
