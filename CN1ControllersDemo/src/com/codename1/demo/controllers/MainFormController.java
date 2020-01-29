/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demo.controllers;

import com.codename1.demo.controllers.forms.MainForm;
import com.codename1.ui.controllers.Controller;
import com.codename1.ui.controllers.FormController;

/**
 *
 * @author shannah
 */
public class MainFormController extends FormController {
    
    public MainFormController(Controller parent) {
        super(parent);
        setView(new MainForm());
    }
    
}
