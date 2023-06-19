package com.cg.moneyplant.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private long mobile;
    private String email;
    private String message;
    private boolean offers;
    @ManyToOne(cascade = CascadeType.ALL)
    private Experts experts;


}
