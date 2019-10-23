package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpockTest {

    @Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("rocK"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("SCISSORS"));
        Assert.assertTrue(RPSLSpock.isValidPick("liZard"));
        Assert.assertTrue(RPSLSpock.isValidPick("Spock"));
        Assert.assertTrue(!RPSLSpock.isValidPick("lizzard"));
    }

    @Test
    public void generatePick() {
        int i = 1000000;
        while( i > 0) {
            String randPick = RPSLSpock.generatePick();
            Assert.assertTrue(RPSLSpock.isValidPick(randPick));
            i--;
        }

    }

    @Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin( "scissors", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "scissors"));
        Assert.assertTrue(!RPSLSpock.isComputerWin("spock", "lizard"));
    }
}