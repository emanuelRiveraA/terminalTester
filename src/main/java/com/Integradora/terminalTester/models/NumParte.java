package com.Integradora.terminalTester.models;


import javax.persistence.*;

@Entity
@Table(name = "partnumber")
public class NumParte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer	id;

    @Column(name = "custpn")
    private String	custpn;

    @Column(name = "caracter")
    private String	caracter;


    public NumParte() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustpn() {
        return custpn;
    }

    public void setCustpn(String custpn) {
        this.custpn = custpn;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
}
