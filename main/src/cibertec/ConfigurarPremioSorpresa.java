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

public class ConfigurarPremioSorpresa extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNumeroCliente;
	private JLabel lblPremioSorpresa;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtNumeroCliente;
	private JTextField txtPremioSorpresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarPremioSorpresa frame = new ConfigurarPremioSorpresa();
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
	public ConfigurarPremioSorpresa() {
		setTitle("Configurar premio sorpresa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumeroCliente = new JLabel("Numero de cliente");
		lblNumeroCliente.setBounds(18, 25, 275, 15);
		contentPane.add(lblNumeroCliente);
		
		lblPremioSorpresa = new JLabel("Premio sorpresa");
		lblPremioSorpresa.setBounds(18, 76, 154, 15);
		contentPane.add(lblPremioSorpresa);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(81, 231, 117, 25);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(238, 231, 117, 25);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		txtNumeroCliente = new JTextField();
		txtNumeroCliente.setBounds(311, 25, 117, 25);
		contentPane.add(txtNumeroCliente);
		txtNumeroCliente.setColumns(10);
		
		txtPremioSorpresa = new JTextField();
		txtPremioSorpresa.setColumns(10);
		txtPremioSorpresa.setBounds(311, 74, 117, 25);
		contentPane.add(txtPremioSorpresa);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			dispose(); //Cierra la ventana actual
	    } else {
	    	throw new IllegalStateException("Error : " + e.getSource());
	    }
	}
}
