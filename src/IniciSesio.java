
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

/**
 * Interfaz que gestiona el Inici de sesió.
 * 
 * @author David Reinón
 * @author Alejandro Tos
 */
public class IniciSesio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNom;
	private JButton btnIniciSessi;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public IniciSesio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(117, 11, 251, 221);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblIniciSessio = new JLabel("Inici de sessió");
		lblIniciSessio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIniciSessio.setBounds(78, 24, 101, 14);
		panel.add(lblIniciSessio);

		JLabel lblNom = new JLabel("Nom:");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNom.setBounds(10, 70, 46, 14);
		panel.add(lblNom);

		JLabel lblContrasenya = new JLabel("Contrsenya:");
		lblContrasenya.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasenya.setBounds(10, 119, 93, 14);
		panel.add(lblContrasenya);

		textFieldNom = new JTextField();
		textFieldNom.setBounds(66, 69, 175, 20);
		panel.add(textFieldNom);
		textFieldNom.setColumns(10);

		btnIniciSessi = new JButton("Inici Sessió");
		btnIniciSessi.setBackground(Color.WHITE);
		btnIniciSessi.setBounds(78, 179, 101, 23);
		panel.add(btnIniciSessi);

		passwordField = new JPasswordField();
		passwordField.setBounds(111, 118, 130, 20);
		panel.add(passwordField);

		setVisible(true);
	}

	/**
	 * Vacia la informció que puga haber en els elements de la interfaz.
	 */
	public void vaciarCamps() {
		textFieldNom.setText("");
		passwordField.setText(new String(new char[0]));
	}

	public JButton getIniciSessi() {
		return btnIniciSessi;
	}

	public JTextField getNom() {
		return textFieldNom;
	}

	public JPasswordField getContrasenya() {
		return passwordField;
	}
}