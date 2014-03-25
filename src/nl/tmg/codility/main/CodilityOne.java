/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.tmg.codility.main;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author jeygokul
 */
public class CodilityOne {
    
    /**
     * Find the perimeter of a triangle, if the given array of integers has a triangle.
     * @param A 
     * @return sum
     */
    public int solution(int[] A) {
        int[] b = A.clone();
        int sum = -1;
        //This step took a lot of time to think
        Arrays.sort(b);
        for(int i = 0; i < b.length -2 ; i++){
            int sum1 = 0;
            if(b[i]+b[i+1] > b[i+2]){
                sum1 = b[i]+b[i+1]+b[i+2];
                if(sum1 > sum){
                    sum = sum1;
                }
            }
        }
        return sum;
    }
    
    /**
     * Main method serves as unit testing
     * @param args 
     */
    public static void main(String... args){
        CodilityOne one = new CodilityOne();
        System.out.println(one.solution(new int[]{10, 2, 5, 1,8, 20}));
    }
    
}
