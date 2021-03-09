
public class Tabuleiro extends javax.swing.JFrame {
    
    public boolean Jogador_1 = true;
    public boolean Jogador_2 = true;
    public int posicao = 0;
    public int j = 0, i = 0;
    int op = 0;
    
    public String linha_1, linha_2, linha_3, coluna_1, coluna_2, coluna_3, diagonal_1, diagonal_2;
    
    String [][] tabuleiro = new String [3][3];
    

        public Tabuleiro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnRepeat = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnRepeat.setText("Jogar Novamente");
        btnRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepeatActionPerformed(evt);
            }
        });

        txtVisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnRepeat)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtVisor)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void checarVez(){
        
        if(Jogador_1 && Jogador_2){
            this.op = 1;
            Jogador_1 = false;
            Jogador_2 = true;
            txtVisor.setText("Sua vez Jogador 2 ");
        }else if(Jogador_1 && Jogador_2 == false){
            this.op = 1;
            Jogador_1 = false;
            Jogador_2 = true;
            txtVisor.setText("Sua vez Jogador 2");
        }else{
            this.op = 2;
            Jogador_1 = true;
            Jogador_2 = false;
            txtVisor.setText("Sua vez Jogador 1");
        }
        
    }
    
    public void limpaTabuleiro(){
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                tabuleiro [i][j] = " ";
            }
        }
    }
    
    public void bloqueioTabuleiro(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    
    public void verificaTabuleiro(){
        
        posicao = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                
                if(tabuleiro[i][j] == "X" || tabuleiro[i][j] == "O"){
                    
                    posicao += 1;
                }
                
            }
        }
    }
    
    public void ganhou(){
        linha_1 = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
        linha_2 = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
        linha_3 = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];
        coluna_1 = tabuleiro[0][0] + tabuleiro[1][0] + tabuleiro[2][0];
        coluna_2 = tabuleiro[0][1] + tabuleiro[1][1] + tabuleiro[2][1];
        coluna_3 = tabuleiro[0][2] + tabuleiro[1][2] + tabuleiro[2][2];
        diagonal_1 = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
        diagonal_2 = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];
        
        if(linha_1.equals("XXX")||linha_2.equals("XXX")||linha_3.equals("XXX")||
                coluna_1.equals("XXX")||coluna_2.equals("XXX")||coluna_3.equals("XXX")||
                diagonal_1.equals("XXX")||diagonal_2.equals("XXX")){
            
            txtVisor.setText("JOGADOR 1 Venceu!");
            bloqueioTabuleiro();
        }else if(linha_1.equals("OOO")||linha_2.equals("OOO")||linha_3.equals("OOO")||
                coluna_1.equals("OOO")||coluna_2.equals("OOO")||coluna_3.equals("OOO")||
                diagonal_1.equals("OOO")||diagonal_2.equals("OOO")){
            
            txtVisor.setText("JOGADOR 2 Venceu!");
            bloqueioTabuleiro();
        }else if(posicao == 9){
            
            txtVisor.setText("JOGO Empatado!");
            bloqueioTabuleiro();
        }
    }
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        checarVez();
        if(op == 1){
            btn1.setText(" X ");
            tabuleiro[0][0] = "X";
        }else{
            btn1.setText("O");
            tabuleiro[0][0] = "O";
        }    
        btn1.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        checarVez();
        if(op == 1){
            btn2.setText(" X ");
            tabuleiro[0][1] = "X";
        }else{
            btn2.setText(" O ");
            tabuleiro[0][1] = "O";
        }
        btn2.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        
        checarVez();
        if(op == 1){
            btn3.setText(" X ");
            tabuleiro[0][2] = "X";
        }else{
            btn3.setText(" O ");
            tabuleiro[0][2] = "O";
        }    
        btn3.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        
        checarVez();
        if(op == 1){
            btn4.setText(" X ");
            tabuleiro[1][0] = "X";
        }else{
            btn4.setText(" O ");
            tabuleiro[1][0] = "O";
        }    
        btn4.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        
        checarVez();
        if(op == 1){
            btn5.setText(" X ");
            tabuleiro[1][1] = "X";
        }else{
            btn5.setText(" O ");
            tabuleiro[1][1] = "O";
        }    
        btn5.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        
        checarVez();
        if(op == 1){
            btn6.setText(" X ");
            tabuleiro[1][2] = "X";
        }else{
            btn6.setText(" O ");
            tabuleiro[1][2] = "O";
        }    
        btn6.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
        checarVez();
        if(op == 1){
            btn7.setText(" X ");
            tabuleiro[2][0] = "X";
        }else{
            btn7.setText(" O ");
            tabuleiro[2][0] = "O";
        }    
        btn7.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        
        checarVez();
        if(op == 1){
            btn8.setText(" X ");
            tabuleiro[2][1] = "X";
        }else{
            btn8.setText(" O ");
            tabuleiro[2][1] = "O";
        }
        btn8.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        
        checarVez();
        if(op == 1){
            btn9.setText(" X ");
            tabuleiro[2][2] = "X";
        }else{
            btn9.setText(" O ");
            tabuleiro[2][2] = "O";
        }    
        btn9.setEnabled(false);
        verificaTabuleiro();
        ganhou();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepeatActionPerformed
        btn1.setText(" ");
        btn1.setEnabled(true);
        btn2.setText(" ");
        btn2.setEnabled(true);
        btn3.setText(" ");
        btn3.setEnabled(true);
        btn4.setText(" ");
        btn4.setEnabled(true);
        btn5.setText(" ");
        btn5.setEnabled(true);
        btn6.setText(" ");
        btn6.setEnabled(true);
        btn7.setText(" ");
        btn7.setEnabled(true);
        btn8.setText(" ");
        btn8.setEnabled(true);
        btn9.setText(" ");
        btn9.setEnabled(true);
        Jogador_1 = true;
        Jogador_2 = true;
        txtVisor.setText(" ");
        limpaTabuleiro();
        
    }//GEN-LAST:event_btnRepeatActionPerformed

        public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnRepeat;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
