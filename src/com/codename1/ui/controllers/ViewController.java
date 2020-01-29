/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.ui.controllers;

import com.codename1.ui.Component;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.events.ComponentStateChangeEvent;

/**
 * A controller class that handles application logic for a view.
 * @author shannah
 */
public class ViewController extends Controller {
    private Component view;
    
    private ActionListener viewListener = evt->{
        if (evt instanceof ControllerEvent) {
            dispatchEvent((ControllerEvent)evt);
        }
    };
    
    /**
     * Listener to be notified when view is initialized/deinitialized.
     */
    private ActionListener<ComponentStateChangeEvent> stateChangeListener = evt -> {
        if (evt.isInitialized()) {
            initController();
        } else {
            deinitialize();
        }
    };
    
    public ViewController(Controller parent) {
        super(parent);
    }
    
    /**
     * Sets the view associated with this controller.
     * @param view 
     */
    public void setView(Component view) {
        if (this.view != null) {
            if (this.view instanceof EventProducer) {
                ((EventProducer)this.view).removeActionListener(viewListener);
            }
            this.view.removeStateChangeListener(stateChangeListener);
        }
        this.view = view;
        if (this.view != null) {
            this.view.addStateChangeListener(stateChangeListener);
            if (this.view instanceof EventProducer) {
                ((EventProducer)this.view).addActionListener(viewListener);
            }
        }
    }
    
    /**
     * Gets the view associated with this controller.
     * @return 
     */
    public Component getView() {
        return view;
    }
    
    
    /**
     * Callback called when the view is initialized (i.e. made visible)
     */
    public void initController() {
        
    }
    
    /**
     * Callback called when the view is deinitialized (i.e. removed from display hierarchy).
     */
    public void deinitialize() {
        
    }

}
