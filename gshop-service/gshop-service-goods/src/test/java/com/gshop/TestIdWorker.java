package com.gshop;

import com.gshop.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestIdWorker.class)
public class TestIdWorker {

    @Test
    public void testIdWorker(){
        IdWorker idWorker = new IdWorker();
        long nextId = idWorker.nextId();
        System.out.println(nextId);

    }

}
