package com.rag.practicals.flyweight_pattern.test1.forest;

import com.rag.practicals.flyweight_pattern.test1.trees.Tree;
import com.rag.practicals.flyweight_pattern.test1.trees.TreeFactory;
import com.rag.practicals.flyweight_pattern.test1.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private List<Tree> trees  = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData){
//        TreeType treeType = new TreeType(name,color,otherTreeData);
        TreeType treeType = TreeFactory.getTreeType(name,color,otherTreeData);
        Tree tree = new Tree(x,y,treeType);
        trees.add(tree);
    }
    @Override
    public void paint(Graphics graphics){
        for (Tree tree:trees){
            tree.draw(graphics);
        }
    }
}
