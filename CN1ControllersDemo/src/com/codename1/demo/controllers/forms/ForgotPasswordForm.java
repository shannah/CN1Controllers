/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.demo.controllers.forms;

import com.codename1.ui.events.ActionListener;
import com.codename1.ui.util.EventDispatcher;

/**
 * GUI builder created Form
 *
 * @author shannah
 */
public class ForgotPasswordForm extends com.codename1.ui.Form {
    private EventDispatcher listeners = new EventDispatcher();
    public ForgotPasswordForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public ForgotPasswordForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }
    
    public void addActionListener(ActionListener l) {
        listeners.addListener(l);
    }
    
    public void removeActionListener(ActionListener l) {
        listeners.removeListener(l);
    }

////-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    protected com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("ForgotPasswordForm");
        setName("ForgotPasswordForm");
        gui_Label.setText("The username is steve");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        gui_Label_1.setText("The password is password");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setName("Label_1");
        addComponent(gui_Label);
        addComponent(gui_Label_1);
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "11.004785% 47.041122% auto auto").setReferenceComponents(gui_Label, "-1 -1 -1 -1").setReferencePositions(gui_Label, "0.0 0.0 0.0 0.0");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_1.getParent().getLayout()).setInsets(gui_Label_1, "0.0mm auto auto 1.3982754mm").setReferenceComponents(gui_Label_1, "0 -1 -1 0 ").setReferencePositions(gui_Label_1, "1.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
