package interfaz;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

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
public class PanelAnalizador extends javax.swing.JPanel implements ActionListener{
	private JLabel jLabelTitulo;
	private JButton botonAnalizar;
	private JButton jButtonAutomatas;
	private JLabel jLabelTabla;
	private JTable jTableTokens;
	private JTable jTableErrores;
	private JTextArea campoCodigoFuente;
	private InterfazAnalizadorLexico principal;
	private VentanaAutomatas miAutomatas;
	private JScrollPane scjtext;
	private JLabel jLabel1;
	private JScrollPane sctabTokens;
	private JScrollPane sctabErrores;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
/*	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new PanelAnalizador());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
*/
	public PanelAnalizador(InterfazAnalizadorLexico principal) {
		super();
		this.principal=principal;
		miAutomatas= new VentanaAutomatas();
		initGUI();
	}
	
	/*
	 * Este metodo leer se encarga de leer un archivo que pide como parametro
	 *  
	 */
	public void leer (File path)
    {
		
    	String texto="";
    	 try 
    	 { 
    		FileReader fr = new FileReader(path); 
    		BufferedReader br = new BufferedReader(fr); 
    		
    		while (texto != null) 
    		{
    			 texto = br.readLine(); 
    			 if (texto != null) 
    			 {
    				 campoCodigoFuente.append(texto + "\n");
    				 System.out.println(texto); 
    			 } 
    		} 
    	 br.close();
    	 }
    	 
    	 catch (IOException ex) 
    	 {
    		 ex.printStackTrace();
    	 }
    }
    
	/*
	 * Este metodo escribir se encarga de guardar y escribir en un archivo 
	 * pide como parametro un string que sera el nombre del archivo.
	 *  
	 */
    public void escribir (String nombre)
    {	
    	File archivo = new File(nombre +".txt");
    	try 
    	{ 
    		FileWriter fw = new FileWriter(archivo, false); 
    		BufferedWriter bw = new BufferedWriter(fw); 
    		
    		String contenidoTexto = new String(campoCodigoFuente.getText());
    		StringTokenizer st = new StringTokenizer(contenidoTexto, "\n");
    		
    		while(st.hasMoreTokens()) 
    		{ 
    			String linea =  st.nextToken();
    			bw.write(linea); 
    			bw.newLine(); 
    		} 
    		bw.close(); 
    	} 
    	catch (IOException ex) 
    	{ 
    		ex.printStackTrace(); 
    	}
    }
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(668, 538));
			this.setLayout(null);
			{
				jLabelTitulo = new JLabel();
				this.add(jLabelTitulo);
				jLabelTitulo.setText("Digite el código fuente a analizar:");
				jLabelTitulo.setBounds(20, 6, 312, 16);
			}
			{
				campoCodigoFuente = new JTextArea();
				campoCodigoFuente.setPreferredSize(new java.awt.Dimension(247, 412));
				scjtext = new JScrollPane(campoCodigoFuente);
				this.add(scjtext,BorderLayout.CENTER);
				scjtext.setBounds(20, 34, 250, 409);
				scjtext.getVerticalScrollBar().setMaximum(10000);

			}
			{
				botonAnalizar = new JButton();
				this.add(botonAnalizar);
				botonAnalizar.setText("Analizar");
				botonAnalizar.setBounds(20, 455, 129, 38);
				botonAnalizar.addActionListener(this);
			}
			
			{
				jLabelTabla = new JLabel();
				this.add(jLabelTabla);
				jLabelTabla.setText("Tabla de Símbolos Léxicos:");
				jLabelTabla.setBounds(316, 6, 323, 16);
			}
			{
				jLabel1 = new JLabel();
				this.add(jLabel1);
				jLabel1.setText("Tabla Errores");
				jLabel1.setBounds(328, 272, 92, 22);
			}
			{
				jButtonAutomatas = new JButton();
				this.add(jButtonAutomatas);
				jButtonAutomatas.setText("Automatas");
				jButtonAutomatas.setBounds(154, 455, 124, 38);
				jButtonAutomatas.addActionListener(this);
				jButtonAutomatas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						
						miAutomatas.setVisible(true);
						miAutomatas.setLocationRelativeTo(null);
					
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==botonAnalizar)
		{
			char a=0;
			principal.analizarCodigo(campoCodigoFuente.getText()+ a);
		}

		
	}

	public void setJTableTokens(JTable tableTokens) {
		jTableTokens = tableTokens;
		//va title
		jTableTokens.setEnabled(false);
		jTableTokens.setRowSelectionAllowed( true );
		jTableTokens.setColumnSelectionAllowed( true);
		sctabTokens = new JScrollPane(jTableTokens);
		this.add(sctabTokens,BorderLayout.CENTER);
		sctabTokens.setBounds(316, 39, 300, 216);
		
	}
	
	public void setJTableErrores(JTable tableErrores){
		jTableErrores = tableErrores;
		jTableErrores.setEnabled(false);
		jTableErrores.setRowSelectionAllowed(true);
		jTableErrores.setColumnSelectionAllowed(true);
		sctabErrores = new JScrollPane(jTableErrores);
		this.add(sctabErrores, BorderLayout.CENTER);
		sctabErrores.setBounds(316, 300, 300, 216);
		sctabErrores.enable();
		sctabErrores.getVerticalScrollBar().setMaximum(10000);
	}
	

}
