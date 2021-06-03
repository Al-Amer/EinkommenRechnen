
public class Rechnen {
    String name;
    double monatlich_lohn;
    int  steuer_klass ;
    double jahrig_lohn;
    double tax ;
    double rentenversicherung;
    double arbeitslosversicherung;
    double krankenversicherung;
    double pflegeversicherung;
    public Rechnen( double monatlich_lohn,int  steuer_klass,String name){
        this.monatlich_lohn=monatlich_lohn;
        this.steuer_klass=steuer_klass;
        this.name=name;
    }
    public void rechnen_result() {
        jahrig_lohn = monatlich_lohn * 12;
        rentenversicherung=jahrig_lohn * 0.093;
        arbeitslosversicherung=jahrig_lohn * 0.012;
        krankenversicherung=jahrig_lohn * 0.012;
        pflegeversicherung=jahrig_lohn * 0.0178;
    if (name.length() !=0) {
        if(monatlich_lohn >0) {
            if (steuer_klass >0 ||steuer_klass<7) {
                if (steuer_klass == 1) {
                    tax = jahrig_lohn * 0.0818;
                } else if (steuer_klass == 2) {
                    tax = jahrig_lohn * 0.0623;
                } else if (steuer_klass == 3) {
                    tax = jahrig_lohn * 0;
                } else if (steuer_klass == 4) {
                    tax = jahrig_lohn * 0.0818;
                } else if (steuer_klass == 5) {
                    tax = jahrig_lohn * 0.1995;
                } else if (steuer_klass == 6) {
                    tax = jahrig_lohn * 0.2170;
                }
                System.out.println("das ist ihre lohn steuer: " + tax + "$");
                System.out.println("Rentenversicherung: " + rentenversicherung);
                System.out.println("Arbeitslosversicherung: "+arbeitslosversicherung );
                System.out.println("Krankenversicherung: " +krankenversicherung);
                System.out.println("Pflegeversicherung: " + pflegeversicherung);

                System.out.println("and das ist Ihre Jahrig Netto"+(jahrig_lohn-tax-rentenversicherung-arbeitslosversicherung-krankenversicherung-pflegeversicherung));

            }else {

                System.out.println("die Steuer klass its falsch ");
            }
        }else if (monatlich_lohn==0){
            System.out.println("die Einkommen ist falsch ");
        }
    }else if (name.length()==0){
        System.out.println("die Name ist nicht geschrieben  ");
    }




    }


    }

