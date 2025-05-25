package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Trabajadores.Empleados;
import Trabajadores.ControladorE;

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
import java.util.AbstractList;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class EmpleadoV extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox cboCargo;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JComboBox cboAfilia;
	private JTextField txtIDEMPLEADO;
	private JTextField txtNomE;
	private JTextField txtHE;
	private JScrollPane scrollPane;
	private JTextArea txtSE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EmpleadoV dialog = new EmpleadoV();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EmpleadoV() {
		setTitle("EMPLEADO");
		setBounds(100, 100, 526, 396);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("PAGO DE EMPLEADOS ");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel.setBounds(179, 11, 180, 31);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_3 = new JLabel("ID EMPLEADO:");
			lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(10, 64, 89, 22);
			contentPanel.add(lblNewLabel_3);
		}
		{
			lblNewLabel_1 = new JLabel("NOMBRE :");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(10, 98, 66, 22);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("HORAS EXTRA :");
			lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(257, 131, 102, 22);
			contentPanel.add(lblNewLabel_2);
		}
		{
			cboCargo = new JComboBox();
			cboCargo.setModel(new DefaultComboBoxModel(new String[] {"GERENTE", "SUPERVISOR", "PANADERO", "ATENCIÓN AL CLIENTE", "CAJERO"}));
			cboCargo.setEditable(true);
			cboCargo.setToolTipText("");
			cboCargo.setBounds(320, 68, 162, 22);
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
			cboAfilia.setModel(new DefaultComboBoxModel(new String[] {"AFP", "ONP"}));
			cboAfilia.setToolTipText("");
			cboAfilia.setEditable(true);
			cboAfilia.setBounds(338, 98, 111, 22);
			contentPanel.add(cboAfilia);
		}
		{
			txtIDEMPLEADO = new JTextField();
			txtIDEMPLEADO.setBounds(109, 65, 86, 20);
			contentPanel.add(txtIDEMPLEADO);
			txtIDEMPLEADO.setColumns(10);
		}
		{
			txtNomE = new JTextField();
			txtNomE.setColumns(10);
			txtNomE.setBounds(109, 99, 86, 20);
			contentPanel.add(txtNomE);
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
				txtSE = new JTextArea();
				scrollPane.setViewportView(txtSE);
			}
		}
		ControladorE ctl = new ControladorE();
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int IDEMPLEADO = LeerIDEMPLEADO();
					String NomE = LeerNomE();
					int Cargo = CBOcargo();
					int Afilia = CBOafilia();
					int HorasE = HorasE();
					double Sueldo = Sueldo();
					
					Empleados emp = new Trabajadores.Empleados(NomE, Cargo, Sueldo, HorasE, Afilia, IDEMPLEADO);
					ctl.AgregarPagoEmpleados(emp);
					Listado(ctl);
				}catch (Exception ex) {
					
				}
			}
		});
		btnNewButton.setBounds(10, 184, 89, 23);
		contentPanel.add(btnNewButton);
	}		

	public void actionPerformed(ActionEvent e) {
	}
	
	private double ObtenerSueldoPorCargo(int index) {
	    if (index == 0) return 2500;
	    else if (index == 1) return 1800;
	    else if (index == 2) return 1500;
	    else if (index == 3) return 1200;
	    else if (index == 4) return 1350;
	    else return ObtenerSueldoPorCargo(index-1);
	}
	private int LeerIDEMPLEADO() {
		return Integer.parseInt(txtIDEMPLEADO.getText());
	}
	private String LeerNomE() {
		return txtNomE.getText();
	}
	private int CBOcargo() {
		return cboCargo.getSelectedIndex();
	}
	private double Sueldo() {
		return ObtenerSueldoPorCargo(CBOcargo());
	}
	private int CBOafilia() {
		return cboAfilia.getSelectedIndex();
	}
	private int HorasE() {
		return Integer.parseInt(txtHE.getText());
	}
	private void Imprimir(String s)
	{
		txtSE.append(s+"\n");
	}
	private void Listado(ControladorE ctl) {
		txtSE.setText("");
		if(CBOafilia()==0) {
			Imprimir("ID EMPLEADO\tNOMBRE\tCARGO\tSUELDO BASE\tSUELDO BRUTO\tDSCTO APF\tDSCTO ESSALUD\tSUELDO NETO");
			ListadoRecursivo(ctl, 0);
		}
		else {
			Imprimir("ID EMPLEADO\tNOMBRE\tCARGO\tSUELDO BASE\tSUELDO BRUTO\tDSCTO ONP\tDSCTO ESSALUD\tSUELDO NETO");
			ListadoRecursivo(ctl, 0);
		}
	}
	private void ListadoRecursivo(ControladorE ctl,int i) {
		if(i < ctl.TamañoPago()) {
			Trabajadores.Empleados emp = ctl.ObtenerPago(i);
			if(CBOafilia()==0) {
				Imprimir(emp.getIDEMPLEADO()+"\t"+emp.getNomE()+"\t"+emp.getCargo()+"\t"+emp.getSueldo()+"\t"+emp.SueldoBruto()+"\t"+emp.DsctoAFP()+"\t"+emp.SueldoNeto());
				ListadoRecursivo(ctl, i + 1);
			}
			else {
				Imprimir(emp.getIDEMPLEADO()+"\t"+emp.getNomE()+"\t"+emp.getCargo()+"\t"+emp.getSueldo()+"\t"+emp.SueldoBruto()+"\t"+emp.DsctoONP()+"\t"+emp.SueldoNeto());
				ListadoRecursivo(ctl, i + 1);
			}
		}
	}


}
