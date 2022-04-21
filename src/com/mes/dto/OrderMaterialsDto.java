package com.mes.dto;

public class OrderMaterialsDto {

    private int id;
    private int amount;
    private int price;

    private int materials_id; //자재테이블 pk
    private int order_id; //발주테이블 pk

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaterials_id() {
        return materials_id;
    }

    public void setMaterials_id(int materials_id) {
        this.materials_id = materials_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "OrderMaterialsDto{" +
                "id=" + id +
                ", amount=" + amount +
                ", price=" + price +
                ", materials_id=" + materials_id +
                ", order_id=" + order_id +
                '}';
    }
}
