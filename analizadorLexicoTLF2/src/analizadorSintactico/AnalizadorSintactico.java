package analizadorSintactico;

import java.util.ArrayList;

import categoriasSintacticas.BloqueClase;
import categoriasSintacticas.BloqueMetodo;
import categoriasSintacticas.Break;
import categoriasSintacticas.Cadena;
import categoriasSintacticas.DeclaracionClase;
import categoriasSintacticas.DeclaracionMetodo;
import categoriasSintacticas.DeclaracionVariable;
import categoriasSintacticas.Expresion;
import categoriasSintacticas.ExpresionAritmetica;
import categoriasSintacticas.ExpresionRelacional;
import categoriasSintacticas.Factor;
import categoriasSintacticas.Importacion;
import categoriasSintacticas.InvocacionMetodo;
import categoriasSintacticas.ListaArgumentos;
import categoriasSintacticas.ListaParametros;
import categoriasSintacticas.ListaSentencias;
import categoriasSintacticas.Paquete;
import categoriasSintacticas.Parametro;
import categoriasSintacticas.Retorno;
import categoriasSintacticas.SentenciaAsignacion;
import categoriasSintacticas.SentenciaMientras;
import categoriasSintacticas.SentenciaPara;
import categoriasSintacticas.SentenciaSi;
import categoriasSintacticas.Termino;
import categoriasSintacticas.TipoDato;
import categoriasSintacticas.TipoRetorno;
import categoriasSintacticas.UnidadDeCompilacion;
import categoriasSintacticas.Visibilidad;
import mundo.SimboloLexico;
/**
 * Clase que analiza sintacticamente el codigo fuente que ya paso por un analisis lexico
 * @author USUARIO
 *
 */
public class AnalizadorSintactico 
{
	/**
	 * lista de simbolos lexicos obtenidos del analizador lexico
	 */
	private ArrayList<SimboloLexico> listaSimbolosLexicos;
	/**
	 * lista de errores sintcticos encontrados en el analisis
	 */
	private ArrayList<ErrorSintactico> listaErroresSintacticos;
	/**
	 * token lexico que se analiza actualmente
	 */
	private SimboloLexico tokenActual;
	/**
	 * posicion del token actual en la lista de simbolos lexicos
	 */
	private int indice;
	/**
	 * estrutura de la unidad de compilacion para el lenguaje
	 */
	private UnidadDeCompilacion unidadCompilacion;

	/**
	 * Constructor de la clase recibe los simbolos lexicos e inicializa los atributos de la clase 
	 * @param listaSimbolos
	 */
	public AnalizadorSintactico(ArrayList<SimboloLexico> listaSimbolos){
		this.listaSimbolosLexicos=listaSimbolos;
		setListaErroresSintacticos(new ArrayList<ErrorSintactico>());
		this.indice = 0;
		this.tokenActual = listaSimbolosLexicos.get(indice);
		setUnidadCompilacion(esUnidadCompilacion());
	}
	
	/**
	 * metodo que permite retornar la unidad de compilacion
	 * @return
	 */
	public UnidadDeCompilacion getUnidadCompilacion()
	{
		return unidadCompilacion;
	}
	
	/**
	 * metodo que permite modificar la unidad de compilacion
	 * @param unidadCompilacion
	 */
	public void setUnidadCompilacion(UnidadDeCompilacion unidadCompilacion)
	{
		this.unidadCompilacion = unidadCompilacion;
	}
	
	/**
	 * metodo que permite retornar la lista de errores sintacticos
	 * @return lista de errores sintacticos
	 */
	public ArrayList<ErrorSintactico> getListaErroresSintacticos() {
		return listaErroresSintacticos;
	}
	
	/**
	 * metodo que permite modificar la lista de errores sintacticos
	 * @param listaErroresSintacticos
	 */
	public void setListaErroresSintacticos(ArrayList<ErrorSintactico> listaErroresSintacticos) {
		this.listaErroresSintacticos = listaErroresSintacticos;
	}
	
