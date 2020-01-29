/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demo.controllers;

import com.codename1.demo.controllers.forms.ForgotPasswordForm;
import com.codename1.ui.controllers.Controller;
import com.codename1.ui.controllers.FormController;

/**
 *
 * @author shannah
 */
public class ForgotPasswordController extends FormController {

    public ForgotPasswordController(Controller parent) {
        super(parent);
        setView(new ForgotPasswordForm());
    }

    @Override
    public void initController() {
        super.initController();
        
    }
    
    
}
