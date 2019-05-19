package ir.mat.project;


import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.Enumeration;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class FilteredJTreeExample  {


   
    public FilteredJTreeExample() {
       
       

     

       

            activity_main.jTree1.setCellRenderer(new DefaultTreeCellRenderer() {
            private JLabel lblNull = new JLabel();

            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value,
                    boolean arg2, boolean arg3, boolean arg4, int arg5, boolean arg6) {

                Component c = super.getTreeCellRendererComponent(tree, value, arg2, arg3, arg4, arg5, arg6);

                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                if (matchesFilter(node)) {
                    c.setForeground(Color.BLACK);
                    return c;
                }
                else if (containsMatchingChild(node)) {
                    c.setForeground(Color.GRAY);
                    return c;
                }
                else {
                    return lblNull;
                }
            }

            private boolean matchesFilter(DefaultMutableTreeNode node) {
                return node.toString().contains(".txt");
            }

            private boolean containsMatchingChild(DefaultMutableTreeNode node) {
                Enumeration<DefaultMutableTreeNode> e = node.breadthFirstEnumeration();
                while (e.hasMoreElements()) {
                    if (matchesFilter(e.nextElement())) {
                        return true;
                    }
                }

                return false;
            }
        });
    }

}