package br.com.prowene.agenda;

import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgendaConsultar extends JFrame {
	Object agenda;
	String agendaNome, nome;

	private static final long serialVersionUID = 1L;
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
	private JTextField tfNomeBusca;
	private DefaultTableModel modelo;
	private JTable tabelaGeral;
	private JScrollPane scrollPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaConsultar frame = new AgendaConsultar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AgendaConsultar() throws Exception {
		setType(Type.UTILITY);
		// setType(Type.UTILITY);
		// setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setAlwaysOnTop(true);
		setTitle("Pesquisa em Lista Geral ");
		setBounds(100, 100, 1000, 531);
		setLocationRelativeTo(this);
		getContentPane().setLayout(
				new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 967, 471);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 11, 509, 449);
		panel_1.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		tabelaGeral = new JTable();
		tabelaGeral.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					agendaNome = (tabelaGeral.getModel().getValueAt(
							tabelaGeral.getSelectedRow(), 0).toString());
					povoaFormulario();
				}
			}
		});

		tabelaGeral.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Telefone", "Telefone2", "Telefone3" }) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		modelo = (DefaultTableModel) tabelaGeral.getModel();
		modelo.setNumRows(0);
		AgendaDAO dao = new AgendaDAO();
		ArrayList<AgendaBeans> listar = dao.todosAgenda();
		for (AgendaBeans agenda : listar) {
			modelo.addRow(new Object[] { agenda.getNome(),
					agenda.getTelefone(), agenda.getTelefone2(),
					agenda.getTelefone3() });
		}
		scrollPane.setViewportView(tabelaGeral);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_3.setBounds(527, 11, 430, 60);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		tfNomeBusca = new JTextField();
		tfNomeBusca.setBounds(10, 13, 367, 28);
		panel_3.add(tfNomeBusca);
		tfNomeBusca.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aoCLicarConsultar();
			}
		});
		btnNewButton.setIcon(new ImageIcon(AgendaConsultar.class
				.getResource("/br/com/prowene/icon/Find.gif")));
		btnNewButton.setBounds(378, 11, 37, 33);
		panel_3.add(btnNewButton);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_4.setBounds(527, 82, 430, 324);
		panel_1.add(panel_4);

		JLabel label = new JLabel("Nome :");
		label.setBounds(26, 29, 46, 14);
		panel_4.add(label);

		JLabel label_1 = new JLabel("Endere\u00E7o :");
		label_1.setBounds(26, 75, 71, 14);
		panel_4.add(label_1);

		JLabel label_2 = new JLabel("Bairro :");
		label_2.setBounds(26, 121, 46, 14);
		panel_4.add(label_2);

		JLabel label_3 = new JLabel("Cidade :");
		label_3.setBounds(26, 167, 46, 14);
		panel_4.add(label_3);

		JLabel label_4 = new JLabel("Estado :");
		label_4.setBounds(309, 166, 46, 14);
		panel_4.add(label_4);

		JLabel label_5 = new JLabel("Cep :");
		label_5.setBounds(26, 213, 46, 14);
		panel_4.add(label_5);

		JLabel label_6 = new JLabel("Fone 1 :");
		label_6.setBounds(244, 213, 46, 14);
		panel_4.add(label_6);

		JLabel label_7 = new JLabel("Fone 2 :");
		label_7.setBounds(26, 259, 46, 14);
		panel_4.add(label_7);

		JLabel label_8 = new JLabel("Fone 3 :");
		label_8.setBounds(244, 259, 46, 14);
		panel_4.add(label_8);

		tfNome = new JTextField();
		tfNome.setEditable(false);
		tfNome.setColumns(10);
		tfNome.setBounds(90, 26, 321, 20);
		panel_4.add(tfNome);

		tfEndereco = new JTextField();
		tfEndereco.setEditable(false);
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(90, 72, 321, 20);
		panel_4.add(tfEndereco);

		tfBairro = new JTextField();
		tfBairro.setEditable(false);
		tfBairro.setColumns(10);
		tfBairro.setBounds(90, 118, 321, 20);
		panel_4.add(tfBairro);

		tfCidade = new JTextField();
		tfCidade.setEditable(false);
		tfCidade.setColumns(30);
		tfCidade.setBounds(90, 164, 215, 20);
		panel_4.add(tfCidade);

		cbEstados = new JComboBox();
		cbEstados.setModel(new DefaultComboBoxModel(new String[] { "AC", "AL",
				"AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
				"MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO",
				"RR", "SC", "SP", "SE", "TO" }));
		cbEstados.setBounds(353, 163, 58, 20);
		panel_4.add(cbEstados);

		ftfCep = new JFormattedTextField();
		ftfCep.setEditable(false);
		ftfCep.setColumns(9);
		ftfCep.setBounds(90, 210, 125, 20);
		panel_4.add(ftfCep);

		ftfFone1 = new JFormattedTextField();
		ftfFone1.setEditable(false);
		ftfFone1.setColumns(15);
		ftfFone1.setBounds(301, 210, 108, 20);
		panel_4.add(ftfFone1);

		ftfFone2 = new JFormattedTextField();
		ftfFone2.setEditable(false);
		ftfFone2.setColumns(15);
		ftfFone2.setBounds(90, 256, 124, 20);
		panel_4.add(ftfFone2);

		ftfFone3 = new JFormattedTextField();
		ftfFone3.setEditable(false);
		ftfFone3.setColumns(15);
		ftfFone3.setBounds(300, 256, 109, 20);
		panel_4.add(ftfFone3);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_5.setBounds(527, 417, 429, 43);
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnFechar.setBounds(299, 11, 89, 23);
		panel_5.add(btnFechar);

	}

	protected void aoCLicarConsultar() {
		nome = tfNomeBusca.getText();
		if (!(nome == null || nome.equals(""))) {							
			try {
				modelo = (DefaultTableModel) tabelaGeral.getModel();
				modelo.setNumRows(0);
				AgendaDAO dao = new AgendaDAO();
				ArrayList<AgendaBeans> listar = dao.filtraAgenda2(nome);
				for (AgendaBeans agenda : listar) {
					modelo.addRow(new Object[] { agenda.getNome(),
							agenda.getTelefone(), agenda.getTelefone2(),
							agenda.getTelefone3() });
				}
			} catch (Exception e) {
			}
			scrollPane.setViewportView(tabelaGeral);		
		}
	}



	protected void povoaFormulario() {
		try {
			AgendaDAO dao = new AgendaDAO();
			AgendaBeans agenda = dao.procurarAgenda(agendaNome);
			tfNome.setText(String.valueOf(agenda.getNome()));
			tfEndereco.setText(String.valueOf(agenda.getEndereco()));
			tfBairro.setText(String.valueOf(agenda.getBairro()));
			tfCidade.setText(String.valueOf(agenda.getCidade()));
			cbEstados.setSelectedItem(String.valueOf(agenda.getEstado()));
			ftfCep.setText(String.valueOf(agenda.getCep()));
			ftfFone1.setText(String.valueOf(agenda.getTelefone()));
			ftfFone3.setText(String.valueOf(agenda.getTelefone3()));
			ftfFone2.setText(String.valueOf(agenda.getTelefone2()));
		} catch (Exception e) {
		}
	}
}
