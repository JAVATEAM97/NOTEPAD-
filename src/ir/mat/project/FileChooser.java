/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.mat.project;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author mat
 */
public class FileChooser {

   
    public String Chooser(String lastroot)
    {
        
         JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Choose a directory to Open: ");
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			if (jfc.getSelectedFile().isDirectory()) {
                            Global.DirectoryRootAddress =  jfc.getSelectedFile().getPath();          
                            return (jfc.getSelectedFile().getPath());
                        }
		}
        return lastroot;
    }
    
}
