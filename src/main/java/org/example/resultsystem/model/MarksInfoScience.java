package org.example.resultsystem.model;

import org.example.resultsystem.HelloApplication;

public class MarksInfoScience {
    private double ban;
    private double eng;
    private double hm;
    private double phy;
    private double chem;
    private double bio;
    private double ict;
    private double ban2;
    private double eng2;
    private double hm2;
    private double phy2;
    private double chem2;

    public MarksInfoScience(double ban, double eng, double hm, double phy, double chem, double bio, double ict, double ban2, double eng2, double hm2, double phy2, double chem2, double bio2, String banM, String engM, String hmM, String phyM, String chemM, String bioM, String ban2M, String eng2M, String hm2M, String phy2M, String chem2M, String bio2M, String ictM, double finalGpa, String finalGrade) {
        this.ban = ban;
        this.eng = eng;
        this.hm = hm;
        this.phy = phy;
        this.chem = chem;
        this.bio = bio;
        this.ict = ict;
        this.ban2 = ban2;
        this.eng2 = eng2;
        this.hm2 = hm2;
        this.phy2 = phy2;
        this.chem2 = chem2;
        this.bio2 = bio2;
        this.banM = banM;
        this.engM = engM;
        this.hmM = hmM;
        this.phyM = phyM;
        this.chemM = chemM;
        this.bioM = bioM;
        this.ban2M = ban2M;
        this.eng2M = eng2M;
        this.hm2M = hm2M;
        this.phy2M = phy2M;
        this.chem2M = chem2M;
        this.bio2M = bio2M;
        this.ictM = ictM;
        this.finalGpa = finalGpa;
        this.finalGrade = finalGrade;
    }

    public MarksInfoScience(double ban, double eng, double hm, double phy, double chem, double bio, double ict, double ban2, double eng2, double hm2, double phy2, double chem2, double bio2, String banM, String engM, String hmM, String phyM, String chemM, String bioM, String ictM, double finalGpa, String finalGrade) {
        this.ban = ban;
        this.eng = eng;
        this.hm = hm;
        this.phy = phy;
        this.chem = chem;
        this.bio = bio;
        this.ict = ict;
        this.ban2 = ban2;
        this.eng2 = eng2;
        this.hm2 = hm2;
        this.phy2 = phy2;
        this.chem2 = chem2;
        this.bio2 = bio2;
        this.banM = banM;
        this.engM = engM;
        this.hmM = hmM;
        this.phyM = phyM;
        this.chemM = chemM;
        this.bioM = bioM;
        this.ictM = ictM;
        this.finalGpa = finalGpa;
        this.finalGrade = finalGrade;
    }

    public double getBan2() {
        return ban2;
    }

    public void setBan2(double ban2) {
        this.ban2 = ban2;
    }

    public double getEng2() {
        return eng2;
    }

    public void setEng2(double eng2) {
        this.eng2 = eng2;
    }

    public double getHm2() {
        return hm2;
    }

    public void setHm2(double hm2) {
        this.hm2 = hm2;
    }

    public double getPhy2() {
        return phy2;
    }

    public void setPhy2(double phy2) {
        this.phy2 = phy2;
    }

    public double getChem2() {
        return chem2;
    }

    public void setChem2(double chem2) {
        this.chem2 = chem2;
    }

    public double getBio2() {
        return bio2;
    }

    public void setBio2(double bio2) {
        this.bio2 = bio2;
    }

    private double bio2;


    private String banM;
    private String engM;
    private String hmM;
    private String phyM;
    private String chemM;
    private String bioM;
    private String ban2M;
    private String eng2M;
    private String hm2M;
    private String phy2M;
    private String chem2M;
    private String bio2M;

    public String getBan2M() {
        return ban2M;
    }

    public void setBan2M(String ban2M) {
        this.ban2M = ban2M;
    }

    public String getEng2M() {
        return eng2M;
    }

    public void setEng2M(String eng2M) {
        this.eng2M = eng2M;
    }

    public String getHm2M() {
        return hm2M;
    }

    public void setHm2M(String hm2M) {
        this.hm2M = hm2M;
    }

    public String getPhy2M() {
        return phy2M;
    }

    public void setPhy2M(String phy2M) {
        this.phy2M = phy2M;
    }

    public String getChem2M() {
        return chem2M;
    }

