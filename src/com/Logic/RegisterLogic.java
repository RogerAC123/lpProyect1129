/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logic;

import com.dao.RegisterDao;
import com.entidades.Register;

/**
 *
 * @author user
 */
public class RegisterLogic {
    
    public boolean agregarRegister(Register o){
        return new RegisterDao().agregarRegister(o);
    }
    
}
