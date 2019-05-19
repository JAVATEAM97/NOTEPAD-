
package ir.mat.project;

import java.io.File;

/**
 *
 * @author mat
 */
public class getFileExtension {
    
     public static  String getFileExtension(String fullName) {
    String fileName = new File(fullName).getName();
    int dotIndex = fileName.lastIndexOf('.');
    return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
}
    
    
}
