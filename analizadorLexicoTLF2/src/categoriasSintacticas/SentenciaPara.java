package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica sentencia para
 * @author USUARIO
 *
 */
public class SentenciaPara 
{
	/**
	 * categoria lexica para
	 */
	private SimboloLexico cpr;
	/**
	 * categoria sintactica expresion aritmetica
	 */
	private ExpresionAritmetica expresionAritmetica;
	/**
	 * categoria sintactica expresion relacional
	 */
	private ExpresionRelacional expresionRelacional;
	/**
	 * categoria sintactica sentencia asignacion
	 */
	private SentenciaAsignacion sentenciaAsignacion;
	/**
	 * categoria sintactica lista sentencias
	 */
	private ListaSentencias listaSentencias;
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC;
	/**
	 * categoria lexica llave apertura
	 */
	private SimboloLexico llaveA;
	/**
	 * categoria lexica llave cierre
	 */
	private SimboloLexico llaveC;
	/**
	 * constructor sin parametros
	 */
	public SentenciaPara() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param cpr
	 * @param expresionAritmetica
	 * @param expresionRelacional
	 * @param sentenciaAsignacion
	 * @param listaSentencias
	 * @param parentesisA
	 * @param parentesisC
	 * @param llaveA
	 * @param llaveC
	 */
	public SentenciaPara(SimboloLexico cpr, SimboloLexico parentesisA,
			ExpresionAritmetica expresionAritmetica,
			ExpresionRelacional expresionRelacional,
			SentenciaAsignacion sentenciaAsignacion, SimboloLexico parentesisC,
			SimboloLexico llaveA, ListaSentencias listaSentencias, SimboloLexico llaveC) 
	{
		this.cpr = cpr;
		this.expresionAritmetica = expresionAritmetica;
		this.expresionRelacional = expresionRelacional;
		this.sentenciaAsignacion = sentenciaAsignacion;
		this.listaSentencias = listaSentencias;
		this.parentesisA = parentesisA;
		this.parentesisC = parentesisC;
		this.llaveA = llaveA;
		this.llaveC = llaveC;
	}
	public SentenciaPara(SimboloLexico cpr, SimboloLexico parentesisA,
			ExpresionAritmetica expresionAritmetica,
			ExpresionRelacional expresionRelacional,
			SentenciaAsignacion sentenciaAsignacion, SimboloLexico parentesisC,
			SimboloLexico llaveA, SimboloLexico llaveC) 
	{
		this.cpr = cpr;
		this.expresionAritmetica = expresionAritmetica;
		this.expresionRelacional = expresionRelacional;
		this.sentenciaAsignacion = sentenciaAsignacion;
		this.parentesisA = parentesisA;
		this.parentesisC = parentesisC;
		this.llaveA = llaveA;
		this.llaveC = llaveC;
	}
	/**
	 * metodo que permite obtener el atributo cpr
	 * @return simbolo lexico para
	 */
	public SimboloLexico getCpr()
	{
		return cpr;
	}
	/**
	 * metodo que permite modificar el atributo cpr
	 * @param cpr
	 */
	public void setCpr(SimboloLexico cpr) 
	{
		this.cpr = cpr;
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
	 * metodo que permite modificar el atributo expresionAritmetica
	 * @param expresionAritmetica
	 */
	public void setExpresionAritmetica(ExpresionAritmetica expresionAritmetica) 
	{
		this.expresionAritmetica = expresionAritmetica;
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
	 * metodo que permite obtener el atributo sentencia asignacion
	 * @return categoria sintactica sentencia asignacion
	 */
	public SentenciaAsignacion getSentenciaAsignacion()
	{
		return sentenciaAsignacion;
	}
	/**
	 * metodo que permite modificar el atributo sentenciaAsignacion
	 * @param sentenciaAsignacion
	 */
	public void setSentenciaAsignacion(SentenciaAsignacion sentenciaAsignacion) 
	{
		this.sentenciaAsignacion = sentenciaAsignacion;
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
	/**
	 * metodo que permite obtener el atributo parentesisA
	 * @return simbolo lexico parentensisapertura
	 */
	public SimboloLexico getParentesisA() 
	{
		return parentesisA;
	}
	/**
	 * metodo que permite modificar el atributo parentesisApertura
	 * @param parentesisApertura
	 */
	public void setParentesisA(SimboloLexico parentesisA) 
	{
		this.parentesisA = parentesisA;
	}
	/**
	 * metodo que permite obtener el atributo parentesisCierre
	 * @return simbolo lexico parentesis cierre
	 */
	public SimboloLexico getParentesisC() 
	{
		return parentesisC;
	}
	/**
	 * metodo que permite modificar el atributo parentesisCierre
	 * @param parentesisCierre
	 */
	public void setParentesisC(SimboloLexico parentesisC) 
	{
		this.parentesisC = parentesisC;
	}
	/**
	 * metodo que permite obtener el atributo llaveApertura
	 * @return simbolo lexico llaveapertura
	 */
	public SimboloLexico getLlaveA() 
	{
		return llaveA;
	}
	/**
	 * metodo que permite modificar el atributo llave apertura
	 * @param llaveApertura
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
	 * @param llaveCierre
	 */
	public void setLlaveC(SimboloLexico llaveC) 
	{
		this.llaveC = llaveC;
	}
}
