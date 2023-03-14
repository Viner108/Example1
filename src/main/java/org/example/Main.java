package org.example;

public class Main {
    public static void main(String[] args) {
       int [] txt = {1,2,3,4,13};
        System.out.println(txt1(txt));
        System.out.println(txt2(txt));
    }
    public static int txt1(int[] txt){
        int j = 0;
        for (int i = 0; i < txt.length; i++) {
            j++;
        }
        return j;
    }
    public static int txt2(int[] txt){
        int b1 = 0;
        int b2;
        for (int i = 0; i < txt.length; i++) {
            if(txt[i]!=13){
                b1 += txt[i]*Math.pow(10,txt1(txt)-2-i);
            }

        }
        return b1;
    }
}