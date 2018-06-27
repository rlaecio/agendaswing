package br.com.prowene.agenda;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AgendaPrincipal extends JFrame {
	int agendaCodigo;
	Object agendaNome;
	static JTable tabela;

	private static final long serialVersionUID = -2649461647595864518L;

	private JPanel contentPane;
	private static JTable tblA;
	private static JTable tblB;
	private static JTable tblC;
	private static JTable tblD;
	private static JTable tblE;
	private static JTable tblF;
	private static JTable tblG;
	private static JTable tblH;
	private static JTable tblI;
	private static JTable tblJ;
	private static JTable tblK;
	private static JTable tblL;
	private static JTable tblM;
	private static JTable tblN;
	private static JTable tblO;
	private static JTable tblP;
	private static JTable tblQ;
	private static JTable tblR;
	private static JTable tblS;
	private static JTable tblT;
	private static JTable tblU;
	private static JTable tblV;
	private static JTable tblW;
	private static JTable tblX;
	private static JTable tblY;
	private static JTable tblZ;
	private static JTabbedPane tabbedPane;

	private static DefaultTableModel modelo;
	private static DefaultTableModel modeloB;
	private static DefaultTableModel modeloC;
	private static DefaultTableModel modeloD;
	private static DefaultTableModel modeloE;
	private static DefaultTableModel modeloF;
	private static DefaultTableModel modeloG;
	private static DefaultTableModel modeloH;
	private static DefaultTableModel modeloI;
	private static DefaultTableModel modeloJ;
	private static DefaultTableModel modeloK;
	private static DefaultTableModel modeloL;
	private static DefaultTableModel modeloM;
	private static DefaultTableModel modeloN;
	private static DefaultTableModel modeloO;
	private static DefaultTableModel modeloP;
	private static DefaultTableModel modeloQ;
	private static DefaultTableModel modeloR;
	private static DefaultTableModel modeloS;
	private static DefaultTableModel modeloT;
	private static DefaultTableModel modeloU;
	private static DefaultTableModel modeloV;
	private static DefaultTableModel modeloW;
	private static DefaultTableModel modeloX;
	private static DefaultTableModel modeloY;
	private static DefaultTableModel modeloZ;

	public static void main(String[] args) {	
		 TelaSplash splash = new TelaSplash(2000);
	     splash.showSplashAndExit();        
		
	     // Bloco LookAndFeel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,	"Não foi possivel alterar a L&F");
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaPrincipal frame = new AgendaPrincipal();
					frame.setVisible(true);
					preencherTabela();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void tabelaExata() {
		int p = tabbedPane.getSelectedIndex();
		if (p == 0) {
			tabela = tblA;
		} else if (p == 1) {
			tabela = tblB;
		} else if (p == 2) {
			tabela = tblC;
		} else if (p == 3) {
			tabela = tblD;
		} else if (p == 4) {
			tabela = tblE;
		} else if (p == 5) {
			tabela = tblF;
		} else if (p == 6) {
			tabela = tblG;
		} else if (p == 7) {
			tabela = tblH;
		} else if (p == 8) {
			tabela = tblI;
		} else if (p == 9) {
			tabela = tblJ;
		} else if (p == 10) {
			tabela = tblK;
		} else if (p == 11) {
			tabela = tblL;
		} else if (p == 12) {
			tabela = tblM;
		} else if (p == 13) {
			tabela = tblN;
		} else if (p == 14) {
			tabela = tblO;
		} else if (p == 15) {
			tabela = tblP;
		} else if (p == 16) {
			tabela = tblQ;
		} else if (p == 17) {
			tabela = tblR;
		} else if (p == 18) {
			tabela = tblS;
		} else if (p == 19) {
			tabela = tblT;
		} else if (p == 20) {
			tabela = tblU;
		} else if (p == 21) {
			tabela = tblV;
		} else if (p == 22) {
			tabela = tblW;
		} else if (p == 23) {
			tabela = tblX;
		} else if (p == 24) {
			tabela = tblY;
		} else if (p == 25) {
			tabela = tblZ;
		}
	}

	@SuppressWarnings("serial")
	public AgendaPrincipal() throws Exception {
		setAutoRequestFocus(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pwn Agenda V 0.1");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				AgendaPrincipal.class
						.getResource("/br/com/prowene/icon/report_edit.png")));
		setBounds(100, 100, 900, 738);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnMenuPrincipal = new JMenu("Arquivo");
		menuBar.add(mnMenuPrincipal);
		JMenuItem mntNovo = new JMenuItem("Novo");
		mntNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AgendaCadastro().setVisible(true);
			}
		});
		mntNovo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
				InputEvent.CTRL_MASK));
		mnMenuPrincipal.add(mntNovo);
		JMenuItem mntConsultar = new JMenuItem("Consultar");
		mntConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new AgendaConsultar().setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		mntConsultar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,
				InputEvent.CTRL_MASK));
		mnMenuPrincipal.add(mntConsultar);
		JMenuItem mntExcluir = new JMenuItem("Excluir");
		mntExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aoClicarExcluir();
			}
		});
		mnMenuPrincipal.add(mntExcluir);
		JMenuItem mntAlterar = new JMenuItem("Alterar");
		mntAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabelaExata();
				agendaNome = (tabela.getModel().getValueAt(
						tabela.getSelectedRow(), 0).toString());
				new AgendaEditar(agendaNome)
						.setVisible(rootPaneCheckingEnabled);
			}
		});
		mntAlterar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				InputEvent.CTRL_MASK));
		mnMenuPrincipal.add(mntAlterar);
		mntExcluir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
				InputEvent.CTRL_MASK));

		JSeparator separator = new JSeparator();
		mnMenuPrincipal.add(separator);

		JMenuItem mntSair = new JMenuItem("Sair");
		mntSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,
				InputEvent.CTRL_MASK));
		mnMenuPrincipal.add(mntSair);

		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		JMenuItem mntSobre = new JMenuItem("Sobre");
		mntSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AgendaSobre().setVisible(rootPaneCheckingEnabled);
			}
		});
		mntSobre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
				InputEvent.CTRL_MASK));
		mnAjuda.add(mntSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JToolBar toolBar = new JToolBar();
		toolBar.setRollover(true);
		toolBar.setFloatable(false);
		toolBar.setBackground(Color.WHITE);
		contentPane.add(toolBar, BorderLayout.NORTH);
		JButton btnNovo = new JButton("");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AgendaCadastro().setVisible(true);
			}
		});
		btnNovo.setBackground(Color.WHITE);
		btnNovo.setToolTipText("Novo Registro");
		btnNovo.setIcon(new ImageIcon(AgendaPrincipal.class
				.getResource("/br/com/prowene/icon/Create.gif")));
		toolBar.add(btnNovo);

		JButton btnExcluir = new JButton("");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aoClicarExcluir();
			}
		});
		btnExcluir.setBackground(Color.WHITE);
		btnExcluir.setToolTipText("Excluir Registro");
		btnExcluir.setIcon(new ImageIcon(AgendaPrincipal.class
				.getResource("/br/com/prowene/icon/No-entry.gif")));
		toolBar.add(btnExcluir);

		JButton btnPesquizar = new JButton("");
		btnPesquizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new AgendaConsultar().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		JButton btnAlterar = new JButton("");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabelaExata();
				agendaNome = (tabela.getModel().getValueAt(
						tabela.getSelectedRow(), 0).toString());
				new AgendaEditar(agendaNome)
						.setVisible(rootPaneCheckingEnabled);
			}
		});
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setIcon(new ImageIcon(AgendaPrincipal.class
				.getResource("/br/com/prowene/icon/Modify.gif")));
		btnAlterar.setToolTipText("Alterar Registros");
		toolBar.add(btnAlterar);

		btnPesquizar.setBackground(Color.WHITE);
		btnPesquizar.setIcon(new ImageIcon(AgendaPrincipal.class
				.getResource("/br/com/prowene/icon/Find.gif")));
		btnPesquizar.setToolTipText("Consultar Registros");
		toolBar.add(btnPesquizar);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		panel.add(tabbedPane);

		// Aba painel letra a
		JPanel pnlA = new JPanel();
		tabbedPane.addTab("A", null, pnlA, null);
		pnlA.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPane = new JScrollPane();
		pnlA.add(scrollPane);
		tblA = new JTable();
		tblA.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblA.getModel().getValueAt(
							tblA.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome).setVisible(true);
				}
			}
		});
		tblA.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblA);

		// Aba Painel Letra B
		JPanel pnlB = new JPanel();
		tabbedPane.addTab("B", null, pnlB, null);
		pnlB.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneB = new JScrollPane();
		pnlB.add(scrollPaneB);
		tblB = new JTable();
		tblB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblB.getModel().getValueAt(
							tblB.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblB.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneB.setViewportView(tblB);

		// Aba Painel Letra C
		JPanel pnlC = new JPanel();
		tabbedPane.addTab("C", null, pnlC, null);
		pnlC.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneC = new JScrollPane();
		pnlC.add(scrollPaneC);
		tblC = new JTable();
		tblC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblC.getModel().getValueAt(
							tblC.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);

				}
			}
		});
		tblC.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		scrollPaneC.setViewportView(tblC);

		// Aba Painel Letra D
		JPanel pnlD = new JPanel();
		tabbedPane.addTab("D", null, pnlD, null);
		pnlD.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneD = new JScrollPane();
		pnlD.add(scrollPaneD);
		tblD = new JTable();
		tblD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblD.getModel().getValueAt(
							tblD.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);

				}
			}
		});
		tblD.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		scrollPaneD.setViewportView(tblD);

		// Aba Painel Letra E
		JPanel pnlE = new JPanel();
		tabbedPane.addTab("E", null, pnlE, null);
		pnlE.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneE = new JScrollPane();
		pnlE.add(scrollPaneE);
		tblE = new JTable();
		tblE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblE.getModel().getValueAt(
							tblE.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblE.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneE.setViewportView(tblE);

		// Aba Painel Letra F
		JPanel pnlF = new JPanel();
		tabbedPane.addTab("F", null, pnlF, null);
		pnlF.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneF = new JScrollPane();
		pnlF.add(scrollPaneF);
		tblF = new JTable();
		tblF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblF.getModel().getValueAt(
							tblF.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblF.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneF.setViewportView(tblF);

		// Aba Painel Letra G //
		JPanel pnlG = new JPanel();
		tabbedPane.addTab("G", null, pnlG, null);
		pnlG.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneG = new JScrollPane();
		pnlG.add(scrollPaneG);
		tblG = new JTable();
		tblG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblG.getModel().getValueAt(
							tblG.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblG.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneG.setViewportView(tblG);

		// Aba Painel Letra H
		JPanel pnlH = new JPanel();
		tabbedPane.addTab("H", null, pnlH, null);
		pnlH.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneH = new JScrollPane();
		pnlH.add(scrollPaneH);
		tblH = new JTable();
		tblH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblH.getModel().getValueAt(
							tblH.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblH.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneH.setViewportView(tblH);

		// Aba Painel Letra I
		JPanel pnlI = new JPanel();
		tabbedPane.addTab("I", null, pnlI, null);
		pnlI.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneI = new JScrollPane();
		pnlI.add(scrollPaneI);
		tblI = new JTable();
		tblI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblI.getModel().getValueAt(
							tblI.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblI.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneI.setViewportView(tblI);

		// Aba Painel Letra J
		JPanel pnlJ = new JPanel();
		tabbedPane.addTab("J", null, pnlJ, null);
		pnlJ.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneJ = new JScrollPane();
		pnlJ.add(scrollPaneJ);
		tblJ = new JTable();
		tblJ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblJ.getModel().getValueAt(
							tblJ.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblJ.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneJ.setViewportView(tblJ);

		// Aba Painel Letra K
		JPanel pnlK = new JPanel();
		tabbedPane.addTab("K", null, pnlK, null);
		pnlK.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneK = new JScrollPane();
		pnlK.add(scrollPaneK);
		tblK = new JTable();
		tblK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblK.getModel().getValueAt(
							tblK.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblK.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneK.setViewportView(tblK);

		// Aba Painel Letra L
		JPanel pnlL = new JPanel();
		tabbedPane.addTab("L", null, pnlL, null);
		pnlL.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneL = new JScrollPane();
		pnlL.add(scrollPaneL);
		tblL = new JTable();
		tblL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblL.getModel().getValueAt(
							tblL.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblL.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneL.setViewportView(tblL);

		// Aba Painel Letra M
		JPanel pnlM = new JPanel();
		tabbedPane.addTab("M", null, pnlM, null);
		pnlM.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneM = new JScrollPane();
		pnlM.add(scrollPaneM);
		tblM = new JTable();
		tblM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblM.getModel().getValueAt(
							tblM.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblM.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneM.setViewportView(tblM);

		// Aba Painel Letra N
		JPanel pnlN = new JPanel();
		tabbedPane.addTab("N", null, pnlN, null);
		pnlN.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneN = new JScrollPane();
		pnlN.add(scrollPaneN);
		tblN = new JTable();
		tblN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblN.getModel().getValueAt(
							tblN.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblN.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneN.setViewportView(tblN);

		// Aba Painel Letra O
		JPanel pnlO = new JPanel();
		tabbedPane.addTab("O", null, pnlO, null);
		pnlO.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneO = new JScrollPane();
		pnlO.add(scrollPaneO);
		tblO = new JTable();
		tblO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblO.getModel().getValueAt(
							tblO.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblO.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneO.setViewportView(tblO);

		// Aba Painel Letra P
		JPanel pnlP = new JPanel();
		tabbedPane.addTab("P", null, pnlP, null);
		pnlP.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneP = new JScrollPane();
		pnlP.add(scrollPaneP);
		tblP = new JTable();
		tblP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblP.getModel().getValueAt(
							tblP.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblP.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneP.setViewportView(tblP);

		// Aba Painel Letra Q
		JPanel pnlQ = new JPanel();
		tabbedPane.addTab("Q", null, pnlQ, null);
		pnlQ.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneQ = new JScrollPane();
		pnlQ.add(scrollPaneQ);
		tblQ = new JTable();
		tblQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblQ.getModel().getValueAt(
							tblQ.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblQ.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneQ.setViewportView(tblQ);

		// Aba Painel Letra R
		JPanel pnlR = new JPanel();
		tabbedPane.addTab("R", null, pnlR, null);
		pnlR.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneR = new JScrollPane();
		pnlR.add(scrollPaneR);
		tblR = new JTable();
		tblR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblR.getModel().getValueAt(
							tblR.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblR.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneR.setViewportView(tblR);

		// Aba Painel Letra S
		JPanel pnlS = new JPanel();
		tabbedPane.addTab("S", null, pnlS, null);
		pnlS.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneS = new JScrollPane();
		pnlS.add(scrollPaneS);
		tblS = new JTable();
		tblS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblS.getModel().getValueAt(
							tblS.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblS.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneS.setViewportView(tblS);

		// Aba Painel Letra T
		JPanel pnlT = new JPanel();
		tabbedPane.addTab("T", null, pnlT, null);
		pnlT.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneT = new JScrollPane();
		pnlT.add(scrollPaneT);
		tblT = new JTable();
		tblT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblT.getModel().getValueAt(
							tblT.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblT.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneT.setViewportView(tblT);

		// Aba Painel Letra U
		JPanel pnlU = new JPanel();
		tabbedPane.addTab("U", null, pnlU, null);
		pnlU.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneU = new JScrollPane();
		pnlU.add(scrollPaneU);
		tblU = new JTable();
		tblU.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblU.getModel().getValueAt(
							tblU.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblU.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneU.setViewportView(tblU);

		// Aba Painel Letra V
		JPanel pnlV = new JPanel();
		tabbedPane.addTab("V", null, pnlV, null);
		pnlV.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneV = new JScrollPane();
		pnlV.add(scrollPaneV);
		tblV = new JTable();
		tblV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblV.getModel().getValueAt(
							tblV.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblV.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneV.setViewportView(tblV);

		// Aba Painel Letra W
		JPanel pnlW = new JPanel();
		tabbedPane.addTab("W", null, pnlW, null);
		pnlW.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneW = new JScrollPane();
		pnlW.add(scrollPaneW);
		tblW = new JTable();
		tblW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblW.getModel().getValueAt(
							tblW.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblW.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneW.setViewportView(tblW);

		// Aba Painel Letra X
		JPanel pnlX = new JPanel();
		tabbedPane.addTab("X", null, pnlX, null);
		pnlX.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneX = new JScrollPane();
		pnlX.add(scrollPaneX);
		tblX = new JTable();
		tblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblX.getModel().getValueAt(
							tblX.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblX.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneX.setViewportView(tblX);

		// Aba Painel Letra Y
		JPanel pnlY = new JPanel();
		tabbedPane.addTab("Y", null, pnlY, null);
		pnlY.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneY = new JScrollPane();
		pnlY.add(scrollPaneY);
		tblY = new JTable();
		tblY.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblY.getModel().getValueAt(
							tblY.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);
				}
			}
		});
		tblY.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneY.setViewportView(tblY);

		// Aba Painel Letra Z
		JPanel pnlZ = new JPanel();
		tabbedPane.addTab("Z", null, pnlZ, null);
		pnlZ.setLayout(new GridLayout(0, 1, 0, 0));
		JScrollPane scrollPaneZ = new JScrollPane();
		pnlZ.add(scrollPaneZ);
		tblZ = new JTable();
		tblZ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					agendaNome = (tblZ.getModel().getValueAt(
							tblZ.getSelectedRow(), 0).toString());
					new AgendaEditar(agendaNome)
							.setVisible(rootPaneCheckingEnabled);

				}
			}
		});
		tblZ.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome", "Cidade", "Telefone", "Endere\u00E7o" }) {
			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPaneZ.setViewportView(tblZ);
	}

	protected void aoClicarExcluir() {
		tabelaExata();
		agendaNome = (tabela.getModel().getValueAt(tabela.getSelectedRow(), 0)
				.toString());
		int resp = JOptionPane.showConfirmDialog(rootPane,
				"Deseja Realmente Excluir " + agendaNome, "Exclusão",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (resp == 0) {
			try {
				AgendaDAO con = new AgendaDAO();
				AgendaBeans agenda1 = new AgendaBeans();
				agenda1.setNome(agendaNome.toString());
				con.excluir(agenda1);
				JOptionPane.showMessageDialog(rootPane,
						"Operação concluida com sucesso!");
				AgendaPrincipal.getWindows();
				preencherTabela();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro!");
			}
			AgendaPrincipal.getWindows();
		}
	}

	public static void preencherTabela() throws Exception {
		modelo = (DefaultTableModel) tblA.getModel();
		modelo.setNumRows(0);
		AgendaDAO dao = new AgendaDAO();
		ArrayList<AgendaBeans> listar = dao.filtraAgenda("a");
		for (AgendaBeans agenda : listar) {
			modelo.addRow(new Object[] { agenda.getNome(), agenda.getCidade(),
					agenda.getTelefone(), agenda.getEndereco() });
		}

		modeloB = (DefaultTableModel) tblB.getModel();
		modeloB.setNumRows(0);
		AgendaDAO daoB = new AgendaDAO();
		ArrayList<AgendaBeans> listarB = daoB.filtraAgenda("b");
		for (AgendaBeans agendaB : listarB) {
			modeloB.addRow(new Object[] { agendaB.getNome(),
					agendaB.getCidade(), agendaB.getTelefone(),
					agendaB.getEndereco() });
		}

		modeloC = (DefaultTableModel) tblC.getModel();
		modeloC.setNumRows(0);
		AgendaDAO daoC = new AgendaDAO();
		ArrayList<AgendaBeans> listarC = daoC.filtraAgenda("c");
		for (AgendaBeans agendaC : listarC) {
			modeloC.addRow(new Object[] { agendaC.getNome(),
					agendaC.getCidade(), agendaC.getTelefone(),
					agendaC.getEndereco() });
		}

		modeloD = (DefaultTableModel) tblD.getModel();
		modeloD.setNumRows(0);
		AgendaDAO daoD = new AgendaDAO();
		ArrayList<AgendaBeans> listarD = daoD.filtraAgenda("d");
		for (AgendaBeans agendaD : listarD) {
			modeloD.addRow(new Object[] { agendaD.getNome(),
					agendaD.getCidade(), agendaD.getTelefone(),
					agendaD.getEndereco() });
		}

		modeloE = (DefaultTableModel) tblE.getModel();
		modeloE.setNumRows(0);
		AgendaDAO daoE = new AgendaDAO();
		ArrayList<AgendaBeans> listarE = daoE.filtraAgenda("e");
		for (AgendaBeans agendaE : listarE) {
			modeloE.addRow(new Object[] { agendaE.getNome(),
					agendaE.getCidade(), agendaE.getTelefone(),
					agendaE.getEndereco() });
		}

		modeloF = (DefaultTableModel) tblF.getModel();
		modeloF.setNumRows(0);
		AgendaDAO daoF = new AgendaDAO();
		ArrayList<AgendaBeans> listarF = daoF.filtraAgenda("f");
		for (AgendaBeans agendaF : listarF) {
			modeloF.addRow(new Object[] { agendaF.getNome(),
					agendaF.getCidade(), agendaF.getTelefone(),
					agendaF.getEndereco() });
		}

		modeloG = (DefaultTableModel) tblG.getModel();
		modeloG.setNumRows(0);
		AgendaDAO daoG = new AgendaDAO();
		ArrayList<AgendaBeans> listarG = daoG.filtraAgenda("g");
		for (AgendaBeans agendaG : listarG) {
			modeloG.addRow(new Object[] { agendaG.getNome(),
					agendaG.getCidade(), agendaG.getTelefone(),
					agendaG.getEndereco() });
		}

		modeloH = (DefaultTableModel) tblH.getModel();
		modeloH.setNumRows(0);
		AgendaDAO daoH = new AgendaDAO();
		ArrayList<AgendaBeans> listarH = daoH.filtraAgenda("h");
		for (AgendaBeans agendaH : listarH) {
			modeloH.addRow(new Object[] { agendaH.getNome(),
					agendaH.getCidade(), agendaH.getTelefone(),
					agendaH.getEndereco() });
		}

		modeloI = (DefaultTableModel) tblI.getModel();
		modeloI.setNumRows(0);
		AgendaDAO daoI = new AgendaDAO();
		ArrayList<AgendaBeans> listarI = daoI.filtraAgenda("i");
		for (AgendaBeans agendaI : listarI) {
			modeloI.addRow(new Object[] { agendaI.getNome(),
					agendaI.getCidade(), agendaI.getTelefone(),
					agendaI.getEndereco() });
		}

		modeloJ = (DefaultTableModel) tblJ.getModel();
		modeloJ.setNumRows(0);
		AgendaDAO daoJ = new AgendaDAO();
		ArrayList<AgendaBeans> listarJ = daoJ.filtraAgenda("j");
		for (AgendaBeans agendaJ : listarJ) {
			modeloJ.addRow(new Object[] { agendaJ.getNome(),
					agendaJ.getCidade(), agendaJ.getTelefone(),
					agendaJ.getEndereco() });
		}

		modeloK = (DefaultTableModel) tblK.getModel();
		modeloK.setNumRows(0);
		AgendaDAO daoK = new AgendaDAO();
		ArrayList<AgendaBeans> listarK = daoK.filtraAgenda("k");
		for (AgendaBeans agendaK : listarK) {
			modeloK.addRow(new Object[] { agendaK.getNome(),
					agendaK.getCidade(), agendaK.getTelefone(),
					agendaK.getEndereco() });
		}

		modeloL = (DefaultTableModel) tblL.getModel();
		modeloL.setNumRows(0);
		AgendaDAO daoL = new AgendaDAO();
		ArrayList<AgendaBeans> listarL = daoL.filtraAgenda("l");
		for (AgendaBeans agendaL : listarL) {
			modeloL.addRow(new Object[] { agendaL.getNome(),
					agendaL.getCidade(), agendaL.getTelefone(),
					agendaL.getEndereco() });
		}

		modeloM = (DefaultTableModel) tblM.getModel();
		modeloM.setNumRows(0);
		AgendaDAO daoM = new AgendaDAO();
		ArrayList<AgendaBeans> listarM = daoM.filtraAgenda("m");
		for (AgendaBeans agendaM : listarM) {
			modeloM.addRow(new Object[] { agendaM.getNome(),
					agendaM.getCidade(), agendaM.getTelefone(),
					agendaM.getEndereco() });
		}

		modeloN = (DefaultTableModel) tblN.getModel();
		modeloN.setNumRows(0);
		AgendaDAO daoN = new AgendaDAO();
		ArrayList<AgendaBeans> listarN = daoN.filtraAgenda("n");
		for (AgendaBeans agendaN : listarN) {
			modeloN.addRow(new Object[] { agendaN.getNome(),
					agendaN.getCidade(), agendaN.getTelefone(),
					agendaN.getEndereco() });
		}

		modeloO = (DefaultTableModel) tblO.getModel();
		modeloO.setNumRows(0);
		AgendaDAO daoO = new AgendaDAO();
		ArrayList<AgendaBeans> listarO = daoO.filtraAgenda("o");
		for (AgendaBeans agendaO : listarO) {
			modeloO.addRow(new Object[] { agendaO.getNome(),
					agendaO.getCidade(), agendaO.getTelefone(),
					agendaO.getEndereco() });
		}

		modeloP = (DefaultTableModel) tblP.getModel();
		modeloP.setNumRows(0);
		AgendaDAO daoP = new AgendaDAO();
		ArrayList<AgendaBeans> listarP = daoP.filtraAgenda("p");
		for (AgendaBeans agendaP : listarP) {
			modeloP.addRow(new Object[] { agendaP.getNome(),
					agendaP.getCidade(), agendaP.getTelefone(),
					agendaP.getEndereco() });
		}

		modeloQ = (DefaultTableModel) tblQ.getModel();
		modeloQ.setNumRows(0);
		AgendaDAO daoQ = new AgendaDAO();
		ArrayList<AgendaBeans> listarQ = daoQ.filtraAgenda("q");
		for (AgendaBeans agendaQ : listarQ) {
			modeloQ.addRow(new Object[] { agendaQ.getNome(),
					agendaQ.getCidade(), agendaQ.getTelefone(),
					agendaQ.getEndereco() });
		}

		modeloR = (DefaultTableModel) tblR.getModel();
		modeloR.setNumRows(0);
		AgendaDAO daoR = new AgendaDAO();
		ArrayList<AgendaBeans> listarR = daoR.filtraAgenda("r");
		for (AgendaBeans agendaR : listarR) {
			modeloR.addRow(new Object[] { agendaR.getNome(),
					agendaR.getCidade(), agendaR.getTelefone(),
					agendaR.getEndereco() });
		}

		modeloS = (DefaultTableModel) tblS.getModel();
		modeloS.setNumRows(0);
		AgendaDAO daoS = new AgendaDAO();
		ArrayList<AgendaBeans> listarS = daoS.filtraAgenda("s");
		for (AgendaBeans agendaS : listarS) {
			modeloS.addRow(new Object[] { agendaS.getNome(),
					agendaS.getCidade(), agendaS.getTelefone(),
					agendaS.getEndereco() });
		}

		modeloT = (DefaultTableModel) tblT.getModel();
		modeloT.setNumRows(0);
		AgendaDAO daoT = new AgendaDAO();
		ArrayList<AgendaBeans> listarT = daoT.filtraAgenda("t");
		for (AgendaBeans agendaT : listarT) {
			modeloT.addRow(new Object[] { agendaT.getNome(),
					agendaT.getCidade(), agendaT.getTelefone(),
					agendaT.getEndereco() });
		}

		modeloU = (DefaultTableModel) tblU.getModel();
		modeloU.setNumRows(0);
		AgendaDAO daoU = new AgendaDAO();
		ArrayList<AgendaBeans> listarU = daoU.filtraAgenda("u");
		for (AgendaBeans agendaU : listarU) {
			modeloU.addRow(new Object[] { agendaU.getNome(),
					agendaU.getCidade(), agendaU.getTelefone(),
					agendaU.getEndereco() });
		}

		modeloV = (DefaultTableModel) tblV.getModel();
		modeloV.setNumRows(0);
		AgendaDAO daoV = new AgendaDAO();
		ArrayList<AgendaBeans> listarV = daoV.filtraAgenda("v");
		for (AgendaBeans agendaV : listarV) {
			modeloV.addRow(new Object[] { agendaV.getNome(),
					agendaV.getCidade(), agendaV.getTelefone(),
					agendaV.getEndereco() });
		}

		modeloW = (DefaultTableModel) tblW.getModel();
		modeloW.setNumRows(0);
		AgendaDAO daoW = new AgendaDAO();
		ArrayList<AgendaBeans> listarW = daoW.filtraAgenda("w");
		for (AgendaBeans agendaW : listarW) {
			modeloW.addRow(new Object[] { agendaW.getNome(),
					agendaW.getCidade(), agendaW.getTelefone(),
					agendaW.getEndereco() });
		}

		modeloX = (DefaultTableModel) tblX.getModel();
		modeloX.setNumRows(0);
		AgendaDAO daoX = new AgendaDAO();
		ArrayList<AgendaBeans> listarX = daoX.filtraAgenda("x");
		for (AgendaBeans agendaX : listarX) {
			modeloX.addRow(new Object[] { agendaX.getNome(),
					agendaX.getCidade(), agendaX.getTelefone(),
					agendaX.getEndereco() });
		}

		modeloY = (DefaultTableModel) tblY.getModel();
		modeloY.setNumRows(0);
		AgendaDAO daoY = new AgendaDAO();
		ArrayList<AgendaBeans> listarY = daoY.filtraAgenda("y");
		for (AgendaBeans agendaY : listarY) {
			modeloY.addRow(new Object[] { agendaY.getNome(),
					agendaY.getCidade(), agendaY.getTelefone(),
					agendaY.getEndereco() });
		}

		modeloZ = (DefaultTableModel) tblZ.getModel();
		modeloZ.setNumRows(0);
		AgendaDAO daoZ = new AgendaDAO();
		ArrayList<AgendaBeans> listarZ = daoZ.filtraAgenda("z");
		for (AgendaBeans agendaZ : listarZ) {
			modeloZ.addRow(new Object[] { agendaZ.getNome(),
					agendaZ.getCidade(), agendaZ.getTelefone(),
					agendaZ.getEndereco() });
		}
	}
}