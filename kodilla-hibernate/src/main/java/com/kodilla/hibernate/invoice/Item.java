package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public final class Item {

    private int id;
    private BigDecimal prize;
    private int quantity;
    private BigDecimal totalValue;
    private Invoice invoice;
    private Product product;

    public Item() {
    }

    public Item( BigDecimal prize, int quantity, BigDecimal totalValue) {
        this.prize = prize;
        this.quantity = quantity;
        this.totalValue = totalValue;
    }

    @Id
    @NotNull
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @NotNull
    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    @NotNull
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @NotNull
    public BigDecimal getValue() {
        return totalValue;
    }

    public void setValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
