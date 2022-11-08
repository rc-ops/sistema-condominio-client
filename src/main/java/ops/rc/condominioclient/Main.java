package ops.rc.condominioclient;

import java.util.List;

import javax.swing.JOptionPane;

import api.ApiClient;
import api.MoradorApi;
import javax.swing.table.DefaultTableModel;
import ops.rc.condominioclient.entities.Morador;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaMoradores = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMoradores = new javax.swing.JTable();
        abaProblemas = new javax.swing.JTabbedPane();
        abaReunioes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblTelefones = new javax.swing.JLabel();
        txtTelefones = new javax.swing.JTextField();
        lblEmails = new javax.swing.JLabel();
        txtEmails = new javax.swing.JTextField();
        lblApartamento = new javax.swing.JLabel();
        txtApartamento = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        lblPendencias = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPendencias = new javax.swing.JTextArea();
        lblSituacoes = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JTextField();
        comboBoxSituacoes = new javax.swing.JComboBox<>();
        btnCriar = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Condomínio ABC");
        setResizable(false);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(32767, 380));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 380));

        tableMoradores.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMoradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMoradoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMoradores);

        abaMoradores.addTab("Lista de moradores", jScrollPane1);

        jTabbedPane1.addTab("Moradores", abaMoradores);
        jTabbedPane1.addTab("Problemas", abaProblemas);
        jTabbedPane1.addTab("Reuniões", abaReunioes);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Morador"));

        lblCpf.setText("CPF");

        lblNome.setText("Nome");

        lblSobrenome.setText("Sobrenome");

        lblTelefones.setText("Telefones");

        lblEmails.setText("Emails");

        lblApartamento.setText("Apartamento");

        lblObservacoes.setText("Observações");

        lblPendencias.setText("Pendências");

        txtPendencias.setColumns(20);
        txtPendencias.setLineWrap(true);
        txtPendencias.setRows(1);
        jScrollPane3.setViewportView(txtPendencias);

        lblSituacoes.setText("Situação");

        comboBoxSituacoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OK", "PENDENTE", "ALUGADO", "OUTRO" }));

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnDeletar.setText("Deletar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSobrenome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCpf)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(8, 8, 8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefones)
                                    .addComponent(lblEmails))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblApartamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefones)
                            .addComponent(txtEmails)
                            .addComponent(txtApartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSituacoes)
                            .addComponent(lblObservacoes)
                            .addComponent(lblPendencias)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(txtObservacoes)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBoxSituacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefones)
                            .addComponent(txtTelefones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPendencias))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmails)
                            .addComponent(txtEmails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSobrenome)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApartamento)
                            .addComponent(txtApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservacoes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSituacoes)
                            .addComponent(comboBoxSituacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        try {
            Morador morador = new Morador();
            morador.setCpf(txtCpf.getText());
            morador.setNome(txtNome.getText());
            morador.setSobrenome(txtSobrenome.getText());
            morador.setTelefones(txtTelefones.getText());
            morador.setEmails(txtEmails.getText());
            morador.setApartamento(Integer.valueOf(txtApartamento.getText()));
            morador.setObservacoes(txtObservacoes.getText());
            morador.setPendencias(txtPendencias.getText());
            morador.setSituacaoMorador(String.valueOf(comboBoxSituacoes.getSelectedItem()));
            MoradorApi moradorApi = ApiClient.getClient().create(MoradorApi.class);
            moradorApi.createMorador(morador).enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> arg0, Response<Void> response) {
                    if (response.isSuccessful()) {
                        loadData();
                    }
                }

                @Override
                public void onFailure(Call<Void> arg0, Throwable e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void tableMoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMoradoresMouseClicked
        int selectedRow = tableMoradores.getSelectedRow();
        String cpf = tableMoradores.getValueAt(selectedRow, 0).toString();
        MoradorApi moradorApi = ApiClient.getClient().create(MoradorApi.class);
        moradorApi.findMoradorByCpf(cpf).enqueue(new Callback<Morador>() {
            @Override
            public void onResponse(Call<Morador> arg0, Response<Morador> response) {
                if (response.isSuccessful()) {
                    Morador morador = response.body();
                    txtCpf.setText(morador.getCpf());
                    txtNome.setText(morador.getNome());
                    txtSobrenome.setText(morador.getSobrenome());
                    txtTelefones.setText(morador.getTelefones());
                    txtEmails.setText(morador.getEmails());
                    txtApartamento.setText(String.valueOf(morador.getApartamento()));
                    txtObservacoes.setText(morador.getObservacoes());
                    txtPendencias.setText(morador.getPendencias());
                    comboBoxSituacoes.setSelectedItem(morador.getSituacaoMorador());
                }
            }

            @Override
            public void onFailure(Call<Morador> arg0, Throwable e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        });;
    }//GEN-LAST:event_tableMoradoresMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLafLight".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaMoradores;
    private javax.swing.JTabbedPane abaProblemas;
    private javax.swing.JTabbedPane abaReunioes;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxSituacoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApartamento;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmails;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPendencias;
    private javax.swing.JLabel lblSituacoes;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTelefones;
    private javax.swing.JTable tableMoradores;
    private javax.swing.JTextField txtApartamento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmails;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextArea txtPendencias;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTelefones;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        try {
            MoradorApi moradorApi = ApiClient.getClient().create(MoradorApi.class);
            moradorApi.findAll().enqueue(new Callback<List<Morador>>() {
                @Override
                public void onResponse(Call<List<Morador>> call, Response<List<Morador>> response) {
                    if (response.isSuccessful()) {
                        DefaultTableModel defaultTableModel = new DefaultTableModel();
                        defaultTableModel.addColumn("CPF");
                        defaultTableModel.addColumn("Nome");
                        defaultTableModel.addColumn("Sobrenome");
                        defaultTableModel.addColumn("Telefones");
                        defaultTableModel.addColumn("Emails");
                        defaultTableModel.addColumn("Apartamento");
                        defaultTableModel.addColumn("Observações");
                        defaultTableModel.addColumn("Pendências");
                        defaultTableModel.addColumn("Situação");
                        for (Morador morador : response.body()) {
                            defaultTableModel.addRow(new Object[]{
                                morador.getCpf(),
                                morador.getNome(),
                                morador.getSobrenome(),
                                morador.getTelefones(),
                                morador.getEmails(),
                                morador.getApartamento(),
                                morador.getObservacoes(),
                                morador.getPendencias(),
                                morador.getSituacaoMorador()
                            });
                        }
                        tableMoradores.setModel(defaultTableModel);

                    }
                }

                @Override
                public void onFailure(Call<List<Morador>> Call, Throwable t) {
                    JOptionPane.showConfirmDialog(null, t.getMessage());
                }

            });
        } catch (Exception e) {
        }
    }
}
