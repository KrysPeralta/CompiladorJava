package codigo;

//Paqueterias
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;


public class Frame extends javax.swing.JFrame {
    
    //Modelo de la tabla
    DefaultTableModel modelo;
    //Comprobacion de entrada de texto
    String vacio = "";

    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/analisis-lexico.png")));
        
        btnArchivo.setBackground(new Color(255,255,255));
        btnLimpiar.setBackground(new Color(255,255,255));
        
        tablaAnalisis.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaAnalisis.getTableHeader().setOpaque(false);
        tablaAnalisis.getTableHeader().setBackground(new Color(20, 108, 148));
        tablaAnalisis.getTableHeader().setForeground(new Color(51, 51, 51));
        tablaAnalisis.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAnalisis = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadena = new javax.swing.JTextArea();
        btnAnalizar = new javax.swing.JButton();
        btnArchivo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador léxico");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("framePrincipal"); // NOI18N
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        btnArchivo.setBackground(new java.awt.Color(204, 204, 204));
        btnArchivo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnArchivo.setText("ARCHIVO");
        btnArchivo.setToolTipText("Generar tokens, lexemas y patrones");
        btnArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btnArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setToolTipText("Limpiar campo de texto y tabla");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblTitulo2.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo2.setText("Análisis léxico:");

        lblTitulo1.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo1.setText("Ingrese la entrada a validar:");

