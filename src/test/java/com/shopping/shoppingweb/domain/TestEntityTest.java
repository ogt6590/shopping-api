package com.shopping.shoppingweb.domain;

import com.shopping.shoppingweb.repository.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class TestEntityTest {

    @Autowired
    TestRepository testRepository;

    @Test
    public void getId() {
        TestEntity insertData = testRepository.save(TestEntity.builder()
                .testData("testData").build());

        TestEntity selectData = testRepository.findById(insertData.getTestKey()).get();
        assertThat(insertData).isEqualTo(selectData);
    }

}