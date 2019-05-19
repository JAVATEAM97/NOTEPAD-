
package ir.mat.project;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mat
 */
public class CopyFile {
    
    
    public static void copyFile( File from, File to ) throws IOException {
    
        System.out.println(from.toString() + "  1");
        System.out.println(to.toString() + "  2 ");
        
        Files.copy( from.toPath(), to.toPath() );
    } 
    
    public static void copyFiles(String[] ourfiles , String[] TextFilesName, String to)throws IOException
    {   
        int i = 0; 
    for(String file : ourfiles ){
        
        File from = new File(file);
        
        File FileTo = new File(to + "\\" +TextFilesName[i]);
        
        try {
            if(!FileTo.exists())
            Files.copy( from.toPath(), FileTo.toPath() );
        } catch (IOException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        i++;
    }
    }
   
}
