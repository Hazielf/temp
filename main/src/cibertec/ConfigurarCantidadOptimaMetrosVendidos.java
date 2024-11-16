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

public class ConfigurarCantidadOptimaMetrosVendidos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCantidadOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField txtCantidadOptima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarCantidadOptimaMetrosVendidos frame = new ConfigurarCantidadOptimaMetrosVendidos();
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
	public ConfigurarCantidadOptimaMetrosVendidos() {
		setTitle("Configurar la cantidad optima de metros vendidos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCantidadOptima = new JLabel("Cantidad optima de metros vendidos");
		lblCantidadOptima.setBounds(18, 25, 275, 15);
		contentPane.add(lblCantidadOptima);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(81, 231, 117, 25);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(238, 231, 117, 25);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(311, 25, 117, 25);
		contentPane.add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);
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
