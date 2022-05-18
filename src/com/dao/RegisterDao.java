/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entidades.Confirmacion;
import com.entidades.Register;
import com.login.principal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class RegisterDao {
    
    //atributos
    Connection cn = null;
    Statement st =null;
    ResultSet rs = null;
    CallableStatement cs = null;
    
    public RegisterDao(){
        cn = new conexion().getConn();
    }
    
    final String INSERT="{call pa_insertar_register(?,?,?,?,?,?)}";
    final String VALIDAR="{call pa_validar_userPass(?,?)}";
    
    public boolean agregarRegister(Register o){
        
        int cantidad = 0;
        //crear nuestro script de agregar
        //String sql ="{call pa_insertar_tutores(?,?,?,?,?,?,?)}";
        
        try{
            cs = cn.prepareCall(INSERT);
            int x = 1;
            cs.setString(x++, o.getNombre());
            cs.setString(x++, o.getApellido());
            cs.setString(x++, o.getCorreo());
            cs.setDate(x++, Date.valueOf(o.getFnacimiento()));
            cs.setString(x++, o.getUser());
            cs.setString(x++, o.getContraseña());
            cantidad = cs.executeUpdate();
            //st = cn.createStatement();
            //cantidad = st.executeUpdate(sql);
        }catch(Exception ex){
             System.out.println("Error SQL: " + ex.getMessage());
        }
        
        return (cantidad>0);
    }
    
    public void getConfirmacion(String usuario,String contrasena){
        int resultado=0;
        try {
            //st = cn.createStatement();
            //rs = st.executeQuery(sql);
            cs = cn.prepareCall(VALIDAR);
            cs.getString(x++, usuario);
            cs.setString(5, contrasena);
            rs = cs.executeQuery();
            if (rs.next()){
                resultado=1;
                if(resultado==1){
                    principal form= new principal();
                    form.setVisible(true);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Error usuario no registrado");
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getMessage());
        }
    }
}
