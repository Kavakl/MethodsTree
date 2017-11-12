import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by kaval on 12.11.2017.
 */
public class BinaryTreeTest {
    BinaryTree b = new BinaryTree();
    Random r = new Random();
    @Test
    public void remove() throws Exception {
        int count = 0;
        int elem = r.nextInt(20);
        while(count < 20){
            b.add(r.nextInt(20));
            count++;
        }
        b.remove(elem);
        b.remove(6);
        b.remove(10);
        assertEquals(b.remove(elem),true);
        assertEquals(b.contains(elem), false);

    }

}