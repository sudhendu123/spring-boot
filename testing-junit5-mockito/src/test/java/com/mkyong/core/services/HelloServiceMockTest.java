package com.mkyong.core.services;

import com.mkyong.core.repository.HelloRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class) , need this? still able to run.
@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;

    //@Spy
    @InjectMocks // auto inject helloRepository
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setMockOutput() {
        //when(helloService.get()).thenReturn("Hello Mockito");
        when(helloRepository.getString(2, 3)).thenReturn("mock repo");
    }

    @DisplayName("Test Mock")
    @Test
    void testGet() {
        assertEquals("mock repo", helloService.getString(2, 3));
    }

}