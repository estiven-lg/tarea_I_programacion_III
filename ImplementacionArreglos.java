package com.umg.implementacionarreglos;

import java.util.Scanner;

public class ImplementacionArreglos {

    public static class Array {

        public String[] data = new String[0];
        public int size = 0;

        public String get(int index) {
            if (index > this.size) {
                return null;
            }
            return data[index];
        }

        public void push(String text) {
            this.size++;
            String[] oldData = this.data;
            this.data = new String[size];

            for (int i = 0; i < oldData.length; i++) {
                data[i] = oldData[i];
            }

            this.data[(size - 1)] = text;
        }

        public void pop() {
            this.size--;
            String[] oldData = this.data;
            this.data = new String[size];

            for (int i = 0; i < size; i++) {
                data[i] = oldData[i];
            }

        }

        @Override
        public String toString() {
            String text = "";
            text += "[";
            for (int i = 0; i < size; i++) {
                text += data[i] + ", ";
            }
            text += "]";

            return text;
        }
    }

    public static class Stack {

        public String[] data = new String[0];
        public int size = 0;

        public String get() {
            String value = data[size - 1];
            this.pop();
            return value;
        }

        public void push(String text) {
            this.size++;
            String[] oldData = this.data;
            this.data = new String[size];

            for (int i = 0; i < oldData.length; i++) {
                data[i] = oldData[i];
            }

            this.data[size - 1] = text;
        }

        public void pop() {
            this.size--;
            String[] oldData = this.data;
            this.data = new String[size];

            for (int i = 0; i < size; i++) {
                data[i] = oldData[i];
            }

        }

        @Override
        public String toString() {
            String text = "";
            text += "[";
            for (int i = 0; i < size; i++) {
                text += data[i] + ", ";
            }
            text += "]";

            return text;
        }
    }

    public static class Quote {

        public String[] data = new String[0];
        public int size = 0;

        public String get() {
            String value = data[0];
            this.pop();
            return value;
        }

        public void push(String text) {
            this.size++;
            String[] oldData = this.data;
            this.data = new String[size];

            for (int i = 0; i < oldData.length; i++) {
                data[i] = oldData[i];
            }

            this.data[size - 1] = text;
        }

        public void pop() {
            this.size--;
            String[] oldData = this.data;
            this.data = new String[size];

            for (int i = 0; i < size; i++) {
                data[i] = oldData[i + 1];
            }

        }

        @Override
        public String toString() {
            String text = "";
            text += "[";
            for (int i = 0; i < size; i++) {
                text += data[i] + ", ";
            }
            text += "]";

            return text;
        }
    }

    public static void main(String[] args) {
        boolean stop = false;
        Scanner input = new Scanner(System.in);
        int size = 0;

        Array array = new Array();
        Stack stack = new Stack();
        Quote quote = new Quote();

        while (!stop) {
            System.out.println("ingrese un nombre");
            String text = input.next();

            array.push(text);
            stack.push(text);
            quote.push(text);

            System.out.println("desea ingresar otro nombre ?(y/n)");
            char res = input.next().charAt(0);
            stop = res != 'y';
            size++;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("--------turno" + (i + 1) + "--------");
            System.out.println("Arreglo:" + array.get(i));
            System.out.println("Pila:" + stack.get());
            System.out.println("Cola:" + quote.get());

        }
    }
}
