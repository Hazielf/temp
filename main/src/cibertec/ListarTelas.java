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

public class ListarTelas extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCerrar;
	private JButton btnGuardar;
	private JScrollPane scpListadoTelas;
	private JTextArea txtSListadoTelas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarTelas frame = new ListarTelas();
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
	public ListarTelas() {
		setTitle("Listar Telas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(86, 233, 117, 25);
		btnCerrar.addActionListener(this);
		contentPane.add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(225, 233, 117, 25);
		contentPane.add(btnGuardar);
		
		scpListadoTelas = new JScrollPane();
		scpListadoTelas.setBounds(15, 12, 416, 209);
		contentPane.add(scpListadoTelas);
		
		txtSListadoTelas = new JTextArea();
		txtSListadoTelas.setEditable(false);
		scpListadoTelas.setViewportView(txtSListadoTelas);
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
