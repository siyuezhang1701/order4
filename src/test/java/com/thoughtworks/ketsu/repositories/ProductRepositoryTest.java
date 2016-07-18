package com.thoughtworks.ketsu.repositories;

import com.thoughtworks.ketsu.infrastructure.core.Product;
import com.thoughtworks.ketsu.infrastructure.core.ProductRepository;
import com.thoughtworks.ketsu.support.DatabaseTestRunner;
import com.thoughtworks.ketsu.support.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by syzhang on 7/18/16.
 */

@RunWith(DatabaseTestRunner.class)
public class ProductRepositoryTest {

    @Inject
    ProductRepository productRepository;

    @Test
    public void should_save_and_find_product(){
        Product product = productRepository.createProduct(TestHelper.productMap("apple", "red apple", Float.valueOf("1.2")));
        assertThat(product.getName(), is("apple"));
        assertThat(product.getDescription(), is("red apple"));
        assertThat(product.getPrice(), is(Float.valueOf("1.2")));
    }
}
