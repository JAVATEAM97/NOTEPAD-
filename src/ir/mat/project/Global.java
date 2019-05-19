/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.mat.project;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mat
 */
public class Global {
    
    public static List<String> Jtree1PathArray = new ArrayList<String>();
    
    public static List<String> TextFilesName = new ArrayList<String>();

    
    public static String DirectoryRootAddress = "";
            
    public static  String DirectoryOfProjectsAddress = System.getProperty("user.home") + "\\NotepadProjects" ;
 
    public  static String SelectedJtree1ItemAdress =  "" ;

    public static int ItemSelectedFlagTree1 = 0;
        
    public static int ItemSelectedFlagTree2 = 0;
    
    public static int TabNumber = 1;

    public static int TabNumberCount = 1;

   
            
    
}
