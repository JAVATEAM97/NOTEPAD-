/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.mat.project;
import java.util.Enumeration;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class ExpandAllNodes {
 
    public static void expandTree(JTree tree, boolean expand) {
        TreeNode root = (TreeNode) tree.getModel().getRoot();
        expandAll(tree, new TreePath(root), expand);
    }
    
    public static void expandAll(JTree tree, TreePath path, boolean expand) {
        TreeNode node = (TreeNode) path.getLastPathComponent();

        if (node.getChildCount() >= 0) {
            Enumeration enumeration = node.children();
            while (enumeration.hasMoreElements()) {
                TreeNode n = (TreeNode) enumeration.nextElement();
                TreePath p = path.pathByAddingChild(n);

                expandAll(tree, p, expand);
            }
        }

        if (expand) {
            tree.expandPath(path);
        } else {
            tree.collapsePath(path);
        }
    }

}