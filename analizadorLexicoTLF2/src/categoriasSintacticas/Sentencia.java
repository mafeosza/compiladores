package categoriasSintacticas;

/**
 * clase que representa la categoria sintactica sentencia
 * @author USUARIO
 *
 */
public class Sentencia 
{
	/**
	 * categoria sintactica sentencia si
	 */
	private SentenciaSi sentenciaSi;
	/**
	 * categoria sintactica sentencia para
	 */
	private SentenciaPara sentenciaPara;
	/**
	 * categoria sintactica sentencia mientras
	 */
	private SentenciaMientras sentenciaMientras;
	/**
	 * categoria sintactica comentario 
	 */
	private Comentario comentario;
	/**
	 * categoria sintactica sentencia si
	 */
	private SentenciaAsignacion sentenciaAsginacion;
	/**
	 * categoria sintactica declaracion variable
	 */
	private DeclaracionVariable declaracionVariable;
	/**
	 * construtor sin parametros
	 */
	public Sentencia() 
	{
		
	}
	/**
	 * constructor con parametros
	 * @param sentenciaSi
	 * @param sentenciaPara
	 * @param sentenciaMientras
	 * @param comentario
	 * @param sentenciaAsginacion
	 * @param declaracionVariable
	 */
	public Sentencia(SentenciaSi sentenciaSi, SentenciaPara sentenciaPara,
			SentenciaMientras sentenciaMientras, Comentario comentario,
			SentenciaAsignacion sentenciaAsginacion,
			DeclaracionVariable declaracionVariable) 
	{
		this.sentenciaSi = sentenciaSi;
		this.sentenciaPara = sentenciaPara;
		this.sentenciaMientras = sentenciaMientras;
		this.comentario = comentario;
		this.sentenciaAsginacion = sentenciaAsginacion;
		this.declaracionVariable = declaracionVariable;
	}
	/**
	 * metodo que permite obtener el atributo sentenciasi
	 * @return categoria sintactica sentenciasi
	 */
	public SentenciaSi getSentenciaSi() 
	{
		return sentenciaSi;
	}
	/**
	 * metodo que permite modificar el atributo sentencia si
	 * @param sentenciasi
	 */
	public void setSentenciaSi(SentenciaSi sentenciaSi) {
		this.sentenciaSi = sentenciaSi;
	}
	/**
	 * metodo que permite obtener el atributo sentencia para
	 * @return categoria sintactica para
	 */
	public SentenciaPara getSentenciaPara() 
	{
		return sentenciaPara;
	}
	/**
	 * metodo que permite modificar el atributo sentencia para
	 * @param sentencia para
	 */
	public void setSentenciaPara(SentenciaPara sentenciaPara) {
		this.sentenciaPara = sentenciaPara;
	}
	/**
	 * metodo que permite obtener el atributo sentencia mientras
	 * @return categoria sintactica sentencia mientras
	 */
	public SentenciaMientras getSentenciaMientras() 
	{
		return sentenciaMientras;
	}
	/**
	 * metodo que permite modificar el atributo sentencia mientras
	 * @param sentencia mientras
	 */
	public void setSentenciaMientras(SentenciaMientras sentenciaMientras) {
		this.sentenciaMientras = sentenciaMientras;
	}
	/**
	 * metodo que permite obtener el atributo comentario
	 * @return categoria sintactica comentario
	 */
	public Comentario getComentario() 
	{
		return comentario;
	}
	/**
	 * metodo que permite modificar el atributo comentario
	 * @param comentario
	 */
	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}
	/**
	 * metodo que permite obtener el atributo sentencia asignacion
	 * @return categoria sintactica sentencia asignacion
	 */
	public SentenciaAsignacion getSentenciaAsginacion() 
	{
		return sentenciaAsginacion;
	}
	/**
	 * metodo que permite modificar el atributo sentenciAsginacion
	 * @param sentenciaAsignacion
	 */
	public void setSentenciaAsginacion(SentenciaAsignacion sentenciaAsginacion)
	{
		this.sentenciaAsginacion = sentenciaAsginacion;
	}
	/**
	 * metodo que permite obtener el atributo declaracion variable
	 * @return categoria sintactica declaracion variable
	 */
	public DeclaracionVariable getDeclaracionVariable() 
	{
		return declaracionVariable;
	}/**
	 * metodo que permite modificar el atributo declaracionvariable
	 * @param declaracionvariable
	 */
	public void setDeclaracionVariable(DeclaracionVariable declaracionVariable)
	{
		this.declaracionVariable = declaracionVariable;
	}
}
