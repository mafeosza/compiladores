package analizadorSintactico;
/**
 * Clase que representa un error sintactico encontrado
 * @author USUARIO
 *
 */
public class ErrorSintactico 
{
	/**
	 * mensaje mostrado cuando ocurre un error sintactico
	 */
	private String mensaje;
	/**
	 * fila en la que se encuentra el error
	 */
	private int fila;
	/**
	 * columna en la que se encuentra el error
	 */
	private int col;
	/**
	 * Constructor sin parametros
	 */
	public ErrorSintactico()
	{
		
	}
	/**
	 * Constructor con parametros
	 * @param mensaje
	 * @param fila
	 * @param col
	 */
	public ErrorSintactico(String mensaje, int fila, int col) 
	{
		super();
		this.mensaje = mensaje;
		this.fila = fila;
		this.col = col;
	}
	/**
	 * metodo que retorna el mensaje de error
	 * @return mensaje de error
	 */
	public String getMensaje() 
	{
		return mensaje;
	}
	/** 
	 * metodo que permite modificar el mensaje de error
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) 
	{
		this.mensaje = mensaje;
	}
	/**
	 * metodo que retorna la fila donde esta el error
	 * @return fila 
	 */
	public int getFila() 
	{
		return fila;
	}
	/**
	 * metodo que permite modificar la fila donde esta el error
	 * @param fila
	 */
	public void setFila(int fila) 
	{
		this.fila = fila;
	}
	/**
	 * metodo que retorna la columna donde esta el error
	 * @return columna
	 */ 
	public int getCol()
	{
		return col;
	}
	/**
	 * Metodo que permite modificar la columna donde esta el error
	 * @param col
	 */
	public void setCol(int col) {
		this.col = col;
	}
	
}
