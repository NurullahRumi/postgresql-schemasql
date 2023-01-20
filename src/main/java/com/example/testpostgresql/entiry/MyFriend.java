package com.example.testpostgresql.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_MYFRIEND")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyFriend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phNo;
    private String address;
    private String preAdd;
}
