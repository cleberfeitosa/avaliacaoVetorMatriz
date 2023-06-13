/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author clebe
 */
public class TelaGeraAvalicao extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaGeraAvalicao
     */
    public TelaGeraAvalicao() {
        initComponents();

        jTxtMatricula.setText(TelaLogin.matricula);
        if (TelaLogin.matricula.equals("2081713")) {
            jTxtNome.setText("Prof Me Cleber Alves Feitosa");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/Cleber.jpg")));
        } else if (TelaLogin.matricula.equals("202011042040128")) {
            jTxtNome.setText("Giovani Madalosso Bassini");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202011042040063")) {
            jTxtNome.setText("Pedro Augusto Campos Ribeiro");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202111042040272")) {
            jTxtNome.setText("Fernando Herinque dos Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/Fernando.jpg")));
        } else if (TelaLogin.matricula.equals("202311042040016")) {
            jTxtNome.setText("Antonio Kennedy de Oliveira Moraes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/Antonio.jpg")));
        } else if (TelaLogin.matricula.equals("202311042040020")) {
            jTxtNome.setText("Camila Kele de Araújo");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040021")) {
            jTxtNome.setText("Carla Eduarda da Silva Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040003")) {
            jTxtNome.setText("Cleide Teodora de Souza");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040007")) {
            jTxtNome.setText("David Lopes Caetano");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040006")) {
            jTxtNome.setText("David Lopes dos Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040018")) {
            jTxtNome.setText("Edinei Dias Coimbra");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040005")) {
            jTxtNome.setText("Eduardo Guilherme Goveia");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040017")) {
            jTxtNome.setText("Fábio Rodrigo Lima dos Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040002")) {
            jTxtNome.setText("Felipe Carlos da Silva");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040001")) {
            jTxtNome.setText("Hygor Garcia Pinheiro");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040022")) {
            jTxtNome.setText("Jackson Guilherme Silva Juremeira");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040019")) {
            jTxtNome.setText("Jeferson Fernandes dos Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040009")) {
            jTxtNome.setText("Júlio César Mangia Fukui");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040013")) {
            jTxtNome.setText("Keven Jordão Carvalho Goulart");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040026")) {
            jTxtNome.setText("LUCAS HENRIQUE ALVES DE SOUZA FERREIRA");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040023")) {
            jTxtNome.setText("NATÃ KIMBERLY DE ALMEIDA");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/Natã.jpg")));
        } else if (TelaLogin.matricula.equals("202311042040011")) {
            jTxtNome.setText("Pabllo Guilherme Candido Goltz");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040024")) {
            jTxtNome.setText("Pedro Henrique Alves dos Santos");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040004")) {
            jTxtNome.setText("PEDRO HENRIQUE DE ANDRADE BARBOZA");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040012")) {
            jTxtNome.setText("Pedro Henrique de Oliveira Magalhaes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040025")) {
            jTxtNome.setText("Pedro Lucas Juliano Alves Martins");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040014")) {
            jTxtNome.setText("Rayssa Eduarda Rodrigues Matias");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040010")) {
            jTxtNome.setText("Rodrigo Augusto Oliveira Kunz");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040015")) {
            jTxtNome.setText("Socrates da Silva Marques");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));
        } else if (TelaLogin.matricula.equals("202311042040008")) {
            jTxtNome.setText("Victor Hugo Santos de Moraes");
            jLblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tads20231/f1.png")));

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLblFoto = new javax.swing.JLabel();
        jTxtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnGerarLista = new javax.swing.JButton();
        jRBtnVetor = new javax.swing.JRadioButton();
        jRbtnMatriz = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtArea = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

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
        jLabel4.setText("TADS 2023 - 1º Semestre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Atividade Avaliativa N2 - 1º Semestre");

        jBtnGerarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/os.png"))); // NOI18N
        jBtnGerarLista.setMnemonic('g');
        jBtnGerarLista.setText("Gerar Lista");
        jBtnGerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGerarListaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRBtnVetor);
        jRBtnVetor.setText("Vetores (4 Exercícios)");

        buttonGroup1.add(jRbtnMatriz);
        jRbtnMatriz.setText("Matriz (2 Exercícios)");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(179, 179, 179)))
                        .addComponent(jBtnGerarLista))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRBtnVetor)
                        .addGap(214, 214, 214)
                        .addComponent(jRbtnMatriz)
                        .addGap(132, 132, 132)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(jBtnGerarLista))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRbtnMatriz)
                            .addComponent(jRBtnVetor))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTxtArea.setColumns(20);
        jTxtArea.setRows(5);
        jScrollPane1.setViewportView(jTxtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtMatriculaActionPerformed

    private void jBtnGerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGerarListaActionPerformed
       
        JOptionPane.showMessageDialog(null, "Após você clicar em 'OK', será gerado a lista de exercícios com 2 exercícios que deverá ser desenvolvida por você.\n Após terminar chame o professor e explique seu raciocínio!\nObservação não feche a tela do gerador de Exercícios, o professor precisa verificar quais foram os exercícios gerados.\n\n Boa prova!\n\nProf Me Cleber Feitosa. ");
        int opc = 0;

        if (jRBtnVetor.isSelected()) {
            opc = 4;
            int vet[] = new int[opc];
            int n = 0;
            for (int i = 0; i < opc; i++) {
                Random rd = new Random();
                n = rd.nextInt(1, 11);
                vet[i] = n;
                /*if(vet[n] == randomNumber){
                    vet[n+1]= randomNumber+1;
                    n++;
                }*/

                switch (vet[i]) {
                    case 1:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos\n"
                                + "juntamente com o maior, o menor e a media dos valores.");

                        break;
                    case 2:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("Fazer um programa para ler 5 valores e, em seguida, mostrar a posic¸ao onde se encontram o maior e o menor valor.");
                        break;
                    case 3:
                        jTxtArea.append("\nExecício número " + vet[i] + "\n");
                        jTxtArea.append("\nFac¸a um programa que leia um vetor de 10 posicoes e verifique se existem valores iguais e os escreva na tela.\n");
                        break;

                    case 4:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nLeia um vetor com 20 numeros inteiros. Escreva os elementos do vetor eliminando elementos repetidos.\n");
                        break;
                    case 5:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaca um programa que leia um vetor de 5 posicoes para n números reais e, depois, um ´\n"
                                + "codigo inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem ´\n"
                                + "direta; se for 2, mostre o vetor na ordem inversa. Caso, o codigo for diferente de 1 e 2 ´\n"
                                + "escreva uma mensagem informando que o codigo ´ e inválido. ´\n");
                        break;
                    case 6:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nLeia um vetor de 10 posicões e atribua valor 0 para todos os elementos que possuírem valores negativos.\n"
                                + "18. ");
                        break;
                    case 7:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nEscreva um programa que leia numeros inteiros no intervalo [0,50] e os armazene em um vetor com 10 posicões. Preencha um segundo vetor apenas com os numeros ımpares do primeiro vetor. Imprima os dois vetores, 2 elementos por linha.\n\n");
                        break;
                    case 8:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFac¸a um programa que receba do usuario dois vetores, ´ A e B, com 10 numeros inteiros cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados do vetor C.\n\n");
                        break;

                    case 9:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaça um programa que leia dois vetores de 10 posicões e calcule outro vetor contendo, nas posicões pares os valores do primeiro e nas posicões impares os valores do segundo.\n\n");
                        break;

                    case 10:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaça um programa para ler 10 numeros DIFERENTES a serem armazenados em um ´\n"
                                + "vetor. Os dados deverao ser armazenados no vetor na ordem que forem sendo lidos, ˜\n"
                                + "sendo que caso o usuario digite um n ´ umero que já a foi digitado anteriormente, o programa ´\n"
                                + "devera pedir para ele digitar outro número. Note que cada valor digitado pelo usuário ´\n"
                                + "deve ser pesquisado no vetor, verificando se ele existe entre os numeros que já a foram ´\n"
                                + "fornecidos. Exibir na tela o vetor final que foi digitado.\n\n");
                        break;

                }
            }
           // n++;
        } else if (jRbtnMatriz.isSelected()) {
            opc = 2;
            int vet[] = new int[opc];
            int n = 0;
            for (int i = 0; i < opc; i++) {
                Random rd = new Random();
                n = rd.nextInt(5, 11);
                vet[i] = n;
                //if (vet[n] == randomNumber) {
                //    vet[n + 1] = randomNumber + 1;
                //    n++;
                //}

                switch (vet[i]) {
                    case 1:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nLeia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.\n\n");

                        break;
                    case 2:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\n Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais\n" +
"elementos. Escreva ao final a matriz obtida.\n\n");
                        break;
                    case 3:
                        jTxtArea.append("\nExecício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da\n" +
"coluna de cada elemento. Em seguida, imprima na tela a matriz.\n\n");
                        break;

                    case 4:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\n Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna) do maior valor..\n\n");
                        break;
                    case 5:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nLeia uma matriz 5 x 5. Leia tambem um valor ´ X. O programa devera fazer uma busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “nao encontrado."+"\n\n");
                        break;
                    case 6:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\n Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição ˜das matrizes lidas.\n\n");
                        break;
                    case 7:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaçaa um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de ´\n" +
"bingo. Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes dados ´\n" +
"de modo a nao ter números repetidos dentro das cartelas. O programa deve exibir na ´\n" +
"tela a cartela gerada..\n\n");
                        break;
                    case 8:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nLeia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva\n" +
