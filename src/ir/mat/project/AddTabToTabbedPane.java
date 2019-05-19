/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.mat.project;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author mat
 */
public class AddTabToTabbedPane {
    
    protected static  RootPaneUI rootPaneUI;
    
    public static void mat(String path , String TabName)
    {
        
        
        
        
        
        
        //Each tab's identifier
        Global.TabNumberCount +=1;

            
            if(Global.TabNumber<=5)
            {
                
                
                //Just Case One Is Commented
                

                switch (Global.TabNumber){
                   case 1:
                       
                       
                        JTextArea t1 = new JTextArea();

                        //Scroll tool
                        final JScrollPane scrolll = new JScrollPane(t1);

                        //make a tab with close button for tabbedpane.
                        JPanel tabBody1 = new JPanel();
                        CustomTabbedPane ctp1 = new CustomTabbedPane();
            
                        tabBody1.add(scrolll);
                        //Set Tab Name
                        ctp1.TabName1.setText(TabName);
                        
                        //Set a Layout For Our Panel.
                        tabBody1.setLayout(new GridLayout());
                         
                        
                        
                        //Start reading from file
                        FileReader fr = null;
                {
                    try {
                        fr = new FileReader(path);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        BufferedReader br = new BufferedReader(fr);
                        String line  , Text = "";
                        
                {
                    try {
                        while((line = br.readLine()) != null)
                        {
                            Text = Text + "\n" + line;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                        //Set Text to JEditorPane.
                        t1.setAutoscrolls(true);
                        t1.setText(Text);
                        //Set Font Style like size.
                        Font f = new Font(null, 3, 20);
                        t1.setFont(f);
                        
                        //Add Tab.
                        activity_main.jTabbedPane2.addTab(String.valueOf(Global.TabNumberCount), tabBody1);   
                        int index1 = activity_main.jTabbedPane2.indexOfTab(String.valueOf(Global.TabNumberCount));
                        //full screen panel for tab.
                        ctp1.setOpaque(false);
                        //define an action for close button
                        ctp1.CloseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                               Component selected = activity_main.jTabbedPane2.getSelectedComponent();
                               if (selected != null)
                               {
                                activity_main.jTabbedPane2.remove(selected);
                                
                                //Decrease the total number of tabs
                                Global.TabNumber -= 1;
                               }    
        
             }
         });
            
            //Customize the tab           
            activity_main.jTabbedPane2.setTabComponentAt(index1, ctp1);
            
                      
            
            
                       break;
                  case 2:
                      
                        JTextArea t2 = new JTextArea();

                        //Scroll tool
                        final JScrollPane scroll2 = new JScrollPane(t2);
                      
                      
                        JPanel tabBody2 = new JPanel();
                        CustomTabbedPane ctp2 = new CustomTabbedPane();

                        tabBody2.add(scroll2);
                        //Set Tab Name
                        ctp2.TabName1.setText(TabName);
                        
                        
                         tabBody2.setLayout(new GridLayout());
                         FileReader fr2 = null;
                {
                    try {
                        fr2 = new FileReader(path);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        BufferedReader br2 = new BufferedReader(fr2);
                        String line2  , Text2 = "";
                        
                {
                    try {
                        while((line2 = br2.readLine()) != null)
                        {
                            Text2 = Text2 + "\n" + line2;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        t2.setText(Text2);
                        Font f2= new Font(null, 3, 20);
                        t2.setFont(f2);
                        
                        
                        
                        activity_main.jTabbedPane2.addTab(String.valueOf(Global.TabNumberCount), tabBody2);   
                        int index2 = activity_main.jTabbedPane2.indexOfTab(String.valueOf(Global.TabNumberCount));
                        //full screen panel for tab.
                        ctp2.setOpaque(false);
                        //define an action for close button
                        ctp2.CloseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                               Component selected = activity_main.jTabbedPane2.getSelectedComponent();
                               if (selected != null)
                               {
                                activity_main.jTabbedPane2.remove(selected);
                                Global.TabNumber -= 1;
                               }    
      
             }
         });
            
            activity_main.jTabbedPane2.setTabComponentAt(index2, ctp2);
            
            
            
            
                       break;
                  case 3:
                      
                        JTextArea t3 = new JTextArea();

                        //Scroll tool
                        final JScrollPane scroll3 = new JScrollPane(t3);
                      
                      
                        JPanel tabBody3 = new JPanel();
                        CustomTabbedPane ctp3 = new CustomTabbedPane();

                        tabBody3.add(scroll3);
                        //Set Tab Name
                        ctp3.TabName1.setText(TabName);
                        
                        
                        tabBody3.setLayout(new GridLayout());
                         
                        
                        
                        //Start reading from file
                        FileReader fr3 = null;
                {
                    try {
                        fr3 = new FileReader(path);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        BufferedReader br3 = new BufferedReader(fr3);
                        String line3  , Text3 = "";
                        
                {
                    try {
                        while((line3 = br3.readLine()) != null)
                        {
                            Text3 = Text3 + "\n" + line3;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                        //Set Text to JEditorPane.
                        t3.setText(Text3);
                        //Set Font Style like size.
                        Font f3 = new Font(null, 3, 20);
                        t3.setFont(f3);
       
                        
                        
                        
                        
                        
                        activity_main.jTabbedPane2.addTab(String.valueOf(Global.TabNumberCount), tabBody3);
                        int index3 = activity_main.jTabbedPane2.indexOfTab(String.valueOf(Global.TabNumberCount));
                        //full screen panel for tab.
                        ctp3.setOpaque(false);
                        //define an action for close button
                        ctp3.CloseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                               Component selected = activity_main.jTabbedPane2.getSelectedComponent();
                                if (selected != null)
                               {
                                activity_main.jTabbedPane2.remove(selected);
                                Global.TabNumber -= 1;
                               }    
       
             }
         });
            
            activity_main.jTabbedPane2.setTabComponentAt(index3, ctp3);   
            
            
            
            
                       break;
                  case 4:
                      
                        JTextArea t4 = new JTextArea();

                        //Scroll tool
                        final JScrollPane scroll4 = new JScrollPane(t4);
                        
                        JPanel tabBody4 = new JPanel();
                        CustomTabbedPane ctp4 = new CustomTabbedPane();

                        tabBody4.add(scroll4);
                                
                        //Set Tab Name
                        ctp4.TabName1.setText(TabName);
                          
                        
                        tabBody4.setLayout(new GridLayout());
                         
                        
                        
                        //Start reading from file
                        FileReader fr4 = null;
                {
                    try {
                        fr4 = new FileReader(path);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        BufferedReader br4 = new BufferedReader(fr4);
                        String line4  , Text4 = "";
                        
                {
                    try {
                        while((line4 = br4.readLine()) != null)
                        {
                            Text4 = Text4 + "\n" + line4;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                        //Set Text to JEditorPane.
                        t4.setText(Text4);
                        //Set Font Style like size.
                        Font f4 = new Font(null, 3, 20);
                        t4.setFont(f4);
       
                        
                        
                      
                        activity_main.jTabbedPane2.addTab(String.valueOf(Global.TabNumberCount), tabBody4);
                        int index4 = activity_main.jTabbedPane2.indexOfTab(String.valueOf(Global.TabNumberCount));
                        //full screen panel for tab.
                        ctp4.setOpaque(false);
                        //define an action for close button
                        ctp4.CloseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                               Component selected = activity_main.jTabbedPane2.getSelectedComponent();
                               if (selected != null)
                               {
                                activity_main.jTabbedPane2.remove(selected);
                                Global.TabNumber -= 1;
                               }    
       
             }
         });
            
            activity_main.jTabbedPane2.setTabComponentAt(index4, ctp4); 
            
            
            
                       break;
                  case 5:
                      
                         JTextArea t5 = new JTextArea();

                        //Scroll tool
                        final JScrollPane scroll5 = new JScrollPane(t5);
                      
                        JPanel tabBody5 = new JPanel();
                        CustomTabbedPane ctp5 = new CustomTabbedPane();
            
                        tabBody5.add(scroll5);
                        //Set Tab Name
                        ctp5.TabName1.setText(TabName);
                        
                        
                        
                        tabBody5.setLayout(new GridLayout());
                         
                        
                        
                        //Start reading from file
                        FileReader fr5 = null;
                {
                    try {
                        fr5 = new FileReader(path);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        BufferedReader br5 = new BufferedReader(fr5);
                        String line5  , Text5 = "";
                        
                {
                    try {
                        while((line5 = br5.readLine()) != null)
                        {
                            Text5 = Text5 + "\n" + line5;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(activity_main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                        //Set Text to JEditorPane.
                        t5.setText(Text5);
                        //Set Font Style like size.
                        Font f5 = new Font(null, 3, 20);
                        t5.setFont(f5);
       
                        
                        
                      
                        activity_main.jTabbedPane2.addTab(String.valueOf(Global.TabNumberCount), tabBody5);
                        int index5 = activity_main.jTabbedPane2.indexOfTab(String.valueOf(Global.TabNumberCount));
                        //full screen panel for tab.
                        ctp5.setOpaque(false);
                        //define an action for close button
                        ctp5.CloseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                               Component selected = activity_main.jTabbedPane2.getSelectedComponent();
                               if (selected != null)
                               {
                                Global.TabNumber -= 1;
                                
                                activity_main.jTabbedPane2.remove(selected);
                               }    
       
             }
         });
            
            activity_main.jTabbedPane2.setTabComponentAt(index5, ctp5);   
            
            
            
            
            
                       break;
                 
                                     
               }
                
                              Global.TabNumber += 1;

                
            }
            else
                 System.out.print("Cant insert Tab!");
    }
    
    
}
