package cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/*Main hereda de JFrame y implementa ActionListener
 *1) Main es subclase de Jframe, lo que la hace interactuar como una GUI
 *2) Implementa la interfaz ActionListener, que permite manejar eventos (presionar botones).
 */
public class Main extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JMenuBar menuBar;
    private JMenu mnArchivo;
    private JMenu mnMantenimiento;
    private JMenu mnVentas;
    private JMenu mnConfiguracion;
    private JMenu mnAyuda;
    private JMenuItem mntmSalir;
    private JMenuItem mntmConsultarTela;
    private JMenuItem mntmModificarTela;
    private JMenuItem mntmListar;
    private JMenuItem mntmVender;
    private JMenuItem mntmGenerarReportes;
    private JMenuItem mntmConfigurarDescuentos;
    private JMenuItem mntmConfigurarObsequio;
    private JMenuItem mntmConfigurarCantidadOptima;
    private JMenuItem mntmConfigurarPremioSorpresa;
    private JMenuItem mntmAcercaDeTienda;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
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
    public Main() {
    	//Inicializamos DataStore
    	DataStore DataStore = cibertec.DataStore.getInstance();
    	//Ni la menor idea de xq no se puede inicializar si no se pone cibertec. antes del DataStore.getInstance()
    	//El IDE me lo arreglo y asi parece funcionar, pero ni idea del pq
    	//preguntarle a la profesora
    	
        setTitle("tienda 1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        mnArchivo = new JMenu("Archivo");
        menuBar.add(mnArchivo);
        
        mntmSalir = new JMenuItem("Salir");
        mntmSalir.addActionListener(this);
        mnArchivo.add(mntmSalir);
        
        mnMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(mnMantenimiento);
        
        mntmConsultarTela = new JMenuItem("Consultar tela");
        mntmConsultarTela.addActionListener(this);
        mnMantenimiento.add(mntmConsultarTela);
        
        mntmModificarTela = new JMenuItem("Modificar tela");
        mntmModificarTela.addActionListener(this);
        mnMantenimiento.add(mntmModificarTela);
        
        mntmListar = new JMenuItem("Listar telas");
        mntmListar.addActionListener(this);
        mnMantenimiento.add(mntmListar);
        
        mnVentas = new JMenu("Ventas");
        menuBar.add(mnVentas);
        
        mntmVender = new JMenuItem("Vender");
        mntmVender.addActionListener(this);
        mnVentas.add(mntmVender);
        
        mntmGenerarReportes = new JMenuItem("Generar reportes");
        mntmGenerarReportes.addActionListener(this);
        mnVentas.add(mntmGenerarReportes);
        
        mnConfiguracion = new JMenu("Configuracion");
        menuBar.add(mnConfiguracion);
        
        mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
        mntmConfigurarDescuentos.addActionListener(this);
        mnConfiguracion.add(mntmConfigurarDescuentos);
        
        mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
        mntmConfigurarObsequio.addActionListener(this);
        mnConfiguracion.add(mntmConfigurarObsequio);
        
        mntmConfigurarCantidadOptima = new JMenuItem("Configurar cantidad optima de metros vendidos");
        mntmConfigurarCantidadOptima.addActionListener(this);
        mnConfiguracion.add(mntmConfigurarCantidadOptima);
        
        mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
        mntmConfigurarPremioSorpresa.addActionListener(this);
        mnConfiguracion.add(mntmConfigurarPremioSorpresa);
        
        mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        
        mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
        mntmAcercaDeTienda.addActionListener(this);
        mnAyuda.add(mntmAcercaDeTienda);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
    }
    
    /*Este metodo es llamado cada que se hace click en un elemento del menú y sigue los siguientes pasos
     *1) El método actionPerformed obtiene la fuente del evento (ActionEvent e)
     *2) Si el objeto inicial coincide con un objeto en especifico, realizar la accion programada para ese objeto.
    */
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == mntmSalir) { 								//Boton Salir
	        System.exit(0);
	    } else if (e.getSource() == mntmConsultarTela){					//Boton Consultar Tela
	    	ConsultarTela consultarTelaFrame = new ConsultarTela();
	        consultarTelaFrame.setVisible(true);
	    } else if (e.getSource() == mntmModificarTela){					//Boton Modificar Tela
	    	ModificarTela ModificarTelaFrame = new ModificarTela();
	        ModificarTelaFrame.setVisible(true);
	    } else if (e.getSource() == mntmListar){						//Boton Listar Tela
	    	ListarTelas ListarTelaFrame = new ListarTelas();
	        ListarTelaFrame.setVisible(true);
    	} else if (e.getSource() == mntmVender){						//Generar Vender
    		Vender VenderFrame = new Vender();
	        VenderFrame.setVisible(true);
    	}else if (e.getSource() == mntmGenerarReportes){				//Generar Reportes
    		GenerarReportes GenerarReportesFrame = new GenerarReportes();
	        GenerarReportesFrame.setVisible(true);
    	}else if (e.getSource() == mntmConfigurarDescuentos){			//Configurar Descuentos
    		ConfigurarDescuentos ConfigurarDescuentosFrame = new ConfigurarDescuentos();
	        ConfigurarDescuentosFrame.setVisible(true);
    	}else if (e.getSource() == mntmConfigurarObsequio) {			//Configurar obsequios
    		ConfigurarDescuentos ConfigurarDescuentosFrame = new ConfigurarDescuentos();
    		ConfigurarDescuentosFrame.setVisible(true);
    	}else if (e.getSource() == mntmConfigurarCantidadOptima) {		//Configurar cantidad optima de metros vendidos
    		ConfigurarCantidadOptimaMetrosVendidos ConfigurarCantidadOptimaFrame = new ConfigurarCantidadOptimaMetrosVendidos();
    		ConfigurarCantidadOptimaFrame.setVisible(true);
    	}else if (e.getSource() == mntmConfigurarPremioSorpresa) {		//Configurar premio sorpresa
    		ConfigurarPremioSorpresa ConfigurarPremioFrame = new ConfigurarPremioSorpresa();
    		ConfigurarPremioFrame.setVisible(true);
    	}
    }
}