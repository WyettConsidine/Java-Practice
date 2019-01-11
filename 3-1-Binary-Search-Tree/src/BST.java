public class BST {
    public BST(int i) {
        rootNode = new BstNode(i);
    }

    public void addNode(int i) {
        BstNode currentNode = rootNode;
        boolean finished = false;
        do {
            BstNode curLeftNode = currentNode.leftNode;
            BstNode curRightNode = currentNode.rightNode;
            int curIntData = currentNode.intData;
            if(i > curIntData) {   //look down the right branch
                if(curRightNode == null) {
                    //create a new node  referenced with currentNode.rightNode
                    currentNode.rightNode = new BstNode(i);
                    finished = true;
                } else {
                    //keep looking by assigning a new current node one level down
                    currentNode = curRightNode;
                }
            } else {  //look down the left branch
                if(curLeftNode == null) {  //create a new node referenced with currentNode.leftNode
                    currentNode.leftNode = new BstNode(i);
                    finished = true;
                } else {  //keep looking by assigning a new current node one level down
                    currentNode = curLeftNode;
                }
            }
        } while(!finished);
    }

    public void traverseAndPrint(BstNode currentNode ) {
        System.out.print("data = " + currentNode.intData);
        if(currentNode.leftNode == null) {
            System.out.print("    left = null");
        } else {
            System.out.print("    left = " + (currentNode.leftNode).intData);
        }
        if(currentNode.rightNode == null) {
            System.out.print("    right = null");
        } else {
            System.out.print("    right = " + (currentNode.rightNode).intData);
        }
        System.out.println("");
        if(currentNode.leftNode != null)
            traverseAndPrint(currentNode.leftNode);
        if(currentNode.rightNode != null)
            traverseAndPrint(currentNode.rightNode);
    }

    BstNode rootNode;

}
