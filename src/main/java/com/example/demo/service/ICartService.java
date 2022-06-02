package com.example.demo.service;

import com.example.demo.dto.CartDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.model.Cart;

import java.util.Optional;

public interface ICartService {

    ResponseDTO getCartDetails();


    Optional<Cart> getCartDetailsById(Integer cartId);

    Optional<Cart> deleteCartItemById(Integer cartId);

    Cart updateRecordById(Integer cartId, CartDTO cartDTO);

    Cart insertItems(CartDTO cartdto);

    Cart updateQuantity(Integer id, Integer quantity);
}
