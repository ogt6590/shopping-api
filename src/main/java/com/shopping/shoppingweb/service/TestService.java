package com.shopping.shoppingweb.service;

import com.shopping.shoppingweb.domain.TestEntity;

import java.util.List;
import java.util.Optional;

public interface TestService {
    List<TestEntity> findAll();
    Optional<TestEntity> findById(long Id);
}
