package com.apress.demo;

import com.apress.demo.orders.entities.Order;
import com.apress.demo.orders.repositories.OrderRepository;
import com.apress.demo.security.entities.User;
import com.apress.demo.security.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaMultipleApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void findAllUsers() {
        List<User> users = userRepository.findAll();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void findAllOrders() {
        List<Order> orders = orderRepository.findAll();
        assertNotNull(orders);
        assertTrue(!orders.isEmpty());
    }

}
