package com.autoPartsStore.app.service.impl;

import com.autoPartsStore.app.dao.SellerDao;
import com.autoPartsStore.app.dao.impl.SellerDaoImpl;
import com.autoPartsStore.app.domain.Seller;
import com.autoPartsStore.app.service.SellerService;

import java.util.Optional;
import java.util.Set;

public class SellerServiceImpl implements SellerService {

    private static SellerService instance;

    private SellerDao sellerDao = SellerDaoImpl.getInstance();

    private SellerServiceImpl() {

    }

    public static SellerService getInstance() {
        if (instance == null) {
            instance = new SellerServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Seller> getByCategory(Integer category) {
        return sellerDao.getByCategory(category);
    }

    @Override
    //TODO
    public boolean fire(Seller employee) {
        return false;
    }

    @Override
    //TODO
    public boolean hire(Seller employee) {
        return false;
    }

    @Override
    //TODO
    public boolean promote(Seller employee) {
        return false;
    }

    @Override
    //TODO
    public Optional<Seller> save(Seller object) {

        // return sellerDao.save(object);
        return Optional.empty();
    }

    @Override
    public Optional<Seller> update(Seller object) {
        return sellerDao.update(object);
    }

    @Override
    public Set<Seller> getAll() {
        return sellerDao.getAll();
    }

    @Override
    public Optional<Seller> getByName(String name) {
        return sellerDao.getByName(name);
    }

    @Override
    public void delete(Seller object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}