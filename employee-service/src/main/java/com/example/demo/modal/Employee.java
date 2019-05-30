package com.example.demo.modal;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    List<Telephone> telephones;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name = "eid", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "pid", referencedColumnName = "id"))
    List<Project> projects;

    @Transient
    Allocation[] allocation;

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Allocation[] getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation[] allocation) {
        this.allocation = allocation;
    }
}
