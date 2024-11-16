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

public class Vender extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblDescripcion;
	private JLabel lblCantidadDeMetros;
	private JButton btnVender;
	private JComboBox cboCodigo;
	private JButton btnCerrar;
	private JScrollPane scpVenderInfo;
	private JTextArea txtSVenderInfo;
	private JTextField txtDescripcion;
	private JTextField txtCantidadMetros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 34, 70, 15);
		contentPane.add(lblCodigo);
		
		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(12, 66, 94, 15);
		contentPane.add(lblDescripcion);
		
		lblCantidadDeMetros = new JLabel("Cantidad de metros");
		lblCantidadDeMetros.setBounds(12, 106, 141, 15);
		contentPane.add(lblCantidadDeMetros);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(307, 29, 117, 25);
		contentPane.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(307, 66, 117, 25);
		btnCerrar.addActionListener(this);
		contentPane.add(btnCerrar);
		
		cboCodigo = new JComboBox();
		cboCodigo.setBounds(171, 29, 117, 25);
		contentPane.add(cboCodigo);
		
		scpVenderInfo = new JScrollPane();
		scpVenderInfo.setBounds(11, 138, 426, 123);
		contentPane.add(scpVenderInfo);
		
		txtSVenderInfo = new JTextArea();
		txtSVenderInfo.setEditable(false);
		scpVenderInfo.setViewportView(txtSVenderInfo);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		txtDescripcion.setBounds(171, 66, 117, 25);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		txtCantidadMetros = new JTextField();
		txtCantidadMetros.setBounds(171, 105, 117, 25);
		contentPane.add(txtCantidadMetros);
		txtCantidadMetros.setColumns(10);
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
