package com.JavaPractice;

public class Main {

    static class LinkedList {
        Node head;

        static void Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();



    }
}








































//
//    public static class App extends Plant {
//
//            public static void main(String[] args) {
//
//                Plant plant = new Plant();
//                plant.getData();
//                plant.getName();
//
//
//            }
//
//        }
//
//    public static class Plant {
//
//            // Usually only static final members are public
//            public static final int ID = 7;
//
//            // Instance variables should be declared private,
//            // or at least protected.
//            private String name;
//
//            // Only methods intended for use outside the class
//            // should be public. These methods should be documented
//            // carefully if you distribute your code.
//            public String getData() {
//                String data = "some stuff" + calculateGrowthForecast();
//
//                return data;
//            }
//
//            // Methods only used the the class itself should
//            // be private or protected.
//            private int calculateGrowthForecast() {
//                return 9;
//            }
//
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//
//
//
//    }
//}
