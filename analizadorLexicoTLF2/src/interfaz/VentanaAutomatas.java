package interfaz;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;




import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;

import java.awt.BorderLayout;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class VentanaAutomatas extends javax.swing.JFrame {
	private JMenuBar jMenuBar1;
	private JMenu jMenu2;
	private JMenu jMenu1;
	
	private JLabel Imagen;
	private JMenuItem separador;
	private JMenuItem terminal;
	private JMenuItem caracter;
	private JMenuItem cadena;
	private JMenuItem parentesis;
	private JMenuItem agrupador;
	private JMenu otros;
	private JMenuItem bloque;
	private JMenuItem linea;
	private JMenu comentarios;
	private JMenuItem real;
	private JMenuItem entero;
	private JMenu numericos1;
	private JMenuItem logicos;
	private JMenuItem relacionales;
	private JMenuItem aritmeticos;
	private JMenu operadores;
	private JMenuItem metodo;
	private JMenuItem clase;
	private JMenuItem variable;
	private JMenu identificadores;
	private JMenuItem palabraRetorno;
	private JMenuItem palabraReal;
	private JMenuItem palabraClase;
	private JMenuItem palabraQuieto;
	private JMenuItem palabraPublico;
	private JMenuItem palabraProtegido;
	private JMenuItem palabraPrivado;
	private JMenuItem palabraNada;
	private JMenuItem palabraLogico;
	private JMenuItem palabraEnt;
	private JMenuItem palabraDoble;
	private JMenuItem palabraCar;
	private JMenuItem palabraCad;
	ImageIcon imagenCad= new ImageIcon("imagenes/palabraCad.jpg");
	ImageIcon imagenCar= new ImageIcon("imagenes/palabraCar.jpg");
	ImageIcon imagenClase= new ImageIcon("imagenes/palabraClase.jpg");
	ImageIcon imagenDoble= new ImageIcon("imagenes/palabraDoble.jpg");
	ImageIcon imagenEnt= new ImageIcon("imagenes/palabraEnt.jpg");
	ImageIcon imagenLogico= new ImageIcon("imagenes/palabraLogico.jpg");
	ImageIcon imagenNada= new ImageIcon("imagenes/palabraNada.jpg");
	ImageIcon imagenPrivado= new ImageIcon("imagenes/palabraPrivado.jpg");
	ImageIcon imagenProtegido= new ImageIcon("imagenes/palabraProtegido.jpg");
	ImageIcon imagenPublico= new ImageIcon("imagenes/palabraPublico.jpg");
	ImageIcon imagenQuieto= new ImageIcon("imagenes/palabraQuieto.jpg");
	ImageIcon imagenReal= new ImageIcon("imagenes/palabraReal.jpg");
	ImageIcon imagenRetorno= new ImageIcon("imagenes/palabraRetorno.jpg");
	ImageIcon clase1= new ImageIcon("imagenes/clase1.jpg");
	ImageIcon metodo1= new ImageIcon("imagenes/metodo1.jpg");
	ImageIcon variable1= new ImageIcon("imagenes/variable1.jpg");
	ImageIcon aritme= new ImageIcon("imagenes/aritmeticos1.jpg");
	ImageIcon relacion= new ImageIcon("imagenes/relacionales1.jpg");
	ImageIcon logicoss= new ImageIcon("imagenes/logicos1.jpg");
	ImageIcon ent= new ImageIcon("imagenes/entero1.jpg");
	ImageIcon reale= new ImageIcon("imagenes/real1.jpg");
	ImageIcon lineas= new ImageIcon("imagenes/linea.jpg");
	ImageIcon bloques= new ImageIcon("imagenes/bloque.jpg");
	ImageIcon agrupadors= new ImageIcon("imagenes/agrupador1.jpg");
	ImageIcon parentesiss= new ImageIcon("imagenes/parentesis1.jpg");
	ImageIcon caden= new ImageIcon("imagenes/cadena.jpg");
	ImageIcon caract= new ImageIcon("imagenes/caracter.jpg");
	ImageIcon term= new ImageIcon("imagenes/terminal1.jpg");
	ImageIcon sepa= new ImageIcon("imagenes/separador1.jpg");
	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VentanaAutomatas inst = new VentanaAutomatas();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VentanaAutomatas() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

			{
				Imagen = new JLabel();
				getContentPane().add(Imagen, BorderLayout.CENTER);
				Imagen.setBounds(5, 0, 659, 294);

			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("Palabras Reservadas");
					{
						palabraCad = new JMenuItem();
						jMenu2.add(palabraCad);
						palabraCad.setText("Palabra Cad");
						palabraCad.addActionListener(new ActionListener() {
							

							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenCad.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraCar = new JMenuItem();
						jMenu2.add(palabraCar);
						palabraCar.setText("Palabra Car");
						palabraCar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenCar.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraClase = new JMenuItem();
						jMenu2.add(palabraClase);
						palabraClase.setText("Palabra Clase");
						palabraClase.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenClase.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
						
					}
					{
						palabraDoble = new JMenuItem();
						jMenu2.add(palabraDoble);
						palabraDoble.setText("Palabra Doble");
						
						palabraDoble.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenDoble.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraEnt = new JMenuItem();
						jMenu2.add(palabraEnt);
						palabraEnt.setText("Palabra Ent");
						palabraEnt.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenEnt.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraLogico = new JMenuItem();
						jMenu2.add(palabraLogico);
						palabraLogico.setText("Palabra Logico");
						palabraLogico.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenLogico.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraNada = new JMenuItem();
						jMenu2.add(palabraNada);
						palabraNada.setText("Palabra Nada");
						palabraNada.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenNada.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraPrivado = new JMenuItem();
						jMenu2.add(palabraPrivado);
						palabraPrivado.setText("Palabra Privado");
						palabraPrivado.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenPrivado.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraProtegido = new JMenuItem();
						jMenu2.add(palabraProtegido);
						palabraProtegido.setText("Palabra Protegido");
						palabraProtegido.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenProtegido.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraPublico = new JMenuItem();
						jMenu2.add(palabraPublico);
						palabraPublico.setText("Palabra Publico");
						palabraPublico.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenPublico.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraQuieto = new JMenuItem();
						jMenu2.add(palabraQuieto);
						palabraQuieto.setText("Palabra Quieto");
						palabraQuieto.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenQuieto.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraReal = new JMenuItem();
						jMenu2.add(palabraReal);
						palabraReal.setText("Palabra Real");
						palabraReal.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenReal.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						palabraRetorno = new JMenuItem();
						jMenu2.add(palabraRetorno);
						palabraRetorno.setText("Palabra Retorno");
						palabraRetorno.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(imagenRetorno.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
				}
				{
					identificadores = new JMenu();
					jMenuBar1.add(identificadores);
					identificadores.setText("Identificadores");
					{
						variable = new JMenuItem();
						identificadores.add(variable);
						variable.setText("Variable");
						variable.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(variable1.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						clase = new JMenuItem();
						identificadores.add(clase);
						clase.setText("Clase");
						clase.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(clase1.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						metodo = new JMenuItem();
						identificadores.add(metodo);
						metodo.setText("Metodo");
						metodo.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(metodo1.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
				}
				{
					operadores = new JMenu();
					jMenuBar1.add(operadores);
					operadores.setText("Operadores");
					{
						aritmeticos = new JMenuItem();
						operadores.add(aritmeticos);
						aritmeticos.setText("Aritmeticos");
						aritmeticos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(aritme.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						relacionales = new JMenuItem();
						operadores.add(relacionales);
						relacionales.setText("Relaciones");
						relacionales.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(relacion.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						logicos = new JMenuItem();
						operadores.add(logicos);
						logicos.setText("Logicos");
						logicos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(logicoss.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
				}
				{
					numericos1 = new JMenu();
					jMenuBar1.add(numericos1);
					numericos1.setText("Numérico");
					{
						entero = new JMenuItem();
						numericos1.add(entero);
						entero.setText("Entero");
						entero.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(ent.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						real = new JMenuItem();
						numericos1.add(real);
						real.setText("Real");
						real.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(reale.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
				}
				{
					comentarios = new JMenu();
					jMenuBar1.add(comentarios);
					comentarios.setText("Comentarios");
					{
						linea = new JMenuItem();
						comentarios.add(linea);
						linea.setText("Linea");
						linea.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(lineas.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						bloque = new JMenuItem();
						comentarios.add(bloque);
						bloque.setText("Bloque");
						bloque.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(bloques.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
				}
				{
					otros = new JMenu();
					jMenuBar1.add(otros);
					otros.setText("Otros");
					{
						agrupador = new JMenuItem();
						otros.add(agrupador);
						agrupador.setText("Agrupador");
						agrupador.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(agrupadors.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						parentesis = new JMenuItem();
						otros.add(parentesis);
						parentesis.setText("Parentesis");
						parentesis.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(parentesiss.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						cadena = new JMenuItem();
						otros.add(cadena);
						cadena.setText("Cadena");
						cadena.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(caden.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						caracter = new JMenuItem();
						otros.add(caracter);
						caracter.setText("Caracter");
						caracter.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(caract.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						terminal = new JMenuItem();
						otros.add(terminal);
						terminal.setText("Terminal");
						terminal.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(term.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
					{
						separador = new JMenuItem();
						otros.add(separador);
						separador.setText("Separador");
						separador.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								Icon icon=new ImageIcon(sepa.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
								Imagen.setIcon(icon);
								
								Imagen.repaint();
								
							
							}
						});
					}
				}
			}
			pack();
			this.setSize(675, 359);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
