package main.java.decorator;

/**.
*Acquire Decorator.
*Decorator class implements Acquire
*/

public abstract class AcquireDecorator implements Acquire {
    
    protected Acquire decoratedAcquire;

    //*Decorator*//
    public AcquireDecorator(Acquire decoratedAcquire) {
        this.decoratedAcquire = decoratedAcquire;
    }

    //*To be used by acquisition*//
    public void acquire() {
        decoratedAcquire.acquire();
    }    
}