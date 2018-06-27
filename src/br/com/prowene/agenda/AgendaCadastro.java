package br.com.prowene.agenda;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class AgendaCadastro extends JFrame {
	public String nome;
	public int registro;

	Object agenda;

	private static final long serialVersionUID = 5125222173888099536L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfBairro;
	private JTextField tfCidade;
	@SuppressWarnings("rawtypes")
	private JComboBox cbEstados;
	private JFormattedTextField ftfCep;
	private JFormattedTextField ftfFone1;
	private JFormattedTextField ftfFone2;
	private JFormattedTextField ftfFone3;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {

		try {
			AgendaCadastro frame = new AgendaCadastro();
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AgendaCadastro() {
		setType(Type.UTILITY);
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);		
		setAlwaysOnTop(true);

		setTitle("Cadastro de Contato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				AgendaPrincipal.class
						.getResource("/br/com/prowene/icon/report_edit.png")));
		setBounds(100, 100, 532, 330);
		setLocationRelativeTo(this);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(null, "",
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_1.setBounds(10, 11, 497, 232);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					// Label -----------------------------------
					JLabel lblNewLabel = new JLabel("Nome :");
					lblNewLabel.setBounds(26, 22, 46, 14);
					panel_1.add(lblNewLabel);

					JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o :");
					lblNewLabel_1.setBounds(26, 53, 71, 14);
					panel_1.add(lblNewLabel_1);

					JLabel lblNewLabel_2 = new JLabel("Bairro :");
					lblNewLabel_2.setBounds(26, 84, 46, 14);
					panel_1.add(lblNewLabel_2);

					JLabel lblNewLabel_3 = new JLabel("Cidade :");
					lblNewLabel_3.setBounds(26, 115, 46, 14);
					panel_1.add(lblNewLabel_3);

					JLabel lblNewLabel_4 = new JLabel("Estado :");
					lblNewLabel_4.setBounds(350, 115, 46, 14);
					panel_1.add(lblNewLabel_4);

					JLabel lblNewLabel_5 = new JLabel("Cep :");
					lblNewLabel_5.setBounds(26, 146, 46, 14);
					panel_1.add(lblNewLabel_5);

					JLabel lblNewLabel_6 = new JLabel("Fone 1 :");
					lblNewLabel_6.setBounds(268, 146, 46, 14);
					panel_1.add(lblNewLabel_6);

					JLabel lblFone = new JLabel("Fone 2 :");
					lblFone.setBounds(26, 177, 46, 14);
					panel_1.add(lblFone);

					JLabel lblFone_1 = new JLabel("Fone 3 :");
					lblFone_1.setBounds(268, 177, 46, 14);
					panel_1.add(lblFone_1);
					// -------------------------------------------------

					tfNome = new JTextField();
					tfNome.setBounds(90, 19, 362, 20);
					panel_1.add(tfNome);
					tfNome.setColumns(10);

					tfEndereco = new JTextField();
					tfEndereco.setBounds(90, 50, 362, 20);
					panel_1.add(tfEndereco);
					tfEndereco.setColumns(10);

					tfBairro = new JTextField();
					tfBairro.setBounds(90, 81, 362, 20);
					panel_1.add(tfBairro);
					tfBairro.setColumns(10);

					tfCidade = new JTextField();
					tfCidade.setBounds(90, 112, 241, 20);
					panel_1.add(tfCidade);
					tfCidade.setColumns(30);
				}

				// Combo estados -----------------------
				cbEstados = new JComboBox();
				cbEstados
						.setModel(new DefaultComboBoxModel(new String[] { "AC",
								"AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO",
								"MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE",
								"PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP",
								"SE", "TO" }));
				cbEstados.setBounds(394, 112, 58, 20);
				panel_1.add(cbEstados);

				// Cep --------------------------------
				ftfCep = new JFormattedTextField();
				ftfCep.setBounds(90, 143, 168, 20);
				panel_1.add(ftfCep);
				ftfCep.setColumns(9);
				try {
					ftfCep.setFormatterFactory(new DefaultFormatterFactory(
							new MaskFormatter("#####-###")));
				} catch (java.text.ParseException ex) {
					ex.printStackTrace();
				}

				// fone 1------------------------------------------------------
				ftfFone1 = new JFormattedTextField();
				ftfFone1.setBounds(325, 143, 127, 20);
				panel_1.add(ftfFone1);
				ftfFone1.setColumns(15);
				try {
					ftfFone1.setFormatterFactory(new DefaultFormatterFactory(
							new MaskFormatter("(##) #####-####")));
				} catch (ParseException ex) {
					ex.printStackTrace();
				}

				// ------------------------------------------------------

				ftfFone2 = new JFormattedTextField();
				ftfFone2.setBounds(90, 174, 155, 20);
				panel_1.add(ftfFone2);
				ftfFone2.setColumns(15);
				try {
					ftfFone2.setFormatterFactory(new DefaultFormatterFactory(
							new MaskFormatter("(##) #####-####")));
				} catch (ParseException ex) {
					ex.printStackTrace();
				}

				// ------------------------------------------------------

				ftfFone3 = new JFormattedTextField();
				ftfFone3.setBounds(324, 174, 127, 20);
				panel_1.add(ftfFone3);
				ftfFone3.setColumns(15);
				try {
					ftfFone3.setFormatterFactory(new DefaultFormatterFactory(
							new MaskFormatter("(##) #####-####")));
				} catch (ParseException ex) {
					ex.printStackTrace();
				}

				// ------------------------------------------------------
			}

			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						aoClicarOk();
					}
				});

				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);

				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancelar");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
	
	
	
	private void aoClicarOk() {
		int resp = JOptionPane.showConfirmDialog(rootPane,
				"Deseja Realmente Incluir o Registro", "Alteração",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (resp == 0) {
			try {
				AgendaDAO con = new AgendaDAO();
				AgendaBeans agenda1 = new AgendaBeans();		
				agenda1.setNome(tfNome.getText());
				agenda1.setEndereco(tfEndereco.getText());
				agenda1.setBairro(tfBairro.getText());
				agenda1.setCidade(tfCidade.getText());
				agenda1.setEstado(cbEstados.getSelectedItem().toString());
				agenda1.setCep(ftfCep.getText());
				agenda1.setTelefone(ftfFone1.getText());
				agenda1.setTelefone2(ftfFone2.getText());
				agenda1.setTelefone3(ftfFone3.getText());
				con.salvar(agenda1);
				JOptionPane.showMessageDialog(rootPane,
						"Registro cadastrado com sucesso!");
				AgendaPrincipal.getWindows();
				AgendaPrincipal.preencherTabela();
				dispose();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(rootPane,
						"Ocorreu um erro na Inclusão! " + e);
				dispose();
			}
		}
	}
}
