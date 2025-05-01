package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Personal.Empleados;
import Productos.Controlador;
import Productos.producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_Producto extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtProducto;
	private JTextField txtCod;
	private JTextField txtStock;
	private JLabel lblNewLabel_4;
	private JTextField txtPrecio;
	private JButton btnRegistrar;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			V_Producto dialog = new V_Producto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public V_Producto() {
		setTitle("PRODUCTO");
		setBounds(100, 100, 503, 356);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("REGISTRO DE PRODUCTOS");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
			lblNewLabel.setBounds(107, 11, 221, 27);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("PRODUCTO");
			lblNewLabel_1.setBounds(10, 49, 60, 19);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("CODIGO");
			lblNewLabel_2.setBounds(10, 79, 60, 19);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("STOCK");
			lblNewLabel_3.setBounds(212, 79, 60, 19);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txtProducto = new JTextField();
			txtProducto.setBounds(75, 49, 86, 20);
			contentPanel.add(txtProducto);
			txtProducto.setColumns(10);
		}
		{
			txtCod = new JTextField();
			txtCod.setColumns(10);
			txtCod.setBounds(75, 78, 86, 20);
			contentPanel.add(txtCod);
		}
		{
			txtStock = new JTextField();
			txtStock.setColumns(10);
			txtStock.setBounds(265, 78, 86, 20);
			contentPanel.add(txtStock);
		}
		{
			lblNewLabel_4 = new JLabel("PRECIO");
			lblNewLabel_4.setBounds(212, 49, 60, 19);
			contentPanel.add(lblNewLabel_4);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(265, 48, 86, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			btnRegistrar = new JButton("REGISTRAR");
			btnRegistrar.addActionListener(this);
			btnRegistrar.setBounds(10, 124, 89, 23);
			contentPanel.add(btnRegistrar);
		}
		{
			btnBuscar = new JButton("BUSCAR");
			btnBuscar.setBounds(10, 158, 89, 23);
			contentPanel.add(btnBuscar);
		}
		{
			btnEliminar = new JButton("ELIMINAR");
			btnEliminar.setBounds(10, 192, 89, 23);
			contentPanel.add(btnEliminar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(148, 124, 285, 182);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnModificar = new JButton("MODIFICAR");
			btnModificar.setBounds(10, 226, 100, 23);
			contentPanel.add(btnModificar);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	private Controlador controlador = new Controlador();

	protected void do_btnRegistrar_actionPerformed(ActionEvent e) 
	{
		 String tipopan = txtProducto.getText();
		    double precio = Double.parseDouble(txtPrecio.getText());
		    String cod = txtCod.getText();
		    int stock = Integer.parseInt(txtStock.getText());
		    
		    try {
		        if (controlador.productoExiste(cod)) {
		            throw new Exception("El código ya existe. Ingrese un código diferente.");
		        }

		        producto P1 = new producto(stock, tipopan, cod, precio);
		        controlador.agregarproducto(P1);  
		        Listado(P1);
		        
		    } catch (Exception ex) {
		        JOptionPane.showMessageDialog(this, "El código ya existe");
		    }
		}

	void Imprimir (String s)
	{
		txtS.append(s+"\n");
	}
	void Imprimir() {
		txtS.append("----------------------------------\n");
	}
	void Listado(producto P1)
	{
		Imprimir("EL codigo es:  " + P1.getCod());
		Imprimir("El Producto es: "+P1.getTipo_pan());
		Imprimir("El precio es:" +P1.getPrecio());
		Imprimir("El stock disponible es: "+P1.getStock());	
	}
	
}
