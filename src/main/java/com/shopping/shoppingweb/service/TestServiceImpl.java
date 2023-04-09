package com.shopping.shoppingweb.service;

import com.shopping.shoppingweb.domain.TestEntity;
import com.shopping.shoppingweb.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<TestEntity> findAll() {
        return testRepository.findAll();
    }

    @Override
    public Optional<TestEntity> findById(long Id) {
        return testRepository.findById(Id);
    }

}
