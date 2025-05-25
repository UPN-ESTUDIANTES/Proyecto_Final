package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inventario.ControladorI;
import Inventario.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventarioV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIDPRO;
	private JTextField txtNOM;
	private JTextField txtSTOCK;
	private JTextField txtPRE;
	private JScrollPane scrollPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventarioV frame = new InventarioV();
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
	
	public InventarioV() {
		setTitle("INVENTATIO DE PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID PRODUCTO");
		lblNewLabel.setBounds(10, 11, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(102, 11, 68, 14);
		contentPane.add(lblNombre);
		
		JLabel lblStock = new JLabel("STOCK");
		lblStock.setBounds(10, 50, 78, 14);
		contentPane.add(lblStock);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(102, 50, 68, 14);
		contentPane.add(lblPrecio);
		
		txtIDPRO = new JTextField();
		txtIDPRO.setBounds(10, 26, 78, 20);
		contentPane.add(txtIDPRO);
		txtIDPRO.setColumns(10);
		
		txtNOM = new JTextField();
		txtNOM.setColumns(10);
		txtNOM.setBounds(98, 26, 72, 20);
		contentPane.add(txtNOM);
		
		txtSTOCK = new JTextField();
		txtSTOCK.setColumns(10);
		txtSTOCK.setBounds(10, 65, 78, 20);
		contentPane.add(txtSTOCK);
		
		txtPRE = new JTextField();
		txtPRE.setColumns(10);
		txtPRE.setBounds(98, 65, 72, 20);
		contentPane.add(txtPRE);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 399, 179);
		contentPane.add(scrollPane);
		
		JTextArea txtSP = new JTextArea();
		scrollPane.setViewportView(txtSP);
		ControladorI ctl = new ControladorI();
		btnNewButton = new JButton("AÑADIR");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				int IDPRO = LeerIDPRODUCTO();
				int STOCK = LeerSTOCK();
				double precio = LeerPRECIO();
				String nombreP = LeerNOMBREP();
						
				Producto pro = new Producto(IDPRO, STOCK, precio, nombreP);
				ctl.AgregarProducto(pro);
				Listado(txtSP, ctl);
			} catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(btnNewButton, "Error: Rellena todas casillas con su correspondiente dato.");
			} 
			}
		});
		
		btnNewButton.setBounds(199, 25, 99, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Producto pro = ctl.BuscarProducto(LeerIDPRODUCTO());
				if(pro!=null) {
					JOptionPane.showMessageDialog(btnBuscar, "ID PRODUCTO encontrado.");
				}
				else JOptionPane.showMessageDialog(btnBuscar, "ID PRODUCTO no encontrado.");
			} catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(btnBuscar, "Error: ID debe ser un número.");
			}
		}
		}
		);
		btnBuscar.setBounds(308, 25, 101, 23);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Producto pro= ctl.BuscarProducto(LeerIDPRODUCTO());
					if(pro!=null) {
						pro.setNombreP(LeerNOMBREP());
						pro.setStock(LeerSTOCK());
						pro.setPrecio(LeerPRECIO());
						Listado(txtSP, ctl);
					}
				}catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(btnModificar, "Error: Rellena las casillas con su correspondiente dato.");
				}
			}
		}
		);
		btnModificar.setBounds(199, 64, 99, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Producto pro = ctl.BuscarProducto(LeerIDPRODUCTO());
					if(pro!=null) {
						ctl.EliminarProducto(LeerIDPRODUCTO());
						Listado(txtSP, ctl);
					}
					else JOptionPane.showMessageDialog(btnEliminar, "El producto a eliminar no existe.");
				} catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(btnEliminar, "Error: ID debe ser un número.");
		        }
			}
		}
		);
		btnEliminar.setBounds(308, 64, 101, 23);
		contentPane.add(btnEliminar);
		
	}
	private int LeerIDPRODUCTO() {
		return Integer.parseInt(txtIDPRO.getText());
	}
	private int LeerSTOCK() {
		return Integer.parseInt(txtSTOCK.getText());
	}
	private double LeerPRECIO() {
		return Double.parseDouble(txtPRE.getText());
	}
	String LeerNOMBREP() {
		return txtNOM.getText();
	}
	private void Imprimir(String S, JTextArea SP) {
		SP.append(S+"\n");
	}
	private void Listado(JTextArea SP, ControladorI ctl) {
	    SP.setText("");
	    Imprimir("ID PRODUCTO\tNOMBRE\tSTOCK\tPRECIO", SP);
	    ListadoRecursivo(ctl, SP, 0);
	}
	private void ListadoRecursivo(ControladorI ctl, JTextArea SP, int i) {
	    if (i < ctl.Tamaño()) {
	        Producto p = ctl.Obtener(i);
	        Imprimir(p.getIDproducto() + "\t" + p.getNombreP() + "\t" + p.getStock() + "\t" + p.getPrecio(), SP);
	        ListadoRecursivo(ctl, SP, i + 1); 
	    }
	}
}
