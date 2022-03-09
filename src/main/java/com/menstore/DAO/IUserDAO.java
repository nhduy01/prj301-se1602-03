/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menstore.DAO;

import com.menstore.model.User;

/**
 *
 * @author MyPC
 */
public interface IUserDAO {
    int getNoOfRecords();
    
    boolean save(User user);
    
    boolean saveWalkInGuest(String id, String name, String phone, String address);
}