        tablaAnalisis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Lexema", "Patrón"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAnalisis.setGridColor(new java.awt.Color(204, 204, 204));
        tablaAnalisis.setRowHeight(25);
        tablaAnalisis.setSelectionBackground(new java.awt.Color(204, 222, 218));
        tablaAnalisis.setSelectionForeground(new java.awt.Color(102, 0, 0));
        tablaAnalisis.setShowGrid(true);
        tablaAnalisis.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaAnalisis);
        if (tablaAnalisis.getColumnModel().getColumnCount() > 0) {
            tablaAnalisis.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaAnalisis.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        txtCadena.setColumns(20);
        txtCadena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCadena.setRows(5);
        txtCadena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        txtCadena.setSelectedTextColor(new java.awt.Color(51, 0, 0));
        txtCadena.setSelectionColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(txtCadena);

        btnAnalizar.setBackground(new java.awt.Color(204, 204, 204));
        btnAnalizar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAnalizar.setText("ANALIZAR");
        btnAnalizar.setToolTipText("Generar tokens, lexemas y patrones");
        btnAnalizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btnAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnArchivo1.setBackground(new java.awt.Color(204, 204, 204));
        btnArchivo1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnArchivo1.setText("GUARDAR");
        btnArchivo1.setToolTipText("Generar tokens, lexemas y patrones");
        btnArchivo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btnArchivo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArchivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTitulo2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(btnArchivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblTitulo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(lblTitulo2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int seleccion = fileChooser.showOpenDialog(this);
    
    if (seleccion == JFileChooser.APPROVE_OPTION) {
    // Obtener el archivo seleccionado
    java.io.File archivo = fileChooser.getSelectedFile();

    // Leer el contenido del archivo y mostrarlo en la caja de texto
    try {
        java.util.Scanner scanner = new java.util.Scanner(archivo);
        StringBuilder contenido = new StringBuilder();
        
        while (scanner.hasNextLine()) {
            contenido.append(scanner.nextLine()).append("\n");
        }
        
        scanner.close();
        
        txtCadena.setText(contenido.toString());
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        vaciarTabla(tablaAnalisis, modelo);
        txtCadena.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        if (txtCadena.getText().equals("")){
            //Ventana de aviso que informa que los campos no han sido rellenados
            JOptionPane.showMessageDialog(null,"No se ha ingresado una entrada", 
                    "ENTRADA VACIA", JOptionPane.ERROR_MESSAGE);
        } else {
            vaciarTabla(tablaAnalisis, modelo);
            analizar();
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnArchivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivo1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                // Obtener el archivo seleccionado
                File archivo = fileChooser.getSelectedFile();
                // Escribir el contenido de la caja de texto en el archivo
                FileWriter writer = new FileWriter(archivo);
                writer.write(txtCadena.getText());
                writer.close();
                // Mensaje de confirmación
                JOptionPane.showMessageDialog(this, "Archivo guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error al intentar guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnArchivo1ActionPerformed

    //Método para vaciar la tabla
    public void vaciarTabla(JTable tabla, DefaultTableModel modelo) {
        int filas = tabla.getRowCount(); //Obtener el número de filas
        
        if (filas != 0){
            try {
                for(int i = 0; i < filas; i++) { //Mientras existan filas
                    modelo.removeRow(0); //eliminarlas una por una hasta que no quede ninguna
                }
            } catch(Exception e3) {
                System.out.println(e3);
            }
        }
    }
    
    //Método para realizar el analisis lexico
    public void analizar(){
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtCadena.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            
            //Componentes para la tabla
            String componente;
            String lexema = "";
            String patron = "";
            
            //Objeto para los datos
            Object[] arreglo = new Object[3];
            //Modelo de la tabla
            modelo = (DefaultTableModel) tablaAnalisis.getModel();
            
            while (true) {
                Tokens tokens = lexer.yylex();
                
                if (tokens == null) {
                    vacio = "";
                    return;
                }
                
                switch (tokens) {
                    case ERROR:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = "ERROR: Simbolo no definido";
                        break;
                    case Entero:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = "[0-9]?[0-9]+";
                        break;
                    case Decimal:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = "[0-9]+(.[0-9]+)";
                        break;
                    case Texto:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = "\" [^\"] \"";
                        break;
                    case Booleano:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Variable: 
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = "[a-zA-Z]+[a-zA-Z]+[0-9]+";
                        break;
                    case Reservadas: 
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Operador:
                        lexema = lexer.lexeme;
                        patron = "+ | - | / | * | ^";
                        if(lexema.equals("+")){
                            componente = tokens.toString() + " suma";
                        } else if(lexema.equals("-")){
                            componente = tokens.toString() + " resta";
                        } else if(lexema.equals("/")){
                            componente = tokens.toString() + " division";
                        } else if(lexema.equals("*")){
                            componente = tokens.toString() + " multiplicacion";
                        } else {
                            componente = tokens.toString() + " potencia";
                        }
                        break;
                    case Incremento:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Decremento:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Inversion:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Asignacion:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Combinado:
                        lexema = lexer.lexeme;
                        patron = "+| | -| | /| | *| | ^|";
                        if(lexema.equals("+|")){
                            componente = "Suma " + tokens.toString();
                        } else if(lexema.equals("-|")){
                            componente = "Resta " + tokens.toString();
                        } else if(lexema.equals("/|")){
                            componente = "Division " + tokens.toString();
                        } else if(lexema.equals("*|")){
                            componente = "Multiplicacion " + tokens.toString();
                        } else {
                            componente = "Potencia " + tokens.toString();
                        }
                        break;
                    case Relacional:
                        lexema = lexer.lexeme;
                        patron = ">  |  <  |  ==  |  <=  |  >=  |  !=";
                        if(lexema.equals(">")){
                            componente = tokens.toString() + " mayor que";
                        } else if(lexema.equals("<")){
                            componente = tokens.toString() + " menor que";
                        } else if(lexema.equals("==")){
                            componente = tokens.toString() + " igual a";
                        } else if(lexema.equals("<=")){
                            componente = tokens.toString() + " menor o igual que";
                        } else if(lexema.equals(">=")){
                            componente = tokens.toString() + " mayor o igual que";
                        } else if(lexema.equals("!=")){
                            componente = tokens.toString() + " no igual a";
                        } else {
                            componente = tokens.toString();
                        }
                        break;
                    case Logico:
                        lexema = lexer.lexeme;
                        patron = "&&  |  ||  |  &  |  |";
                        if(lexema.equals("&&")){
                            componente = tokens.toString() + " AND";
                        } else if(lexema.equals("||")){
                            componente = tokens.toString() + " OR";
                        } else if(lexema.equals("&")){
                            componente = tokens.toString() + " AND Binario";
                        } else {
                            componente = tokens.toString() + " OR Binario";
                        }
                        break;
                    case Concatenacion:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
                    case Delimitador:
                        lexema = lexer.lexeme;
                        patron = "(  |  )  |  {  |  }  |  [  |  ]";
                        if(lexema.equals("(")){
                            componente = tokens.toString() + " abrir parentesis";
                        } else if(lexema.equals(")")){
                            componente = tokens.toString() + " cerrar parentesis";
                        } else if(lexema.equals("{")){
                            componente = tokens.toString() + " abrir llave";
                        } else if(lexema.equals("}")){
                            componente = tokens.toString() + " cerrar llave";
                        } else if(lexema.equals("[")){
                            componente = tokens.toString() + " abrir corchete";
                        } else {
                            componente = tokens.toString() + " cerrar corchete";
                        }
                        break;
                    case Arreglo:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = lexer.lexeme;
                        break;
//                    case Signo:
//                        lexema = lexer.lexeme;
//                        patron = "'  |  ; |  .  |  ,  |  ?  |  ¿  |  !  |  ¡  |  #  |  $  |  -  |  _";
//                        if(lexema.equals("'")){
//                            componente = tokens.toString() + " comilla";
//                        } else if(lexema.equals(";")){
//                            componente = tokens.toString() + " punto y coma";
//                        } else if(lexema.equals(".")){
//                            componente = tokens.toString() + " punto";
//                        } else if(lexema.equals(",")){
//                            componente = tokens.toString() + " coma";
//                        } else if(lexema.equals("?")){
//                            componente = tokens.toString() + " cerrar interrogacion";
//                        } else if(lexema.equals("¿")){
//                            componente = tokens.toString() + " abrir interrogacion";
//                        } else if(lexema.equals("!")){
//                            componente = tokens.toString() + " cerrar exclamacion";
//                        } else if(lexema.equals("¡")){
//                            componente = tokens.toString() + " abrir exclamacion";
//                        } else if(lexema.equals("#")){
//                            componente = tokens.toString() + " numeral";
//                        } else if(lexema.equals("$")){
//                            componente = tokens.toString() + " peso";
//                        } else if(lexema.equals("-")){
//                            componente = tokens.toString() + " guion";
//                        } else {
//                            componente = tokens.toString() + " guion bajo";
//                        }
//                        break;
                    default:
                        lexema = lexer.lexeme;
                        componente = tokens.toString();
                        patron = "No definido";
                        break;
                }
                
                //Llenado del arreglo
                arreglo [0] = lexema;
                arreglo [1] = componente;
                arreglo [2] = patron;
                
                //Añadir al modelo de la tabla
                modelo.addRow(arreglo);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Cambiar el modelo de la tabla
        tablaAnalisis.setModel(modelo);
    }
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnArchivo1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaAnalisis;
    private javax.swing.JTextArea txtCadena;
    // End of variables declaration//GEN-END:variables
}
