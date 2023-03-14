package com.shopping.shoppingweb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "test")
@Getter
public class Test {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "TEST_KEY")
    private Long testKey;

    @Column(name = "TEST_DATA")
    private String testData;

}
