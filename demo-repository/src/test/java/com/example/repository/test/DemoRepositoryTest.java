package com.example.repository.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Demo;
import com.example.repository.DemoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
@Transactional
public class DemoRepositoryTest {

    @PersistenceContext 
    private EntityManager entityManager;

    @Autowired
    private DemoRepository demoRepository;

    @Test
    public void testExample() throws Exception {
    	Demo demo = new Demo();
    	String name = "osv";
    	demo.setName(name);
        entityManager.persist(demo);
        demo = demoRepository.findByName(name);
        Assert.assertEquals(name, demo.getName());
    }
}
