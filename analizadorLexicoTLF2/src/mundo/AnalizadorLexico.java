package mundo;

import java.util.ArrayList;

public class AnalizadorLexico {

	//atributos
	int filaActual ; 
	int columnaActual;
	int posicionActual;
	char  caracterActual;
	String codigoFuente;

	ArrayList<SimboloLexico> tablaSimbolos;
	ArrayList<SimboloLexico> tablaErrores;

	//constante EOC para indicar fin del archivo
	static final char EOC=0;



	//------------------------------------------ 
	// METODOS 
	//------------------------------------------



	/* A este método le ingresa como parámetro el código Fuente
	 * su función es llamar los diferentes métodos que definen la clasificación del token, el lexema
	 * y posición  
	 */
	public void analizar(String codigoFuente)
	{
		/*Inicializa la posición Fila y Columna en 1. Y la posición Actual que recorre
	      el código en 0.*/
		filaActual=columnaActual=1;
		this.codigoFuente=codigoFuente;
		posicionActual=0;
		//Crea una tabla de símbolos y de errores de tipo ArrayList de Símbolos Léxicos
		//para almacenar los simbolos léxicos
		tablaSimbolos=new ArrayList<SimboloLexico>();
		//para almacenar los errores léxicos
		tablaErrores=new ArrayList<SimboloLexico>();

		//si no se ha terminado el archivo
		if (codigoFuente.length()!=EOC) 
		{
			//extraigo el primer caracter del Código Fuente
			caracterActual=codigoFuente.charAt(posicionActual);
		}
		else
		{
			//a caracterActual le asigno EOC que indica la finalización del codigoFuente
			caracterActual=EOC;
		}	

		/*
		 * Mientras existan caracteres por analizar se van llamando diferentes métodos
		 * predicados que definirán el símbolo Léxico
		 */
		while (caracterActual!=EOC)
		{
			//van todos los métodos predicado
			if (esEntero())
				continue;
			if(esReal())
				continue;
			if(esComentarioLinea())
				continue;
			if(esComentarioBloque())
				continue;
			if(esAsignacion())
				continue;
			if(esSaltoLinea())
				continue;
			if(esAritmetico())
				continue;
			if(esCadena())
				continue;
			if(esCaracter())
				continue;
			if(esOpRelacional())
				continue;
			if(esTerminal())
				continue;
			if(esAgrupador())
				continue;
			if(esParentesis())
				continue;
			if(esVariable())
				continue;
			if(esClase())
				continue;
			if(esMetodo())
				continue;
			if(esOpLogico())
				continue;
			if(esPalabraReservada())
				continue;
			if(esDiferente())
				continue;
			if(esSeparador())
				continue;


			//si no pertenece a nuestro lenguaje lo almacena como un símbolo no identificado
			if(caracterActual == 32 || caracterActual == 9 || caracterActual == 10)
			{
				sigteCaracter();
			}

			else
			{
				almacenarError(""+caracterActual,"DESCONOCIDO",filaActual,columnaActual);
				System.out.println(2+caracterActual);
				sigteCaracter();
			}

		}
	}

	/*
	 * Este método esMetodo() define si el símbolo léxico es un Metodo y returna FALSE o TRUE	
	 * EXPRESION REGULAR
	 * _L+D*_
	 * Caracter _, seguido de letras "cerradura positiva", y Digitos cerradura de estrella, finalizado por el caracter _
	 */
	private boolean esMetodo()
	{
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		if(caracterActual == '_')
		{
			sigteCaracter();
			lexema += caracterActual;
			//si el caracter actual es una letra, entonces llama al siguiente caracter
			if(Character.isAlphabetic(caracterActual))
			{
				sigteCaracter();

				//Mientras el caracter sea una letra, adiciona al lexema ese caracter y sigue revisando
				//el siguiente caracter.
				while (Character.isAlphabetic(caracterActual))
				{   lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
				}

				//si el caracter actual es un Dígito, entonces llama al siguiente caracter
				if(Character.isDigit((caracterActual)))
				{
					lexema += caracterActual;
					sigteCaracter();

					//Mientras el caracter sea un dígito, adiciona al lexema ese caracter y sigue revisando
					//el siguiente caracter.
					while (Character.isDigit (caracterActual))
					{   lexema += caracterActual;
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
					}
				}
				if(caracterActual == '_')
				{
					lexema += caracterActual;
					sigteCaracter();
					almacenarToken(lexema,"Id Metodo",filaIniToken,columnaInicialToken);
					return true;
				}
			}
		}


		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;

	}

