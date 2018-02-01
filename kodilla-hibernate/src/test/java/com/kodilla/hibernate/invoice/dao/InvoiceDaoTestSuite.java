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
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product jajko = new Product("jajo");
        Product papryka = new Product("Papryka");

        Item pozycja1 = new Item(jajko, new BigDecimal(2), 10, new BigDecimal(1));
        Item pozycja2 = new Item(papryka, new BigDecimal(4), 2, new BigDecimal(3));
        Item pozycja3 = new Item(jajko, new BigDecimal(4), 5, new BigDecimal(3));

        Invoice faktura1 = new Invoice("00012018");

        faktura1.getItems().add(pozycja1);
        faktura1.getItems().add(pozycja2);
        faktura1.getItems().add(pozycja3);

        //When
        invoiceDao.save(faktura1);
        int faktura1Id = faktura1.getId();

        //Then
        Assert.assertNotEquals(0, faktura1Id);

        //CleanUp
        invoiceDao.delete(faktura1Id);
    }
}