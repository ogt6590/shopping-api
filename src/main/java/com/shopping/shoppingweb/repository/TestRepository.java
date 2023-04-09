package com.shopping.shoppingweb.repository;

import com.shopping.shoppingweb.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
