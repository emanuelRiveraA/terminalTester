package com.Integradora.terminalTester.models;

import javax.persistence.*;

@Entity

@Table(name = "componentes")
public class Componentes {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "program")
    private String	PROGRAM;

    @Column(name = "bundle")
    private String	BUNDLE;

    @Column(name = "validit")
    private String	VALIDIT;

    @Column(name = "elitem")
    private String	ELITEM;

    @Column(name = "custpn")
    private String	CUSTPN;

    @Column(name = "code7en")
    private String	CODE7EN;

    @Column(name = "active")
    private String	ACTIVE;

    @Column(name = "datec")
    private String	DATEC;



    public Componentes() {
    }

    public String getCUSTPN() {
        return CUSTPN;
    }

    public void setCUSTPN(String CUSTPN) {
        this.CUSTPN = CUSTPN;
    }
    public String getPROGRAM() {
        return PROGRAM;
    }

    public void setPROGRAM(String PROGRAM) {
        this.PROGRAM = PROGRAM;
    }

    public String getBUNDLE() {
        return BUNDLE;
    }

    public void setBUNDLE(String BUNDLE) {
        this.BUNDLE = BUNDLE;
    }

    public String getVALIDIT() {
        return VALIDIT;
    }

    public void setVALIDIT(String VALIDIT) {
        this.VALIDIT = VALIDIT;
    }

    public String getELITEM() {
        return ELITEM;
    }

    public void setELITEM(String ELITEM) {
        this.ELITEM = ELITEM;
    }

    public String getCODE7EN() {
        return CODE7EN;
    }

    public void setCODE7EN(String CODE7EN) {
        this.CODE7EN = CODE7EN;
    }

    public String getACTIVE() {
        return ACTIVE;
    }

    public void setACTIVE(String ACTIVE) {
        this.ACTIVE = ACTIVE;
    }

    public String getDATEC() {
        return DATEC;
    }

    public void setDATEC(String DATEC) {
        this.DATEC = DATEC;
    }
}
