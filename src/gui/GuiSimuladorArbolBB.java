
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import mundo.SimuladorArbolBinario;

/**
 *
 * @author User
 */
public class GuiSimuladorArbolBB extends javax.swing.JFrame {
    
    private SimuladorArbolBinario simulador=new SimuladorArbolBinario();
    private Ventana ventana=new Ventana();
    private JFrame dibujoEmergente = new JFrame("Representación gráfica");

    
    public GuiSimuladorArbolBB() {
        initComponents();
        this.colocarMensajeBienvenida();
        this.inicializar(false);
        this.dibujoEmergente.setVisible(false);
    }
    
      

    private void colocarMensajeBienvenida()
    {
    String msg="Esta es la ventana de resultados\n\n\n";
        msg+="Sin mucho que decir, las busquedas se verán aquí XD";
        
        
        
        this.impresion.setText(msg);
        this.impresion.setEditable(false);
    }
    
    private void inicializar(boolean enable) {
        this.cmdRecorrer.setEnabled(enable);
        this.opciones.setEnabled(enable);
        this.cmdDarHojas.setEnabled(enable);
        this.cmdBuscar.setEnabled(enable);
        this.cmdBuscarPadre.setEnabled(enable);
        this.botonBorrar.setEnabled(enable);
        this.botonPodar.setEnabled(enable);
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        botonInsertar = new javax.swing.JButton();
        cmdRecorrer = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox();
        cmdDarHojas = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdBuscarPadre = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonPodar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arboles Binarios");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de Pruebas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setRows(5);
        jScrollPane1.setViewportView(impresion);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        botonInsertar.setBackground(new java.awt.Color(255, 255, 255));
        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        cmdRecorrer.setBackground(new java.awt.Color(255, 255, 255));
        cmdRecorrer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdRecorrer.setText("Recorrer");
        cmdRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRecorrerActionPerformed(evt);
            }
        });

        opciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        opciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "InOrden", "PreOrden", "PosOrden", "PorNiveles" }));

        cmdDarHojas.setBackground(new java.awt.Color(255, 255, 255));
        cmdDarHojas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDarHojas.setText("Mostrar Hijos");
        cmdDarHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDarHojasActionPerformed(evt);
            }
        });

        cmdBuscar.setBackground(new java.awt.Color(255, 255, 255));
        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        cmdBuscarPadre.setBackground(new java.awt.Color(255, 255, 255));
        cmdBuscarPadre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBuscarPadre.setText("BuscarPadre");
        cmdBuscarPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarPadreActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonPodar.setBackground(new java.awt.Color(255, 255, 255));
        botonPodar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonPodar.setText("Eliminar Hijos");
        botonPodar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPodarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRecorrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdDarHojas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBuscarPadre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPodar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(cmdRecorrer)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDarHojas)
                    .addComponent(cmdBuscar)
                    .addComponent(cmdBuscarPadre)
                    .addComponent(botonBorrar)
                    .addComponent(botonPodar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(0, 0, 560, 340);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setText("INTEGRANTES DEL GRUPO");

        jLabel2.setText("Jorge Noguera");

        jLabel3.setText("Hessler Villela");

        jLabel4.setText("Kevin Ramos");

        jLabel5.setText("Carlos Martinez");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRecorrerActionPerformed
        Object opcion=this.opciones.getSelectedItem();
        String recorrido=null;
        if(opcion.equals("InOrden"))
        recorrido=this.simulador.inOrden();
        if(opcion.equals("PreOrden"))
        recorrido=this.simulador.preOrden();
        if(opcion.equals("PosOrden"))
        recorrido=this.simulador.posOrden();
        if(opcion.equals("PorNiveles"))
        recorrido=this.simulador.imprimirPorNiveles();
        this.impresion.setText("");
        this.impresion.setText(recorrido);

    }//GEN-LAST:event_cmdRecorrerActionPerformed

    private void cmdDarHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDarHojasActionPerformed
        String salida=this.simulador.darHojas();
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdDarHojasActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        int dato_a_buscar=ventana.leerInt("Ingrese numero a buscar en el arbol:");
        String salida=this.simulador.esta(dato_a_buscar);
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdBuscarPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarPadreActionPerformed
        int dato_a_buscar=ventana.leerInt("Ingrese numero para buscar Padre: ");
        String salida=this.simulador.darPadre(dato_a_buscar);
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdBuscarPadreActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        this.dibujoEmergente.hide();
        int dato=ventana.leerInt("Ingrese numero para insertar:");        
        if(this.simulador.insertar(dato))
        {            
            ventana.imprimir("El numero fue agregado en el arbol","Correcto");
            this.inicializar(true);
            this.repintarArbol();                   
        }
        else
        ventana.imprimirError("No se pudo ingresar el numero", "Error");        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int dato=ventana.leerInt("Digite numero a borrar: ");
        this.impresion.setText(this.simulador.borrar(dato));
        this.repintarArbol();
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonPodarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPodarActionPerformed
        this.impresion.setText("Los hijos del árbol fueron eliminados");
        this.simulador.podarArbol();
        this.repintarArbol();
    }//GEN-LAST:event_botonPodarActionPerformed

    private void incializaVentanaEmergente() {
            this.dibujoEmergente = new JFrame("Representación gráfica");
            this.dibujoEmergente.hide();
            this.dibujoEmergente.setBounds(new Rectangle(500, 500));
            this.dibujoEmergente.setLocationRelativeTo(null);
    }
    private void repintarArbol() {
            this.jDesktopPane1.removeAll();       
                Rectangle tamaño = this.jInternalFrame2.getBounds();
                this.jInternalFrame2=null;
                this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
                this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
                this.jInternalFrame2.setVisible(true);
                this.jInternalFrame2.setBounds(tamaño);
                this.jInternalFrame2.setEnabled(false);                                           
                this.jInternalFrame2.add( this.simulador.getDibujo(), BorderLayout.CENTER);
                this.incializaVentanaEmergente();
                this.dibujoEmergente.getContentPane().add(this.simulador.getDibujo());    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiSimuladorArbolBB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSimuladorArbolBB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSimuladorArbolBB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSimuladorArbolBB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSimuladorArbolBB().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonPodar;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdBuscarPadre;
    private javax.swing.JButton cmdDarHojas;
    private javax.swing.JButton cmdRecorrer;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox opciones;
    // End of variables declaration//GEN-END:variables
}
