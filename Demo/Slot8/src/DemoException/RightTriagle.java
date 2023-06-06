/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoException;





/**
 *
 * @author ADMIN
 */
class IllegalRightTriagleException extends Exception{
    public IllegalRightTriagleException(String message){
        super(message);
    }
}
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message){
        super(message);
    }
}



//    private void validateTriagle(int a, int b, int c) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void validRightTriagle(int a, int b, int c) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


public class RightTriagle {
    int a,b,c;
    public RightTriagle(int a,int b,int c) throws IllegalTriangleException,IllegalRightTriagleException{
       validateTriagle(a,b,c);
       validateRightTriagle(a,b,c);
       this.a = a;
       this.b = b;
       this.c = c;
    }
    private void validateTriagle(int a,int b,int c) throws IllegalTriangleException{
        if(a <= 0 || b <= 0 || c <= 0|| (a+b) <= c ||(a+c) <=b||(b+c) <= a){
            throw new IllegalTriangleException("This is not  a triagle");
        }
    }
    private void validateRightTriagle(int a,int b,int c) throws IllegalRightTriagleException{
        if(!(a*a+b*b == c * c || a * a + c * c == b * b|| b*b + c*c == a*a)){
            throw new IllegalRightTriagleException("This is not a right triagle");
        }
    }
    
}

