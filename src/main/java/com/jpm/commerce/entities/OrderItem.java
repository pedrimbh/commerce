package com.jpm.commerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="tb_order_item")
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;
    public OrderItem(){}

    public OrderItem(Order order, Product product, Integer quantirty, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantirty;
        this.price = price;
    }
    public Order getOrder(){
        return id.getOrder();
    }
    public Product getProduct(){
        return id.getProduct();
    }
    public void setOrder(Order order){
        id.setOrder(order);
    }
    public void setProduct(Product product){
        id.setProduct(product);
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantirty(Integer quantirty) {
        this.quantity = quantirty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
