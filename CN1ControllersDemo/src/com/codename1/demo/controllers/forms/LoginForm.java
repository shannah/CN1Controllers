/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demo.controllers.forms;

import com.codename1.ui.controllers.ActionSupport;
import com.codename1.ui.controllers.ControllerEvent;
import com.codename1.ui.controllers.EventProducer;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.util.EventDispatcher;

/**
 * GUI builder created Form
 *
 * @author shannah
 */
public class LoginForm extends com.codename1.ui.Form implements EventProducer {

    private ActionSupport listeners = new ActionSupport();

    @Override
    public ActionSupport getActionSupport() {
        return listeners;
    }
    
    public class LoginFormEvent extends ControllerEvent {
        LoginFormEvent() {
            super(LoginForm.this);
        }
    }
    
    public class ForgotPasswordEvent extends LoginFormEvent {
        
    }
    public class LoginRequestEvent extends LoginFormEvent {

        /**
         * @return the username
         */
        public String getUsername() {
            return username;
        }

        /**
         * @return the password
         */
        public String getPassword() {
            return password;
        }
        private String username;
        private String password;
        LoginRequestEvent(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
    
    public LoginForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public LoginForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
        
        gui_login.addActionListener(evt->{
            listeners.fireActionEvent(new LoginRequestEvent(gui_username.getText(), gui_password.getText()));
        });
        
        gui_forgotPassword.addActionListener(evt->{
            listeners.fireActionEvent(new ForgotPasswordEvent());
        });
    }
    
   
//////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_username = new com.codename1.ui.TextField();
    protected com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    protected com.codename1.ui.TextField gui_password = new com.codename1.ui.TextField();
    protected com.codename1.ui.Button gui_login = new com.codename1.ui.Button();
    protected com.codename1.ui.Button gui_forgotPassword = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("LoginForm");
        setName("LoginForm");
        gui_Label.setText("Username");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        gui_username.setHint("Username");
        gui_username.setText("");
                gui_username.setInlineStylesTheme(resourceObjectInstance);
        gui_username.setName("username");
        gui_Label_1.setText("Password");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setName("Label_1");
        gui_password.setText("TextField");
                gui_password.setInlineStylesTheme(resourceObjectInstance);
        gui_password.setName("password");
        gui_password.setConstraint(com.codename1.ui.TextArea.PASSWORD);
        gui_login.setText("Login");
                gui_login.setInlineStylesTheme(resourceObjectInstance);
        gui_login.setName("login");
        gui_forgotPassword.setText("Forgot Password");
                gui_forgotPassword.setInlineStylesTheme(resourceObjectInstance);
        gui_forgotPassword.setName("forgotPassword");
        addComponent(gui_Label);
        addComponent(gui_username);
        addComponent(gui_Label_1);
        addComponent(gui_password);
        addComponent(gui_login);
        addComponent(gui_forgotPassword);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "0.0mm auto auto 0.0mm").setReferenceComponents(gui_Label, "1 -1 -1 2 ").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_username.getParent().getLayout()).setInsets(gui_username, "23.5161% 14.827908% auto auto").setReferenceComponents(gui_username, "-1 -1 -1 -1").setReferencePositions(gui_username, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_1.getParent().getLayout()).setInsets(gui_Label_1, "0.46609163mm 1.8643674mm auto auto").setReferenceComponents(gui_Label_1, "1 3 -1 -1").setReferencePositions(gui_Label_1, "1.0 1.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_password.getParent().getLayout()).setInsets(gui_password, "0.0mm 0.0mm auto 0.0mm").setReferenceComponents(gui_password, "1 1 -1 1 ").setReferencePositions(gui_password, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_login.getParent().getLayout()).setInsets(gui_login, "32px auto auto 3.0295963mm").setReferenceComponents(gui_login, "3 -1 -1 1 ").setReferencePositions(gui_login, "1.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_forgotPassword.getParent().getLayout()).setInsets(gui_forgotPassword, "0.0mm 42.813457% auto auto").setReferenceComponents(gui_forgotPassword, "4 -1 -1 4 ").setReferencePositions(gui_forgotPassword, "0.0 0.0 0.0 1.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
