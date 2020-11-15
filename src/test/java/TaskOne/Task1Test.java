package TaskOne;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.rules.ExpectedException;

import java.rmi.server.ExportException;


public class Task1Test {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenPass25ThenFalseTest() {
        Task1 go = new Task1();
        String func = go.func("105");
        Assert.assertEquals("false", func);
    }

    @Test
    public void funcTest() {
        Task1 go = new Task1();
        String func = go.func("69");
        Assert.assertEquals("true", func);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void whenPassNullThenError() {
        Task1 go = new Task1();
        go.func(null);
    }

    @Test
    public void whenPassNullThenErrorTwo() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Нельзя передавать null!!!");
        Task1 go = new Task1();
        go.func(null);
    }

    @Test
    public void whenPassNullThenErrorThree() {
        final Task1 go = new Task1();
        UnsupportedOperationException unsupportedOperationException = Assert
                .assertThrows(UnsupportedOperationException.class, () -> go.func(null));

        Assert.assertEquals("Нельзя передавать null!!!", unsupportedOperationException.getMessage());
        System.out.println("");
    }

}