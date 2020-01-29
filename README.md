# CN1Controllers

A very small MVC (model-view-controller) library to help structure Codename One applications using the MVC design pattern.

## Synopsis

The library contains a minimal set of controller and event classes to be able to structure Codename One applications using MVC.

## Application Structure

Applications extends the ApplicationController class, which implements the necessary `start()`, `stop()`, `init()`, and `destroy()` methods.

Override the `actionPerformed()` method to catch all events that are triggered in an application.  This includes life-cycle events (`StartEvent`, `StopEvent`, `InitEvent`, and `DestroyEvent`), and events that are triggered by the application.

Create a `FormController` subclass for each `Form` that you wish to display.

All views should implement the `EventProducer` interface.  User interactions with views can be sent to the controller hierarchy for handling by dispatching an event to registered event listeners.  Events will bubble up the controller hierarchy until it finds a controller that handles it.



