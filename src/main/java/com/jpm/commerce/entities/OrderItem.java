package com.jpm.commerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_order_item")
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantirty;
    private Double price;
    public OrderItem(){}

    public OrderItem(Order order, Product product, Integer quantirty, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantirty = quantirty;
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
    public Integer getQuantirty() {
        return quantirty;
    }

    public void setQuantirty(Integer quantirty) {
        this.quantirty = quantirty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
