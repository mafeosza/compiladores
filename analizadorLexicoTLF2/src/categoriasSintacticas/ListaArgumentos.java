package categoriasSintacticas;

import java.util.ArrayList;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica lista argumentos
 * @author USUARIO
 *
 */
public class ListaArgumentos 
{
	/**
	 * categoria lexica separador
	 */
	private ArrayList<SimboloLexico> listaSeparadores;
	/**
	 * categoria sintactica lista argumentos
	 */
	private ArrayList<Argumento> listaArgumentos;
	/**
	 * constructor sin parametros
	 */
	public ListaArgumentos() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param listaSeparadores
	 * @param listaArgumentos
	 */
	public ListaArgumentos(ArrayList<SimboloLexico> listaSeparadores,
			ArrayList<Argumento> listaArgumentos) 
	{
		this.listaSeparadores = listaSeparadores;
		this.listaArgumentos = listaArgumentos;
	}
	/**
	 * metodo que permite obtener el atributo lisa separadores
	 * @return simbolo lexico lista separadores
	 */
	public ArrayList<SimboloLexico> getListaSeparadores() 
	{
		return listaSeparadores;
	}
	/**
	 * metodo que permite modificar el atributo listaseparadores
	 * @param listaSeparadores
	 */
	public void setListaSeparadores(ArrayList<SimboloLexico> listaSeparadores) 
	{
		this.listaSeparadores = listaSeparadores;
	}
	/**
	 * metodo que permite obtener el atributo lista argumentos
	 * @return categoria sintactica lista argumentos
	 */
	public ArrayList<Argumento> getListaArgumentos() 
	{
		return listaArgumentos;
	}
	/**
	 * metodo que permite modificar el atributo lista argumentos
	 * @param listaArgumentos
	 */
	public void setListaArgumentos(ArrayList<Argumento> listaArgumentos) 
	{
		this.listaArgumentos = listaArgumentos;
	}
}
