package com.hms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "patients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String name;

    private int age;

    private String gender;

    @Size(max = 200)
    private String address;

    @Size(max = 20)
    private String phoneNumber;

    @Email
    @Size(max = 50)
    private String email;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Temporal(TemporalType.DATE)
    private Date dateOfAdmission;

    @Temporal(TemporalType.DATE)
    private Date dateOfDischarge;

    // getters and setters
}