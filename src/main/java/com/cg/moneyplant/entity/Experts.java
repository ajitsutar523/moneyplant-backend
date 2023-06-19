package com.cg.moneyplant.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Experts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String communityProfile;
    private String title;
    private long mobile;
    private long ratings;
    private long reviews;
    private double experience;
    private String education;
    private double fees;
    private String tags;
    @JsonIgnore
    @OneToMany(mappedBy = "experts")
    private List<Enquiry> enquiry;
}
