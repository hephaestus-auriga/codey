/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.tmg.codility.main;

/**
 *
 * @author jeygokul
 */
public class CodilityThree {
    
    /**
     * Find the number of perfect cube roots in a integer range
     * @param A
     * @param B
     * @return 
     */
    public int solution(int A, int B) {
        int counter = 0;
        for(int i = A; i < B ; i++){
            double cubeRoot = Math.cbrt(i);
            if( (i%cubeRoot) == 0 ){
                counter = counter+1;
            }
        }
        return counter;
    }
    
    /**
     * Main method serves the purpose of unit testing
     * @param args 
     */
    public static void main(String... args){
        CodilityThree three = new CodilityThree();
        System.out.println(three.solution(8, 65));
    }
}
