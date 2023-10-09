/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.UserDao;

/**
 *
 * @author QuaVi
 */

public class UserRepository implements InterfaceUserRepository {

    @Override
    public void add() {
        UserDao.Instance().createAccount();
    }

    @Override
    public void login() {
        UserDao.Instance().login();
        
    }
    
}
