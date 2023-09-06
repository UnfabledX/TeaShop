package com.leka.teashop.service;

import com.leka.teashop.model.User;
import com.leka.teashop.model.dto.OrderDto;
import com.leka.teashop.model.dto.ProductDto;

public interface OrderService {

    void addToOrder(User currentUser, String quantity, ProductDto productDto);

    void deleteStartedOrdersWhenLogout(User currentUser);

    void decreaseCounter(Long productId, OrderDto order);

    void increaseCounter(Long productId, OrderDto order);

    void deleteProductFromCart(Long productId, OrderDto order);
}
