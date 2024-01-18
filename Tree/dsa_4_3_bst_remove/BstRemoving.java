package dsa_8_3_bst_remove;

public class BstRemoving {
	class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node root = null;

    public void insert(int key) {
        Node newNode = new Node(key);
        Node currentNode = root;
        if (currentNode == null) {
            root = newNode;
            return;
        }
        while (true) {
            if (key < currentNode.data) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }
    public void remove(int data) {
    	removeHelper(data,root,null);
    	
    }
    public void removeHelper(int data,Node temp,Node parentNode) {
    	while(temp!=null) {
    		if (data<temp.data) {
    			parentNode=temp;
    			temp=temp.left;
    		}
    		else if (data>temp.data) {
    			parentNode=temp;
    			temp=temp.right;
    		}
    		else {
    			if (temp.left!=null && temp.right!=null) { // to remove 10
    				temp.data=getMinValue(temp.right);
    				removeHelper(temp.data,temp.right,temp);
    			}
    			else {
    				if (parentNode==null) {
    					if (temp.right==null) {
    						root=temp.left;
    					}
    					else {
    						root=temp.right;
    					}
    				}
    				else {
    					if (parentNode.left==temp) {
    						if (temp.right==null) {
    							parentNode.left=temp.left;
    						}
    						else {
    							parentNode.left=temp.right;
    						}
    					}
    					else {
    						if (temp.right==null) {
    							parentNode.right=temp.left;
    						}
    						else {
    							parentNode.right =temp.right;
    						}
    						
    					}
    					
    				}
    			}
    			break;
    		}
    	}
    	
    }
    public int getMinValue(Node temp) {
    	if (temp.left == null) {
    		return temp.data;
    	}
    	else {
    		return getMinValue(temp.left);
    	}
    }
    public void inOrder() {
        inOrderHelper(root, 0);
    }

    private void inOrderHelper(Node node, int level) {
        if (node != null) {
            inOrderHelper(node.right, level + 1);

            // Print spaces for indentation based on the level
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }

            System.out.println(node.data);

            inOrderHelper(node.left, level + 1);
        }
    }

    public static void main(String[] args) {
        BstRemoving tree = new BstRemoving();
        tree.insert(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(11);
        tree.insert(15);
        tree.remove(15);
        tree.inOrder();
    }


}
