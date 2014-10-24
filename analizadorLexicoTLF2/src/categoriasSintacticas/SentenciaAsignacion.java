package categoriasSintacticas;

import java.util.ArrayList;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica paquete
 * @author USUARIO
 *
 */
public class SentenciaAsignacion
{
	/**
	 * categoria lexica operadorAsignacion
	 */
	private SimboloLexico operadorAsignacion;
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC;
	
	/**
	 * categoria sintactica expresion
	 */
	private Expresion expresion;
	/**
	 * constructor sin parametros
	 */
	public SentenciaAsignacion() 
	{

	}
	/**
	 * constructor con parametros
	 * @param operadorAsignacion
	 * @param parentesisA
	 * @param parentesisC
	 * @param separador
	 * @param expresion
	 */
	public SentenciaAsignacion(SimboloLexico operadorAsignacion,
			SimboloLexico parentesisA, Expresion expresion, SimboloLexico parentesisC)
	{
		this.operadorAsignacion = operadorAsignacion;
		this.parentesisA = parentesisA;
		this.parentesisC = parentesisC;
		this.expresion = expresion;
	}
	/**
	 * metodo que permite obtener el atributo operadorasignacion
	 * @return simbolo lexico operadorasignacion
	 */
	public SimboloLexico getOperadorAsignacion()
	{
		return operadorAsignacion;
	}
	/**
	 * metodo que permite modificar el atributo operadorAsignacion
	 * @param operadorAsignacion
	 */
	public void setOperadorAsignacion(SimboloLexico operadorAsignacion) 
	{
		this.operadorAsignacion = operadorAsignacion;
	}
	
	
	public SimboloLexico getParentesisA() {
		return parentesisA;
	}
	public void setParentesisA(SimboloLexico parentesisA) {
		this.parentesisA = parentesisA;
	}
	public SimboloLexico getParentesisC() {
		return parentesisC;
	}
	public void setParentesisC(SimboloLexico parentesisC) {
		this.parentesisC = parentesisC;
	}
	
	/**
	 * metodo que permite obtener el atributo expresion
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
}
