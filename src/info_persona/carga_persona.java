/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info_persona;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Calendar;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Gianluca Sparvoli
 */
public class carga_persona extends javax.swing.JFrame {

    /**
     * Creates new form carga_persona
     */
    public carga_persona() {
        initComponents();
        this.setLocationRelativeTo(null);
        combobox_sexo.removeAllItems();
        combobox_sexo.addItem("Masculino");
        combobox_sexo.addItem("Femenino");
        combobox_sexo.addItem("No especifica");
        
        combobox_dia.removeAllItems();
        for (int i = 1; i < 32; i++) {            
            String a = Integer.toString(i);            
            combobox_dia.addItem(a);
        }
        
        combobox_mes.removeAllItems();
        for (int i = 1; i < 13; i++) {            
            String a = Integer.toString(i);            
            combobox_mes.addItem(a);
        }
        
        combobox_año.removeAllItems();
        for (int i = 2019; i > 1919; i--) {            
            String a = Integer.toString(i);            
            combobox_año.addItem(a);
        }
        
        RestrictedTextField limitar_DNI = new RestrictedTextField(txt_DNI);
        limitar_DNI.setLimit(9);
        limitar_DNI.setOnlyNums(true);
        
        RestrictedTextField limitar_apellido = new RestrictedTextField(txt_apellido);
        limitar_apellido.setOnlyText(true);
        
        RestrictedTextField limitar_nombre = new RestrictedTextField(txtl_nombre);
        limitar_nombre.setOnlyText(true);
        
        RestrictedTextField limitar_caract_celular = new RestrictedTextField(txt_celular1);
        limitar_caract_celular.setLimit(4);
        limitar_caract_celular.setOnlyNums(true);
        
        RestrictedTextField limitar_celular = new RestrictedTextField(txt_celular2);
        limitar_celular.setLimit(7);
        limitar_celular.setOnlyNums(true);
        
        RestrictedTextField limitar_codpostal= new RestrictedTextField(txt_codpostal);
        limitar_codpostal.setLimit(4);
        limitar_codpostal.setOnlyNums(true);
        
        RestrictedTextField limitar_contatoemergencia= new RestrictedTextField(txt_contactoemergencia1);
        limitar_contatoemergencia.setLimit(11);
        limitar_contatoemergencia.setOnlyNums(true);
        
        RestrictedTextField limitar_nacionalidad= new RestrictedTextField(txt_nacionalidad);
        limitar_nacionalidad.setOnlyText(true);
        
        RestrictedTextField limitar_caract_telefono= new RestrictedTextField(txt_telefono1);
        limitar_caract_telefono.setLimit(4);
        limitar_caract_telefono.setOnlyNums(true);
        
        RestrictedTextField limitar_telefono= new RestrictedTextField(txt_telefono2);
        limitar_telefono.setLimit(8);
        limitar_telefono.setOnlyNums(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtl_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boton_cargar = new javax.swing.JButton();
        label_cargaexitosa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combobox_sexo = new javax.swing.JComboBox<>();
        combobox_dia = new javax.swing.JComboBox<>();
        combobox_mes = new javax.swing.JComboBox<>();
        combobox_año = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nacionalidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_celular1 = new javax.swing.JTextField();
        txt_celular2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_telefono2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_contactoemergencia1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_codpostal = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_nomimagen = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btn_seleccionarimg = new javax.swing.JButton();
        label_foto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARGA DE DATOS");
        setUndecorated(true);

        jLabel1.setText("Nombre: ");

        txtl_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtl_nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido: ");

        jLabel3.setText("DNI: ");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel4.setText("Carga de datos");

        boton_cargar.setText("Aceptar");
        boton_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cargarActionPerformed(evt);
            }
        });

        label_cargaexitosa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setText("Fecha de Nacimiento: ");

        jLabel6.setText("Sexo: ");

        combobox_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combobox_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_sexoActionPerformed(evt);
            }
        });

        combobox_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combobox_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combobox_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("E-Mail: ");

        jLabel8.setText("Direccion: ");

        jLabel9.setText("Nacionalidad:");

        jLabel10.setText("Celular: ");

        jLabel11.setText("-");

        jLabel12.setText("Telefono: ");

        jLabel13.setText("-");

        jLabel14.setText("Contacto de emergencia:  ");

        jLabel15.setText("Cod. Postal:");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel16.setText("Foto:");

        btn_seleccionarimg.setText("Seleccionar Imagen");
        btn_seleccionarimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarimgActionPerformed(evt);
            }
        });

        label_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/usuario.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/regatas escudo.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Juice ITC", 1, 60)); // NOI18N
        jLabel18.setText("CLUB REGATAS SAN NICOLAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel8)
                                .addGap(40, 40, 40)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(37, 37, 37)
                                .addComponent(txt_nomimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_seleccionarimg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(13, 13, 13)
                                .addComponent(txt_contactoemergencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel12)
                                .addGap(41, 41, 41)
                                .addComponent(txt_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16)
                                .addComponent(txtl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel7)
                                .addGap(55, 55, 55)
                                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label_cargaexitosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(230, 230, 230)
                                .addComponent(boton_cargar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(35, 35, 35)
                                            .addComponent(txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(jLabel15))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(combobox_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(combobox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(combobox_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(combobox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(245, 245, 245)
                                        .addComponent(jLabel10)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codpostal, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_celular1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_celular2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_codpostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combobox_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(combobox_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combobox_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(combobox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txt_celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txt_celular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txt_contactoemergencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton_cargar)
                        .addComponent(btn_buscar)
                        .addComponent(btn_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nomimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(btn_seleccionarimg))
                        .addGap(18, 18, 18)
                        .addComponent(label_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(label_cargaexitosa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtl_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtl_nombreActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_txtl_nombreActionPerformed

    private void boton_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cargarActionPerformed
        // TODO add your handling code here:
               
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db-club", "root", ""); //ruta,usuario(root si no tiene),contrasña
            PreparedStatement pst = cn.prepareStatement("insert into persona values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            FileInputStream archivofoto;
            
            String fechafinal,d,m,a,sexo,celular,telefono;
            d = combobox_dia.getSelectedItem().toString();
            m = combobox_mes.getSelectedItem().toString();
            a = combobox_año.getSelectedItem().toString();
            fechafinal = d + "/" + m + "/" + a;
            sexo = combobox_sexo.getSelectedItem().toString();
            celular = txt_celular1.getText() + "-" + txt_celular2.getText();
            telefono = txt_telefono1.getText() + "-" + txt_telefono2.getText();
            
            int dd = Integer.parseInt(d);
            int mm = Integer.parseInt(m);
            int aa = Integer.parseInt(a);
            int edadint = calcularEdad(aa,mm,dd);

            
            String edadstring = Integer.toString(edadint);
            
            pst.setString(1, "0");  //id
            pst.setString(2, txt_DNI.getText().trim());   //dni
            pst.setString(3, " ");  //cuil
            pst.setString(4, txt_direccion.getText().trim());  //domicilio
            pst.setString(5, txtl_nombre.getText().trim());    //nombre
            pst.setString(6, txt_apellido.getText().trim());  //apellido
            pst.setString(7, edadstring.trim());  //edad
            pst.setString(8, fechafinal.trim());  //fecha nac
            pst.setString(9, sexo.trim());  //sexo
            pst.setString(10, txt_mail.getText().trim());  //mail
            pst.setString(11, txt_codpostal.getText().trim());  //cod postal
            pst.setString(12, txt_nacionalidad.getText().trim());  //nacionalidad
            pst.setString(13, celular.trim());  //celular
            pst.setString(14, telefono.trim());  //telefono
            pst.setString(15, txt_contactoemergencia1.getText().trim());  //contacto de emergencia
            pst.setString(16, txt_nomimagen.getText().trim());
            
            archivofoto = new FileInputStream(txt_nomimagen.getText()); 
            pst.setBinaryStream(17,archivofoto);
            
            pst.executeUpdate();

            txt_DNI.setText("");
            txtl_nombre.setText("");
            txt_apellido.setText("");
            txt_direccion.setText("");
            txt_celular1.setText("");
            txt_celular2.setText("");
            txt_codpostal.setText("");
            txt_contactoemergencia1.setText("");
            txt_direccion.setText("");
            txt_mail.setText("");
            txt_nacionalidad.setText("");
            txt_telefono1.setText("");
            txt_telefono2.setText("");
            txt_nomimagen.setText("");
            label_foto.setText("");
            
            label_cargaexitosa.setText("Registro exitoso");
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_boton_cargarActionPerformed
   
    
    private static int calcularEdad(int a, int m, int d) {
    Calendar today = Calendar.getInstance();
    int diffYear = today.get(Calendar.YEAR) - a;
    int diffMonth = today.get(Calendar.MONTH) - m;
    int diffDay = today.get(Calendar.DAY_OF_MONTH) - d;
    // Si está en ese año pero todavía no los ha cumplido
    if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
        diffYear = diffYear - 1;
    }
    return diffYear;
}
    
    
    private void combobox_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_sexoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
         System.exit(0);       
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
            buscar_persona f = new buscar_persona();  //se abre el segundo formulario (buscar)
            f.setVisible(true);
            dispose();  //cierra la ventana actual
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_seleccionarimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarimgActionPerformed
        // TODO add your handling code here:

        FileNameExtensionFilter filtro = new FileNameExtensionFilter ("Formatos de archivos JPEG, PNG(*.JPG; *.JPEG; *.PNG)" , "jpg" , "jpeg" , "png");
        JFileChooser archivo = new JFileChooser();
        archivo.setFileFilter(filtro);

        int ventana = archivo.showOpenDialog(null);

        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            txt_nomimagen.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txt_nomimagen.getText());
            foto = foto.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            label_foto.setIcon(new ImageIcon(foto));
        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor selecione una imagen");
        }

    }//GEN-LAST:event_btn_seleccionarimgActionPerformed

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
            java.util.logging.Logger.getLogger(carga_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carga_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carga_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carga_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carga_persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cargar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_seleccionarimg;
    private javax.swing.JComboBox<String> combobox_año;
    private javax.swing.JComboBox<String> combobox_dia;
    private javax.swing.JComboBox<String> combobox_mes;
    private javax.swing.JComboBox<String> combobox_sexo;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_cargaexitosa;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel label_foto;
    private javax.swing.JTextField txt_DNI;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_celular1;
    private javax.swing.JTextField txt_celular2;
    private javax.swing.JTextField txt_codpostal;
    private javax.swing.JTextField txt_contactoemergencia1;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nacionalidad;
    private javax.swing.JTextField txt_nomimagen;
    private javax.swing.JTextField txt_telefono1;
    private javax.swing.JTextField txt_telefono2;
    private javax.swing.JTextField txtl_nombre;
    // End of variables declaration//GEN-END:variables
}
