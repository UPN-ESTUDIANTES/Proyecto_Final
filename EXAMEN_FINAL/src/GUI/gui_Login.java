package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui_Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnIngresarLogin;
	private JTextField txtContraseña;
	private JButton btnCerrarSesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_Login frame = new gui_Login();
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
	public gui_Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(gui_Login.class.getResource("/IMAGENES/Paisaje_Login.jpg")));
		lblNewLabel.setBounds(324, 0, 312, 395);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 324, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(30, 23, 239, 346);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(gui_Login.class.getResource("/imagenes/icono_login.png")));
		lblNewLabel_1.setBounds(68, 11, 82, 73);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 87, 86, 23);
		panel_1.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 121, 140, 20);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CONTRASEÑA :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 161, 119, 23);
		panel_1.add(lblNewLabel_3);
		
		btnIngresarLogin = new JButton("INGRESAR");
		btnIngresarLogin.addActionListener(this);
		btnIngresarLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIngresarLogin.setBounds(37, 247, 150, 33);
		panel_1.add(btnIngresarLogin);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(10, 195, 140, 20);
		panel_1.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		btnCerrarSesion = new JButton("CERRAR SESIÓN");
		btnCerrarSesion.addActionListener(this);
		btnCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCerrarSesion.setBounds(37, 302, 150, 33);
		panel_1.add(btnCerrarSesion);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrarSesion) {
			do_btnCerrarSesion_actionPerformed(e);
		}
		if (e.getSource() == btnIngresarLogin) {
			do_btnIngresarLogin_actionPerformed(e);
		}
	}
	protected void do_btnIngresarLogin_actionPerformed(ActionEvent e) {
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
    	
        if (usuario.equals("admin") && contraseña.equals("1234")) 
        {
        	gui_sistema v2= new gui_sistema() ;
        	v2.setVisible(true);
        	this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Acceso concedido. Bienvenido " + usuario);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
	}
	protected void do_btnCerrarSesion_actionPerformed(ActionEvent e) {
		dispose();
	}
}
