package Task3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskThreeTest {
    @Test
    public void firstTest(){
        TaskThree go = new TaskThree();
        int[] list = {1, 8, 6 ,2, 5, 4, 8, 3, 7};
        int res = go.function(list);
        Assert.assertEquals(49, res);
    }
    @Test
    public void secondTest(){
        TaskThree go = new TaskThree();
        int[] list = {1, 1};
        int res = go.function(list);
        Assert.assertEquals(1, res);
    }
    @Test
    public void thirdTest(){
        TaskThree go = new TaskThree();
        int[] list = {4, 3, 2, 1, 4};
        int res = go.function(list);
        Assert.assertEquals(16, res);
    }
    @Test
    public void fourthTest(){
        TaskThree go = new TaskThree();
        int[] list = {1, 2, 1};
        int res = go.function(list);
        Assert.assertEquals(2, res);
    }

}