package cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ConsultarTela extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblMaterial;
	private JLabel lblAncho;
	private JLabel lblPeso;
	private JLabel lblPrecio;
	private JButton btnCerrar;
	private JComboBox cboCodigo;
	private JTextArea txtDescripcion;
	private JTextArea txtMaterial;
	private JTextArea txtAncho;
	private JTextArea txtPeso;
	private JTextArea txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarTela frame = new ConsultarTela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultarTela() {
		setTitle("Consultar Tela");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(12, 25, 70, 15);
		contentPane.add(lblCodigo);
		
		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 66, 94, 15);
		contentPane.add(lblDescripcion);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(12, 106, 70, 15);
		contentPane.add(lblMaterial);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(12, 148, 94, 15);
		contentPane.add(lblAncho);
		
		lblPeso = new JLabel("Peso (g/m\u00B2)");
		lblPeso.setBounds(12, 185, 94, 15);
		contentPane.add(lblPeso);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(12, 227, 94, 15);
		contentPane.add(lblPrecio);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(308, 20, 117, 25);
		btnCerrar.addActionListener(this);
		contentPane.add(btnCerrar);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(142, 22, 117, 25);
		contentPane.add(cboCodigo);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setEnabled(false);
		txtDescripcion.setEditable(false);
		txtDescripcion.setBounds(142, 66, 117, 25);
		contentPane.add(txtDescripcion);
		
		txtMaterial = new JTextArea();
		txtMaterial.setEnabled(false);
		txtMaterial.setEditable(false);
		txtMaterial.setBounds(142, 106, 117, 25);
		contentPane.add(txtMaterial);
		
		txtAncho = new JTextArea();
		txtAncho.setEnabled(false);
		txtAncho.setEditable(false);
		txtAncho.setBounds(142, 148, 117, 25);
		contentPane.add(txtAncho);
		
		txtPeso = new JTextArea();
		txtPeso.setEnabled(false);
		txtPeso.setEditable(false);
		txtPeso.setBounds(142, 185, 117, 25);
		contentPane.add(txtPeso);
		
		txtPrecio = new JTextArea();
		txtPrecio.setEnabled(false);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(142, 222, 117, 25);
		contentPane.add(txtPrecio);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			dispose(); //Cierra la ventana actual
	    } else {
	    	throw new IllegalStateException("Error : " + e.getSource());
	    }
	}
}
