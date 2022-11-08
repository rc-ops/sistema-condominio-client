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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaMoradores = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMoradores = new javax.swing.JTable();
        abaProblemas = new javax.swing.JTabbedPane();
        abaReunioes = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        tableMoradores.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(tableMoradores);

        abaMoradores.addTab("Lista de moradores", jScrollPane1);

        jTabbedPane1.addTab("Moradores", abaMoradores);
        jTabbedPane1.addTab("Problemas", abaProblemas);
        jTabbedPane1.addTab("Reuniões", abaReunioes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableMoradores;
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