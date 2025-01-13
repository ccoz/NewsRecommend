package csu.nr.news.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import csu.yang.api.domain.po.New;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class INewServiceimplTest {
    @Autowired
    protected INewService newService;

    @Test
    void testGetById() {
        New result = newService.getById(1L);
        System.out.printf(result.toString());
    }
}
