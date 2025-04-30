package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Personal.Empleados;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class V_Empleado extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_2;
	private JComboBox cboCargo;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JComboBox cboAfilia;
	private JTextField txtCod;
	private JTextField txtNom;
	private JTextField txtSueldo;
	private JTextField txtHE;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnPorcesar;
	private JButton btnLimpiar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			V_Empleado dialog = new V_Empleado();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public V_Empleado() {
		setTitle("EMPLEADO");
		setBounds(100, 100, 526, 396);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("REGISTRO DE EMPLEADOS ");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel.setBounds(141, 11, 222, 31);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_3 = new JLabel("CODIGO :");
			lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(10, 64, 66, 22);
			contentPanel.add(lblNewLabel_3);
		}
		{
			lblNewLabel_1 = new JLabel("NOMBRE :");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(10, 98, 66, 22);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_4 = new JLabel(" SUELDO :");
			lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_4.setBounds(10, 131, 66, 22);
			contentPanel.add(lblNewLabel_4);
		}
		{
			lblNewLabel_2 = new JLabel("HORAS EXTRA :");
			lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(257, 131, 102, 22);
			contentPanel.add(lblNewLabel_2);
		}
		{
			cboCargo = new JComboBox();
			cboCargo.setModel(new DefaultComboBoxModel(new String[] {"", "GERENTE", "SUPERVISOR", "CAJERO", "REPONEDOR"}));
			cboCargo.setEditable(true);
			cboCargo.setToolTipText("");
			cboCargo.setBounds(338, 68, 111, 22);
			contentPanel.add(cboCargo);
		}
		{
			lblNewLabel_5 = new JLabel("CARGO :");
			lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_5.setBounds(257, 68, 66, 22);
			contentPanel.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("AFILIACIÓN:");
			lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_6.setBounds(257, 98, 79, 22);
			contentPanel.add(lblNewLabel_6);
		}
		{
			cboAfilia = new JComboBox();
			cboAfilia.setModel(new DefaultComboBoxModel(new String[] {"", "AFP", "ONP"}));
			cboAfilia.setToolTipText("");
			cboAfilia.setEditable(true);
			cboAfilia.setBounds(338, 98, 111, 22);
			contentPanel.add(cboAfilia);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(75, 65, 86, 20);
			contentPanel.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			txtNom = new JTextField();
			txtNom.setColumns(10);
			txtNom.setBounds(75, 97, 86, 20);
			contentPanel.add(txtNom);
		}
		{
			txtSueldo = new JTextField();
			txtSueldo.setColumns(10);
			txtSueldo.setBounds(75, 132, 86, 20);
			contentPanel.add(txtSueldo);
		}
		{
			txtHE = new JTextField();
			txtHE.setColumns(10);
			txtHE.setBounds(363, 132, 86, 20);
			contentPanel.add(txtHE);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(134, 182, 315, 148);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnPorcesar = new JButton("PROCESAR");
			btnPorcesar.addActionListener(this);
			btnPorcesar.setBounds(10, 184, 89, 23);
			contentPanel.add(btnPorcesar);
		}
		{
			btnLimpiar = new JButton("LIMPIAR");
			btnLimpiar.addActionListener(this);
			btnLimpiar.setBounds(10, 228, 89, 23);
			contentPanel.add(btnLimpiar);
		}
		{
			btnSalir = new JButton("SALIR");
			btnSalir.addActionListener(this);
			btnSalir.setBounds(10, 294, 89, 23);
			contentPanel.add(btnSalir);
		}
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
			
				
		}
		});
		btnBuscar.setBounds(10, 261, 89, 23);
		contentPanel.add(btnBuscar);
	}		
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnPorcesar) {
			do_btnPorcesar_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
	}
	
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
		
		
	}
	
	protected void do_btnPorcesar_actionPerformed(ActionEvent e) {
		
		String cod=txtCod.getText();
		String nom=txtNom.getText();
		String cargo= cboCargo.getSelectedItem().toString();	
		double sueldo= Double.parseDouble(txtSueldo.getText());
		int afilia= cboAfilia.getSelectedIndex();
		int HorasExtra = Integer.parseInt(txtHE.getText());
		
		Empleados E1 = new Empleados(cod, nom, cargo, sueldo, HorasExtra, afilia);
		Listado(E1);		
	}	
	void Imprimir(String s)
	{
		txtS.append(s+"\n");
	}
	void Listado(Empleados e)
	{
		Imprimir("EL codigo es:  " + e.getCod());
		Imprimir("El nombre es:  " + e.getNom());
		Imprimir("El cargo es:  " + e.getCargo());
		Imprimir("El sueldo bruto es:  " + e.SueldoBruto());
		Imprimir("El sueldo neto es:  " + e.SueldoNeto());
		Imprimir("Horas Extra trabajadas:  " + e.getHorasextras());	
	}
	
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
		dispose(); 
	}
}
