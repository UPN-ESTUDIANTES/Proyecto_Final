package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inventario.Controlador;
import Inventario.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame {

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
					V1 frame = new V1();
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
	public V1() {
		setTitle("INVENTATIO DE PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID PRODUCTO");
		lblNewLabel.setBounds(10, 11, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(110, 11, 49, 14);
		contentPane.add(lblNombre);
		
		JLabel lblStock = new JLabel("STOCK");
		lblStock.setBounds(10, 50, 41, 14);
		contentPane.add(lblStock);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(110, 50, 49, 14);
		contentPane.add(lblPrecio);
		
		txtIDPRO = new JTextField();
		txtIDPRO.setBounds(10, 26, 78, 20);
		contentPane.add(txtIDPRO);
		txtIDPRO.setColumns(10);
		
		txtNOM = new JTextField();
		txtNOM.setColumns(10);
		txtNOM.setBounds(106, 26, 72, 20);
		contentPane.add(txtNOM);
		
		txtSTOCK = new JTextField();
		txtSTOCK.setColumns(10);
		txtSTOCK.setBounds(10, 65, 78, 20);
		contentPane.add(txtSTOCK);
		
		txtPRE = new JTextField();
		txtPRE.setColumns(10);
		txtPRE.setBounds(106, 65, 72, 20);
		contentPane.add(txtPRE);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 98, 365, 154);
		contentPane.add(scrollPane);
		
		JTextArea txtSP = new JTextArea();
		scrollPane.setViewportView(txtSP);
		Controlador ctl = new Controlador();
		btnNewButton = new JButton("AÑADIR");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int IDPRO = Integer.parseInt(txtIDPRO.getText());
			int STOCK = Integer.parseInt(txtSTOCK.getText());
			double precio = Double.parseDouble(txtPRE.getText());
			String nombreP = txtNOM.getText();
					
			Producto pro = new Producto(IDPRO, STOCK, precio, nombreP);
			ctl.AgregarProducto(pro);
			txtSP.setText("");
			Listado();
			}
		void Imprimir(String S) {
			txtSP.append(S+"\n");
		}
		//Falta recursividad.
		void Listado() {
			Imprimir("ID PRODUCTO\tNOMBRE\tSTOCK\tPRECIO");
			for (int i = 0; i<ctl.Tamaño();i++) {
				Imprimir(ctl.Obtener(i).getIDproducto()+"\t"+ctl.Obtener(i).getNombreP()+"\t"+ctl.Obtener(i).getStock()+"\t"+ctl.Obtener(i).getPrecio());
			}
		}
		});
		
		btnNewButton.setBounds(188, 25, 72, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Producto pro = ctl.BuscarProducto(LeerIDPRODUCTO());
			if(pro!=null) {
				JOptionPane.showMessageDialog(btnBuscar, "ID PRODUCTO encontrado.");
			}
			else JOptionPane.showMessageDialog(btnBuscar, "ID PRODUCTO no encontrado.");
		}
		int LeerIDPRODUCTO() {
			return Integer.parseInt(txtIDPRO.getText());
		}
		});
		btnBuscar.setBounds(284, 25, 72, 23);
		contentPane.add(btnBuscar);
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSP.setText("");
				Producto pro= ctl.BuscarProducto(LeerIDPRODUCTO());
				if(pro!=null) {
					pro.setIDproducto(LeerIDPRODUCTO());
					pro.setNombreP(LeerNOMBREP());
					pro.setStock(LeerSTOCK());
					pro.setPrecio(LeerPRECIO());
					Listado();
				}
			}
			int LeerIDPRODUCTO() {
				return Integer.parseInt(txtIDPRO.getText());
			}
			int LeerSTOCK() {
				return Integer.parseInt(txtSTOCK.getText());
			}
			double LeerPRECIO() {
				return Double.parseDouble(txtPRE.getText());
			}
			String LeerNOMBREP() {
				return txtNOM.getText();
			}
			void Imprimir(String S) {
				txtSP.append(S+"\n");
			}
			//Falta recursividad.
			void Listado() {
				Imprimir("ID PRODUCTO\tNOMBRE\tSTOCK\tPRECIO");
				for (int i = 0; i<ctl.Tamaño();i++) {
					Imprimir(ctl.Obtener(i).getIDproducto()+"\t"+ctl.Obtener(i).getNombreP()+"\t"+ctl.Obtener(i).getStock()+"\t"+ctl.Obtener(i).getPrecio());
				}
			}
		});
		btnModificar.setBounds(188, 64, 91, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(284, 64, 91, 23);
		contentPane.add(btnEliminar);
	}
}
