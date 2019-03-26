package com.luc.mudan.dp.structural.composite;

/**
 * @author : luc
 * @date : 2019-03-05 12:19
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>");
        Component root = new Composite("Root");
        root.add(new Leaf("Leaf A in Root"));
        root.add(new Leaf("Leaf B in Root"));

        Component branchX = new Composite("Branch X in Root");
        Component branchY = new Composite("Branch Y in Root");
        root.add(branchX);
        root.add(branchY);

        branchX.add(new Leaf("Leaf A in Branch X"));

        // 为BranchX增加枝节点
        Component branchZ = new Composite("Branch Z in Branch X");
        branchX.add(branchZ);

        // 为BranchY增加叶节点
        branchY.add(new Leaf("Leaf in Branch Y"));

        // 为BranchZ增加叶节点
        branchZ.add(new Leaf("Leaf in Branch Z"));

        root.display();
    }
}
