package com.Integradora.terminalTester.models;


import javax.persistence.*;
import java.util.Date;

@Entity

@Table(name = "acconf")
public class Acconfig {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "program")
    private String	PROGRAM;

    @Column(name = "bundle")
    private String	BUNDLE;

    @Column(name = "validit")
    private String	VALIDIT;

    @Column(name = "ac")
    private String	AC;

    @Column(name = "actyp")
    private String	ACTYP;

    @Column(name = "custid")
    private String	CUSTID;

    @Column(name = "code7cb")
    private String	CODE7CB;

    @Column(name = "code7en")
    private String	CODE7EN;

    @Column(name = "qty3")
    private Integer	QTY3;

    @Column(name = "totqty3")
    private Integer	TOTQTY3;

    @Column(name = "launchdt")
    private String LAUNCHDT;

    @Column(name = "datec")
    private Date	DATEC;

    @Column(name = "usern")
    private String	USERN;

    @Column(name = "active")
    private String	ACTIVE;

    public Acconfig() {
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

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = AC;
    }

    public String getACTYP() {
        return ACTYP;
    }

    public void setACTYP(String ACTYP) {
        this.ACTYP = ACTYP;
    }

    public String getCUSTID() {
        return CUSTID;
    }

    public void setCUSTID(String CUSTID) {
        this.CUSTID = CUSTID;
    }

    public String getCODE7CB() {
        return CODE7CB;
    }

    public void setCODE7CB(String CODE7CB) {
        this.CODE7CB = CODE7CB;
    }

    public String getCODE7EN() {
        return CODE7EN;
    }

    public void setCODE7EN(String CODE7EN) {
        this.CODE7EN = CODE7EN;
    }

    public Integer getQTY3() {
        return QTY3;
    }

    public void setQTY3(Integer QTY3) {
        this.QTY3 = QTY3;
    }

    public Integer getTOTQTY3() {
        return TOTQTY3;
    }

    public void setTOTQTY3(Integer TOTQTY3) {
        this.TOTQTY3 = TOTQTY3;
    }

    public String getLAUNCHDT() {
        return LAUNCHDT;
    }

    public void setLAUNCHDT(String LAUNCHDT) {
        this.LAUNCHDT = LAUNCHDT;
    }

    public Date getDATEC() {
        return DATEC;
    }

    public void setDATEC(Date DATEC) {
        this.DATEC = DATEC;
    }

    public String getUSERN() {
        return USERN;
    }

    public void setUSERN(String USERN) {
        this.USERN = USERN;
    }

    public String getACTIVE() {
        return ACTIVE;
    }

    public void setACTIVE(String ACTIVE) {
        this.ACTIVE = ACTIVE;
    }
}