"o numero de alunos cuja pior nota foi na prova 1, o número de alunos cuja pior nota foi ´\n" +
"na prova 2, e o numero de alunos cuja pior nota foi na prova 3. Em caso de empate ´\n" +
"das piores notas de um aluno, o criterio de desempate ´ e arbitrário, mas o aluno deve ser ´\n" +
"contabilizado apenas uma vez.\n\n");
                        break;

                    case 9:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes\n" +
"informações sobre alunos de uma disciplina, sendo todas as informações do tipo inteiro: ˜\n" +
"• Primeira coluna: numero de matrícula (use um inteiro)\n" +
"• Segunda coluna: media das provas ´\n" +
"• Terceira coluna: media dos trabalhos ´\n" +
"• Quarta coluna: nota final\n" +
"Elabore um programa que:\n" +
"5\n" +
"(a) Leia as tres primeiras informações de cada aluno ˜\n" +
"(b) Calcule a nota final como sendo a soma da media das provas e da média dos ´\n" +
"trabalhos\n" +
"(c) Imprima a matrícula do aluno que obteve a maior nota final (assuma que só existe ´\n" +
"uma maior nota)\n" +
"(d) Imprima a media aritmética das notas finais\n\n");
                        break;

                    case 10:
                        jTxtArea.append("Execício número " + vet[i] + "\n");
                        jTxtArea.append("\nFaça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuario ´\n" +
"um menu de opções: ˜\n" +
"(a) somar as duas matrizes\n" +
"(b) subtrair a primeira matriz da segunda\n" +
"(c) adicionar uma constante as duas matrizes `\n" +
"(d) imprimir as matrizes\n" +
"Nas duas primeiras opções uma terceira matriz 3 x 3 deve ser criada. Na terceira opção˜\n" +
"o valor da constante deve ser lido e o resultado da adição da constante deve ser arma- ˜\n" +
"zenado na propria matriz..\n\n");
                        break;

                }
            }
            // n++;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma opção de lista de exercícios!!! E boa prova!!!\n Ah! Não se esqueça de continuar torcendo pelo VASCÃO!!!");
        }

        //jBtnGerarLista.setEnabled(false);
        // TelaInicial.jMnItmGerarAtividade.setEnabled(false);
jBtnGerarLista.setEnabled(false);
    }//GEN-LAST:event_jBtnGerarListaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnGerarLista;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLblFoto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBtnVetor;
    private javax.swing.JRadioButton jRbtnMatriz;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtArea;
    public static javax.swing.JTextField jTxtMatricula;
    public static javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
