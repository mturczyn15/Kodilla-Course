package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("szynka");
        Product product2 = new Product("ser");
        productDao.save(product2);
        productDao.save(product1);

        Item item1 = new Item(new BigDecimal(4), 3, new BigDecimal(12));
        Item item2 = new Item(new BigDecimal(5), 3, new BigDecimal(15));

        item1.setProduct(product1);
        item2.setProduct(product2);

        Invoice invoice = new Invoice("1");
        invoice.addItem(item2);
        invoice.addItem(item1);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //Clean
        invoiceDao.delete(invoice);
        productDao.delete(product2);
        productDao.delete(product1);
    }
}
