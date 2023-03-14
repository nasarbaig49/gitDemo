package com.java;

public class UnderstandingOops {

        private int x = 101;

        private void f(int x) {
            x++;
            System.out.println(x);
            //g();
        }

        private void g() {
            System.out.println(x);
        }

        public static void main(String[] args) {
            UnderstandingOops e = new UnderstandingOops();
            int x = 200;
            e.f(x);
        }
    }
