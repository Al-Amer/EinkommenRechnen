
import javax.swing.*;  // importing all javax.swing
import java.awt.*;      // importing all java.awt
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args) {



        JFrame windows = new JFrame("Steuer Rechnen windows");
        JLabel welcome_label = new JLabel("Welcom");
        Font welcom_font = new Font("Serfi",Font.BOLD,25);
        welcome_label.setFont(welcom_font);
        JTextField person_name = new JTextField();              //
        JLabel label_1 = new JLabel("Name :");
        JTextField einkommen = new JTextField();                //
        JLabel label_2 = new JLabel("Monatlich Lohn");
        JTextField stuer_klasse = new JTextField();             //
        JLabel label_3 = new JLabel("Stuer Klasse");
        JButton button = new JButton("Enter");
        JLabel labelResult = new JLabel();
        JLabel labelResult_0 = new JLabel();
        JLabel labelResult_1 = new JLabel();
        JLabel labelResult_2 = new JLabel();
        JLabel labelResult_3 = new JLabel();
        JLabel labelResult_4 = new JLabel();
        JLabel labelResult_5 = new JLabel();
        JLabel labelResult_6 = new JLabel();
        JLabel labelResult_7 = new JLabel();
        JLabel labelResult_8 = new JLabel();



        // windows
        windows.setSize(500, 700);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setLayout(new FlowLayout());

        //------------------------------------
        welcome_label.setBounds(200,20,100,60);
        label_1.setBounds(50,100,100,30);
        person_name.setBounds(180,100,100,30);
        label_2.setBounds(50,150,100,30);
        einkommen.setBounds(180,150,100,30);
        label_3.setBounds(50,200,100,30);
        stuer_klasse.setBounds(180,200,100,30);
        button.setBounds(50,250,100,30);
        labelResult.setBounds(25,280,450,30);
        labelResult_0.setBounds(25,310,450,30);
        labelResult_1.setBounds(25,340,450,30);
        labelResult_2.setBounds(25,370,450,30);
        labelResult_3.setBounds(25,400,450,30);
        labelResult_4.setBounds(25,430,450,30);
        labelResult_5.setBounds(25,460,450,30);
        labelResult_6.setBounds(25,490,450,30);
        labelResult_7.setBounds(25,520,450,30);
        labelResult_8.setBounds(25,550,450,30);
        //add
        windows.add(welcome_label);
        windows.add(label_1);
        windows.add(person_name);
        windows.add(label_2);
        windows.add(einkommen);
        windows.add(label_3);
        windows.add(stuer_klasse);
        windows.add(button);
        windows.add(labelResult);
        windows.add(labelResult_0);
        windows.add(labelResult_1);
        windows.add(labelResult_2);
        windows.add(labelResult_3);
        windows.add(labelResult_4);
        windows.add(labelResult_5);
        windows.add(labelResult_6);
        windows.add(labelResult_7);
        windows.add(labelResult_8);

        //Imprtans
        windows.setLayout(null);
        windows.setVisible(true);   // to see the windows (true)



        // button drucken  und rechnen;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   // double de1=Double.valueOf(einkommen.getText());
                    int klass=Integer.valueOf(stuer_klasse.getText());
                    //object von kalss machen
                   // Rechnen rechnen=new Rechnen(de1,klass);               1
                    //String info_copy= rechnen.rechnen_result();           1
                    //ergibniss
                    String name=String.valueOf(person_name.getText());
                    double monatlich_lohn=Double.valueOf(einkommen.getText());;
                    //====================================================================
                    // object von klass machen, um die prozess uberprufung
                    Rechnen rechnen=new Rechnen(monatlich_lohn,klass,name);
                    rechnen.rechnen_result();

                    // Java Swing
                    double jahrig_lohn;
                    double tax ;
                    tax=0;
                    double rentenversicherung;
                    double arbeitslosversicherung;
                    double krankenversicherung;
                    double pflegeversicherung;
                    double netto;
                    jahrig_lohn = monatlich_lohn * 12;
                    rentenversicherung=jahrig_lohn * 0.093;
                    arbeitslosversicherung=jahrig_lohn * 0.012;
                    krankenversicherung=jahrig_lohn * 0.012;
                    pflegeversicherung=jahrig_lohn * 0.0178;
                    if (klass == 1) {
                        tax = jahrig_lohn * 0.0818;
                    } else if (klass == 2) {
                        tax = jahrig_lohn * 0.0623;
                    } else if (klass == 3) {
                        tax = jahrig_lohn * 0;
                    } else if (klass == 4) {
                        tax = jahrig_lohn * 0.0818;
                    } else if (klass == 5) {
                        tax = jahrig_lohn * 0.1995;
                    } else if (klass == 6) {
                        tax = jahrig_lohn * 0.2170;
                    } else {
                        System.out.println("wrong ");
                       labelResult.setForeground(Color.red);

                        labelResult.setText("eine Fehler ");
                    }
                    netto=jahrig_lohn-((tax+rentenversicherung+arbeitslosversicherung)+(krankenversicherung+pflegeversicherung));

                    //====================================================================
                    if(name.length() != 0) {
                        if(monatlich_lohn>0.0) {
                            if (tax < 0 || tax > 7) {
                                labelResult.setForeground(Color.black);

                                labelResult.setText("Hallo " + person_name.getText());
                                labelResult_1.setText("jahriglohn: " + jahrig_lohn);
                                labelResult_2.setText("Steuer: " + tax);
                                labelResult_3.setText("Rentenversicherung: " + rentenversicherung);
                                labelResult_4.setText("Arbeitslosversicherung: " + arbeitslosversicherung);
                                labelResult_5.setText("Krankenversicherung: " + krankenversicherung);
                                labelResult_6.setText("Pflegeversicherung: " + pflegeversicherung);
                                labelResult_7.setText("Jahrig Netto: " + netto);
                                labelResult_8.setText("Monatlich Netto: " + (netto / 12));
                            } else {
                                labelResult.setForeground(Color.red);
                                labelResult.setText("Hallo " + person_name.getText());
                                labelResult_0.setForeground(Color.red);
                                labelResult_0.setText("Sie Haben Eine Fehler ");
                                labelResult_1.setForeground(Color.red);
                                labelResult_1.setText("bitte Kontrollieren Sie ");
                                labelResult_2.setForeground(Color.red);
                                labelResult_2.setText("Ihre Angabe/Steuer Klass");
                                labelResult_3.setForeground(Color.red);
                                labelResult_3.setText("und Versuchen Sie  Nachmal");
                                labelResult_4.setForeground(Color.red);
                                labelResult_4.setText("Vielen Dank");
                            }
                        }else{
                            labelResult.setForeground(Color.red);
                            labelResult.setText("Hallo " + person_name.getText());
                            labelResult_0.setForeground(Color.red);
                            labelResult_0.setText("Sie Haben Eine Fehler ");
                            labelResult_1.setForeground(Color.red);
                            labelResult_1.setText("bitte Kontrollieren Sie ");
                            labelResult_2.setForeground(Color.red);
                            labelResult_2.setText("Ihre Monathlich Einkommen");
                            labelResult_3.setForeground(Color.red);
                            labelResult_3.setText("und Versuchen Sie  Nachmal");
                            labelResult_4.setForeground(Color.red);
                            labelResult_4.setText("Vielen Dank");
                        }
                    }else if (name.length()==0){
                        labelResult.setForeground(Color.red);
                        labelResult.setText("Hallo " );
                        labelResult_0.setForeground(Color.red);
                        labelResult_0.setText("Sie Haben Eine Fehler ");
                        labelResult_1.setForeground(Color.red);
                        labelResult_1.setText("bitte Schrieben Sie ");
                        labelResult_2.setForeground(Color.red);
                        labelResult_2.setText("Ihre Name");
                        labelResult_3.setForeground(Color.red);
                        labelResult_3.setText("und Versuchen Sie  Nachmal");
                        labelResult_4.setForeground(Color.red);
                        labelResult_4.setText("Vielen Dank");

                    }

                }catch (Exception ex){
                    labelResult.setForeground(Color.red);

                    labelResult.setText("eine Fehler ");
                }
            }
        });






    }
}
