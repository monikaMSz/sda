package sda.code.intermediate;

import org.junit.Test;

import java.util.Arrays;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelfTest {

    @Test
    public void simpleFileLoadersTest() {
        Properties props = new FileLoaders().loadDefaultProperties();
        assertTrue(Boolean.parseBoolean(props.getProperty("success")));
        assertEquals(42, Integer.parseInt(props.getProperty("answer")));
        assertEquals("World", props.getProperty("hello.msg"));
        assertEquals("?", props.getProperty("nonexistent", "?"));
    }

    @Test
    public void simpleSortingChecksTest() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0};
        Arrays.sort(array);
        assertTrue(new SortingChecks().isSorted(array));
    }
}