	/*
	 * Este método esClase() define si el símbolo léxico es una clase y returna FALSE o TRUE	
	 * EXPRESION REGULAR
	 * $L+D*
	 * Simbolo de pesos, Letras cerradura positiva, sequido de digitos cerradura de estrella
	 */
	private boolean esClase()
	{
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		if(caracterActual == '$')
		{
			sigteCaracter();
			lexema += caracterActual;
			//si el caracter actual es una letra, entonces llama al siguiente caracter
			if(Character.isAlphabetic(caracterActual))
			{
				sigteCaracter();

				//Mientras el caracter sea una letra, adiciona al lexema ese caracter y sigue revisando
				//el siguiente caracter.
				while (Character.isAlphabetic(caracterActual))
				{   lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
				}

				//si el caracter actual es un Dígito, entonces llama al siguiente caracter
				if(Character.isDigit((caracterActual)))
				{
					lexema += caracterActual;
					sigteCaracter();

					//Mientras el caracter sea un dígito, adiciona al lexema ese caracter y sigue revisando
					//el siguiente caracter.
					while (Character.isDigit (caracterActual))
					{   lexema += caracterActual;
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
					}
				}
				almacenarToken(lexema,"Id Clase",filaIniToken,columnaInicialToken);
				return true;
			}
		}

		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;

	}

	/*
	 * Este método esVariable() define si el símbolo léxico es una variable y returna FALSE o TRUE	
	 * EXPRESION REGULAR
	 *  @(L U _ U -)+D*
	 * Caracter arroba, seguido de letras o guiones "cerradura positiva", y Digitos cerradura de estrella
	 */
	private boolean esVariable()
	{
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		if(caracterActual == '@')
		{
			sigteCaracter();
			lexema += caracterActual;
			//si el caracter actual es una letra, entonces llama al siguiente caracter
			if(Character.isAlphabetic(caracterActual) || caracterActual == '_' || caracterActual == '-')
			{
				sigteCaracter();

				//Mientras el caracter sea una letra, adiciona al lexema ese caracter y sigue revisando
				//el siguiente caracter.
				while (Character.isAlphabetic(caracterActual) || caracterActual == '_' || caracterActual == '-')
				{  
					lexema += caracterActual;
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
				}

				//si el caracter actual es un Dígito, entonces llama al siguiente caracter
				if(Character.isDigit((caracterActual)))
				{
					lexema += caracterActual;
					sigteCaracter();

					//Mientras el caracter sea un dígito, adiciona al lexema ese caracter y sigue revisando
					//el siguiente caracter.
					while (Character.isDigit (caracterActual))
					{   lexema += caracterActual;
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
					}
				}
				almacenarToken(lexema,"Id Variable",filaIniToken,columnaInicialToken);
				return true;
			}
		}

		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;

	}

	/* 
	 * Este metodo esParentesis() define si el simbolo lexico es un parentesis de nuestro lenguaje 
	 * EXPRESION REGULAR
	 * < U >
	 * El parentesis es el conjunto de caracteres <>
	 */
	private boolean esParentesis(){
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = "";
		if(caracterActual=='<')
		{
			lexema += caracterActual;
			sigteCaracter();
			almacenarToken(lexema,"Parentesis Apertura",filaIniToken,columnaInicialToken);
			return true;
		}
		if(caracterActual=='>')
		{
			lexema += caracterActual;
			sigteCaracter();
			almacenarToken(lexema,"Parentesis Cierre",filaIniToken,columnaInicialToken);
			return true;
		}
		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
	}

