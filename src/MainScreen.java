import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {
    Locale ptBr = new Locale("pt", "BR");
    String[] material = {"Luxo", "Premium", "Comum"};
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    Funcoes f = new Funcoes();
    
    HashMap <String, Pedido> pedido = new HashMap <>();
    
    ArrayList<Material> m;
    
    public MainScreen() {
        this.m = new ArrayList<>();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField12 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NomeClienteLabel = new javax.swing.JLabel();
        CPFClienteLabel = new javax.swing.JLabel();
        SobrenomeClienteLabel = new javax.swing.JLabel();
        CPFClienteTextField = new javax.swing.JTextField();
        NomeClienteTextField = new javax.swing.JTextField();
        SobrenomeClienteTextField = new javax.swing.JTextField();
        AtualizarClienteButton = new javax.swing.JButton();
        IncluirClienteButton = new javax.swing.JButton();
        ListarClienteButton = new javax.swing.JButton();
        ExcluirClienteButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientesTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        NomePedidoLabel = new javax.swing.JLabel();
        CPFPedidoLabel = new javax.swing.JLabel();
        SobrenomePedidoLabel = new javax.swing.JLabel();
        CPFPedidoTextField = new javax.swing.JTextField();
        SobrenomePedidoTextField = new javax.swing.JTextField();
        PesquisarPedidosButton = new javax.swing.JButton();
        NomePedidoTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ItensPedidoTitulo = new javax.swing.JLabel();
        FormaTapeteLabel = new javax.swing.JLabel();
        MaterialPedidoLabel = new javax.swing.JLabel();
        AlturaLabel = new javax.swing.JLabel();
        LarguraLabel = new javax.swing.JLabel();
        TamanhoLabel = new javax.swing.JLabel();
        FormaTapeteCombobox = new javax.swing.JComboBox<>();
        SelecionarMaterialCombobox = new javax.swing.JComboBox<>();
        LarguraPedidosTextField = new javax.swing.JTextField();
        AlturaPedidosTextField = new javax.swing.JTextField();
        TamanhoPedidosTextField = new javax.swing.JTextField();
        AlterarItemPedidosButton = new javax.swing.JButton();
        ExcluirItemPedidosButton = new javax.swing.JButton();
        IncluirItemPedidosButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItensPedidoTable = new javax.swing.JTable();
        ResumoPedidoTitulo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        TotaldoPedidoLabel = new javax.swing.JLabel();
        TotaldoPedidoTextField = new javax.swing.JTextField();
        ClientePedidoTitulo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        MaterialPrecoLabel = new javax.swing.JLabel();
        PrecoM2MaterialTextField = new javax.swing.JTextField();
        AtualizarPrecoButton = new javax.swing.JButton();
        PrecoM2MaterialLabel = new javax.swing.JLabel();
        MaterialPrecoCombobox = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setToolTipText("Cliente");
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(300, 400));
        jTabbedPane1.setName("Cliente"); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(680, 300));
        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        NomeClienteLabel.setText("Nome:");

        CPFClienteLabel.setText("CPF:");

        SobrenomeClienteLabel.setText("Sobrenome:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SobrenomeClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(CPFClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomeClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SobrenomeClienteTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(CPFClienteTextField)
                    .addComponent(NomeClienteTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeClienteLabel)
                    .addComponent(NomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SobrenomeClienteLabel)
                    .addComponent(SobrenomeClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPFClienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFClienteLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AtualizarClienteButton.setText("Atualizar");
        AtualizarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarClienteButtonActionPerformed(evt);
            }
        });

        IncluirClienteButton.setText("Incluir");
        IncluirClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirClienteButtonActionPerformed(evt);
            }
        });

        ListarClienteButton.setText("Listar");
        ListarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarClienteButtonActionPerformed(evt);
            }
        });

        ExcluirClienteButton.setText("Excluir");
        ExcluirClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClienteButtonActionPerformed(evt);
            }
        });

        ClientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Sobrenome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClientesTable.getTableHeader().setReorderingAllowed(false);
        ClientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClientesTable);
        if (ClientesTable.getColumnModel().getColumnCount() > 0) {
            ClientesTable.getColumnModel().getColumn(0).setResizable(false);
            ClientesTable.getColumnModel().getColumn(1).setResizable(false);
            ClientesTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IncluirClienteButton)
                .addGap(18, 18, 18)
                .addComponent(AtualizarClienteButton)
                .addGap(18, 18, 18)
                .addComponent(ListarClienteButton)
                .addGap(22, 22, 22)
                .addComponent(ExcluirClienteButton)
                .addContainerGap())
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtualizarClienteButton)
                    .addComponent(IncluirClienteButton)
                    .addComponent(ListarClienteButton)
                    .addComponent(ExcluirClienteButton))
                .addGap(34, 34, 34)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel4);

        NomePedidoLabel.setText("Nome:");

        CPFPedidoLabel.setText("CPF:");

        SobrenomePedidoLabel.setText("Sobrenome:");

        SobrenomePedidoTextField.setEnabled(false);

        PesquisarPedidosButton.setText("Pesquisar");
        PesquisarPedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarPedidosButtonActionPerformed(evt);
            }
        });

        NomePedidoTextField.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPFPedidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomePedidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SobrenomePedidoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CPFPedidoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(NomePedidoTextField)
                    .addComponent(SobrenomePedidoTextField))
                .addGap(21, 21, 21)
                .addComponent(PesquisarPedidosButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFPedidoLabel)
                    .addComponent(PesquisarPedidosButton))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomePedidoLabel)
                    .addComponent(NomePedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SobrenomePedidoLabel)
                    .addComponent(SobrenomePedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NomePedidoTextField.getAccessibleContext().setAccessibleName("");

        ItensPedidoTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ItensPedidoTitulo.setText("Item de Pedido");

        FormaTapeteLabel.setText("Forma do tapete");

        MaterialPedidoLabel.setText("Selecione o material");

        AlturaLabel.setText("Altrura (m)");

        LarguraLabel.setText("Largura (m)");

        TamanhoLabel.setText("Tamanho (m²)");

        FormaTapeteCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retangular", "Circular", "Triangular" }));
        FormaTapeteCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaTapeteComboboxActionPerformed(evt);
            }
        });

        SelecionarMaterialCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Luxo", "Premium" }));

        LarguraPedidosTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LarguraPedidosTextFieldFocusLost(evt);
            }
        });

        AlturaPedidosTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AlturaPedidosTextFieldFocusLost(evt);
            }
        });

        TamanhoPedidosTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TamanhoPedidosTextFieldFocusLost(evt);
            }
        });

        AlterarItemPedidosButton.setText("Alterar Item de pedido");
        AlterarItemPedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarItemPedidosButtonActionPerformed(evt);
            }
        });

        ExcluirItemPedidosButton.setText("Excluir Item de pedido");
        ExcluirItemPedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirItemPedidosButtonActionPerformed(evt);
            }
        });

        IncluirItemPedidosButton.setText("Incluir Item de pedido");
        IncluirItemPedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirItemPedidosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(FormaTapeteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FormaTapeteCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaterialPedidoLabel)
                                    .addComponent(AlturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LarguraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TamanhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SelecionarMaterialCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AlturaPedidosTextField)
                                    .addComponent(LarguraPedidosTextField)
                                    .addComponent(TamanhoPedidosTextField))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ItensPedidoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AlterarItemPedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExcluirItemPedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncluirItemPedidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItensPedidoTitulo)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormaTapeteLabel)
                    .addComponent(FormaTapeteCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaterialPedidoLabel)
                    .addComponent(SelecionarMaterialCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlturaLabel)
                    .addComponent(AlturaPedidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LarguraLabel)
                    .addComponent(LarguraPedidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TamanhoLabel)
                    .addComponent(TamanhoPedidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IncluirItemPedidosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AlterarItemPedidosButton)
                        .addComponent(ExcluirItemPedidosButton)))
                .addContainerGap())
        );

        ItensPedidoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Forma", "Material", "Tamanho (m²)", "Preço"
            }
        ));
        ItensPedidoTable.getTableHeader().setReorderingAllowed(false);
        ItensPedidoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItensPedidoTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ItensPedidoTable);

        ResumoPedidoTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ResumoPedidoTitulo.setText("Resumo do pedido");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(ResumoPedidoTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ResumoPedidoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TotaldoPedidoLabel.setText("Total do pedido:");

        TotaldoPedidoTextField.setEditable(false);
        TotaldoPedidoTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TotaldoPedidoTextField.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(TotaldoPedidoLabel)
                .addGap(37, 37, 37)
                .addComponent(TotaldoPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotaldoPedidoLabel)
                    .addComponent(TotaldoPedidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        ClientePedidoTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ClientePedidoTitulo.setText("Cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(ClientePedidoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(ClientePedidoTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Pedido", jPanel5);

        MaterialPrecoLabel.setText("Material");

        AtualizarPrecoButton.setText("Atualizar");
        AtualizarPrecoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarPrecoButtonActionPerformed(evt);
            }
        });

        PrecoM2MaterialLabel.setText("Preço do M²     R$");

        MaterialPrecoCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Luxo", "Premium" }));
        MaterialPrecoCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialPrecoComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(MaterialPrecoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addComponent(PrecoM2MaterialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaterialPrecoCombobox, 0, 555, Short.MAX_VALUE)
                            .addComponent(PrecoM2MaterialTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AtualizarPrecoButton)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoM2MaterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecoM2MaterialLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaterialPrecoLabel)
                    .addComponent(MaterialPrecoCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AtualizarPrecoButton)
                .addContainerGap(547, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Preço Material", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncluirClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirClienteButtonActionPerformed
        DefaultTableModel dtmClientes = (DefaultTableModel) ClientesTable.getModel();
        String errorMsg = f.validaDadosParaTabelaCliente(CPFClienteTextField.getText(), NomeClienteTextField.getText(), SobrenomeClienteTextField.getText());
        if (errorMsg.equals("")) {
            
            String erroCpf = (f.ValidaCPF(CPFClienteTextField.getText()));
            String erroCpfJaExiste = CPFExistente(CPFClienteTextField.getText());
            if (!erroCpf.equals("") || !erroCpfJaExiste.equals("")){
                JOptionPane.showMessageDialog(null, erroCpf.equals("")?erroCpfJaExiste:erroCpf);
            }else{
                Object[] dados = {CPFClienteTextField.getText(), NomeClienteTextField.getText(), SobrenomeClienteTextField.getText()};
                dtmClientes.addRow(dados);
                Cliente c = new Cliente(CPFClienteTextField.getText(), NomeClienteTextField.getText(), SobrenomeClienteTextField.getText());
                clientes.add(c);
                limparCamposFormularioCliente();
            }
        } else {
            JOptionPane.showMessageDialog(null, errorMsg);
        }
    }//GEN-LAST:event_IncluirClienteButtonActionPerformed

    private void ExcluirClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClienteButtonActionPerformed
        DefaultTableModel dtmClientes = (DefaultTableModel) ClientesTable.getModel();
        int resultadoCaixaPreco = 0;
        
        String msgErro = "Excluir cliente " + dtmClientes.getValueAt(ClientesTable.getSelectedRow(), 1) + "?";    
        resultadoCaixaPreco = JOptionPane.showConfirmDialog(new javax.swing.JFrame(), msgErro, "Aviso", 
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (resultadoCaixaPreco == 0){
            if (ClientesTable.getSelectedRowCount() == 1) {
                dtmClientes.removeRow(ClientesTable.getSelectedRow());
                apagarClienteCPF(CPFClienteTextField.getText());
                pedido.remove(CPFClienteTextField.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado.");
            }
            limparCamposFormularioCliente();
        }
    }//GEN-LAST:event_ExcluirClienteButtonActionPerformed

    private void AtualizarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarClienteButtonActionPerformed
        DefaultTableModel dtmClientes = (DefaultTableModel) ClientesTable.getModel();
        if (ClientesTable.getSelectedRowCount() == 1) {
            String NomeCliente = NomeClienteTextField.getText();
            String SobrenomeCliente = SobrenomeClienteTextField.getText();
            String CPFCliente = CPFClienteTextField.getText();
            
            String erroCpf = f.ValidaCPF(CPFCliente);
            String erroCpfJaExiste = CPFExistente(CPFClienteTextField.getText());
            if (!erroCpf.equals("") || !erroCpfJaExiste.equals("")){
                JOptionPane.showMessageDialog(null, erroCpf.equals("")?erroCpfJaExiste:erroCpf);
            }else{
                int linha = ClientesTable.getSelectedRow();
                String CpfAntigo = ClientesTable.getValueAt(linha, 0).toString();
                
                dtmClientes.setValueAt(NomeCliente, ClientesTable.getSelectedRow(), 1);
                dtmClientes.setValueAt(SobrenomeCliente, ClientesTable.getSelectedRow(), 2);
                dtmClientes.setValueAt(CPFCliente, ClientesTable.getSelectedRow(), 0);
                
                buscarClienteCPF(CpfAntigo).atualizaCliente(CPFCliente, NomeCliente, SobrenomeCliente);
                
                Pedido p = pedido.remove(CpfAntigo);
                pedido.put(CPFCliente, p);
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado.");
        }
        limparCamposFormularioCliente();
    }//GEN-LAST:event_AtualizarClienteButtonActionPerformed

    private void ClientesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesTableMouseClicked
        DefaultTableModel dtmClientes = (DefaultTableModel) ClientesTable.getModel();

        String NomeCliente = dtmClientes.getValueAt(ClientesTable.getSelectedRow(), 1).toString();
        String SobrenomeCliente = dtmClientes.getValueAt(ClientesTable.getSelectedRow(), 2).toString();
        String CPFCliente = dtmClientes.getValueAt(ClientesTable.getSelectedRow(), 0).toString();

        NomeClienteTextField.setText(NomeCliente);
        SobrenomeClienteTextField.setText(SobrenomeCliente);
        CPFClienteTextField.setText(CPFCliente);
    }//GEN-LAST:event_ClientesTableMouseClicked

    private void AtualizarPrecoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarPrecoButtonActionPerformed
      
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).nome.equals(MaterialPrecoCombobox.getSelectedItem().toString())){
                try {
                    m.get(i).valor = Float.parseFloat(PrecoM2MaterialTextField.getText());
                    JOptionPane.showMessageDialog(null, "Preço atualizado! ");
                }catch(java.lang.NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Numero inválido.");
                    PrecoM2MaterialTextField.setText("");
                }
                
            }
        }
    }//GEN-LAST:event_AtualizarPrecoButtonActionPerformed

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        for (int i = 0; i < material.length; i++) {
            m.add(new Material(material[i], 0));
        }
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void IncluirItemPedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirItemPedidosButtonActionPerformed
        
        if(!TamanhoPedidosTextField.getText().equals("")){
            DefaultTableModel dtmItens = (DefaultTableModel) ItensPedidoTable.getModel();

            Float AlturaPedidos = f.converteParaNumero(AlturaPedidosTextField.getText());
            Float LarguraPedidos = f.converteParaNumero(LarguraPedidosTextField.getText());

            int resultadoCaixaPreco = 0;
            if (retornaMaterial(SelecionarMaterialCombobox.getSelectedItem().toString()).valor <= 0) {
                String msgErro = "O material selecionado esta com valor: " + retornaMaterial(SelecionarMaterialCombobox.getSelectedItem().toString()).valor + ".\nDeseja continuar?";
                resultadoCaixaPreco = JOptionPane.showConfirmDialog(new javax.swing.JFrame(), msgErro, "Aviso", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            if (resultadoCaixaPreco == 0){
                Tapete tp = new Tapete();
                tp.criaTapete(
                    AlturaPedidos,
                    LarguraPedidos,
                    f.converteParaNumero(TamanhoPedidosTextField.getText()),
                    FormaTapeteCombobox.getSelectedItem().toString(),
                    retornaMaterial(SelecionarMaterialCombobox.getSelectedItem().toString())
                );            
                    try{
                        pedido.get(CPFPedidoTextField.getText()).insereTapete(tp);

                        Object[] dados = {FormaTapeteCombobox.getSelectedItem().toString(), SelecionarMaterialCombobox.getSelectedItem().toString(), TamanhoPedidosTextField.getText(), NumberFormat.getCurrencyInstance(ptBr).format(pedido.get(CPFPedidoTextField.getText()).item.get(pedido.get(CPFPedidoTextField.getText()).item.size()-1).precoTapete)};
                        dtmItens.addRow(dados);

                        pedido.get(CPFPedidoTextField.getText()).totalPedido = pedido.get(CPFPedidoTextField.getText()).calculaTotalPedido();

                        TotaldoPedidoTextField.setText(NumberFormat.getCurrencyInstance(ptBr).format((pedido.get(CPFPedidoTextField.getText()).calculaTotalPedido())));
                    }   catch(java.lang.NullPointerException e)  {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado");                
                    }

            }
        }else {
            JOptionPane.showMessageDialog(null, "Preencher campo M2.");
        }
    }//GEN-LAST:event_IncluirItemPedidosButtonActionPerformed

    private void ExcluirItemPedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirItemPedidosButtonActionPerformed
        DefaultTableModel dtmItens = (DefaultTableModel) ItensPedidoTable.getModel();
        if (ItensPedidoTable.getSelectedRowCount() == 1) {            
            pedido.get(CPFPedidoTextField.getText()).item.remove(ItensPedidoTable.getSelectedRow());
            dtmItens.removeRow(ItensPedidoTable.getSelectedRow());
            pedido.get(CPFPedidoTextField.getText()).totalPedido = (pedido.get(CPFPedidoTextField.getText()).calculaTotalPedido());            
            TotaldoPedidoTextField.setText(NumberFormat.getCurrencyInstance(ptBr).format((pedido.get(CPFPedidoTextField.getText()).calculaTotalPedido())));;
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado.");
        }
        limparCamposFormularioCliente();
    }//GEN-LAST:event_ExcluirItemPedidosButtonActionPerformed

    private void AlterarItemPedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarItemPedidosButtonActionPerformed
        if(!TamanhoPedidosTextField.getText().equals("")){

            DefaultTableModel dtmItens = (DefaultTableModel) ItensPedidoTable.getModel();
            int linha = ItensPedidoTable.getSelectedRow();

            String forma = FormaTapeteCombobox.getSelectedItem().toString();
            String material = SelecionarMaterialCombobox.getSelectedItem().toString();
            String altura = AlturaPedidosTextField.getText();
            String largura = LarguraPedidosTextField.getText();
            String tamanho = TamanhoPedidosTextField.getText();
            Float preco = f.converteParaNumero(tamanho) * buscaMaterialNome(material).valor;               

            Tapete t = new Tapete();
            t.criaTapete(f.converteParaNumero(altura), f.converteParaNumero(largura), f.converteParaNumero(tamanho), forma, buscaMaterialNome(material));

            dtmItens.setValueAt(forma, ItensPedidoTable.getSelectedRow(), 0);
            dtmItens.setValueAt(material, ItensPedidoTable.getSelectedRow(), 1);
            dtmItens.setValueAt(tamanho, ItensPedidoTable.getSelectedRow(), 2);
            dtmItens.setValueAt(NumberFormat.getCurrencyInstance(ptBr).format(preco), ItensPedidoTable.getSelectedRow(), 3);

            pedido.get(CPFPedidoTextField.getText()).item.set(linha, t);
            pedido.get(CPFPedidoTextField.getText()).totalPedido = (pedido.get(CPFPedidoTextField.getText()).calculaTotalPedido());

            TotaldoPedidoTextField.setText(NumberFormat.getCurrencyInstance(ptBr).format((pedido.get(CPFPedidoTextField.getText()).calculaTotalPedido())));
        }else {
            JOptionPane.showMessageDialog(null, "Preencher campo M2.");
        }
    }//GEN-LAST:event_AlterarItemPedidosButtonActionPerformed

    private void TamanhoPedidosTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TamanhoPedidosTextFieldFocusLost
        String errorMsg = f.calculaLados(FormaTapeteCombobox.getSelectedItem().toString(), TamanhoPedidosTextField.getText());
        if (errorMsg.equals("Digite um numero valido.")) {
            JOptionPane.showMessageDialog(null, errorMsg);
            TamanhoPedidosTextField.setText("");
        }else {
            switch (FormaTapeteCombobox.getSelectedItem().toString()) {
                case "Circular":
                    AlturaPedidosTextField.setText(errorMsg);
                    break;
                default:
                    AlturaPedidosTextField.setText(errorMsg);
                    LarguraPedidosTextField.setText(errorMsg);
                    break;
            }
        }
    }//GEN-LAST:event_TamanhoPedidosTextFieldFocusLost

    private void AlturaPedidosTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AlturaPedidosTextFieldFocusLost
        String errorMsg = f.calculaM2(FormaTapeteCombobox.getSelectedItem().toString(), AlturaPedidosTextField.getText(), LarguraPedidosTextField.getText());
        if (errorMsg.equals("Digite um numero valido.")) {
            JOptionPane.showMessageDialog(null, errorMsg);
            AlturaPedidosTextField.setText("");
        }else {
            TamanhoPedidosTextField.setText(errorMsg);
        }
    }//GEN-LAST:event_AlturaPedidosTextFieldFocusLost

    private void LarguraPedidosTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LarguraPedidosTextFieldFocusLost
        String errorMsg = f.calculaM2(FormaTapeteCombobox.getSelectedItem().toString(), AlturaPedidosTextField.getText(), LarguraPedidosTextField.getText());
        if (errorMsg.equals("Digite um numero valido.")) {
            JOptionPane.showMessageDialog(null, errorMsg);
            LarguraPedidosTextField.setText("");
        }else {
            TamanhoPedidosTextField.setText(errorMsg);
        }
    }//GEN-LAST:event_LarguraPedidosTextFieldFocusLost

    private void FormaTapeteComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaTapeteComboboxActionPerformed
        switch (FormaTapeteCombobox.getSelectedItem().toString()) {
            case "Triangular":
            LarguraLabel.setText("Base (m)");
            AlturaLabel.setText("Altura (m)");
            LarguraPedidosTextField.setVisible(true);
            break;
            case "Circular":
            AlturaLabel.setText("Raio (m)");
            LarguraLabel.setText("");
            LarguraPedidosTextField.setVisible(false);
            break;
            default:
            LarguraLabel.setText("Largura (m)");
            AlturaLabel.setText("Altura (m)");
            LarguraPedidosTextField.setVisible(true);
            break;
        }
        
        limparCamposFormularioPedido();
    }//GEN-LAST:event_FormaTapeteComboboxActionPerformed

    
    private void PesquisarPedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarPedidosButtonActionPerformed
        DefaultTableModel dtmItens = (DefaultTableModel) ItensPedidoTable.getModel();
        if (!CPFPedidoTextField.getText().isEmpty()) {
            Cliente nc = buscarClienteCPF(CPFPedidoTextField.getText());
            String erroCpf = f.ValidaCPF(CPFPedidoTextField.getText());
            if (nc.getNome().equals("") || !erroCpf.equals("")){
                JOptionPane.showMessageDialog(null, !erroCpf.equals("")?erroCpf:"Cliente não encontrado");                
                
                while(dtmItens.getRowCount() > 0){
                    dtmItens.removeRow(0);
                }
                CPFPedidoTextField.setText("");
                NomePedidoTextField.setText("");
                SobrenomePedidoTextField.setText("");
            } else {
                NomePedidoTextField.setText(nc.getNome());
                SobrenomePedidoTextField.setText(nc.getSobrenome());
                if (pedido.containsKey(CPFPedidoTextField.getText())){
                    try{
                        Pedido pedidoParaTela = pedido.get(CPFPedidoTextField.getText()).pedidoVazio();
                        TotaldoPedidoTextField.setText(NumberFormat.getCurrencyInstance(ptBr).format(pedidoParaTela.totalPedido));
                        while(dtmItens.getRowCount() > 0){
                            dtmItens.removeRow(0);
                        }
                        for (int i = 0; i < pedidoParaTela.item.size(); i++) {
                            Object[] dados = {pedidoParaTela.item.get(i).nome, pedidoParaTela.item.get(i).material.nome, pedidoParaTela.item.get(i).m2, NumberFormat.getCurrencyInstance(ptBr).format(pedidoParaTela.item.get(i).precoTapete)}; 
                            dtmItens.addRow(dados); 
                        } 
                    }catch(java.lang.NullPointerException e) {                        
                        while(dtmItens.getRowCount() > 0){
                            dtmItens.removeRow(0);
                        }
                    }
                } else {
                    Pedido p = new Pedido();
                    p.preencherPedido(buscarClienteCPF(CPFPedidoTextField.getText()));
                    pedido.put(CPFPedidoTextField.getText(), p);
                    while(dtmItens.getRowCount() > 0){
                            dtmItens.removeRow(0);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite um CPF.");
        }
        limparCamposFormularioPedido();

    }//GEN-LAST:event_PesquisarPedidosButtonActionPerformed

    private void ListarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarClienteButtonActionPerformed
        DefaultTableModel dtmClientes = (DefaultTableModel) ClientesTable.getModel();
        String sobrenome = SobrenomeClienteTextField.getText();
        while(dtmClientes.getRowCount() > 0){
            dtmClientes.removeRow(0);
        }

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getSobrenome().contains(sobrenome)) {
                Object[] dados = {clientes.get(i).getCPF(), clientes.get(i).getNome(), clientes.get(i).getSobrenome()};
                dtmClientes.addRow(dados);
            }
        }
    }//GEN-LAST:event_ListarClienteButtonActionPerformed

    private void ItensPedidoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItensPedidoTableMouseClicked
        DefaultTableModel dtmItens = (DefaultTableModel) ItensPedidoTable.getModel();
        if (ItensPedidoTable.getSelectedRowCount() == 1) {            
            Tapete tpt = pedido.get(CPFPedidoTextField.getText()).item.get(ItensPedidoTable.getSelectedRow());
            
            FormaTapeteCombobox.setSelectedItem(tpt.nome);
            SelecionarMaterialCombobox.setSelectedItem(tpt.material.nome);
            AlturaPedidosTextField.setText(f.converteFloatParaString(tpt.dimensao1));
            LarguraPedidosTextField.setText(f.converteFloatParaString(tpt.dimensao2));
            TamanhoPedidosTextField.setText(f.converteFloatParaString(tpt.m2));
        }
         
    }//GEN-LAST:event_ItensPedidoTableMouseClicked

    private void MaterialPrecoComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialPrecoComboboxActionPerformed
        PrecoM2MaterialTextField.setText(buscaMaterialNome(MaterialPrecoCombobox.getSelectedItem().toString()).valor.toString());
    }//GEN-LAST:event_MaterialPrecoComboboxActionPerformed


    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });

    }

    public void limparCamposFormularioCliente() {
        NomeClienteTextField.setText("");
        SobrenomeClienteTextField.setText("");
        CPFClienteTextField.setText("");
    }
    
    public void limparCamposFormularioPedido() {
        AlturaPedidosTextField.setText("");
        LarguraPedidosTextField.setText("");
        TamanhoPedidosTextField.setText("");
    }

    public Cliente buscarClienteCPF(String CPF) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCPF().equals(CPF)) {
                return clientes.get(i);
            }
        }
        return new Cliente("", "", "");
    } 

    
    public Material retornaMaterial(String nome){
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).nome.equals(nome)) {
                return m.get(i);
            }
        }
        return (new Material("",0));
    }
    
    public boolean apagarClienteCPF(String CPF) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCPF().equals(CPF)) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    } 
    
    public Material buscaMaterialNome(String nome){
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).nome.equals(nome))
                return m.get(i);
        }
        return new Material("",0);
    }
    
    public String CPFExistente(String cpf){
        if (!cpf.equals("Erro - Insira um CPF válido!! ")){
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getCPF().equals(cpf)){
                    return "CPF Já cadastrado.";
                }
            }
            return "";
        }
        return cpf;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarItemPedidosButton;
    private javax.swing.JLabel AlturaLabel;
    private javax.swing.JTextField AlturaPedidosTextField;
    private javax.swing.JButton AtualizarClienteButton;
    private javax.swing.JButton AtualizarPrecoButton;
    private javax.swing.JLabel CPFClienteLabel;
    private javax.swing.JTextField CPFClienteTextField;
    private javax.swing.JLabel CPFPedidoLabel;
    private javax.swing.JTextField CPFPedidoTextField;
    private javax.swing.JLabel ClientePedidoTitulo;
    private javax.swing.JTable ClientesTable;
    private javax.swing.JButton ExcluirClienteButton;
    private javax.swing.JButton ExcluirItemPedidosButton;
    private javax.swing.JComboBox<String> FormaTapeteCombobox;
    private javax.swing.JLabel FormaTapeteLabel;
    private javax.swing.JButton IncluirClienteButton;
    private javax.swing.JButton IncluirItemPedidosButton;
    private javax.swing.JTable ItensPedidoTable;
    private javax.swing.JLabel ItensPedidoTitulo;
    private javax.swing.JLabel LarguraLabel;
    private javax.swing.JTextField LarguraPedidosTextField;
    private javax.swing.JButton ListarClienteButton;
    private javax.swing.JLabel MaterialPedidoLabel;
    private javax.swing.JComboBox<String> MaterialPrecoCombobox;
    private javax.swing.JLabel MaterialPrecoLabel;
    private javax.swing.JLabel NomeClienteLabel;
    private javax.swing.JTextField NomeClienteTextField;
    private javax.swing.JLabel NomePedidoLabel;
    private javax.swing.JTextField NomePedidoTextField;
    private javax.swing.JButton PesquisarPedidosButton;
    private javax.swing.JLabel PrecoM2MaterialLabel;
    private javax.swing.JTextField PrecoM2MaterialTextField;
    private javax.swing.JLabel ResumoPedidoTitulo;
    private javax.swing.JComboBox<String> SelecionarMaterialCombobox;
    private javax.swing.JLabel SobrenomeClienteLabel;
    private javax.swing.JTextField SobrenomeClienteTextField;
    private javax.swing.JLabel SobrenomePedidoLabel;
    private javax.swing.JTextField SobrenomePedidoTextField;
    private javax.swing.JLabel TamanhoLabel;
    private javax.swing.JTextField TamanhoPedidosTextField;
    private javax.swing.JLabel TotaldoPedidoLabel;
    private javax.swing.JTextField TotaldoPedidoTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static final transient javax.swing.JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField12;
    // End of variables declaration//GEN-END:variables
}
