package categoriasSintacticas;

import java.util.ArrayList;

import mundo.SimboloLexico;
/**
 * clase que representa la categoria sintactica ListaParametros
 * @author USUARIO
 *
 */
public class ListaParametros 
{
	/**
	 * categoria sintactica parametros
	 */
	private ArrayList<ListaParametros> listaParametros;
		/**
	 * constructor sin parametros
	 */
	public ListaParametros() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param listaParametros
	 * @param listaTerminales
	 */
	public ListaParametros(ArrayList<ListaParametros> listaParametros) 
	{
		this.listaParametros = listaParametros;
	}
	/**
	 * metodo que permite obtener el atributo pacc
	 * @return categoria sintactica listaparametros
	 */
	public ArrayList<ListaParametros> getListaParametros() 
	{
		return listaParametros;
	}
	/**
	 * metodo que permite modificar el atributo lista parametros
	 * @param listaParametros
	 */
	public void setListaParametros(ArrayList<ListaParametros> listaParametros) 
	{
		this.listaParametros = listaParametros;
	}
	
}
