package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica declaracion de variable
 * @author USUARIO
 *
 */
public class DeclaracionVariable {
	/**
	 * categoria lexica identificador variable
	 */
	private SimboloLexico idVariable;
	/**
	 * categoria sintactica tipo de dato
	 */
	private TipoDato tipoDato;
	/**
	 * categoria lexica terminal
	 */
	private SimboloLexico terminal;
	/**
	 * constructor sin parametros
	 */
	public DeclaracionVariable() {
		super();
	}
	/**
	 * constructor con parametros
	 * @param idVariable
	 * @param tipoDato
	 * @param terminal
	 */
	public DeclaracionVariable(SimboloLexico idVariable, TipoDato tipoDato,
			SimboloLexico terminal) {
		super();
		this.idVariable = idVariable;
		this.tipoDato = tipoDato;
		this.terminal = terminal;
	}
	/**
	 * metodo que permite obtener el atributo idVariable
	 * @return simbolo lexico identificador variable
	 */
	public SimboloLexico getIdVariable() {
		return idVariable;
	}
	/**
	 * metodo que permite modificar el atributo id variable
	 * @param idvariable
	 */
	public void setIdVariable(SimboloLexico idVariable) {
		this.idVariable = idVariable;
	}
	/**
	 * metodo que permite obtener el atributo tipo de dato
	 * @return categoria lexica tipo de dato
	 */
	public TipoDato getTipoDato() {
		return tipoDato;
	}
	/**
	 * metodo que permite modificar el atributo tipo de dato
	 * @param tipo de dato
	 */
	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}
	/**
	 * metodo que permite obtener el atributo terminal
	 * @return simbolo lexico terminal
	 */
	public SimboloLexico getTerminal() {
		return terminal;
	}
	/**
	 * metodo que permite modificar el atributo terminal
	 * @param terminal
	 */
	public void setTerminal(SimboloLexico terminal) {
		this.terminal = terminal;
	}
}
