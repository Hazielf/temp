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

public class GenerarReportes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCerrar;
	private JScrollPane scpListadoTelas;
	private JTextArea txtSListadoTelas;
	private JLabel lblTipoDeReporte;
	private JComboBox cboTipoDeReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarReportes frame = new GenerarReportes();
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
	public GenerarReportes() {
		setTitle("Generar Reportes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Si se cierra, solo cierra la ventana actual
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(314, 8, 117, 25);
		btnCerrar.addActionListener(this);
		
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setBounds(12, 13, 117, 15);
		contentPane.add(lblTipoDeReporte);
		contentPane.add(btnCerrar);
		
		scpListadoTelas = new JScrollPane();
		scpListadoTelas.setBounds(15, 45, 416, 209);
		contentPane.add(scpListadoTelas);
		
		txtSListadoTelas = new JTextArea();
		txtSListadoTelas.setEditable(false);
		scpListadoTelas.setViewportView(txtSListadoTelas);
		
		cboTipoDeReporte = new JComboBox();
		cboTipoDeReporte.setBounds(128, 8, 174, 25);
		contentPane.add(cboTipoDeReporte);
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
