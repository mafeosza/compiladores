package categoriasSintacticas;
/**
 * clase que representa la categoria sintactica bloque clase
 * @author USUARIO
 *
 */
public class BloqueClase 
{
	/**
	 * categoria sintactica declaracion variable
	 */
	private DeclaracionVariable declaracionVariable;
	/**
	 * categoria sintactica declaracion de metodo
	 */
	private DeclaracionMetodo declaracionMetodo;
	/**
	 *constructor sin parametros 
	 */
	public BloqueClase() 
	{
		
	}
	/**
	 * Constructor con parametros
	 * @param declaracionVariable
	 * @param declaracionMetodo
	 */
	public BloqueClase(DeclaracionVariable declaracionVariable,
			DeclaracionMetodo declaracionMetodo) 
	{
		this.declaracionVariable = declaracionVariable;
		this.declaracionMetodo = declaracionMetodo;
	}
	
	
	/**
	 * metodo que permite obtener el atributo declaracionvariable
	 * @return categoria sintactica declaracion variable
	 */
	public DeclaracionVariable getDeclaracionVariable()
	{
		return declaracionVariable;
	}
	/**
	 * metodo que permite modificar el atributo declaracionvariable
	 * @param declaracionvariable
	 */
	public void setDeclaracionVariable(DeclaracionVariable declaracionVariable)
	{
		this.declaracionVariable = declaracionVariable;
	}
	/**
	 * metodo que permite obtener el atributo metodo
	 * @return categoria sintactica declaracion metodo
	 */
	public DeclaracionMetodo getDeclaracionMetodo() 
	{
		return declaracionMetodo;
	}
	/**
	 * metodo que permite modificar el atributo declaracionmetodo
	 * @param declaracionmetodo
	 */
	public void setDeclaracionMetodo(DeclaracionMetodo declaracionMetodo) 
	{
		this.declaracionMetodo = declaracionMetodo;
	}
}
