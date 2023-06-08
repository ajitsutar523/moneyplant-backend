package com.cg.moneyplant.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Experts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String FirstName;
    private String Lastname;
    private String emailId;
    private String communityProfile;
    private String speciality;
    private long mobile;
    private long ratings;
    private long reviews;
    private double experience;
    private double fees;
    private String bio;
    @OneToMany(mappedBy = "experts")
    private List<Enquiry> enquiry;
}
