/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto1progra3.CapaPresentacion;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import proyecto1progra3.CapaDatos.ConexionBD;
import proyecto1progra3.CapaLógica.*;

/**
 *
 * @author emanu
 */
public class Gestion<Statement> extends javax.swing.JDialog {
    StLog es = new StLog();

    /**
     * Creates new form Gestion
     */
    public Gestion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        QuitarLabelfondo(jPanelEstudiantes, false);
        QuitarFields();
    }
      public void mostrar(String tabla){
          String sql = "Select * from" + jTableProfesor;
          java.sql.Statement st;
           ConexionBD con = new ConexionBD ();
           Connection ConexionBD = con.getConn();
           DefaultTableModel model =new DefaultTableModel();
           model.addColumn("Nombre");
            model.addColumn("Cedula");
             model.addColumn("Apellido1");
              model.addColumn("Apellido2");
               model.addColumn("Edad");
                model.addColumn("Profesion");
                 model.addColumn("UniDeEgresion");
          model.addColumn("Clases impartidas");
          model.addColumn("Años de experiencia");
          model.addColumn("Idiomas");
          model.addColumn("Numero");
          model.addColumn("Correo");
          model.addColumn("Username");
          
          jTableProfesor.setModel(model);
          String [] datos = new String[13];
          try{
              st =  ConexionBD.createStatement();
              ResultSet rs = st.executeQuery(sql);
              
              while(rs.next())
                  datos[0]= rs.getString(0);
                  datos[0]= rs.getString(1);
                  datos[0]= rs.getString(2);
                  datos[0]= rs.getString(3);
                  datos[0]= rs.getString(4);
                  datos[0]= rs.getString(5);
                  datos[0]= rs.getString(6);    
                  datos[0]= rs.getString(7);
                  datos[0]= rs.getString(8);
                  datos[0]= rs.getString(9);
                  datos[0]= rs.getString(10);
                  datos[0]= rs.getString(11);
                  datos[0]= rs.getString(12);
                  datos[0]= rs.getString(13);
                  datos[0]= rs.getString(14);
                 model.addRow(datos);
                 
          }  catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Error" + e.toString() );}     
      }
       public void mostrar1(String tabla){
          String sql = "Select * from" + jTableProfesor;
          java.sql.Statement st;
           ConexionBD con = new ConexionBD ();
           Connection ConexionBD = con.getConn();
           DefaultTableModel model =new DefaultTableModel();
           model.addColumn("Nombre");
            model.addColumn("Cedula");
             model.addColumn("Apellido1");
              model.addColumn("Apellido2");
               model.addColumn("Edad");
                model.addColumn("Profesion");
                 model.addColumn("UniDeEgresion");
          model.addColumn("Clases impartidas");
          model.addColumn("Años de experiencia");
          model.addColumn("Idiomas");
          model.addColumn("Numero");
          model.addColumn("Correo");
          model.addColumn("Username");
          
          jTableProfesor.setModel(model);
          String [] datos = new String[13];
          try{
              st = ConexionBD.createStatement();
              ResultSet rs = st.executeQuery(sql);
              
              while(rs.next())
                  datos[0]= rs.getString(0);
                  datos[0]= rs.getString(1);
                  datos[0]= rs.getString(2);
                  datos[0]= rs.getString(3);
                  datos[0]= rs.getString(4);
                  datos[0]= rs.getString(5);
                  datos[0]= rs.getString(6);    
                  datos[0]= rs.getString(7);
                  datos[0]= rs.getString(8);
                  datos[0]= rs.getString(9);
                  datos[0]= rs.getString(10);
                  datos[0]= rs.getString(11);
                  datos[0]= rs.getString(12);
                  datos[0]= rs.getString(13);
                  datos[0]= rs.getString(14);
                 model.addRow(datos);
                 
          }  catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Error" + e.toString() );}     
      }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelGestor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanelProfesores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelEdicion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProfesor = new javax.swing.JTable();
        jPanelEstudiantes = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEstudiantes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableestudiantes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Quicksand", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que tabla desea ver?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona lo que queres ver", "Profesores", "Alumnos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGestorLayout = new javax.swing.GroupLayout(jPanelGestor);
        jPanelGestor.setLayout(jPanelGestorLayout);
        jPanelGestorLayout.setHorizontalGroup(
            jPanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGestorLayout.setVerticalGroup(
            jPanelGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelGestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 0, 211, -1));

        jPanelProfesores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tabla para ver profesores");
        jPanelProfesores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 645, 35));

        jPanelEdicion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Menu para editar profesores");
        jPanelEdicion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 33, -1, -1));

        jLabel4.setText("Profesion");
        jPanelEdicion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 73, -1, -1));

        jLabel5.setText("U de egresión");
        jPanelEdicion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 113, -1, -1));

        jLabel6.setText("Clases impartidas");
        jPanelEdicion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabel7.setText("Años de experiencia");
        jPanelEdicion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jButton2.setText("Eliminar");
        jPanelEdicion.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 433, -1, -1));

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelEdicion.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanelEdicion.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 73, 130, -1));

        jTextField2.setText("jTextField2");
        jPanelEdicion.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 110, 120, -1));

        jTextField3.setText("jTextField3");
        jPanelEdicion.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 163, 110, -1));

        jTextField4.setText("jTextField4");
        jPanelEdicion.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 203, 90, -1));

        jButton1.setText("Intercambiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelEdicion.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 461, -1, -1));

        jTextField8.setText("jTextField8");
        jPanelEdicion.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        jLabel11.setText("UserName");
        jPanelEdicion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, -1, -1));

        jTextField7.setText("jTextField7");
        jPanelEdicion.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jLabel10.setText("Correo");
        jPanelEdicion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 170, -1, -1));

        jLabel9.setText("Numero");
        jPanelEdicion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, -1, -1));

        jTextField6.setText("jTextField6");
        jPanelEdicion.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, -1, -1));

        jTextField5.setText("jTextField5");
        jPanelEdicion.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, -1, -1));

        jLabel8.setText("Idiomas");
        jPanelEdicion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, -1, -1));

        jLabel26.setText("Idiomas");
        jPanelEdicion.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jLabel27.setText("Numero");
        jPanelEdicion.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabel28.setText("Correo");
        jPanelEdicion.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jLabel29.setText("Username");
        jPanelEdicion.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jTextField21.setText("jTextField21");
        jPanelEdicion.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 240, 160, -1));

        jTextField22.setText("jTextField22");
        jPanelEdicion.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 150, -1));

        jTextField23.setText("jTextField23");
        jPanelEdicion.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 160, -1));

        jTextField24.setText("jTextField24");
        jPanelEdicion.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, -1));

        jPanelProfesores.add(jPanelEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 220, 500));

        jLabel30.setText("Nombre:");
        jPanelProfesores.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jTextField25.setText("jTextField25");
        jPanelProfesores.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 110, -1));

        jLabel31.setText("Cedula");
        jPanelProfesores.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jTextField26.setText("jTextField26");
        jPanelProfesores.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 100, -1));

        jLabel32.setText("Carne");
        jPanelProfesores.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 80, -1));

        jTextField27.setText("jTextField27");
        jPanelProfesores.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 120, -1));

        jLabel33.setText("Primer Apellido");
        jPanelProfesores.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jTextField28.setText("jTextField28");
        jPanelProfesores.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 140, -1));

        jLabel34.setText("Segundo Apellido");
        jPanelProfesores.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jTextField29.setText("jTextField29");
        jPanelProfesores.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 140, -1));

        jLabel35.setText("Edad:");
        jPanelProfesores.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 80, -1));

        jTextField30.setText("jTextField30");
        jPanelProfesores.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 110, -1));

        jTableProfesor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableProfesor);

        jPanelProfesores.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 370));

        getContentPane().add(jPanelProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 507));

        jPanelEstudiantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Mongolian Baiti", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Bienvenido a Gestion de alumnos. Seleccione alguno para editar sus datos");
        jPanelEstudiantes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Nombre");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setText("Fecha de ingreso");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel15.setText("Cedula");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel16.setText("Promedio");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel17.setText("Carnet");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel18.setText("Clases actuales");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 90, -1));

        jLabel19.setText("Primer Apellido");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel20.setText("Segundo Apellido");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel21.setText("Edad");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel22.setText("Materias pasadas");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel23.setText("Correo");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 40, -1));

        jLabel24.setText("Número telefónico");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jButton5.setText("Eliminar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        jButton6.setText("Cambiar vista");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jTextField9.setText("jTextField9");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, -1));

        jTextField10.setText("jTextField10");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, -1));

        jTextField11.setText("jTextField11");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, -1));

        jTextField12.setText("jTextField12");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 90, -1));

        jTextField13.setText("jTextField13");
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 90, -1));

        jTextField14.setText("jTextField14");
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, -1));

        jTextField15.setText("jTextField15");
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, -1));

        jTextField16.setText("jTextField16");
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, -1));

        jTextField17.setText("jTextField17");
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, -1));

        jTextField18.setText("jTextField18");
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 100, -1));

        jTextField19.setText("jTextField19");
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));

        jTextField20.setText("jTextField20");
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 100, -1));

        jLabel25.setText("Descripcion del estudiante");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 410, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 400, 130));

        jPanelEstudiantes.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 420, 500));
        jPanelEstudiantes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 620, -1));

        TableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jPanelEstudiantes.add(TableEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTableestudiantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableestudiantes);

        jPanelEstudiantes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 630, -1));

        getContentPane().add(jPanelEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex() ==0)
        {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la lista");
        }
        if(jComboBox1.getSelectedIndex() == 1){
           QuitarLabelfondo(jPanelProfesores , true); 
            QuitarLabelfondo(jPanelFondo, false);
            QuitarLabelfondo(jPanelEdicion, true);
            QuitarLabelfondo(jPanelGestor, false);
            CargardatosBasedeDatos();
            
        }
        if(jComboBox1.getSelectedIndex() == 2 ){
            QuitarLabelfondo(jPanelEstudiantes, true);
            QuitarLabelfondo(jPanel1, true);
            QuitarLabelfondo(jPanelGestor, false);
            QuitarLabelfondo(jPanelFondo, false);
            QuitarLabelfondo(jPanelProfesores, false);
            
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        QuitarLabelfondo(jPanelEdicion, false);
        QuitarLabelfondo(jPanelGestor, true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        QuitarLabelfondo(jPanel1 , false);
        QuitarLabelfondo(jPanelGestor, true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     mostrar("jTableProfesor");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gestion dialog = new Gestion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableEstudiantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEdicion;
    private javax.swing.JPanel jPanelEstudiantes;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelGestor;
    private javax.swing.JPanel jPanelProfesores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableProfesor;
    private javax.swing.JTable jTableestudiantes;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void QuitarLabelfondo(JPanel panel, boolean siono) {
        panel.setVisible(siono);
    }

    public void CargardatosBasedeDatos() {
       jTableProfesor.setModel(es.Lista());
    }

    private void QuitarFields() {
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField9.setText("");
       jTextField10.setText("");
       jTextField11.setText("");
       jTextField12.setText("");
       jTextField13.setText("");
       jTextField14.setText("");
       jTextField15.setText("");
       jTextField16.setText("");
       jTextField17.setText("");
       jTextField18.setText("");
       jTextField19.setText("");
       jTextField20.setText("");
       jTextField21.setText("");
       jTextField22.setText("");
       jTextField23.setText("");
       jTextField24.setText("");
       jTextField25.setText("");
       jTextField26.setText("");
       jTextField27.setText("");
       jTextField28.setText("");
       jTextField29.setText("");
       jTextField30.setText("");
    }
    
}
