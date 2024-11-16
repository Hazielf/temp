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

public class ConfigurarDescuentos extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblP1;
	private JLabel lblP2;
	private JLabel lblP3;
	private JLabel lblP4;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuentos frame = new ConfigurarDescuentos();
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
	public ConfigurarDescuentos() {
		setTitle("Configurar porcentajes de descuentos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPorcentaje1 = new JLabel("1 a 5 metros");
		lblPorcentaje1.setBounds(12, 25, 94, 15);
		contentPane.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("6 a 10 metros");
		lblPorcentaje2.setBounds(12, 66, 108, 15);
		contentPane.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("11 a 15 metros");
		lblPorcentaje3.setBounds(13, 109, 117, 15);
		contentPane.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("Mas de 15 metros");
		lblPorcentaje4.setBounds(12, 148, 142, 15);
		contentPane.add(lblPorcentaje4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(308, 20, 117, 25);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(308, 66, 117, 25);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);
		
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setBounds(145, 25, 117, 25);
		contentPane.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setColumns(10);
		txtPorcentaje2.setBounds(145, 64, 117, 25);
		contentPane.add(txtPorcentaje2);
		
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setColumns(10);
		txtPorcentaje3.setBounds(145, 107, 117, 25);
		contentPane.add(txtPorcentaje3);
		
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setColumns(10);
		txtPorcentaje4.setBounds(145, 146, 117, 25);
		contentPane.add(txtPorcentaje4);
		
		lblP1 = new JLabel("%");
		lblP1.setBounds(280, 30, 25, 15);
		contentPane.add(lblP1);
		
		lblP2 = new JLabel("%");
		lblP2.setBounds(280, 71, 25, 15);
		contentPane.add(lblP2);
		
		lblP3 = new JLabel("%");
		lblP3.setBounds(280, 109, 25, 15);
		contentPane.add(lblP3);
		
		lblP4 = new JLabel("%");
		lblP4.setBounds(280, 148, 25, 15);
		contentPane.add(lblP4);
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
