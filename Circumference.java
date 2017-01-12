/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface1;

/**
 *
 * @author ASHRAF
 */
public class Circumference implements MyInterface{

    @Override
    public double compute(int x) {
  return 2*PI*x;
    }
    
}
