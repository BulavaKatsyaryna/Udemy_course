package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="employees")
public class Employee {

    @Column(name="id")
    private int id;

    private String name;

    private String surename;

    private String department;

    private int salary;

}