	/* 
	 * Este metodo esAgrupacor() define si el simbolo lexico es un agrupador 
	 * EXPRESION REGULAR
	 * [ U ]
	 * El agrupador es el conjunto de caracteres []
	 */
	private boolean esAgrupador(){
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = "";
		if(caracterActual=='[')
		{
			lexema += caracterActual;
			sigteCaracter();
			almacenarToken(lexema,"Agrupador Apertura",filaIniToken,columnaInicialToken);
			return true;
		}
		if(caracterActual==']')
		{
			lexema += caracterActual;
			sigteCaracter();
			almacenarToken(lexema,"Agrupador Cierre",filaIniToken,columnaInicialToken);
			return true;
		}
		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
	}

	/* 
	 * Este metodo esTerminal() define si el simbolo lexico es un terminal 
	 * EXPRESION REGULAR
	 * ,
	 * El terminal es el caracter coma
	 */
	private boolean esTerminal(){
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		if(caracterActual==','){
			sigteCaracter();
			almacenarToken(lexema,"terminal de linea",filaIniToken,columnaInicialToken);
			return true;
		}
		else{
			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}
	}

	/* 
	 * Este metodo esSeparador() define si el simbolo lexico es un separador 
	 * EXPRESION REGULAR
	 * :
	 * El separador es el caracter dos puntos
	 */
	private boolean esSeparador(){
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		if(caracterActual==':'){
			sigteCaracter();
			almacenarToken(lexema,"Separador",filaIniToken,columnaInicialToken);
			return true;
		}
		else{
			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}
	}

	/*
	 * Este metodo esOpRelacional() define si el simbolo lexico es un operador relacional 
	 * EXPRESION REGULAR
	 * |(< U > U >= U <= U ==)|
	 * Encerrado entre pipes los operadores de mayor, menor, mayor que, menor que e igual igual
	 * EJEMPLO: (+)
	 */
	private boolean esOpRelacional()
	{

		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = "";
		if(caracterActual=='|')
		{
			lexema += caracterActual;
			sigteCaracter();

			if(caracterActual=='<' || caracterActual=='>')
			{
				lexema += caracterActual + "";
				sigteCaracter();
			}
			if( caracterActual=='=')
			{
				lexema = caracterActual + "";
				sigteCaracter();

				if( caracterActual=='=')
				{
					lexema += caracterActual + "";
					sigteCaracter();
				}
			}
			if(caracterActual=='|'){
				lexema += caracterActual + "";
				sigteCaracter();
				almacenarToken(lexema,"operador relacional",filaIniToken,columnaInicialToken);
				return true;
			}
		}
		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
	}

	/*
	 * Este metodo esCaracter() define si el simbolo lexico es un caracter
	 * EXPRESION REGULAR
	 * +( L U D ) 
	 * Despues del caracter (+) Letra o digito
	 * EJEMPLO: +j
	 */
	private boolean esCaracter(){
		int posicionParaBactraking = posicionActual;
		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = "";
		if(caracterActual=='+')
		{
			lexema += caracterActual + "";
			sigteCaracter();

			if(Character.isDigit(caracterActual) || Character.isAlphabetic(caracterActual)){
				lexema += caracterActual + "";
				sigteCaracter();
				almacenarToken(lexema,"caracter",filaIniToken,columnaInicialToken);
				return true;
			}
		}
		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
	}

