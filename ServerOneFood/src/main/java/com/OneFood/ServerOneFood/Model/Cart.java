package com.OneFood.ServerOneFood.Model;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCart;
    private long idUser;
    private long idFood;
    private int cartNumberOfFood;
    private boolean status;

    public Cart(long idUser, long idFood, int cartNumberOfFood, boolean status) {
        this.idUser = idUser;
        this.idFood = idFood;
        this.cartNumberOfFood = cartNumberOfFood;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cart() {
    }

    public long getIdCart() {
        return idCart;
    }

    public void setIdCart(long idCart) {
        this.idCart = idCart;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getIdFood() {
        return idFood;
    }

    public void setIdFood(long idFood) {
        this.idFood = idFood;
    }

    public int getCartNumberOfFood() {
        return cartNumberOfFood;
    }

    public void setCartNumberOfFood(int cartNumberOfFood) {
        this.cartNumberOfFood = cartNumberOfFood;
    }
}
