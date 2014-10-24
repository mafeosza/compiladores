package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica comentario
 * @author USUARIO
 *
 */
public class Comentario 
{
	/**
	 * categoria lexica comentario linea
	 */
	private SimboloLexico comentarioLinea;
	/**
	 * categoria lexica comteario bloque
	 */
	private SimboloLexico comentarioBloque;
	/**
	 * constructor sin parametros
	 */
	public Comentario() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param comentarioLinea
	 * @param comentarioBloque
	 */
	public Comentario(SimboloLexico comentarioLinea,
			SimboloLexico comentarioBloque)
	{
		this.comentarioLinea = comentarioLinea;
		this.comentarioBloque = comentarioBloque;
	}
	/**
	 * metodo que permite obtener el atributo comentariolinea
	 * @return simbolo lexico comentario linea
	 */
	public SimboloLexico getComentarioLinea()
	{
		return comentarioLinea;
	}
	/**
	 * metodo que permite modificar el atributo comentariolinea
	 * @param comentario
	 */
	public void setComentarioLinea(SimboloLexico comentarioLinea) 
	{
		this.comentarioLinea = comentarioLinea;
	}
	/**
	 * metodo que permite obtener el atributo comentario bloque
	 * @return simbolo lexico comentario bloque
	 */
	public SimboloLexico getComentarioBloque() 
	{
		return comentarioBloque;
	}
	/**
	 * metodo que permite modificar el atributo comentariobloque
	 * @param comentariobloque
	 */
	public void setComentarioBloque(SimboloLexico comentarioBloque)
	{
		this.comentarioBloque = comentarioBloque;
	}
}
