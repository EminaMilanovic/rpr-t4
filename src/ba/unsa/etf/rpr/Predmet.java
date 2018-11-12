package ba.unsa.etf.rpr;

public class Predmet {
    private String naziv;
    private  Student[] studenti;
    private int ects;
    private boolean obavezan;

    public Predmet(String naziv, int ects, boolean obavezan) {
        this.naziv = naziv;
        this.ects = ects;
        this.obavezan = obavezan;
    }

    public Predmet() {

    }


    public boolean isObavezan() {
        return obavezan;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }


    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }


    public void upisiStudentaNaPredmet(Student s){}
    public String spisakStudenataNaPredmetu(){ return"";}
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String n) {
        this.naziv = n;
    }


}
