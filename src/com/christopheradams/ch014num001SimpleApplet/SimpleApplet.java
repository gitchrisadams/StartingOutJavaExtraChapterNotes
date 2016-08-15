package com.christopheradams.ch014num001SimpleApplet;

import javax.swing.*;
import java.awt.*;

/**
   This is a simple applet.
*/
// Notice we extend JApplet unlike extending JFrame for Gui apps:
public class SimpleApplet extends JApplet
{
   /**
      The init method sets up the applet, much
      like a constructor.
   */
   
   public void init()
   {
      // Create a label.
      JLabel label =
           new JLabel("This is my very first applet.");
      
      // Set the layout manager.
      setLayout(new FlowLayout());
      
      // Add the label to the content pane.
      add(label);
   }
}
