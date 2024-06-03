package com.project.jt_todo_list.Controller;

import com.project.jt_todo_list.controller.PingController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

@SpringBootTest
@ContextConfiguration(classes = PingController.class)
public class PingControllerTest {

    @Autowired
    PingController pingController;

    @Test
    public void whenPingRequest_thenPongResponse() {
        String pingResponse = pingController.ping();

        assertThat(pingResponse).isEqualTo("pong");
    }
}
