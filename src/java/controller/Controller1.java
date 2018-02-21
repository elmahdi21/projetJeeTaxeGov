/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author User
 */
@Named(value = "controller1")
@SessionScoped
public class Controller1 implements Serializable {

    /**
     * Creates a new instance of Controller1
     */
    public Controller1() {
    }
    
}