	/*
	 * Este metodo esComentarioBloque() define si el simbolo lexico es un comentario de varias lineas
	 * EXPRESION REGULAR
	 * -+ C.O.S +-
	 * Despues de los caracteres (-+) Cualquier otro simbolo se cierra con los caracteres (+-) en ese orden
	 * EJEMPLO: 
	 * -+ comentario 
	 * de varias 
	 * lineas +-
	 */
	private boolean esComentarioBloque(){
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		if(caracterActual =='-')
		{
			sigteCaracter();
			if(caracterActual =='+')
			{

				sigteCaracter();
				while(caracterActual != '+')
				{
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
				}

				if(caracterActual=='+')
				{
					sigteCaracter();
					if(caracterActual=='-')
					{
						//Avanza al siguiente caracter sobre el codigo fuente 
						sigteCaracter();
						//		almacenarToken(lexema,"Com Bloque",filaIniToken,columnaInicialToken);
						return true;
					}
				}
				else
				{
					bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
					return false;
				}
			}
		}

		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;

	}

	/*
	 * Este metodo esComentarioLinea() define si el simbolo lexico es un comentario de una linea
	 * EXPRESION REGULAR
	 * -- C.O.S
	 * Despues de los caracteres (--) Cualquier otro simbolo
	 * EJEMPLO: --comentario de una sola linea
	 */
	private boolean esComentarioLinea(){
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		if(caracterActual =='-')
		{
			sigteCaracter();
			if(caracterActual =='-')
			{
				sigteCaracter();
				while(caracterActual != '\n')
				{
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
				}

				if(caracterActual=='\n')
				{
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
					//	almacenarToken(lexema,"Com Linea",filaIniToken,columnaInicialToken);
					return true;
				}
				else
				{
					bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
					return false;
				}
			}
		}

		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;

	}

	/*
	 * Este metodo esCadena() define si el simbolo lexico es una cadena de caracteres
	 * EXPRESION REGULAR
	 *  -( L U D )*- 
	 * Encerrado entre los caracteres (- -) Letras o digitos cerradura de estrella
	 * EJEMPLO: -hola8-
	 */
	private boolean esCadena(){
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		if(caracterActual =='-'){
			sigteCaracter();
			while(Character.isDigit(caracterActual) || Character.isAlphabetic(caracterActual))
			{
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
			}
			if(caracterActual=='-'){
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
				almacenarToken(lexema,"cadena",filaIniToken,columnaInicialToken);
				return true;
			}
			else{
				bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
				return false;
			}
		}
		else{
			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}		
	}
	/*
	 * Este metodo esOpLogico() define si el simbolo lexico es un operador logico
	 * EXPRESION REGULAR
	 * ( /[& U ^^ U |]/ )
	 * Encerrado entre el caracter (//) los operadores de AND, OR y NOT
	 * EJEMPLO: /&/
	 */
	private boolean esOpLogico()
	{
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";

		if(caracterActual=='/'){
			sigteCaracter();

			if(caracterActual=='&' || caracterActual=='|')
			{
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
			}
			else
				if(caracterActual == '^')
				{
					char ct= caracterActual;
					sigteCaracter();
					if(caracterActual == '^')
					{
						lexema += ct;
						lexema += caracterActual;
						sigteCaracter();
					}
					else 
					{
						bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
						return false;
					}
				}
			if(caracterActual=='/')
			{
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
				almacenarToken(lexema,"Operador Logico",filaIniToken,columnaInicialToken);
				return true;
			}
		}
		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
	}

	/*
	 * Este metodo esAritmetico() define si el simbolo lexico es un operador aritmetico 
	 * EXPRESION REGULAR
	 * ([* U + U - U /])
	 * Encerrado entre parentesis los operadores de division, multiplicacion, suma y resta
	 * EJEMPLO: (+)
	 */
	private boolean esAritmetico(){
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = "";

		if(caracterActual=='(')
		{
			lexema += caracterActual;
			sigteCaracter();

			if(caracterActual=='+' || caracterActual=='-' || caracterActual=='*' || caracterActual=='/')
			{
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();

				if(caracterActual==')')
				{
					lexema += caracterActual;
					//Avanza al siguiente caracter sobre el codigo fuente 
					sigteCaracter();
					almacenarToken(lexema,"operador aritmetico",filaIniToken,columnaInicialToken);
					return true;
				}
			}
		}
		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
	}

