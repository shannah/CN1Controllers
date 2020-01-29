/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demo.controllers;

import com.codename1.demo.controllers.forms.LoginForm;
import com.codename1.demo.controllers.forms.LoginForm.ForgotPasswordEvent;
import com.codename1.demo.controllers.forms.LoginForm.LoginRequestEvent;
import com.codename1.ui.Dialog;
import com.codename1.ui.controllers.Controller;
import com.codename1.ui.controllers.ControllerEvent;
import com.codename1.ui.controllers.FormController;

/**
 *
 * @author shannah
 */
public class LoginController extends FormController {
    
    public class LoginControllerEvent extends ControllerEvent {
        LoginControllerEvent() {
            super(LoginController.this);
        }
    }
    
    public class LoginSuccessfulEvent extends LoginControllerEvent {}
    
    public LoginForm getView() {
        return (LoginForm)super.getView();
    }
    
    public LoginController(Controller parent) {
        super(parent);
        setView(new LoginForm());
    }


    @Override
    public void actionPerformed(ControllerEvent evt) {
        if (evt instanceof LoginRequestEvent) {
            handleLogin((LoginRequestEvent)evt);
            return;
        }
        if (evt instanceof ForgotPasswordEvent) {
            handleForgotPassword((ForgotPasswordEvent)evt);
            return;
        }
        super.actionPerformed(evt);
    }
    
    
    private void handleLogin(LoginRequestEvent evt) {
        evt.consume();
        if ("steve".equals(evt.getUsername()) && "password".equals(evt.getPassword())) {
            dispatchEvent(new LoginSuccessfulEvent());
        } else {
            Dialog.show("Oops", "Incorrect username or password. Enter steve/password.", "OK", null);
        }
    }
    
    private void handleForgotPassword(ForgotPasswordEvent evt) {
         evt.consume();
         new ForgotPasswordController(this).getView().show();
    }
    
    
}
