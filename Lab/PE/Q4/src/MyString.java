/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyString implements IString{
    private boolean isPrimeDigit(char c){
        int digit = Character.getNumericValue(c);
        if(digit < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if(digit % i == 0)
                return false;
        }
        return true;
    }
    @Override
    public int f1(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c) && isPrimeDigit(c)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split(" ");
        StringBuilder reserved = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            reserved.append(words[i]);
            if(i > 0){
                reserved.append(" ");
            }
        }
        return reserved.toString();
  }
    
}
