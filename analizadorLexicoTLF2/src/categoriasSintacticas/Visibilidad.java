package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica visibilidad
 * @author USUARIO
 *
 */
public class Visibilidad
{
	/**
	 * categoria lexica palabrareservada
	 */
	private SimboloLexico visibilidad;
	/**
	 * constructor sin parametros
	 */
	public Visibilidad() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param visibilidad
	 */
	public Visibilidad(SimboloLexico visibilidad) 
	{
		this.visibilidad = visibilidad;
	}
	/**
	 * metodo que permite obtener el atributo visibilidad
	 * @return simbolo lexico visibilidad
	 */
	public SimboloLexico getVisibilidad()
	{
		return visibilidad;
	}
	/**
	 * metodo que permite modificar el atributo visibilidad
	 * @param visibilidad
	 */
	public void setVisibilidad(SimboloLexico visibilidad)
	{
		this.visibilidad = visibilidad;
	}
}
