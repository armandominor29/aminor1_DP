package test.java.decorator;

import static org.junit.Assert.assertTrue;

import main.java.decorator.Acquire;
import main.java.decorator.Acquisition;
import main.java.decorator.ChevroletAcq;
import main.java.decorator.FordAcq;
import main.java.decorator.NissanAcq;

import org.junit.Before;

import org.junit.Test;

public class TestDecorator {
    
    /*Create an instance of each type of vehicle*/
    ChevroletAcq chevyAcq;
    FordAcq fordAcq;
    NissanAcq nissanAcq;

    final Acquire acqChevy = new ChevroletAcq();
    final Acquire acqFord = new Acquisition(new FordAcq());
    final Acquire acqNissan = new Acquisition(new NissanAcq());
    
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testAcquireDecorator() {
        
        /*Set up Chevrolet acquisition*/
        chevyAcq = new ChevroletAcq();
        
        /*Set up Ford acquisition*/
        fordAcq = new FordAcq();
        
        /*Set up Nissan acquisition*/
        nissanAcq = new NissanAcq();
        
        /*test for Chevrolet acquisition for expected results*/
        chevyAcq.setBalance(1000);
        assertTrue(chevyAcq.getBalance() == 1000);
        
        chevyAcq.setCost(800);
        assertTrue(chevyAcq.getCost() == 800);
        
        chevyAcq.setDebt(200);
        assertTrue(chevyAcq.getDebt() == 200);
        
        int cc = chevyAcq.updateBalance();
        assertTrue(cc == 0);
        
        /*test for Ford acquisition for expected results*/
        fordAcq.setBalance(1000);
        assertTrue(fordAcq.getBalance() == 1000);
        
        fordAcq.setCost(800);
        assertTrue(fordAcq.getCost() == 800);
        
        fordAcq.setDebt(200);
        assertTrue(fordAcq.getDebt() == 200);
        
        int ff = fordAcq.updateBalance();
        assertTrue(ff == 0);
        
        /*test for Nissan acquisition for expected results*/
        nissanAcq.setBalance(1000);
        assertTrue(nissanAcq.getBalance() == 1000);
        
        nissanAcq.setCost(800);
        assertTrue(nissanAcq.getCost() == 800);
        
        nissanAcq.setDebt(200);
        assertTrue(nissanAcq.getDebt() == 200);
        
        int nn = nissanAcq.updateBalance();
        assertTrue(nn == 0);
        
        /*test all acquire calls*/
        acqChevy.acquire();
        
        acqFord.acquire();

        acqNissan.acquire();
    }
}