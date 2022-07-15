package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.similar(tree1, tree2));
        
    }


   public boolean similar(BST<E> node2) {
    return(similar(this.root, node2.root));
  }

  
  protected boolean similar(Node<E> actual1, Node<E> actual2) {
    boolean respuesta;

    if (actual1 == null && actual2 == null){
      System.out.println("1");
      respuesta = true;
    }
    else if ((actual1.left == null) && (actual2.left == null) && (actual1.right == null) && (actual2.right == null)){
      System.out.println("base");
      respuesta = true;
    }
    else if (!(actual1.left == null) && !(actual2.left == null) && !(actual1.right == null) && !(actual2.right == null)){
      System.out.println("2");
      respuesta = (similar(actual1.left, actual2.left) && similar(actual1.right, actual2.right));
    }
    else if (!(actual1.left == null) && !(actual2.left == null) && (actual1.right == null) && (actual2.right == null)){
      System.out.println("3");
      respuesta = similar(actual1.left, actual2.left);
    }
    else if ((actual1.left == null) && (actual2.left == null) && !(actual1.right == null) && !(actual2.right == null)){
      System.out.println("4");
      respuesta = similar(actual1.right, actual2.right);
    }
    else{
      System.out.println("5");
      respuesta = false;
    }
    return respuesta;
  }
}