	/**
	 * Metodo que permite pasar entre los diferentes simbolos lexicos recibidos del 
	 * analizador lexico
	 */
	public void darSiguienteToken()
	{
		if(indice == listaSimbolosLexicos.size()-1) 
		{ 
			return; 
		}else
		{ 
			indice++; 
			tokenActual = listaSimbolosLexicos.get(indice); 
		} 
	}
	
	/**
	 * Metodo que permite comenzar nuevamente el ciclo de comparacion de una sintaxis, volviendo los parametros
	 * a los valores del ultimo item reconocido
	 * @param posBT parametro del ultimo indice correcto
	 */
	public void bactraking(int posBT)
	{
		indice = posBT;
		tokenActual = listaSimbolosLexicos.get(indice);
	}

	/**
	 * Metodo que compara los tokens recibidos del analizador lexico y los compara para saber si es una unidad 
	 * de compilacion
	 * Orden: 
	 * Importacion 
	 * Paquete
	 * Declaracion clase
	 * @return unidadCompilacion
	 */
	public UnidadDeCompilacion esUnidadCompilacion()
	{
		int indiceA = indice;
		Importacion importacion = esImportacion();

		if(importacion != null)
		{
			darSiguienteToken();
			Paquete paquete =esPaquete();
			if(paquete != null)
			{
				darSiguienteToken();
				DeclaracionClase declaracionClase = esDeclaracionClase();
				if(declaracionClase != null)
				{
					darSiguienteToken();
					return new UnidadDeCompilacion(importacion,paquete,declaracionClase);					
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	
	/**
	 * metodo que analiza si un conjunto de tokens conforman una importacion
	 * @return
	 */
	private Importacion esImportacion() {
		int indiceA =indice;
		SimboloLexico impt,cadena;
		if (tokenActual.getToken().equals("Palabra Reservada") && tokenActual.getLexema().equals("impt"))
		{
			impt=tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("cadena")){
				cadena=tokenActual;
				darSiguienteToken();
				return new Importacion(impt,cadena);
			}
			else{
				bactraking(indiceA);
				return null;				
			}
		}
		bactraking(indiceA);
		return null;
	}
	
	/**
	 * metodo que analiza si un conjunto de tokens conforman un paquete
	 * @return
	 */
	private Paquete esPaquete() {

		int indiceA=indice;
		SimboloLexico pacc,cadena,terminal;

		if(tokenActual.getToken().equals("Palabra Reservada") && tokenActual.getLexema().equals("pacc")){
			pacc=tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("cadena"))
			{
				cadena=tokenActual;
				darSiguienteToken();

				if(tokenActual.getToken().equals("terminal de linea")){
					terminal=tokenActual;
					darSiguienteToken();
					return new Paquete(pacc,cadena,terminal);
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	
	/**
	 * metodo que analiza si un conjunto de tokens conforman una declaracion
	 * @return
	 */
	private DeclaracionClase esDeclaracionClase() 
	{
		int indiceA =indice;
		SimboloLexico clase, idClase, llave, llavec;
		if(tokenActual.getToken().equals("Palabra Reservada") && tokenActual.getLexema().equals("clase") )
		{
			clase = tokenActual;
			darSiguienteToken();
			
			if(tokenActual.getToken().equals("Id Clase"))
			{
				idClase=tokenActual;
				darSiguienteToken();
				if(tokenActual.getToken().equals("Agrupador Apertura"))
				{
					llave=tokenActual;
					darSiguienteToken();
					BloqueClase bloqueClase = esBloqueClase();
					if (bloqueClase!=null) 
					{
						darSiguienteToken();
						if(tokenActual.getToken().equals("Agrupador Cierre"))
						{
							llavec=tokenActual;
							darSiguienteToken();
							return new DeclaracionClase(clase, idClase, llave, bloqueClase, llavec);
						}
						else
						{
							bactraking(indiceA);
							return null;
						}
					}
					else
					{
						bactraking(indiceA);
						return null;
					}
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}
/**
 * Método que analiza si un conjunto de tokens conforma una declaracion de variable 
 * @return
 */
	private DeclaracionVariable esDeclaracionVariable()
	{
		int indiceA = indice;
		SimboloLexico identificadorVariable, terminal;
		if(tokenActual.getToken().equals("Id Variable"))
		{
			identificadorVariable=tokenActual;
			darSiguienteToken();
			
			TipoDato tipoDato = esTipoDato();
			if(tipoDato!= null)
			{
				darSiguienteToken();
				if(tokenActual.getToken().equals("terminal de linea"))
				{
					terminal=tokenActual;
					darSiguienteToken();
					return new DeclaracionVariable(identificadorVariable, tipoDato, terminal);
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es un break
	 * @return
	 */
	private Break esBreak()
	{
		int indiceA=indice;
		SimboloLexico paus;
		if(tokenActual.getToken().equals("Palabra Reservada") && tokenActual.getToken().equals("quieto"))
		{
			paus=tokenActual;
			darSiguienteToken();
			return new Break(paus);
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es un retorno
	 * @return
	 */
	private Retorno esRetorno()
	{
		int indiceA=indice;
		SimboloLexico retorno;
		if(tokenActual.getToken().equals("Palabra Reservada")&& tokenActual.getToken().equals("retorno"))
		{
			retorno=tokenActual;
			darSiguienteToken();
			return new Retorno(retorno);
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es una cadena
	 * @return
	 */
	private Cadena esCadena()
	{
		int indiceA=indice;
		SimboloLexico cadena;
		if(tokenActual.getToken().equals("Palabra Reservada")&& tokenActual.getToken().equals("cad"))
		{
			cadena=tokenActual;
			darSiguienteToken();
			return new Cadena(cadena);
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}

	/**
	 * Metodo que analiza si un conjunto de tokens es una sentencia si
	 * @return
	 */
	private SentenciaSi esSentenciaSi()
	{
		int indiceA = indice;
		SimboloLexico parentesis, parentesisC, se, llaveA, llaveC;
		if(tokenActual.getToken().equals("Parentesis Apertura"))
		{
			parentesis=tokenActual;
			darSiguienteToken();
			ExpresionRelacional expresionRelaciona = esExpresionRelacional();
			if(expresionRelaciona!= null)
			{
				darSiguienteToken();
				if(tokenActual.getToken().equals("Parentesis Cierre"))
				{
					parentesisC=tokenActual;
					darSiguienteToken();
					if(tokenActual.getToken().equals("Palabra Reservada")&& tokenActual.getToken().equals("se"))
					{
						se= tokenActual;
						darSiguienteToken();
						if(tokenActual.getToken().equals("Agrupador Apertura"))
						{
							llaveA=tokenActual;
							darSiguienteToken();
							ListaSentencias listaSentencias = esListaSentencias();
							if(listaSentencias!=null)
							{
								darSiguienteToken();
								if(tokenActual.getToken().equals("Agrupador Cierre"))
								{
									llaveC=tokenActual;
									darSiguienteToken();
									return new SentenciaSi(parentesis, expresionRelaciona, parentesisC, 
											se, llaveA, listaSentencias, llaveC);
								}
								else
								{
									bactraking(indiceA);
									return null;
								}
							}
							else
							{
								bactraking(indiceA);
								return null;
							}
						}
						else
						{
							bactraking(indiceA);
							return null;
						}
					}
					else
					{
						bactraking(indiceA);
						return null;
					}
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	
	/**
	 * Metodo que analiza un conjunto de tokens y determina si es una sentencia para
	 * @return	
	 */
	private SentenciaPara esSentenciaPara()
	{
		int indiceA =indice;
		SimboloLexico cpr, parentesisA, parentesisC, llaveA, llaveC;
		if(tokenActual.getToken().equals("Palabra Reservada")&& tokenActual.getToken().equals("cpr"))
		{
			cpr=tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("Parentesis Apertura"))
			{
				parentesisA=tokenActual;
				darSiguienteToken();
				ExpresionAritmetica expresionAritmetica = esExpresionAritmetica();
				if(expresionAritmetica!=null)
				{
					darSiguienteToken();
					ExpresionRelacional expresionRelacional = esExpresionRelacional();
					if(expresionRelacional!=null)
					{
						darSiguienteToken();
						SentenciaAsignacion sentenciaAsignacion = esSentenciaAsignacion();
						if(sentenciaAsignacion!=null)
						{
							darSiguienteToken();
							if(tokenActual.getToken().equals("Parentesis Cierre"))
							{
								parentesisC=tokenActual;
								darSiguienteToken();
								if(tokenActual.getToken().equals("Agrupador Apertura"))
								{
									llaveA=tokenActual;
									darSiguienteToken();
									ListaSentencias listaSentencia = esListaSentencias();
									if(listaSentencia!=null)
									{
										darSiguienteToken();
										if(tokenActual.getToken().equals("Agrupador Cierre"))
										{
											llaveC=tokenActual;
											darSiguienteToken();
											return new SentenciaPara(cpr, parentesisA, 
													expresionAritmetica,expresionRelacional, 
													sentenciaAsignacion,parentesisC,llaveA, listaSentencia,
													llaveC);
										}
										else
										{
											bactraking(indiceA);
											return null;
										}

									}
									else
									{
										//para sin sentencias
										if(tokenActual.getToken().equals("Agrupador Cierre"))
										{
											llaveC=tokenActual;
											darSiguienteToken();
											return new SentenciaPara(cpr, parentesisA, 
													expresionAritmetica,expresionRelacional, 
													sentenciaAsignacion,parentesisC,llaveA, llaveC);
										}
										else
										{
											bactraking(indiceA);
											return null;
										}
									}
								}
								else
								{
									bactraking(indiceA);
									return null;
								}
							}
							else
							{
								bactraking(indiceA);
								return null;
							}
						}
						else
						{
							bactraking(indiceA);
							return null;
						}
					}
					else
					{
						bactraking(indiceA);
						return null;
					}
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}	
		else
		{
			bactraking(indiceA);
			return null;
		}
	}

	/**
	 * Metodo que analiza un conjunto de tokens y determa si es un factor
	 * @return
	 */
	private Factor esFactor()
	{
		int indiceA = indice;
		SimboloLexico factor;
		if(tokenActual.getToken().equals("entero") || tokenActual.getToken().equals("real") || 
				tokenActual.getToken().equals("Id Variable"))
		{
			factor=tokenActual;
			darSiguienteToken();
			return new Factor(factor);
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza un conjunto de tokens y determina si es un termino
	 * @return
	 */
	private Termino esTermino()
	{
		int indiceA = indice;
		SimboloLexico termino;
		if(tokenActual.getToken().equals("entero") || tokenActual.getToken().equals("real") || 
				tokenActual.getToken().equals("Id Variable"))
		{
			termino=tokenActual;
			darSiguienteToken();
			return new Termino(termino);
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza un conjunto de tokens y determina si son una sentencia mientras
	 * @return
	 */
	private SentenciaMientras esSentenciaMientras()
	{
		int indiceA = indice;
		SimboloLexico parentesisA, parentesisC, cmt, llaveA, llaveC;
		if(tokenActual.getToken().equals("Parentesis  Apertura"))
		{
			parentesisA=tokenActual;
			darSiguienteToken();
			ExpresionRelacional expresionRelacional = esExpresionRelacional();
			if(expresionRelacional!=null)
			{
				darSiguienteToken();
				if(tokenActual.getToken().equals("Parentesis Cierre"))
				{
					parentesisC=tokenActual;
					darSiguienteToken();
					if(tokenActual.getToken().equals("Palabra Reservada")&& tokenActual.getToken().equals("cmt"))
					{
						cmt=tokenActual;
						darSiguienteToken();
						if(tokenActual.getToken().equals("Agrupador Apertura"))
						{
							llaveA=tokenActual;
							darSiguienteToken();
							ListaSentencias listaSentencia = esListaSentencias();
							if(listaSentencia!=null)
							{
								darSiguienteToken();
								if(tokenActual.getToken().equals("Agrupador Cierre"))
								{
									llaveC=tokenActual;
									darSiguienteToken();
									return new SentenciaMientras(parentesisA, expresionRelacional, parentesisC,
											cmt, llaveA, listaSentencia, llaveC);
								}
								else
								{
									bactraking(indiceA);
									return null;
								}
							}
							else
							{
								//mientras sin sentencias
								if(tokenActual.getToken().equals("Agrupador Cierre"))
								{
									llaveC=tokenActual;
									darSiguienteToken();
									return new SentenciaMientras(parentesisA, expresionRelacional, parentesisC,
											cmt, llaveA, llaveC);
								}
								else
								{
									bactraking(indiceA);
									return null;
								}
							}
						}
						else
						{
							bactraking(indiceA);
							return null;
						}
					}
					else
					{
						bactraking(indiceA);
						return null;
					}
				}
				else
				{
					bactraking(indiceA);
					return null;
				}
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	
	/**
	 * Metodo que analiza si un conjunto de tokens son una invocacion de metodo
	 * @return
	 */
	private InvocacionMetodo esInvocacionMetodo()
	{
		int indiceA = indice;
		SimboloLexico identificadorMetodo, parentesisA, parentesisC, terminal;
		if(tokenActual.getToken().equals("Id Metodo"))
		{
			identificadorMetodo =tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("Parentesis Apertura"))
			{
				parentesisA=tokenActual;
				darSiguienteToken();
				ListaArgumentos listaArgumentos= esListaArgumentos();
				if(listaArgumentos!=null)
				{
					darSiguienteToken();
					if(tokenActual.getToken().equals("Parentesis Cierre"))
					{
						parentesisC=tokenActual;
						darSiguienteToken();
						if(tokenActual.getToken().equals("terminal de linea"))
						{
							terminal=tokenActual;
							darSiguienteToken();
							return new InvocacionMetodo(identificadorMetodo, parentesisA, listaArgumentos,
									parentesisC, terminal);
						}else
						{
							bactraking(indiceA);
							return null;
						}
						
					}else
					{
						bactraking(indiceA);
						return null;
					}
				}
				else
				{
					if(tokenActual.getToken().equals("Parentesis Cierre"))
					{
						parentesisC=tokenActual;
						darSiguienteToken();
						if(tokenActual.getToken().equals("terminal de linea"))
						{
							terminal=tokenActual;
							darSiguienteToken();
							return new InvocacionMetodo(identificadorMetodo, 
									parentesisA, parentesisC, terminal);
						}else
						{
							bactraking(indiceA);
							return null;
						}
					}else
					{
						bactraking(indiceA);
						return null;
					}
				}	
			}else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es una expresion 
	 * @return
	 */
	private Expresion esExpresion()
	{
		int indiceA=indice;
		SimboloLexico expresion;
		if(tokenActual.getToken().equals("entero")|| tokenActual.getToken().equals("real") || 
				tokenActual.getToken().equals("Id Variable"))
		{
			expresion=tokenActual;
			darSiguienteToken();
			return new Expresion(expresion);
		}
		ExpresionRelacional expresionRelacional = esExpresionRelacional();
		if(expresionRelacional!=null)
		{
			darSiguienteToken();
			return new Expresion(expresionRelacional);
		}
		ExpresionAritmetica expresionAritmetica = esExpresionAritmetica();
		if(expresionAritmetica!=null)
		{
			darSiguienteToken();
			return new Expresion(expresionAritmetica);
		}
		else
		{
			bactraking(indiceA);
			return null;
		}
	}
	
	/**
	 * Metodo que analiza si un conjunto de tokens es una expresion aritmetica
	 * @return
	 */
	private ExpresionAritmetica esExpresionAritmetica() 
	{
		int indiceA=indice;
		SimboloLexico operador, parentesisA, parentesisC, parentesisA2, parentesisC2;
		
		if(tokenActual.getToken().equals("operador aritmetico"))
		{
			operador=tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("Parentesis Apertura"))
			{
				parentesisA=tokenActual;
				darSiguienteToken();
				Expresion expresion = esExpresion();
				if(expresion!=null)
				{
					darSiguienteToken();
					if(tokenActual.getToken().equals("Parentesis Cierre"))
					{
						parentesisC=tokenActual;
						darSiguienteToken();
						if(tokenActual.getToken().equals("Parentesis Apertura"))
						{
							parentesisA2=tokenActual;
							darSiguienteToken();
							Expresion expresion2 = esExpresion();
							if(expresion2!=null)
							{
								darSiguienteToken();
								if(tokenActual.getToken().equals("Parentesis Cierre"))
								{
									parentesisC2 =tokenActual;
									darSiguienteToken();
									return new ExpresionAritmetica(operador, parentesisA,
											expresion, parentesisC, parentesisA2, expresion2, parentesisC2);
								}else
								{
									bactraking(indiceA);
									return null;
								}
							}else
							{
								bactraking(indiceA);
								return null;
							}
						}else
						{
							bactraking(indiceA);
							return null;
						}
					}else
					{
						bactraking(indiceA);
						return null;
					}
				}else
				{
					bactraking(indiceA);
					return null;
				}
			}else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}

	/**
	 * Metodo que analiza si un conjunto de tokens es una expresion relacional
	 * @return
	 */
	private ExpresionRelacional esExpresionRelacional() 
	{
		int indiceA=indice;
		SimboloLexico operador, parentesisA, parentesisC, parentesisA2, parentesisC2;
		
		if(tokenActual.getToken().equals("operador relacional"))
		{
			operador=tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("Parentesis Apertura"))
			{
				parentesisA=tokenActual;
				darSiguienteToken();
				Expresion expresion = esExpresion();
				if(expresion!=null)
				{
					darSiguienteToken();
					if(tokenActual.getToken().equals("Parentesis Cierre"))
					{
						parentesisC=tokenActual;
						darSiguienteToken();
						if(tokenActual.getToken().equals("Parentesis Apertura"))
						{
							parentesisA2=tokenActual;
							darSiguienteToken();
							Expresion expresion2 = esExpresion();
							if(expresion2!=null)
							{
								darSiguienteToken();
								if(tokenActual.getToken().equals("Parentesis Cierre"))
								{
									parentesisC2 =tokenActual;
									darSiguienteToken();
									return new ExpresionRelacional(operador, parentesisA,
											expresion, parentesisC, parentesisA2, expresion2, parentesisC2);
								}else
								{
									bactraking(indiceA);
									return null;
								}
							}else
							{
								bactraking(indiceA);
								return null;
							}
						}else
						{
							bactraking(indiceA);
							return null;
						}
					}else
					{
						bactraking(indiceA);
						return null;
					}
				}else
				{
					bactraking(indiceA);
					return null;
				}
			}else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es una delcaracion de metodo
	 * @return
	 */
	private DeclaracionMetodo esDeclaracionMetodo()
	{
		int indiceA=indice;
		SimboloLexico idMetodo, parentesisA, parentesisC, llaveA, llaveC;
		TipoRetorno tipoRetorno =esTipoRetorno();
		if(tipoRetorno!=null)
		{
			darSiguienteToken();
			if(tokenActual.getToken().equals("Id Metodo"))
			{
				idMetodo=tokenActual;
				darSiguienteToken();
				Visibilidad visibilidad = esVisibilidad();
				if(visibilidad!=null)
				{
					darSiguienteToken();
					if(tokenActual.getToken().equals("Parentess Apertura"))
					{
						parentesisA=tokenActual;
						ListaParametros listaParametros=esListaParametros();
						if(listaParametros!=null)
						{
							darSiguienteToken();
							if(tokenActual.getToken().equals("Parentesis Cierre"))
							{
								parentesisC=tokenActual;
								darSiguienteToken();
								if(tokenActual.getToken().equals("Agrupador Apertura"))
								{
									llaveA=tokenActual;
									darSiguienteToken();
									ArrayList<DeclaracionMetodo> bloqueMetodo =esBloqueMetodo();
									if(bloqueMetodo!=null)
									{
										darSiguienteToken();
										if(tokenActual.getToken().equals("Agrupador Cierre"))
										{
											llaveC=tokenActual;
											darSiguienteToken();
											//crea un nuevo bloquemetodo (construcctor pide arraylist de declaracionMetodos)
											return new DeclaracionMetodo(tipoRetorno, idMetodo, 
													visibilidad,parentesisA,listaParametros,parentesisC,
													llaveA, bloqueMetodo, llaveC);
										}else
										{
											bactraking(indiceA);
											return null;
										}
									}else{
										if(tokenActual.getToken().equals("Agrupador Cierre"))
										{
											llaveC=tokenActual;
											darSiguienteToken();
											return new DeclaracionMetodo(tipoRetorno, idMetodo, 
													visibilidad,parentesisA,listaParametros,parentesisC,
													llaveA, llaveC);
										}else
										{
											bactraking(indiceA);
											return null;
										}
									}
								}else
								{
									bactraking(indiceA);
									return null;
								}
							}else
							{
								bactraking(indiceA);
								return null;
							}
						}else{
							if(tokenActual.getToken().equals("Parentesis Cierre"))
							{
								parentesisC=tokenActual;
								darSiguienteToken();
								if(tokenActual.getToken().equals("Agrupador Apertura"))
								{
									llaveA=tokenActual;
									darSiguienteToken();
									BloqueMetodo bloqueMetodo = esBloqueMetodo();
									if(bloqueMetodo!=null)
									{
										darSiguienteToken();
										if(tokenActual.getToken().equals("Agrupador Cierre"))
										{
											llaveC=tokenActual;
											darSiguienteToken();
											return new DeclaracionMetodo(tipoRetorno, idMetodo, 
													visibilidad,parentesisA,parentesisC,
													llaveA, bloqueMetodo, llaveC);
										}else
										{
											bactraking(indiceA);
											return null;
										}
									}else{
										if(tokenActual.getToken().equals("Agrupador Cierre"))
										{
											llaveC=tokenActual;
											darSiguienteToken();
											return new DeclaracionMetodo(tipoRetorno, idMetodo, 
													visibilidad,parentesisA,parentesisC,
													llaveA, llaveC);
										}else
										{
											bactraking(indiceA);
											return null;
										}
									}
								}else
								{
									bactraking(indiceA);
									return null;
								}
							}else{
								bactraking(indiceA);
								return null;
							}
						}
					}else{
						bactraking(indiceA);
						return null;
					}	
				}else{
					bactraking(indiceA);
					return null;
				}
			}else{
				bactraking(indiceA);
				return null;
			}
		}else{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es un tipo retorno
	 * @return
	 */
	private TipoRetorno esTipoRetorno() {
		int indiceA =indice;
		SimboloLexico idClase;
		TipoDato tipoDato =esTipoDato();
		if(tipoDato!=null){
			darSiguienteToken();
			if(tokenActual.getToken().equals("Id Clase")){
				idClase=tokenActual;
				return new TipoRetorno(tipoDato, idClase);
			}
			else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es un tipo dato
	 * @return
	 */
	private TipoDato esTipoDato(){
		int indiceA= indice;
		SimboloLexico tipoDato;
		
		if(tokenActual.getToken().equals("Palabra Reservada"))
			{
				if(tokenActual.getToken().equals("ent")
						||tokenActual.getToken().equals("doble") 
						||tokenActual.getToken().equals("real")
						||tokenActual.getToken().equals("cad") 
						||tokenActual.getToken().equals("car")
						||tokenActual.getToken().equals("logico")
						||tokenActual.getToken().equals("Id Clase")) 
				{
					tipoDato=tokenActual; 
					darSiguienteToken();
					return new TipoDato(tipoDato);
				}else
				{
					bactraking(indiceA);
					return null;
				}
			}else
			{
				bactraking(indiceA);
				return null;
			}
	}

	/**
	 * Metodo que analiza si un conjunto de tokens es la visibilidad
	 * @return
	 */
	private Visibilidad esVisibilidad() {
		int indiceA =indice;
		SimboloLexico visibilidad;
		if(tokenActual.getToken().equals("Palabra Reservada"))
		{
			if(tokenActual.getToken().equals("privado")
					||tokenActual.getToken().equals("publico")
					||tokenActual.getToken().equals("protegido")) 
			{
				visibilidad=tokenActual; 
				darSiguienteToken();
				return new Visibilidad(visibilidad);
			}else
			{
				bactraking(indiceA);
				return null;
			}	
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}
	/**
	 * Metodo que analiza si un conjunto de tokens es un parametro
	 * @return
	 */
	private Parametro esParametro(){
		int indiceA =indice;
		SimboloLexico idVariable;
		if(tokenActual.getToken().equals("Id Variable")){
			idVariable=tokenActual;
			darSiguienteToken();
			TipoDato tipoDato = esTipoDato();
			if(tipoDato!=null){
				darSiguienteToken();
				return new Parametro(idVariable,tipoDato);
			}else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}

	/**
	 * Metodo que analiza si un conjunto de tokens es un bloque de metodo
	 * @return
	 */
	private ArrayList<DeclaracionMetodo> esBloqueMetodo() {
		
		int indiceA=indice;
		ArrayList<DeclaracionMetodo>bloqueMetodo = new ArrayList<DeclaracionMetodo>();
		DeclaracionMetodo dm = esDeclaracionMetodo();
		if(dm==null){
			bactraking(indiceA);
			return null;
		}else{
			
		while(dm!=null){
			bloqueMetodo.add(dm);
			dm=esDeclaracionMetodo();
		}
		return bloqueMetodo;
		}
	}

	private ListaParametros esListaParametros() {
		int indiceA =indice;
		Parametro parametro= esParametro();
//		
//		if(parametro!=null){
//		
//			ArrayList<ListaParametros> listaParametros1 = new ArrayList<ListaParametros>();
//			listaParametros1.add(parametro);
//			
//			while (tokenActual.getLexema().equals(":")) 
//			{
//				darSiguienteToken();
//				parametro= esParametro();
//				listaParametros1.add(parametro);
//			}
//			darSiguienteToken();
//			return new ListaParametros(listaParametros1);
//		}
		return null;
	}
private SentenciaAsignacion esSentenciaAsignacion() 
	{
		int indiceA =indice;
		SimboloLexico asignacion, parentesisA, parentesisC, separador;
		if(tokenActual.getToken().equals("Asignacion"))
		{
			asignacion=tokenActual;
			darSiguienteToken();
			if(tokenActual.getToken().equals("Parentesis Apertura"))
			{
				parentesisA= tokenActual;
				Expresion expresion = esExpresion();
				darSiguienteToken();
				if(expresion!=null)
				{
					if(tokenActual.getToken().equals("Parentesis Cierre"))
					{
						parentesisC =tokenActual;
						darSiguienteToken();
						return new SentenciaAsignacion(asignacion,parentesisA,
								expresion, parentesisC);
					}else
					{
						bactraking(indiceA);
						return null;
					}
				}else
				{
					bactraking(indiceA);
					return null;
				}
			}else
			{
				bactraking(indiceA);
				return null;
			}
		}else
		{
			bactraking(indiceA);
			return null;
		}
	}
//	private SesionIteracion esSesionIteracion()
//	{
//		
//	}

	private ListaArgumentos esListaArgumentos() {
		// TODO Auto-generated method stub
		return null;
	}

	private ListaSentencias esListaSentencias() {
		// TODO Auto-generated method stub
		return null;
	}

	private BloqueClase esBloqueClase() {

		int indiceA= indice;
		DeclaracionVariable declaracionVariable = esDeclaracionVariable();
		DeclaracionMetodo declaracionMetodo = esDeclaracionMetodo();
		BloqueClase bloqueClase = new BloqueClase();
		
		if(declaracionVariable!=null){
			darSiguienteToken();
			bloqueClase.setDeclaracionVariable(declaracionVariable);
			return bloqueClase;
		} 	
		//falta error
		
		if(declaracionMetodo!=null){
			darSiguienteToken();
			bloqueClase.setDeclaracionMetodo(declaracionMetodo);
			return bloqueClase;
		}
		//falta error
		
		if(declaracionMetodo ==null && declaracionVariable==null){
		return null;
		}
		//falta error
		return null;
	}
	
}
