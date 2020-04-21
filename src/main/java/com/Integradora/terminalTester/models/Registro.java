package com.Integradora.terminalTester.models;

import javax.persistence.*;

@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer	id;

    @Column(name = "codeen")
    private String	CODEEN;


    @Column(name = "elitem")
    private String	ELITEM;

    @Column(name = "custpn")
    private String	CUSTPN;

    @Column(name = "datec")
    private String	DATEC;

    @Column(name = "descripcion")
    private String	DESCRIPCION;

    public Registro() {
    }

    public Registro(Integer id, String CODEEN, String ELITEM, String CUSTPN, String DATEC, String DESCRIPCION) {
        this.id = id;
        this.CODEEN = CODEEN;
        this.ELITEM = ELITEM;
        this.CUSTPN = CUSTPN;
        this.DATEC = DATEC;
        this.DESCRIPCION = DESCRIPCION;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCODEEN() {
        return CODEEN;
    }

    public void setCODEEN(String CODEEN) {
        this.CODEEN = CODEEN;
    }

    public String getELITEM() {
        return ELITEM;
    }

    public void setELITEM(String ELITEM) {
        this.ELITEM = ELITEM;
    }

    public String getCUSTPN() {
        return CUSTPN;
    }

    public void setCUSTPN(String CUSTPN) {
        this.CUSTPN = CUSTPN;
    }

    /* public String getDATEC() {
        return DATEC;
    }

    public void setDATEC(String DATEC) {
        this.DATEC = DATEC;
    }*/

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
}