	/*
	 * Este metodo esPalabraReservada() define si el simbolo lexico es una de las tantas palabras reservadas de nuestro lenguaje
	 * EXPRESION REGULAR
	 * PALABRAS RESERVADAS: ent, doble, real, privado, publico, logico, cad, car, nada, retorno, noretorno, clase, quieto, protegido
	 */
	private boolean esPalabraReservada()
	{
		if(!Character.isAlphabetic(caracterActual))
		{
			return false;  
		}
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";
		String palabra = lexema;

		//si el caracter actual es una Letra, entonces llama al siguiente caracter
		if(Character.isAlphabetic((caracterActual)))
			sigteCaracter();

		//Mientras el caracter sea una letra, adiciona al lexema ese caracter y sigue revisando
		//el siguiente caracter.
		while(Character.isAlphabetic(caracterActual))
		{
			palabra += caracterActual;
			sigteCaracter();
		}

		System.out.println(palabra);

		if(palabra.equalsIgnoreCase("ent") || palabra.equalsIgnoreCase("doble") || palabra.equalsIgnoreCase("real")
				|| palabra.equalsIgnoreCase("privado") || palabra.equalsIgnoreCase("publico") || palabra.equalsIgnoreCase("logico")
				|| palabra.equalsIgnoreCase("cad") || palabra.equalsIgnoreCase("car") || palabra.equalsIgnoreCase("nada") 
				|| palabra.equalsIgnoreCase("retorno") || palabra.equalsIgnoreCase("noretorno") || palabra.equalsIgnoreCase("clase")
				|| palabra.equalsIgnoreCase("quieto") || palabra.equalsIgnoreCase("protegido") || palabra.equalsIgnoreCase("cpr") 
				|| palabra.equalsIgnoreCase("cmt") || palabra.equalsIgnoreCase("paus") || palabra.equalsIgnoreCase("se")
				|| palabra.equalsIgnoreCase("pacc") || palabra.equalsIgnoreCase("impt"))
		{
			sigteCaracter();
			lexema = palabra;
			almacenarToken(lexema,"Palabra Reservada",filaIniToken,columnaInicialToken);
			return true;

		}
		else	
		{
			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}

	}
	/*
	 * Este metodo esReal() define si el simbolo lexico es un Real y retorna FALSE
	 * EXPRESION REGULAR
	 * D*.D+_
	 * Digitos cerradura de estrella, caracter punto, Digitos cerradura positiva, caracter guion bajo
	 */
	private boolean esReal(){

		//		if(!Character.isDigit(caracterActual))
		//		{
		//			return false;  
		//		}
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = "";

		//si el caracter actual es un Dígito, entonces llama al siguiente caracter
		if(Character.isDigit((caracterActual)))
		{
			lexema += caracterActual;
			sigteCaracter();




			//Mientras el caracter sea un dígito, adiciona al lexema ese caracter y sigue revisando
			//el siguiente caracter.
			while (Character.isDigit (caracterActual))
			{   lexema += caracterActual;
			//Avanza al siguiente caracter sobre el codigo fuente 
			sigteCaracter();
			}
		}


		if(caracterActual=='.')
		{	
			lexema += caracterActual;
			//Avanza al siguiente caracter sobre el codigo fuente 
			sigteCaracter();

			if(Character.isDigit(caracterActual))
			{
				lexema += caracterActual;
				sigteCaracter();
			}
			else
			{
				bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
				return false;
			}
			//Mientras el caracter sea un dígito, adiciona al lexema ese caracter y sigue revisando
			//el siguiente caracter.
			while (Character.isDigit (caracterActual))
			{   lexema += caracterActual;
			//Avanza al siguiente caracter sobre el codigo fuente 
			sigteCaracter();
			}

			if(caracterActual=="_".charAt(0))
			{	
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
				almacenarToken(lexema,"real",filaIniToken,columnaInicialToken);
				return true;
			}

		}

		bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;

	}

