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

public class ConfigurarObsequio extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtCantidadMetrosAdquiridos;
	private JTextField txtObsequio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequio frame = new ConfigurarObsequio();
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
	public ConfigurarObsequio() {
		setTitle("Configurar obsequio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPorcentaje1 = new JLabel("Cantidad minima de metros adquiridos");
		lblPorcentaje1.setBounds(18, 25, 275, 15);
		contentPane.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("Obsequio");
		lblPorcentaje2.setBounds(18, 76, 108, 15);
		contentPane.add(lblPorcentaje2);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(81, 231, 117, 25);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(238, 231, 117, 25);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		txtCantidadMetrosAdquiridos = new JTextField();
		txtCantidadMetrosAdquiridos.setBounds(311, 25, 117, 25);
		contentPane.add(txtCantidadMetrosAdquiridos);
		txtCantidadMetrosAdquiridos.setColumns(10);
		
		txtObsequio = new JTextField();
		txtObsequio.setColumns(10);
		txtObsequio.setBounds(311, 74, 117, 25);
		contentPane.add(txtObsequio);
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
