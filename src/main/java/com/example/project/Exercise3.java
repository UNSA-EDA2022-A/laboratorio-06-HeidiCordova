package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


   public boolean EstrictamenteBinario() {
    return(EstrictamenteBinario(this.root));
  }

  
  protected boolean EstrictamenteBinario(Node<E> actual) {
    boolean res;

    if(actual == null){
      return true;
    }
    else if (!(actual.left == null) && !(actual.right == null)){
      System.out.println(!(actual.left == null) && !(actual.right == null));
      res = (EstrictamenteBinario(actual.left) && EstrictamenteBinario(actual.right));
    }
    else if (actual.left == null && actual.right == null){
      res = true;
    }
    else{
      res = false;
    }
    return res;
  
}
