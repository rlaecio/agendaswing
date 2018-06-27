package br.com.prowene.agenda;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class AgendaSobre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaSobre frame = new AgendaSobre();					
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
	public AgendaSobre() {
		setResizable(false);
		setType(Type.UTILITY);
		setBounds(100, 100, 579, 339);
		
		setLocationRelativeTo(this);
		setUndecorated(true); 
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 560, 306);
		panel.setBorder(UIManager.getBorder("InternalFrame.border"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 549, 307);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(416, 247, 89, 23);
		panel_1.add(btnFechar);
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(AgendaSobre.class.getResource("/br/com/prowene/icon/agenda.png")));    		
		lblNewLabel.setBounds(10, 11, 281, 148);
		panel_1.add(lblNewLabel);
		
		JLabel lblPwnAgendaVerso = new JLabel("PWN Agenda Vers\u00E3o 1.0");
		lblPwnAgendaVerso.setFont(new Font("Calibri", Font.ITALIC, 24));
		lblPwnAgendaVerso.setBounds(301, 48, 247, 38);
		panel_1.add(lblPwnAgendaVerso);
		
		JTextArea txtrDesenvolvido = new JTextArea();
		txtrDesenvolvido.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrDesenvolvido.setEnabled(false);
		txtrDesenvolvido.setEditable(false);
		txtrDesenvolvido.setText("Desenvolvido sob a encomenda do Grupo Lolata.\r\n\r\nCopyrigth \u00A9 2013.\r\nTodos os direitos reservados.\r\n\r\nProwene Solu\u00E7\u00F5es em Tec. da Informa\u00E7\u00E3o");
		txtrDesenvolvido.setBounds(22, 185, 505, 111);
		panel_1.add(txtrDesenvolvido);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
