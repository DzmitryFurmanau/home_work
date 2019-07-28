package com.autoPartsStore.app.dao.impl;

import com.autoPartsStore.app.dao.ProductDao;
import com.autoPartsStore.app.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProductDaoImpl implements ProductDao {

    private static ProductDao instance;

    private ProductDaoImpl() {

    }

    public static ProductDao getInstance() {
        if (instance == null) {
            instance = new ProductDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Product> getByPrice(Double price) {
        return new ArrayList<>();
    }

    @Override
    public Predicate<Product> sale(Integer count) {
        return Objects::isNull;
    }

    @Override
    public Optional<Product> save(Product object) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> update(Product object) {
        return Optional.empty();
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Supplier<Product> getByName(String Name) {
        return Product::new;
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
