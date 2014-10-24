package categoriasSintacticas;

import java.util.ArrayList;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica expresionAritmetica
 * @author USUARIO
 *
 */
public class ExpresionAritmetica 
{
	/**
	 * categoria lexica operadorAritmetico
	 */
	private SimboloLexico operadorAritmetico;
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC;
	/**
	 * categoria sintatica expresion
	 */
	private Expresion expresion;
	/**
	 * categoria lexica parentesis apertura
	 */
	private SimboloLexico parentesisA2;
	/**
	 * categoria lexica parentesis cierre
	 */
	private SimboloLexico parentesisC2;
	/**
	 * categoria sintatica expresion
	 */
	private Expresion  expresion2;

	/**
	 * constructor sin parametros
	 */
	public ExpresionAritmetica() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param operadorAritmetico
	 * @param parentesisA
	 * @param parentesisC
	 * @param expresion
	 */
	public ExpresionAritmetica(SimboloLexico operadorAritmetico,
			SimboloLexico parentesisA, Expresion expresion,
			SimboloLexico parentesisC, SimboloLexico parentesisA2,
			Expresion expresion2, SimboloLexico parentesisC2 ) 
	{
		this.operadorAritmetico = operadorAritmetico;
		this.parentesisA = parentesisA;
		this.expresion = expresion;
		this.parentesisC = parentesisC;
		this.parentesisA2 = parentesisA2;
		this.expresion2 = expresion2;
		this.parentesisC2 = parentesisC2;
	}
	public SimboloLexico getOperadorAritmetico() {
		return operadorAritmetico;
	}
	public void setOperadorAritmetico(SimboloLexico operadorAritmetico) {
		this.operadorAritmetico = operadorAritmetico;
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
	public Expresion getExpresion() {
		return expresion;
	}
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}
	public SimboloLexico getParentesisA2() {
		return parentesisA2;
	}
	public void setParentesisA2(SimboloLexico parentesisA2) {
		this.parentesisA2 = parentesisA2;
	}
	public SimboloLexico getParentesisC2() {
		return parentesisC2;
	}
	public void setParentesisC2(SimboloLexico parentesisC2) {
		this.parentesisC2 = parentesisC2;
	}
	public Expresion getExpresion2() {
		return expresion2;
	}
	public void setExpresion2(Expresion expresion2) {
		this.expresion2 = expresion2;
	}
	
	
	
}
