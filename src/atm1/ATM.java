/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm1;

/**
 *
 * @author yarae
 */
public interface ATM {
    public double getcurrentbalance();
    public void withdarw(String amount);
    public void deposit (String amount);
    public String prev( );
    public String next();
}