    public void setChem2M(String chem2M) {
        this.chem2M = chem2M;
    }

    public String getBio2M() {
        return bio2M;
    }

    public void setBio2M(String bio2M) {
        this.bio2M = bio2M;
    }

    private String ictM;
    private double finalGpa;
    private String finalGrade;
    private String subject;
    private double marks;




    public MarksInfoScience(double hm, double phy, double chem) {
        this.hm = hm;
        this.phy = phy;
        this.chem = chem;
    }

    public MarksInfoScience(double hm, double phy, double chem,String year) {
        this.hm = hm;
        this.phy = phy;
        this.chem = chem;
        this.year = year;
    }

    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String grade;


    public MarksInfoScience(String subject, double marks, String grade) {
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MarksInfoScience(double ban, double eng) {
        this.ban = ban;
        this.eng = eng;
    }


    public MarksInfoScience(String finalGrade,double finalGpa,double ban,double eng,double hm,double phy,double chem) {
        this.finalGpa = finalGpa;
        this.finalGrade = finalGrade;
        this.ban = ban;
        this.phy = phy;
        this.chem = chem;
        this.hm = hm;
        this.eng = eng;
    }

    public MarksInfoScience(double ban, double eng, double hm, double phy, double chem, double bio, double ict, String banM, String engM, String hmM, String phyM, String chemM, String bioM, String ictM, double finalGpa, String finalGrade) {
        this.finalGrade = finalGrade;
        this.finalGpa = finalGpa;
        this.ban = ban;
        this.eng = eng;
        this.hm = hm;
        this.phy = phy;
        this.chem = chem;
        this.bio = bio;
        this.ict = ict;
        this.banM = banM;
        this.engM = engM;
        this.hmM = hmM;
        this.phyM = phyM;
        this.chemM = chemM;
        this.bioM = bioM;
        this.ictM = ictM;
    }

    public MarksInfoScience(String banM, String engM, String hmM, String phyM, String chemM, String bioM, String ictM) {
        this.banM = banM;
        this.engM = engM;
        this.hmM = hmM;
        this.phyM = phyM;
        this.chemM = chemM;
        this.bioM = bioM;
        this.ictM = ictM;

    }
    public MarksInfoScience(double ban, double eng, double hm, double phy, double chem, double bio, double ict) {
        this.ban = ban;
        this.eng = eng;
        this.hm = hm;
        this.phy = phy;
        this.chem = chem;
        this.bio = bio;
        this.ict = ict;
    }

    public double getBan() {
        return ban;
    }

    public void setBan(double ban) {
        this.ban = ban;
    }

    public double getEng() {
        return eng;
    }

    public void setEng(double eng) {
        this.eng = eng;
    }

    public double getHm() {
        return hm;
    }

    public void setHm(double hm) {
        this.hm = hm;
    }

    public double getPhy() {
        return phy;
    }

    public void setPhy(double phy) {
        this.phy = phy;
    }

    public double getChem() {
        return chem;
    }

    public void setChem(double chem) {
        this.chem = chem;
    }

    public double getBio() {
        return bio;
    }

    public void setBio(double bio) {
        this.bio = bio;
    }

    public double getIct() {
        return ict;
    }

    public void setIct(double ict) {
        this.ict = ict;
    }

    public String getBanM() {
        return banM;
    }

    public void setBanM(String banM) {
        this.banM = banM;
    }

    public String getEngM() {
        return engM;
    }

    public void setEngM(String engM) {
        this.engM = engM;
    }

    public String getHmM() {
        return hmM;
    }

    public void setHmM(String hmM) {
        this.hmM = hmM;
    }

    public String getPhyM() {
        return phyM;
    }

    public void setPhyM(String phyM) {
        this.phyM = phyM;
    }

    public String getChemM() {
        return chemM;
    }

    public void setChemM(String chemM) {
        this.chemM = chemM;
    }

    public String getBioM() {
        return bioM;
    }

    public void setBioM(String bioM) {
        this.bioM = bioM;
    }

    public String getIctM() {
        return ictM;
    }

    public void setIctM(String ictM) {
        this.ictM = ictM;
    }

    public double getFinalGpa() {
        return finalGpa;
    }

    public void setFinalGpa(double finalGpa) {
        this.finalGpa = finalGpa;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }
}
