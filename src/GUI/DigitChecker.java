/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author User
 */
public class DigitChecker {
    boolean isDigit(String str)
    {
        boolean flag = true;
        try
        {
            Long num = Long.parseLong(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            flag = false;
        }
        return flag;
    }
}
