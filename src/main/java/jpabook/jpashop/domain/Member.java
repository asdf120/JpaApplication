package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    // 내장타입 확인
    @Embedded
    private Address address;

    // 하나의 회원이 여러개의 상품 주문
    // 일대다의 관계
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
