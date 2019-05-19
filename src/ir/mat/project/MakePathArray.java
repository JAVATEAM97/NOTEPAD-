package ir.mat.project;


import java.io.File;
import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.JTree;
import javax.swing.tree.TreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mat
 */
public class MakePathArray {
    
    //Start to Visit the nodes.
  public static void visitAllNodes(JTree tree) {
    TreeNode root = (TreeNode) tree.getModel().getRoot();
    visitAllNodes(root);
  }

  public static void visitAllNodes(TreeNode node) {
      
      //Convert the node to the file for checking
      File c = new File(Global.DirectoryRootAddress + "\\" + node.toString());
      
      //Add the address to the list if it is correct
      if(c.exists())
      {
       Global.Jtree1PathArray.add(Global.DirectoryRootAddress + "\\" + node.toString());  
          
     
           Global.TextFilesName.add(node.toString());
       
      }
      
      //Call the function to get the address of the files inside the folder
      if(c.isDirectory())
      {
       listFilesForFolder(c);
      }
      
      //Go to the next node
    if (node.getChildCount() >= 0) {
      for (Enumeration e = node.children(); e.hasMoreElements();) {
        TreeNode n = (TreeNode) e.nextElement();
        visitAllNodes(n);
      }
    }
  }
  
  //add files to list
  public static void listFilesForFolder( final File folder ) {
    for (final File fileEntry : folder.listFiles()) {
        if (fileEntry.isDirectory()) {
            listFilesForFolder(fileEntry);
        } else {
           
           Global.Jtree1PathArray.add(folder + "\\" + fileEntry.getName());
           Global.TextFilesName.add(fileEntry.getName());

        }
    }
}
  
  
    //Sort file addresses by text file
    public static void SortArray() {
        
        for(int i = 0 ; i<=Global.Jtree1PathArray.size()-1 ; i++)
        {
    
            if(Global.Jtree1PathArray.get(i).contains(".txt") == false)
            {
                 Global.Jtree1PathArray.remove(i);
                 i--;
            }
        }
        
        for(int i = 0 ; i<=Global.TextFilesName.size()-1 ; i++)
        {
    
            if(Global.TextFilesName.get(i).contains(".txt") == false)
            {
                 Global.TextFilesName.remove(i);
                 i--;
            }
        }
        
    }  
}
