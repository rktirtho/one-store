package com.rktirthoh.onestore.entity;

import com.rktirthoh.onestore.entity.user.User;
import com.rktirthoh.onestore.entity.user.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String area;
    private String postCode;
    private String district;
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    private UserDetails userDetails;
}
