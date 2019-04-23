package main.java.decorator;

/**.
*Acquisition.
*Makes call to super class and applies decorator.
*/

//*class to implement acquisition*//
public class Acquisition extends AcquireDecorator {

    //*call acquisition from AcquireDecorator*//
    public Acquisition(Acquire acquisition) {
       super(acquisition);        
    }

    @Override
    //*Implement decorator to acquire method*//
    public void acquire() {
        decoratedAcquire.acquire();
    }
}