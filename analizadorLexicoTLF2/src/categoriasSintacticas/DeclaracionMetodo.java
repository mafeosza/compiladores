package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica declaracion de metodo
 * @author USUARIO
 *
 */
public class DeclaracionMetodo 
{
	/**
	 * categoria sintactica tipo retorno
	 */
	private TipoRetorno tipoRetorno;
	/**
	 * categoria lexica identificador metodo
	 */
	private SimboloLexico idMetodo;
	/**
	 * categoria sintactica visibilidad
	 */
	private Visibilidad visibilidad;
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC;
	/**
	 * categoria sintactica lista parametros
	 */
	private ListaParametros listaParametros;
	/**
	 * categoria lexica llave apertura
	 */
	private SimboloLexico llaveA;
	/**
	 * categoria lexica llave cierre
	 */
	private SimboloLexico llaveC;
	/**
	 * categoria sintactica bloquemetodo
	 */
	private BloqueMetodo bloqueMetodo;
	/**
	 * constructor sin parametros
	 */
	public DeclaracionMetodo() 
	{
		
	}
	/**
	 * Constructor con parametros
	 * @param tipoRetorno
	 * @param idMetodo
	 * @param visibilidad
	 * @param parentesis
	 * @param listaParametros
	 * @param llave
	 * @param bloqueMetodo
	 */
	public DeclaracionMetodo(TipoRetorno tipoRetorno, SimboloLexico idMetodo,
			Visibilidad visibilidad, SimboloLexico parentesisA,
			ListaParametros listaParametros,SimboloLexico parentesisC, SimboloLexico llave,
			BloqueMetodo bloqueMetodo, SimboloLexico llaveC) 
	{
		this.tipoRetorno = tipoRetorno;
		this.idMetodo = idMetodo;
		this.visibilidad = visibilidad;
		this.parentesisA = parentesisA;
		this.listaParametros = listaParametros;
		this.parentesisC = parentesisC;
		this.llaveA = llave;
		this.llaveC=llaveC;
		this.bloqueMetodo = bloqueMetodo;
	}
	
	public DeclaracionMetodo(TipoRetorno tipoRetorno, SimboloLexico idMetodo,
			Visibilidad visibilidad, SimboloLexico parentesis,
			ListaParametros listaParametros, SimboloLexico parentesisC, SimboloLexico llave,
			 SimboloLexico llaveC) 
	{
		this.tipoRetorno = tipoRetorno;
		this.idMetodo = idMetodo;
		this.visibilidad = visibilidad;
		this.parentesisA = parentesis;
		this.listaParametros = listaParametros;
		this.parentesisC=parentesisC;
		this.llaveA = llave;
		this.llaveC=llaveC;
	}
	public DeclaracionMetodo(TipoRetorno tipoRetorno, SimboloLexico idMetodo,
			Visibilidad visibilidad, SimboloLexico parentesis,
			SimboloLexico llave, SimboloLexico parentesisC, BloqueMetodo bloqueMetodo, SimboloLexico llaveC) 
	{
		this.tipoRetorno = tipoRetorno;
		this.idMetodo = idMetodo;
		this.visibilidad = visibilidad;
		this.parentesisA = parentesis;
		this.parentesisC=parentesisC;
		this.llaveA = llave;
		this.llaveC=llaveC;
		this.bloqueMetodo = bloqueMetodo;
	}
	public DeclaracionMetodo(TipoRetorno tipoRetorno, SimboloLexico idMetodo,
			Visibilidad visibilidad, SimboloLexico parentesis,SimboloLexico parentesisC,
			SimboloLexico llave, SimboloLexico llaveC) 
	{
		this.tipoRetorno = tipoRetorno;
		this.idMetodo = idMetodo;
		this.visibilidad = visibilidad;
		this.parentesisA = parentesis;
		this.parentesisC=parentesisC;
		this.llaveA = llave;
		this.llaveC=llaveC;
	}
	/**
	 * metodo que permite obtener el atributo tipoRetorno
	 * @return categoria sintctica tiporetorno
	 */
	public TipoRetorno getTipoRetorno() 
	{
		return tipoRetorno;
	}
	
