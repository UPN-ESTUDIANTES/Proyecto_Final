package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Producto.Arreglo_Producto;
import Producto.Productos;
import Trabajadores.Arreglo_Empleado;
import Trabajadores.Empleados;
import Ventas.Arreglo_Venta;
import Ventas.NuevaVenta;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class gui_sistema extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSalir;
	private JTextField txtNomE;
	private JTextField txtHE;
	private JTextField txtCodigoV;
	private JTextField txtCantidad;
	private JTextField txtIdProducto;
	private JTextField txtNombreP;
	private JTextField txtStockP;
	private JTextField txtPrecioP;
	private JTextField txtIdEmpleado;
	private JTextArea txtP;
	private JTextField txtSueldo;
	private JTextField txtProductoId;
	private JLabel lblDniCliente;
	private JTextField txtDniCliente;
	private JTextField txtNombre;
	private JButton btnProcesarP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_sistema frame = new gui_sistema();
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
	public gui_sistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PANADERÍA DELICIAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(82, 0, 387, 82);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 179, 461);
		panel.setBackground(Color.ORANGE);
		panel.setForeground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(27, 401, 89, 23);
		panel.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(gui_sistema.class.getResource("/IMAGENES/panaderia_logo.png")));
		lblNewLabel_1.setBounds(456, 0, 145, 82);
		contentPane.add(lblNewLabel_1);
		
		JTabbedPane tabbedSistema = new JTabbedPane(JTabbedPane.TOP);
		tabbedSistema.setBounds(178, 88, 576, 373);
		contentPane.add(tabbedSistema);
		
		JPanel PanelNuevaV = new JPanel();
		tabbedSistema.addTab("NUEVA VENTA", null, PanelNuevaV, null);
		PanelNuevaV.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CODIGO DE VENTA");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 11, 118, 21);
		PanelNuevaV.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("ID PRODUCTO");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(141, 11, 92, 21);
		PanelNuevaV.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("CANTIDAD");
		lblNewLabel_6_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6_1_1_1.setBounds(260, 11, 72, 21);
		PanelNuevaV.add(lblNewLabel_6_1_1_1);
		
		txtCodigoV = new JTextField();
		txtCodigoV.setBounds(10, 43, 106, 20);
		PanelNuevaV.add(txtCodigoV);
		txtCodigoV.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(246, 43, 86, 20);
		PanelNuevaV.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesarP = new JButton("PROCESAR");
		btnProcesarP.addActionListener(this);
		btnProcesarP.setBounds(460, 11, 89, 33);
		PanelNuevaV.add(btnProcesarP);
		
		lblDniCliente = new JLabel("DNI CLIENTE");
		lblDniCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDniCliente.setBounds(10, 84, 79, 16);
		PanelNuevaV.add(lblDniCliente);
		
		txtProductoId = new JTextField();
		txtProductoId.setBounds(126, 43, 86, 20);
		PanelNuevaV.add(txtProductoId);
		txtProductoId.setColumns(10);
		
		txtDniCliente = new JTextField();
		txtDniCliente.setBounds(10, 111, 96, 20);
		PanelNuevaV.add(txtDniCliente);
		txtDniCliente.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("NOMBRE CLIENTE");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(140, 85, 106, 14);
		PanelNuevaV.add(lblNewLabel_12);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(137, 111, 96, 20);
		PanelNuevaV.add(txtNombre);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 141, 551, 181);
		PanelNuevaV.add(scrollPane_2);
		
		txtAV = new JTextArea();
		scrollPane_2.setViewportView(txtAV);
		
		btnListarVenta = new JButton("LISTAR");
		btnListarVenta.addActionListener(this);
		btnListarVenta.setBounds(460, 57, 89, 33);
		PanelNuevaV.add(btnListarVenta);
		
		btnBoleta = new JButton("BOLETA");
		btnBoleta.addActionListener(this);
		btnBoleta.setBounds(460, 101, 89, 30);
		PanelNuevaV.add(btnBoleta);
		
		JPanel PanelEmpleados = new JPanel();
		PanelEmpleados.setToolTipText("");
		PanelEmpleados.setBackground(Color.WHITE);
		tabbedSistema.addTab("EMPLEADOS", null, PanelEmpleados, null);
		tabbedSistema.setEnabledAt(1, true);
		PanelEmpleados.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("ID EMPLEADOS:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(10, 26, 102, 19);
		PanelEmpleados.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("NOMBRE: ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(10, 57, 86, 14);
		PanelEmpleados.add(lblNewLabel_8);
		
		txtNomE = new JTextField();
		txtNomE.setBounds(109, 56, 86, 20);
		PanelEmpleados.add(txtNomE);
		txtNomE.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("CARGO:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(234, 28, 60, 14);
		PanelEmpleados.add(lblNewLabel_9);
		
		JComboBox cboCargo = new JComboBox();
		cboCargo.setModel(new DefaultComboBoxModel(new String[] {"SUPERVISOR", "EMPLEADO", "PANADERO", "CAJERO", "ATENCIÓN AL CLIENTE"}));
		cboCargo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cboCargo.setToolTipText("");
		cboCargo.setBounds(317, 24, 110, 22);
		PanelEmpleados.add(cboCargo);
		
		JLabel lblNewLabel_10 = new JLabel("AFILIACIÓN:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(234, 58, 77, 14);
		PanelEmpleados.add(lblNewLabel_10);
		
		JComboBox cboAfilia = new JComboBox();
		cboAfilia.setModel(new DefaultComboBoxModel(new String[] {"AFP", "ONP"}));
		cboAfilia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cboAfilia.setBounds(317, 54, 110, 22);
		PanelEmpleados.add(cboAfilia);
		
		JLabel lblNewLabel_11 = new JLabel("HORAS EXTRA:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_11.setBounds(10, 88, 102, 14);
		PanelEmpleados.add(lblNewLabel_11);
		
		txtHE = new JTextField();
		txtHE.setBounds(109, 87, 86, 20);
		PanelEmpleados.add(txtHE);
		txtHE.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(119, 118, 442, 216);
		PanelEmpleados.add(scrollPane);
		
		JTextArea txtSE = new JTextArea();
		scrollPane.setViewportView(txtSE);
		Arreglo_Empleado emp = new Arreglo_Empleado();
		
		JButton btnProcesareEmpleado = new JButton("PROCESAR");
		btnProcesareEmpleado.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String cod=txtIdEmpleado.getText();
				String nom=txtNomE.getText();
				String areala=cboCargo.getSelectedItem().toString();
				Double sue = Double.parseDouble(txtSueldo.getText());
				int he = Integer.parseInt(txtHE.getText());
				int afilia=cboAfilia.getSelectedIndex();	
				Empleados e1=new Empleados(cod, nom, areala, sue, he, afilia);
				
				Empleados existente = emp.BuscarPagoEmpleados(cod);

		        if (existente == null) {
		            emp.AgregarPagoEmpleados(e1);
		            JOptionPane.showMessageDialog(null, "Empleado registrado correctamente.");
		        } else {
		            JOptionPane.showMessageDialog(null, "El empleado ya existe.");
		        }
			}
		}	
			
		);
		
		btnProcesareEmpleado.setBounds(7, 120, 89, 23);
		PanelEmpleados.add(btnProcesareEmpleado);
		
		txtIdEmpleado = new JTextField();
		txtIdEmpleado.setBounds(109, 26, 86, 20);
		PanelEmpleados.add(txtIdEmpleado);
		txtIdEmpleado.setColumns(10);
		
		JButton btnMostrar = new JButton("REPORTAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSE.setText("");
				Listado();
				limpiarCampos();
			}
			void Imprimir(String s) {
				txtSE.append(s+"\n");
			}
			void Listado() 
			{
				Imprimir("Código\tNombre\tCargo \tSueldo Bruto\tHoras Extra\tAfiliación\tSueldo Neto");
				for (int i = 0; i <emp.TamañoPago() ; i++) 
				{
					if(i<emp.TamañoPago())

					Imprimir(""+emp.ObtenerPago(i).getIdEmpleado()+"\t"+emp.ObtenerPago(i).getNomE()+"\t"
							+emp.ObtenerPago(i).getCargo()+"\t"+emp.ObtenerPago(i).getSueldo()
							+"\t"+emp.ObtenerPago(i).getHorasE()+"\t"+emp.ObtenerPago(i).getTipoAfiliacion()+"\t"+emp.ObtenerPago(i).SueldoNeto());
				}
				
				
			}	
			public void limpiarCampos() 
			{
			    txtIdEmpleado.setText("");
			    txtNomE.setText("");
			    txtHE.setText("");
			    txtSueldo.setText(" ");
			}
		});
		btnMostrar.setBounds(7, 154, 89, 23);
		PanelEmpleados.add(btnMostrar);
		
		JButton btnBuscarE = new JButton("BUSCAR");
		btnBuscarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cod=txtIdEmpleado.getText().trim();
				Empleados em = emp.BuscarPagoEmpleados(cod); 
				if (em != null ) {
				    JOptionPane.showMessageDialog(null, "Si existe código");
				} else {
				    JOptionPane.showMessageDialog(null, "No existe código");
				}
			}
		});
		btnBuscarE.setBounds(7, 188, 89, 23);
		PanelEmpleados.add(btnBuscarE);
		
		JButton btnEliminarE = new JButton("ELIMINAR");
		btnEliminarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cod=txtIdEmpleado.getText().trim();
				Empleados em = emp.BuscarPagoEmpleados(cod); 
				if (em != null ) {
					emp.EliminarPago(cod);
				    JOptionPane.showMessageDialog(null, "Empleado Eliminado");
				} else {
				    JOptionPane.showMessageDialog(null, "No existe código");
				}
			}
		});
		btnEliminarE.setBounds(10, 226, 89, 23);
		PanelEmpleados.add(btnEliminarE);
		
		JButton btnModificarE = new JButton("MODIFICAR");
		btnModificarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cod=txtIdEmpleado.getText();
				String nom=txtNomE.getText();
				String areala=cboCargo.getSelectedItem().toString();
				Double sue = Double.parseDouble(txtSueldo.getText());
				int he = Integer.parseInt(txtHE.getText());
				int afilia=cboAfilia.getSelectedIndex();	
				Empleados e1=new Empleados(cod, nom, areala, sue, he, afilia);
				Empleados em = emp.BuscarPagoEmpleados(cod); 
				
				if (em != null ) 
				{
					emp.ModificarPago(cod,e1);
				    JOptionPane.showMessageDialog(null, "Datos Modificados Correctamente");
				} else {
				    JOptionPane.showMessageDialog(null, "No existe código");
				}
			}
		});
		btnModificarE.setBounds(10, 258, 89, 23);
		PanelEmpleados.add(btnModificarE);
		
		JLabel lblNewLabel_8_1 = new JLabel("SUELDO:");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8_1.setBounds(234, 88, 86, 14);
		PanelEmpleados.add(lblNewLabel_8_1);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(317, 87, 110, 20);
		PanelEmpleados.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		JPanel PanelProducto = new JPanel();
		PanelProducto.setBackground(Color.WHITE);
		tabbedSistema.addTab("PRODUCTOS", null, PanelProducto, null);
		PanelProducto.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ID PRODUCTO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(80, 21, 83, 14);
		PanelProducto.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOMBRE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(208, 21, 54, 14);
		PanelProducto.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STOCK");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(325, 21, 46, 14);
		PanelProducto.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PRECIO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(445, 21, 46, 14);
		PanelProducto.add(lblNewLabel_5);
		
		txtIdProducto = new JTextField();
		txtIdProducto.setBounds(77, 46, 86, 20);
		PanelProducto.add(txtIdProducto);
		txtIdProducto.setColumns(10);
		
		txtNombreP = new JTextField();
		txtNombreP.setBounds(191, 46, 86, 20);
		PanelProducto.add(txtNombreP);
		txtNombreP.setColumns(10);
		
		txtStockP = new JTextField();
		txtStockP.setBounds(306, 46, 86, 20);
		PanelProducto.add(txtStockP);
		txtStockP.setColumns(10);
		
		txtPrecioP = new JTextField();
		txtPrecioP.setBounds(427, 46, 86, 20);
		PanelProducto.add(txtPrecioP);
		txtPrecioP.setColumns(10);
		
		JButton btnProcesarProducto = new JButton("PROCESAR");
		btnProcesarProducto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String codP = txtIdProducto.getText();
				String nomP = txtNombreP.getText().toUpperCase().trim();
				int stockP = Integer.parseInt(txtStockP.getText());
				double precioP = Double.parseDouble(txtPrecioP.getText());
				int stockNuevo= Integer.parseInt(txtStockP.getText());
				Productos p1=new Productos(codP,nomP,stockP,precioP);
				Productos existenteId= produc.BuscarProducto(codP);
				Productos existenteNombre= produc.BuscarProducto(nomP);
				
				
				if (existenteId == null && existenteNombre == null) 
				{
					if (stockP < 0 || precioP < 0) {
				        JOptionPane.showMessageDialog(null, "El stock y el precio no pueden ser negativos.");
				        return; 
				    }
					else
					{
						produc.AgregarProducto(p1);
					    JOptionPane.showMessageDialog(null, "Producto registrado correctamente.");
					    ListadoV();
					}	    
				} else if (existenteId != null) {
				    existenteId.setStock(existenteId.getStock() + stockNuevo);
				    JOptionPane.showMessageDialog(null, "El Producto ya existe. Se actualizó el stock.");
				}
				else {
				    JOptionPane.showMessageDialog(null, "Ya existe un producto con ese nombre.");
				}
				
			}
		});
		btnProcesarProducto.setBounds(10, 93, 89, 23);
		PanelProducto.add(btnProcesarProducto);
		
		JButton btnBuscarProduct = new JButton("BUSCAR");
		btnBuscarProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String codP=txtIdProducto.getText().trim();
				Productos pro = produc.BuscarProducto(codP); 
				if (pro != null ) {
				    JOptionPane.showMessageDialog(null, "Si existe Producto");
				} else {
				    JOptionPane.showMessageDialog(null, "No existe Producto");
				}
			}
		});
		btnBuscarProduct.setBounds(10, 134, 89, 23);
		PanelProducto.add(btnBuscarProduct);
		
		JButton btn_EliminarProducto = new JButton("ELIMINAR");
		btn_EliminarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String codP=txtIdProducto.getText().trim();
				Productos pro = produc.BuscarProducto(codP); 
				if (pro != null ) 
				{
				    produc.EliminarProducto(codP);
					JOptionPane.showMessageDialog(null, "Producto Eliminado Correctamente");
				} else {
				    JOptionPane.showMessageDialog(null, "Producto No Encontrado");
				
				}
		   }
		});
		btn_EliminarProducto.setBounds(10, 178, 89, 23);
		PanelProducto.add(btn_EliminarProducto);
		
		JButton btnModificarProducto = new JButton("MODIFICA");
		btnModificarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codP = txtIdProducto.getText();
				String nomP = txtNombreP.getText();
				int stockP = Integer.parseInt(txtStockP.getText());
				double precioP = Double.parseDouble(txtPrecioP.getText());
				Productos existente= produc.BuscarProducto(codP);
				
				if (existente != null ) 
				{
					Productos p1=new Productos(codP,nomP,stockP,precioP);
					boolean modificado = produc.ModificarProducto(codP, p1);
					 if (modificado) {
			                JOptionPane.showMessageDialog(null, "Datos Modificados Correctamente");
			            } else {
			                JOptionPane.showMessageDialog(null, "No se pudo modificar el producto");
			            }
				} else
					JOptionPane.showMessageDialog(null, "No existe código");
			}
		});
		btnModificarProducto.setBounds(10, 227, 89, 23);
		PanelProducto.add(btnModificarProducto);
		
		JButton btnListarProducto = new JButton("LISTAR");
		btnListarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtP.setText("");
				Imprimir("Código\tNombre\tStock \tPrecio");
				Listado();
			}
			void Imprimir(String s) {
				txtP.append(s+"\n");
			}
			void Listado() 
			{	
				for (int i = 0; i <produc.Tamaño() ; i++) 
				{
					Imprimir(""+produc.Obtener(i).getIdProducto()+"\t"+produc.Obtener(i).getNombreP()+"\t"
							+produc.Obtener(i).getStock()+"\t"+produc.Obtener(i).getPrecio());
				}
			}			
		});
		btnListarProducto.setBounds(10, 261, 89, 23);
		PanelProducto.add(btnListarProducto);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(109, 93, 426, 241);
		PanelProducto.add(scrollPane_1);
		
		txtP = new JTextArea();
		scrollPane_1.setViewportView(txtP);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(178, 0, 576, 91);
		contentPane.add(panel_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBoleta) {
			do_btnBoleta_actionPerformed(e);
		}
		if (e.getSource() == btnListarVenta) {
			do_btnListarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnProcesarP) {
			do_btnProcesarP_actionPerformed(e);
		}
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		gui_Login v1= new gui_Login();
		v1.setVisible(true);
		this.setVisible(false);
	}
	
	Arreglo_Producto produc = new Arreglo_Producto();
	Arreglo_Venta ven = new Arreglo_Venta();
	private JTextArea txtAV;
	private JButton btnListarVenta;
	private JButton btnBoleta;
	
	protected void do_btnProcesarP_actionPerformed(ActionEvent e) 
	{
		String codP = txtProductoId.getText();
		String codV = txtCodigoV.getText();
		String nomC = txtNombre.getText();
		String dniC = txtDniCliente.getText();
		Integer cant = Integer.parseInt(txtCantidad.getText());
		
		Productos existente= produc.BuscarProducto(codP);
		
		if (existente != null) 
		{
			if (cant < 0) 
			{
				JOptionPane.showMessageDialog(null, "La cantidad no pueden ser negativa.");
		        return;
			}
			else
			{
				if (existente.getStock() >= cant) 
				{
					NuevaVenta nv = new NuevaVenta(dniC, nomC, codV, codP, cant);
		            ven.agregarVenta(nv);
		            existente.setStock(existente.getStock() - cant); 
		            JOptionPane.showMessageDialog(null, "Producto encontrado y venta registrada.");
		        } else {
		            JOptionPane.showMessageDialog(null, "Stock insuficiente. Disponible: " + existente.getStock());
		        }
			}			      
        } else {
            JOptionPane.showMessageDialog(null, "El Producto no existe.");
        }
	}
	
	protected void do_btnListarVenta_actionPerformed(ActionEvent e) 
	{
		ListadoV();
		}
	    void Imprimir(String s) {
		txtAV.append(s+"\n");
      	}
		void ListadoV() 
		{
			txtAV.setText("");
			 Imprimir(String.format("%-15s %-20s %-12s %-20s %-20s %-10s %-10s %-15s", 
				        "Código Venta", "Nombre Cliente", "DNI", "Código Producto", 
				        "Nombre Producto", "Precio", "Cantidad", "Total Pagar"));
			for (int i = 0; i <ven.tamaño() ; i++) 
			{
				NuevaVenta venta = ven.obtenerVenta(i);
				 Productos prod = produc.BuscarProducto(venta.getIdProductoS());
				if (prod != null)
				{
					double precio = prod.getPrecio();
					int cantidad = venta.getCantidad();
					double total = cantidad * precio;			
					
				    Imprimir(venta.getIdVenta() + "\t" +
				             venta.getNombreCliente() + "\t" +
				             venta.getDniCliente() + "\t" +
				             venta.getIdProductoS() + "\t" +
				             prod.getNombreP() + "\t" +
				             precio + "\t" +
				             cantidad + "\t" +
				             total);

				}

				
			}
		}
	protected void do_btnBoleta_actionPerformed(ActionEvent e) {
		
		 txtAV.setText(""); 

		    double totalBoleta = 0;
		    boolean encontrada = false;

		    Imprimir("========= BOLETA DE VENTA =========");
		    Imprimir("Código de Venta: " + txtCodigoV.getText());
		    Imprimir(String.format("%-15s %-10s %-10s %-10s", "Producto", "Precio", "Cantidad", "Subtotal"));

		    for (int i = 0; i < ven.tamaño(); i++) {
		        NuevaVenta venta = ven.obtenerVenta(i);

		        if (venta.getIdVenta().equals(txtCodigoV.getText())) {
		            encontrada = true;
		            Productos prod = produc.BuscarProducto(venta.getIdProductoS());

		            if (prod != null) {
		                double precio = prod.getPrecio();
		                int cantidad = venta.getCantidad();
		                double subtotal = precio * cantidad;
		                totalBoleta += subtotal;

		                Imprimir(String.format("%-15s %-10.2f %-10d %-10.2f", prod.getNombreP(), precio, cantidad, subtotal));
		            }
		        }
		    }

		    if (encontrada) {
		        Imprimir("-----------------------------------");
		        Imprimir(String.format("TOTAL A PAGAR: %.2f", totalBoleta));
		    } else {
		        Imprimir("No se encontraron productos para esta venta.");
		    }
	}
	}
