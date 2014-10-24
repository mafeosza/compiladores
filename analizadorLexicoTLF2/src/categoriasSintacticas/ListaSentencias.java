package categoriasSintacticas;

import java.util.ArrayList;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica lista sentencias
 * @author USUARIO
 *
 */
public class ListaSentencias 
{
	/**
	 * categoria sintactica lista sentencias
	 */
	private ArrayList<Sentencia> listaSentencias;
	/**
	 * categoria lexica terminal
	 */
	private SimboloLexico terminal;
	/**
	 * constructor sin parametros
	 */
	public ListaSentencias() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param listaSentencias
	 * @param terminal
	 */
	public ListaSentencias(ArrayList<Sentencia> listaSentencias,
			SimboloLexico terminal) 
	{
		this.listaSentencias = listaSentencias;
		this.terminal = terminal;
	}
	/**
	 * metodo que permite obtener el atributo lista sentencias
	 * @return categoria sintactica lista sentencias
	 */
	public ArrayList<Sentencia> getListaSentencias()
	{
		return listaSentencias;
	}
	/**
	 * metodo que permite modificar el atributo lista de sentencias
	 * @param listaSentencias
	 */
	public void setListaSentencias(ArrayList<Sentencia> listaSentencias) 
	{
		this.listaSentencias = listaSentencias;
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
}
