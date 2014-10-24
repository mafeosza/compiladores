package categoriasSintacticas;

import mundo.SimboloLexico;

/**
 * clase que representa la categoria sintactica tipo de retorno
 * @author USUARIO
 *
 */
public class TipoRetorno
{
	/**
	 * categoria lexica palabraReservada
	 */
	private TipoDato tipoDato;
	private SimboloLexico idClase;
	/**
	 * constructor sin parametros
	 */
	public TipoRetorno() 
	{
		
	}
	public TipoRetorno(TipoDato tipoDato,SimboloLexico idClase) 
	{
		this.idClase=idClase;
		this.tipoDato=tipoDato;
	}
	public TipoDato getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}
	public SimboloLexico getIdClase() {
		return idClase;
	}
	public void setIdClase(SimboloLexico idClase) {
		this.idClase = idClase;
	}
}

