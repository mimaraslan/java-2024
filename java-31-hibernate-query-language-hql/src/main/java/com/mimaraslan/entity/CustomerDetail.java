package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Setter
@Getter
//@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetail {

    // FIXME
    @OneToOne (cascade = CascadeType.PERSIST,orphanRemoval = true)
    @JoinColumn
    Customer customer;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "foreign", strategy = "foreign",
            parameters = {
            @org.hibernate.annotations.Parameter(name = "property", value="customer")
             }
    )

    @Column(name = "CUSTOMER_DETAIL_ID")
    private int customerDetailId;


    @Column(name = "ADDRESS", length = 1000)
    private String address;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "EMAIL", length = 110)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREATE")
    private Date createDate;
}
