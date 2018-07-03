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

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest

public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Item item = new Item(new BigDecimal(20), 5, new BigDecimal(100));
        Item item1 = new Item(new BigDecimal(12), 7, new BigDecimal(84));
        Item item2 = new Item(new BigDecimal(10), 8, new BigDecimal(80));

        Product product = new Product("Cherries");
        Product product1 = new Product("Blueberries");
        Product product2 = new Product("Strawberries");

        product.getItems().add(item);
        product1.getItems().add(item1);
        product2.getItems().add(item2);

        Invoice invoice = new Invoice("1");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);

        //when
        productDao.save(product);
        int productId = product.getId();
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();

        invoiceDao.save(invoice);
        int id = invoice.getId();

        itemDao.save(item);
        int itemId = item.getId();
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();

        //then
        Assert.assertNotEquals(0, id);

        //clean up
        try {
            itemDao.delete(itemId);
            itemDao.delete(item1Id);
            itemDao.delete(item2Id);
            productDao.delete(productId);
            productDao.delete(product1Id);
            productDao.delete(product2Id);
            invoiceDao.delete(id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
