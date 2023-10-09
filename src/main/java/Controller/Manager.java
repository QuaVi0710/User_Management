/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.InterfaceUserRepository;
import Repository.UserRepository;
import View.Menu;

/**
 *
 * @author QuaVi
 */
public class Manager extends Menu<String> {

    static String[] mc = {"Create a new account", "Login system", "exit"};
    InterfaceUserRepository repo;

    public Manager() {
        super("\tUSER MANAGEMENT", mc);
        repo = new UserRepository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1 ->
                repo.add();
            case 2 ->
                repo.login();
            case 3 ->
                System.exit(0);
        }
    }

}
