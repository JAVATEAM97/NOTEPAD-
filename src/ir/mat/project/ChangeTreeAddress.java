
package ir.mat.project;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author mat
 */
public class ChangeTreeAddress {
    
    
    private final DefaultMutableTreeNode root;

    private final DefaultTreeModel treeModel;
    
    
    
    public ChangeTreeAddress(String path ,int TreeNumber)
    {
        
        
        File fileRoot = new File(path);
        root = new DefaultMutableTreeNode(new FileNode(fileRoot));
        treeModel = new DefaultTreeModel(root);
       if(TreeNumber==1)
       {
        activity_main.jTree1.setModel(treeModel);
        activity_main.jTree1.setShowsRootHandles(true);
       }else
       {
        activity_main.jTree2.setModel(treeModel);
        activity_main.jTree2.setShowsRootHandles(true);
           
       }    
        CreateChildNodes ccn = new CreateChildNodes(fileRoot, root);
        new Thread(ccn).start();
        
        //View text files in a tree by filtering
        FilteredJTreeExample mm = new FilteredJTreeExample();
        
        
    }
    
    
    
    
  public class CreateChildNodes implements Runnable {

        private final DefaultMutableTreeNode root;

        private final File fileRoot;

        public CreateChildNodes(File fileRoot, 
                DefaultMutableTreeNode root) {
            this.fileRoot = fileRoot;
            this.root = root;
        }

        @Override
        public void run() {
            createChildren(fileRoot, root);
        }

        private void createChildren(File fileRoot, 
                DefaultMutableTreeNode node) {
            File[] files = fileRoot.listFiles();
            if (files == null) return;

            for (File file : files) {
                DefaultMutableTreeNode childNode = 
                        new DefaultMutableTreeNode(new FileNode(file));
                node.add(childNode);
                if (file.isDirectory()) {
                    createChildren(file, childNode);
                }
            }
        }

    }

    public class FileNode {

        private final File file;

        public FileNode(File file) {
            this.file = file;
        }

        @Override
        public String toString() {
            String name = file.getName();
            if (name.equals("")) {
                return file.getAbsolutePath();
            } else {
                return name;
            }
        }
    }

}