	/*
	 * Este método esEntero() define si el símbolo léxico es un Entero y returna FALSE o TRUE	
	 * EXPRESION REGULAR
	 * D+'
	 * Digitos cerradura positiva, caracter tilde
	 */
	private boolean esEntero()
	{
		// Si el dígito NO es entero retorna FALSE
		if(!Character.isDigit(caracterActual))
		{
			return false;  
		}

		/*
		 * Se almacena la pocisión Actual en posicionParaBactraking en que inicia el recorrido
		 *  para definir si es un entero. En caso de no serlo, debe iniciar el recorrido en 
		 *  esta posición para continuar con otro método Predicado
		 */
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;

		//se almacena el caracterActual en la cadena lexema
		String lexema = caracterActual + "";

		//si el caracter actual es un Dígito, entonces llama al siguiente caracter
		if(Character.isDigit((caracterActual)))
			sigteCaracter();

		//Mientras el caracter sea un dígito, adiciona al lexema ese caracter y sigue revisando
		//el siguiente caracter.
		while (Character.isDigit (caracterActual))
		{   lexema += caracterActual;
		//Avanza al siguiente caracter sobre el codigo fuente 
		sigteCaracter();
		}

		/*
  		Si el caracterActual en una coma (,) entonces el token NO es un entero, por lo tanto
		debemos reiniciar la búsqueda en el código fuente. Se llama el metodo backtracking()
		ingresandole como parámetros (posicionParaBactraking, filaIniToken, columnaInicialToken)
		y retorna FALSO a ENTERO
		 */
		if(caracterActual==',')
		{	bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
		return false;
		}
		if(caracterActual=="'".charAt(0))
		{	
			lexema += caracterActual;
			//Avanza al siguiente caracter sobre el codigo fuente 
			sigteCaracter();
			almacenarToken(lexema,"entero",filaIniToken,columnaInicialToken);
			return true;
		}
		/*
		 * Es un ENTERO entonces almacena el símbolo léxico
		 */
		else
		{	

			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}

	}
	/* 
	 * Este método esAsignacion() define si el símbolo léxico es una asignacion y returna FALSE o TRUE	
	 * EXPRESION REGULAR
	 * =>
	 * simbolo igual,simbolo mayor que 
	 */
	private boolean esAsignacion(){
		/*
		 * Se almacena la pocisión Actual en posicionParaBactraking en que inicia el recorrido
		 *  para definir si es un entero. En caso de no serlo, debe iniciar el recorrido en 
		 *  esta posición para continuar con otro método Predicado
		 */
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;
		
		if(caracterActual=='='){
			String lexema = caracterActual+"";
			sigteCaracter();
			if(caracterActual=='>'){
				lexema += caracterActual;
				//Avanza al siguiente caracter sobre el codigo fuente 
				sigteCaracter();
				almacenarToken(lexema,"Asignacion",filaIniToken,columnaInicialToken);
				return true;
			}
			else{
				bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);

				return false;
			}
		}else{
			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}
	}
	/*
	 * Este método esDiferente() define si el símbolo léxico es diferente y returna FALSE o TRUE	
	 * EXPRESION REGULAR
	 * dif
	 */
	 private boolean esDiferente(){
		/* Se almacena la pocisión Actual en posicionParaBactraking en que inicia el recorrido
		 *  para definir si es un entero. En caso de no serlo, debe iniciar el recorrido en 
		 *  esta posición para continuar con otro método Predicado
		 */
		int posicionParaBactraking = posicionActual;

		// posicion para guardar los lexemas en la tabla de símbolos
		int filaIniToken = filaActual; 
		int columnaInicialToken = columnaActual;
		
		if(caracterActual=='d'){
			String lexema = caracterActual+"";
			sigteCaracter();
			if(caracterActual=='i'){
				lexema += caracterActual;
				sigteCaracter();
				if(caracterActual=='f'){
					lexema+=caracterActual;
					sigteCaracter();	
					almacenarToken(lexema,"Diferente",filaIniToken,columnaInicialToken);
					return true;
				}else{
					bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
					return false;
				}
			}
			else{
				bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
				return false;
			}
		}
		else{
			bactracking(posicionParaBactraking, filaIniToken, columnaInicialToken);
			return false;
		}
	}
	/**
	 * Reconoce salto de línea
	 */
	private boolean esSaltoLinea()
	{
		if(caracterActual=='\n')
		{	sigteCaracter();
		return true;
		}
		return false;
	}

	/*
	 * El método bactracking se encarga de reiniciar la posicionActual, caracterActual,
	 * columnaActual,filaActual para comenzar de nuevo la búsqueda en el código Fuente de un
	 * nuevo lexema
	 */
	private void bactracking(int posicionParaBactraking, int filaInicialToken, int columnaInicialToken) 
	{
		posicionActual=posicionParaBactraking;
		caracterActual=codigoFuente.charAt(posicionActual);

		columnaActual=columnaInicialToken;
		filaActual=filaInicialToken;

	}

	/*
	 * El metodo sigteCaracter() se encarga de adelantar una posición en el código Fuente
	 */
	private void sigteCaracter()
	{    //Si el caracter leído el igual a la EOC terminación del archivo, entonces a
		//caracterActual le asigna EOC
		if(codigoFuente.charAt(posicionActual+1)==EOC)
		{
			caracterActual=EOC;
		}
		else
		{   //Si el caracter leído del códigoFuente es un Salto de Línea '\n' entonces incrementa
			//la fila e inicializa la columnaActual en 0
			if(codigoFuente.charAt(posicionActual+1)=='\n')
			{
				filaActual++;
				columnaActual=0;
			}
			else 
				//Si el caracter leído del códigoFuente es un tabulador '\t' entonces incrementa
				//la fila e inicializa la columnaActual en 4
				if(codigoFuente.charAt(posicionActual+1)=='\t')
					columnaActual+=4;
				else
					columnaActual++;

			posicionActual++;
			caracterActual=codigoFuente.charAt(posicionActual);
		}
	}

	/*
	 * El método almacenarToken() recibe como parámetros (lexema, token, filaInicial, columnaInicial)
	 * y almacena en la tabla de símbolos léxicos el nuevo símboloLexico
	 */
	private void almacenarToken(String lexema, String token, int filaInicial, int columnaInicial) 
	{
		SimboloLexico auxiliar = new SimboloLexico(lexema, token, filaInicial, columnaInicial);
		tablaSimbolos.add(auxiliar);

	}

	/*
	 * El método almacenarError() recibe como parámetros (lexema, error, filaInicial, columnaInicial)
	 * y almacena en la tabla de símbolos de errores el nuevo error
	 */
	private void almacenarError(String lexema, String error, int filaInicial, int columnaInicial)
	{
		SimboloLexico auxiliar = new SimboloLexico(lexema, error, filaInicial, columnaInicial);
		tablaErrores.add(auxiliar);

	}

	/*
	 * El método getTablaSimbolos() retorna el arreglo de símbolos léxicos encontrados en el código Fuente
	 */
	public ArrayList<SimboloLexico> getTablaSimbolos() {
		return tablaSimbolos;
	}

	/*
	 * El método getTablaErrores() retorna la tabla de errores encontrados en el código Fuente
	 */
	public ArrayList<SimboloLexico> getTablaErrores() {
		return tablaErrores;
	}



}
