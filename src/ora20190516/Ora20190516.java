package ora20190516;

import java.util.ArrayList;
import java.util.Scanner;

public class Ora20190516 {

    public static void method(){
        System.out.println("hello");
        System.out.println("hellosziaszevassz");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(99);
    }

    public static void main(String[] args) {
        
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("biliárd? Y/N");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equalsIgnoreCase("Y")){
            System.out.println(" :) ");
        }else{
            System.out.println(" :( ");
        }
        
        
    }
    
    public static void method2(){
        System.out.println("szia");
    }
    
    public static void method3(){
        System.out.println("progmatic4life");
    }
    
    
    
}
