package com.umg.nodos;

import java.util.Scanner;

public class Nodos {

    public static class Node {

        String value;
        Node right = null;
        Node left = null;

        public void showTree() {
            System.out.println("---------------------");
            System.out.println("Nodo:" + this.value);

            if (this.left != null) {
                System.out.println("Nodo hijo izquierdo:" + this.left.value);
            }

            if (this.right != null) {
                System.out.println("Nodo hijo derecho:" + this.right.value);
            }
            
            if (this.left != null) {
                this.left.showTree();
            }

            if (this.right != null) {
                this.right.showTree();
            }

        }

        public Node() {
            Scanner input = new Scanner(System.in);
            boolean addRight = false, addLeft = false;
            System.out.print("Ingresa el nombre del nodo:");
            this.value = input.next();

            System.out.println("deseas agreale un nodo a la izquierda a : '" + this.value + "' ? (y/n)");
            addLeft = input.next().charAt(0) == 'y';
            if (addLeft) {
                this.left = new Node();
            }

            System.out.println("deseas agreale un nodo a la derecha a : '" + this.value + "' ? (y/n)");
            addRight = input.next().charAt(0) == 'y';
            if (addRight) {
                this.right = new Node();
            }

        }
    }

    public static void main(String[] args) {
        Node mainNode = new Node();
        mainNode.showTree();
    }
}
