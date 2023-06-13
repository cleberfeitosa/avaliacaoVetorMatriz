/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.ComponentOrientation;
import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author clebe
 */
public class TelaAvaliação extends javax.swing.JFrame {

    /**
     * Creates new form TelaAvaliação
     */
    public TelaAvaliação() {
        initComponents();
        jTxtMatricula.setText(TelaLogin.matricula);
        if(TelaLogin.matricula.equals("2020110310420014")){
            jTxtNome.setText("Alisson Queiroz Alves");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Alisson.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420171")){
            jTxtNome.setText("Ana Julia Aquino da Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ana Julia.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420120")){
            jTxtNome.setText("Ana Luiza Freire Anicesio");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ana Luiza.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420325")){
            jTxtNome.setText("Anamin Juliana Barbosa da Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Anamim.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420082")){
            jTxtNome.setText("Ariel Luiz Biondo");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ariel.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420031")){
            jTxtNome.setText("Bruno Henrique Adams Santana");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bruno Henrique.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420112")){
            jTxtNome.setText("Clenan Uirly Arantes Oliveira");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clenan.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420163")){
            jTxtNome.setText("Eduardo Nunes Paulino Brito");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eduardo Nunes.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420317")){
            jTxtNome.setText("Enzzo Alexandry Lima de Oliveira");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enzo.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420104")){
            jTxtNome.setText("Gabriel Shallon de Siqueira Fernandes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gabriel Shallon.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420309")){
            jTxtNome.setText("Giovana Gomes da Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Giovana Gomes.jpg")));
        }else if(TelaLogin.matricula.equals("2021110310420281")){
            jTxtNome.setText("Gleibson Santana de Oliveira");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gleibson.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420252")){
            jTxtNome.setText("Guilherme de Souza Bueno");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Guilherme Bueno.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420260")){
            jTxtNome.setText("Guilherme Freitas da Costa Lopes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Guilherme Freitas.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420376")){
            jTxtNome.setText("Gustavo da Silva Gomes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gustavo da Silva.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420147")){
            jTxtNome.setText("Gustavo Vinícius Coinete Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gustavo Vinícius.png")));
        }else if(TelaLogin.matricula.equals("2022110310420350")){
            jTxtNome.setText("Igor Queiroz Rezende");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Igor Queiroz.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420155")){
            jTxtNome.setText("Italo Sabino Dias Santana");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Italo.png")));
        }else if(TelaLogin.matricula.equals("2022110310420210")){
            jTxtNome.setText("Jhony Rhaffael Bezerra Neto");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Jhony Rahaffael Bezerra Neto.jpg")));
        }else if(TelaLogin.matricula.equals("2021110310420206")){
            jTxtNome.setText("João Vitor Alves Welter");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/João Victoe Alves.png")));
        }else if(TelaLogin.matricula.equals("2022110310420058")){
            jTxtNome.setText("Joaquim Guilherme de Sousa e Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Joaquim Guilherme.png")));
        }else if(TelaLogin.matricula.equals("2022110310420201")){
            jTxtNome.setText("Luiz Fernando Alves Correia");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Luiz Fernando.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420015")){
            jTxtNome.setText("Marcelo Teo Silva dos Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Marcelo Teo.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420040")){
            jTxtNome.setText("Maria Eduarda Pereira Castro");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Maria Eduarda.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420236")){
            jTxtNome.setText("Mariane de Oliveira Duarte");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mariane de Oliveira.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420023")){
            jTxtNome.setText("Matheus Risalte Miranda");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Matheus.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420244")){
            jTxtNome.setText("Pedro Henrique Alves Leal");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pedro Henrique.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420198")){
            jTxtNome.setText("Pedro Guilherme Mota Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pedro Guilherme.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420180")){
            jTxtNome.setText("Raiana da Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Raiana Silva.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420279")){
            jTxtNome.setText("Raiane Balieiro Fernandes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Raiane Balieiro.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420139")){
            jTxtNome.setText("Samuel Ryan Faria Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Samuel Ryan.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420287")){
            jTxtNome.setText("Sarah Lopes Farineli");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sarah Lopes.jpg")));
        }else if(TelaLogin.matricula.equals("2021110310420117")){
            jTxtNome.setText("Sebasthyan Kaylan Batista Veras");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sebasthyan.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420066")){
            jTxtNome.setText("Thamara Dias Macedo");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thamara Dias.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420333")){
            jTxtNome.setText("Víctor Gustavo do Carmo Trabalon");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Víctor Gustavo.jpg")));
        }else if(TelaLogin.matricula.equals("2022110310420295")){
            jTxtNome.setText("Yasmin Lopes Arevalo");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Yasmim Lopes.jpg")));
        }else if(TelaLogin.matricula.equals("2081713")){
            jTxtNome.setText("Prof Me Cleber Alves Feitosa");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cleber.jpg")));
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLblFoto = new javax.swing.JLabel();
        jTxtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnGerarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtArea.setColumns(20);
        jTxtArea.setRows(5);
        jScrollPane1.setViewportView(jTxtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLblFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTxtMatricula.setEditable(false);
        jTxtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtMatriculaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Matricula: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome: ");

        jTxtNome.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("1º Ano de EMI Informática ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Atividade Avaliativa N1 - 4º Bimestre");

        jBtnGerarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/os.png"))); // NOI18N
        jBtnGerarLista.setMnemonic('g');
        jBtnGerarLista.setText("Gerar Lista");
        jBtnGerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGerarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtMatricula)
                            .addComponent(jTxtNome)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jBtnGerarLista)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jBtnGerarLista)))
                    .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMatriculaActionPerformed

    private void jBtnGerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGerarListaActionPerformed
       
        
        for (int i = 1; i <= 2; i++) {
           double doubleRandomNumber = Math.random() * 10;
            int randomNumber = (int)doubleRandomNumber;
            switch (randomNumber) {
                case 0:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nProblema \"diagonal_negativos\"\n" +
"Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N\n" +
"contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores\n" +
"negativos da matriz. \n\n");
                    
                    break;
                case 1:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nProblema \"soma_linhas\"\n" +
"Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz\n" +
"de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor\n" +
"seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.\n\n");
                    break;
                case 2:
                    jTxtArea.append("\nExecício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("Problema \"negativos_matriz\"\n" +
"Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme\n" +
"exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.\n\n");
                    break;
                case 3:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nProblema \"cada_linha\"\n" +
"Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento\n" +
"de cada linha. Suponha não haver empates.\n\n");
                    break;
                case 4:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nProblema \"soma_matrizes\"\n" +
"Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas\n" +
"cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma\n" +
"dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.\n\n");
                    break;
                case 5:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nProblema \"acima_diagonal\"\n" +
"Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N\n" +
"contendo números inteiros. Mostrar a soma dos elementos acima da\n" +
"diagonal principal. Um exemplo de números acima da diagonal\n" +
"principal é mostrado ao lado (no caso as células com fundo cinza).\n\n");
                    break;
                case 6:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nProblema \"matriz_geral\"\n" +
"Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as\n" +
"seguintes ações:\n" +
"a) calcular e imprimir a soma de todos os elementos positivos da matriz.\n" +
"b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.\n" +
"c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.\n" +
"d) imprimir os elementos da diagonal principal da matriz.\n" +
"e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir\n" +
"a matriz alterada.\n");
                    break;
                case 7:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nGere e imprima uma matriz M 4x4 com valores aleatórios entre 0-\n" +
"9. Após isso determine o maior número da matriz e a sua posição\n" +
"(linha, coluna).\n");
                    break;
                
                case 8:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nGere e imprima uma matriz M 10x10 com valores aleatórios entre\n" +
"0-9. Após isso indique qual é o maior e o menor valor da linha 5 e\n" +
"qual é o maior e o menor valor da coluna 7.\n");
                    break;
                
                case 9:
                    jTxtArea.append("Execício número " + (randomNumber+1)+ "\n");
                    jTxtArea.append("\nCapture do teclado valores para preenchimento de uma matriz M\n" +
"3x3. Após a captura imprima a matriz criada e encontre a\n" +
"quantidade de números pares, a quantidade de números ímpares.\n");
                    break;
                
            }
            jBtnGerarLista.setEnabled(false);
            //TelaInicial.jMnItmGerarAtividade.setEnabled(false);
        }
        
    }//GEN-LAST:event_jBtnGerarListaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAvaliação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAvaliação().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGerarLista;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLblFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtArea;
    public static javax.swing.JTextField jTxtMatricula;
    public static javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
