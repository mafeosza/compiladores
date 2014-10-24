package categoriasSintacticas;
/**
 * clase que representa la categoria sintactica unidad de compilacion
 * @author USUARIO
 *
 */
public class UnidadDeCompilacion 
{
	/**
	 * categoria lexica importacion
	 */
	private Importacion importacion;
	/**
	 * categoria lexica paquete
	 */
	private Paquete paquete;
	/**
	 * categoria sintactica declaracion de clase
	 */
	private DeclaracionClase declaracionClase;
	/**
	 * constructor sin parametros
	 */
	public UnidadDeCompilacion()
	{
		
	}
	/**
	 * Constructor con parametros
	 * @param importacion
	 * @param paquete
	 * @param declaracionClase
	 */
	public UnidadDeCompilacion (Importacion importacion,Paquete paquete,
			DeclaracionClase declaracionClase)
	{
		this.importacion=importacion;
		this.paquete=paquete;
		this.declaracionClase=declaracionClase;
	}
	/**
	 * metodo que permite obtener el atributo importacion
	 * @return simbolo lexico Importacion
	 */
	public Importacion getImportacion() 
	{
		return importacion;
	}
	/**
	 * metodo que permite modificar el atributo importacion
	 * @param simbolo lexico Importacion
	 */
	public void setImportacion(Importacion importacion)
	{
		this.importacion = importacion;
	}
	/**
	 * metodo que permite obtener el atributo paquete
	 * @return simbolo lexico paquete
	 */
	public Paquete getPaquete()
	{
		return paquete;
	}
	/**
	 * metodo que permite modificar el atributo paquete
	 * @param simbolo lexico paquete
	 */
	public void setPaquete(Paquete paquete)
	{
		this.paquete = paquete;
	}
	/**
	 * metodo que permite obtener el atributo declaracion clase
	 * @return categoria sintactica declaracionclase
	 */
	public DeclaracionClase getDeclaracionClase()
	{
		return declaracionClase;
	}
	/**
	 * metodo que permite modificar el atributo declaracion clase
	 * @return categoria sintactica declaracion clase
	 */
	public void setDeclaracionClase(DeclaracionClase declaracionClase) 
	{
		this.declaracionClase = declaracionClase;
	}
}
