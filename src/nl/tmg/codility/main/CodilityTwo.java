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
public class CodilityTwo {
    
    /**
     * Find the String value of integer and radix
     * @param V
     * @param R
     * @return 
     */
    public String solution(int V, int R) {
        Integer a = V;
        Integer r = R;
        //I agree this is a total hack
        //But frankly I could not think of a better way to do it
        //Nor did not want to reinvent the wheel
        return Integer.toString(a, r);
    }
    
    /**
     * Main method serves as a unit test
     * @param args 
     */
    public static void main(String... args){
        CodilityTwo two = new CodilityTwo();
        System.out.println(two.solution(62, 21));
    }
}