	public void setTipoRetorno(TipoRetorno tipoRetorno) 
	{
		this.tipoRetorno = tipoRetorno;
	}
	/**
	 * metodo que permite obtener el atributo idmetodo
	 * @return simbolo lexico idmetodo
	 */
	public SimboloLexico getIdMetodo()
	{
		return idMetodo;
	}
	/**
	 * metodo que permite modificar el atributo idmetodo
	 * @param parentesis
	 */
	public void setIdMetodo(SimboloLexico idMetodo)
	{
		this.idMetodo = idMetodo;
	}
	/**
	 * metodo que permite obtener el atributo visibilidad
	 * @return categoria sintactica visibilidad
	 */
	public Visibilidad getVisibilidad() 
	{
		return visibilidad;
	}
	/**
	 * metodo que permite modificar el atributo parentesis cierre
	 * @return simbolo lexico parentesis cierre
	 */
	public void setVisibilidad(Visibilidad visibilidad)
	{
		this.visibilidad = visibilidad;
	}
	/**
	 * metodo que permite obtener el atributo parentesis apertura
	 * @return simbolo lexico parentesis
	 */
	public SimboloLexico getParentesisA()
	{
		return parentesisA;
	}
	/**
	 * metodo que permite modificar el atributo parentesis apertura
	 * @param parentesis
	 */
	public void setParentesisA(SimboloLexico parentesis)
	{
		this.parentesisA = parentesis;
	}
	/**
	 * metodo que permite obtener el atributo parentesis cierre
	 * @return simbolo lexico parentesis cierre
	 */
	public SimboloLexico getParentesisC()
	{
		return parentesisC;
	}
	/**
	 * metodo que permite modificar el atributo parentesis cierre
	 * @param parentesis
	 */
	public void setParentesisC(SimboloLexico parentesisC)
	{
		this.parentesisC = parentesisC;
	}
	/**
	 * metodo que permite obtener el atributo lista parametros
	 * @return simbolo lexico lista parametros
	 * 
	 */
	public ListaParametros getListaParametros()
	{
		return listaParametros;
	}
	/**
	 * metodo que permite modificar el atributo parentesis cierre
	 * @param parentesis
	 */
	public void setListaParametros(ListaParametros listaParametros)
	{
		this.listaParametros = listaParametros;
	}
	/**
	 * metodo que permite obtener el atributo parentesis apertura
	 * @return simbolo lexico parentesis apertura
	 */
	public SimboloLexico getLlaveA() 
	{
		return llaveA;
	}
	/**
	 * metodo que permite modificar el atributo parentesis apertura
	 * @param llave
	 */
	public void setLlaveA(SimboloLexico llave) {
		this.llaveA = llave;
	}
	/**
	 * metodo que permite obtener el atributo parentesis cierre
	 * @return simbolo lexico parentesis cierre
	 */
	public SimboloLexico getLlaveC() {
		return llaveC;
	}
	/**
	 * metodo que permite modificar el atributo parentesis cierre
	 * @param llave
	 */
	public void setLlaveC(SimboloLexico llaveC) {
		this.llaveC = llaveC;
	}
	/**
	 * metodo que permite obtener el atributo bloquemetodo
	 * @return simbolo sintactico bloque metodo
	 */
	public BloqueMetodo getBloqueMetodo() {
		return bloqueMetodo;
	}
	/**
	 * metodo que permite modificar el atributo bloquemetodo
	 * @param bloquemetodo
	 */
	public void setBloqueMetodo(BloqueMetodo bloqueMetodo) {
		this.bloqueMetodo = bloqueMetodo;
	}	
}
