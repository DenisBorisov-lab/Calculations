package Task2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTwoTest {
    @Test
    public void whenPass16ThanTrue(){
        TaskTwo go = new TaskTwo();
        Boolean function = go.function(16);
        Assert.assertTrue(function);
    }
    @Test
    public void whenPass5ThanFalse(){
        TaskTwo go = new TaskTwo();
        boolean func = go.function(5);
        Assert.assertFalse(func);
    }
    @Test
    public void whenPass1ThanTrue(){
        TaskTwo go = new TaskTwo();
        boolean function = go.function(1);
        Assert.assertTrue(function);

    }

}