package com.scrubele.persistance.dao;

import com.scrubele.BeatyProduct;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class BeautyProductDaoImpl extends AbstractDao<BeatyProduct> implements BeautyProductDao, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<BeatyProduct> getEntityClass() {
        return BeatyProduct.class;
    }

    //@Resource
    //private UserTransaction userTransaction;
    
    @PostConstruct
    public void init() {
        System.out.println("ready");
    }

}
