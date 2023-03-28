package com.example.mycgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private Button button1;
    private FloatingActionButton floatingActionButton;
    private TextView textview4;
    private Spinner spinner1;
    private FloatingActionButton mail;

    public double credit1,credit2,credit3,credit4,credit5,credit6;
    public double totalcredits=5;
    public double grade1,grade2,grade3,grade4,grade5,grade6;
    public double creditscored,CGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);


        ArrayList<String> subject = new ArrayList<>();
        subject.add("--SELECT--");
        subject.add("Mathematics I");
        subject.add("Mathematics II");
        subject.add("Computer Programing (Oddsem)");
        subject.add("Computer Programing (Evensem)");
        subject.add("Applied Physics");
        subject.add("Applied Chemistry");
        subject.add("Mechanics");
        subject.add("Manufacturing Processes");
        subject.add("Energy Environment");
        subject.add("Engineering Drawing");
        subject.add("Electrical And Electronics Engineering");
        subject.add("Proffessional Communication");

        ArrayList<String> Grades = new ArrayList<>();
        Grades.add("--SELECT--");
        Grades.add("A+");
        Grades.add("A");
        Grades.add("A-");
        Grades.add("B");
        Grades.add("B-");
        Grades.add("C");
        Grades.add("C-");
        Grades.add("F");


        Spinner spinner1 = findViewById(R.id.spinner1);
        spinner1.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,subject));
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text1 = spinner1.getSelectedItem().toString();
                if(text1 == "Mathematics I"){ credit1 = 3.5 ;}
                else if(text1 == "Mathematics II"){ credit1 = 3.5 ;}
                else if(text1 == "Computer Programing (Oddsem)"){ credit1 = 4.0 ;}
                else if(text1 == "Computer Programing (Evensem)"){ credit1 = 4.0 ;}
                else if(text1 == "Applied Physics"){ credit1 = 4.5 ;}
                else if(text1 == "Applied Chemistry"){ credit1 = 4.5 ;}
                else if(text1 == "Mechanics"){ credit1 = 2.5 ;}
                else if(text1 == "Manufacturing Processes"){ credit1 = 3;}
                else if(text1 == "Energy Environment"){ credit1 = 3.5 ;}
                else if(text1 == "Engineering Drawing"){ credit1 = 4 ;}
                else if(text1 == "Electrical And Electronics Engineering"){credit1 = 4.5 ;}
                else if(text1 == "Proffessional Communication"){ credit1 = 3 ;}
                else if(text1 == "--SELECT--"){ credit1 = 0 ;}

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Spinner spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,subject));
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text2 = spinner2.getSelectedItem().toString();
//                double credit2 ;
                if(text2 == "Mathematics I"){ credit2 = 3.5 ;}
                else if(text2 == "Mathematics II"){ credit2 = 3.5 ;}
                else if(text2 == "Computer Programing (Oddsem)"){ credit2 = 4.0 ;}
                else if(text2 == "Computer Programing (Evensem)"){ credit2 = 4.0 ;}
                else if(text2 == "Applied Physics"){ credit2 = 4.5 ;}
                else if(text2 == "Applied Chemistry"){ credit2 = 4.5 ;}
                else if(text2 == "Mechanics"){ credit2 = 2.5 ;}
                else if(text2 == "Manufacturing Processes"){ credit2 = 3 ;}
                else if(text2 == "Energy Environment"){ credit2 = 3.5 ;}
                else if(text2 == "Engineering Drawing"){ credit2 = 4 ;}
                else if(text2 == "Electrical And Electronics Engineering"){credit2 = 4.5 ;}
                else if(text2 == "Proffessional Communication"){ credit2 = 3 ;}
                else if(text2 == "--SELECT--"){ credit2 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner3 = findViewById(R.id.spinner3);
        spinner3.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,subject));
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text3 = spinner3.getSelectedItem().toString();
//                double credit3 ;
                     if(text3 == "Mathematics I"){ credit3 = 3.5 ;}
                else if(text3 == "Mathematics II"){ credit3 = 3.5 ;}
                else if(text3 == "Computer Programing (Oddsem)"){ credit3 = 4.0 ;}
                else if(text3 == "Computer Programing (Evensem)"){ credit3 = 4.0 ;}
                else if(text3 == "Applied Physics"){ credit3 = 4.5 ;}
                else if(text3 == "Applied Chemistry"){ credit3 = 4.5 ;}
                else if(text3 == "Mechanics"){ credit3 = 2.5 ;}
                else if(text3 == "Manufacturing Processes"){ credit3 = 3 ;}
                else if(text3 == "Energy Environment"){ credit3 = 3.5 ;}
                else if(text3 == "Engineering Drawing"){ credit3 = 4 ;}
                else if(text3 == "Electrical And Electronics Engineering"){credit3 = 4.5 ;}
                else if(text3 == "Proffessional Communication"){ credit3 = 3 ;}
                else if(text3 == "--SELECT--"){ credit3 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Spinner spinner4 = findViewById(R.id.spinner4);
        spinner4.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,subject));
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text4 = spinner4.getSelectedItem().toString();
//                    double credit4 ;
                if(text4 == "Mathematics I"){ credit4 = 3.5 ;}
                else if(text4 == "Mathematics II"){ credit4 = 3.5 ;}
                else if(text4 == "Computer Programing (Oddsem)"){ credit4 = 4.0 ;}
                else if(text4 == "Computer Programing (Evensem)"){ credit4 = 4.0 ;}
                else if(text4 == "Applied Physics"){ credit4 = 4.5 ;}
                else if(text4 == "Applied Chemistry"){ credit4 = 4.5 ;}
                else if(text4 == "Mechanics"){ credit4 = 2.5 ;}
                else if(text4 == "Manufacturing Processes"){ credit4 = 3 ;}
                else if(text4 == "Energy Environment"){ credit4 = 3.5 ;}
                else if(text4 == "Engineering Drawing"){ credit4 = 4 ;}
                else if(text4 == "Electrical And Electronics Engineering"){credit4 = 4.5 ;}
                else if(text4 == "Proffessional Communication"){ credit4 = 3 ;}
                else if(text4 == "--SELECT--"){ credit4 = 0 ;}
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });



        Spinner spinner5 = findViewById(R.id.spinner5);
        spinner5.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,subject));
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text5 = spinner5.getSelectedItem().toString();
                if(text5 == "Mathematics I"){ credit5 = 3.5 ;}
                else if(text5 == "Mathematics II"){ credit5 = 3.5 ;}
                else if(text5 == "Computer Programing (Oddsem)"){ credit5 = 4.0 ;}
                else if(text5 == "Computer Programing (Evensem)"){ credit5 = 4.0 ;}
                else if(text5 == "Applied Physics"){ credit5 = 4.5 ;}
                else if(text5 == "Applied Chemistry"){ credit5 = 4.5 ;}
                else if(text5 == "Mechanics"){ credit5 = 2.5 ;}
                else if(text5 == "Manufacturing Processes"){ credit5 = 3 ;}
                else if(text5 == "Energy Environment"){ credit5 = 3.5 ;}
                else if(text5 == "Engineering Drawing"){ credit5 = 4 ;}
                else if(text5 == "Electrical And Electronics Engineering"){credit5 = 4.5 ;}
                else if(text5 == "Proffessional Communication"){ credit5 = 3 ;}
                else if(text5 == "--SELECT--"){ credit5 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner6 = findViewById(R.id.spinner6);
        spinner6.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,subject));
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text6 = spinner6.getSelectedItem().toString();
                if(text6 == "Mathematics I"){ credit6 = 3.5 ;}
                else if(text6 == "Mathematics II"){ credit6 = 3.5 ;}
                else if(text6 == "Computer Programing (Oddsem)"){ credit6 = 4.0 ;}
                else if(text6 == "Computer Programing (Evensem)"){ credit6 = 4.0 ;}
                else if(text6 == "Applied Physics"){ credit6 = 4.5 ;}
                else if(text6 == "Applied Chemistry"){ credit6 = 4.5 ;}
                else if(text6 == "Mechanics"){ credit6 = 2.5 ;}
                else if(text6 == "Manufacturing Processes"){ credit6 = 3 ;}
                else if(text6 == "Energy Environment"){ credit6 = 3 ;}
                else if(text6 == "Engineering Drawing"){ credit6 = 4 ;}
                else if(text6 == "Electrical And Electronics Engineering"){credit6 = 4.5 ;}
                else if(text6 == "Proffessional Communication"){ credit6 = 3 ;}
                else if(text6 == "--SELECT--"){ credit6 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner7 = findViewById(R.id.spinner7);
        spinner7.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Grades));
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text7 = spinner7.getSelectedItem().toString();
                if(text7 == "A+"){ grade1 = 10;}
                else if(text7 == "A"){ grade1 = 10 ;}
                else if(text7 == "A-"){ grade1 = 9 ;}
                else if(text7 == "B"){ grade1 = 8 ;}
                else if(text7 == "B-"){ grade1 = 7 ;}
                else if(text7 == "C"){ grade1 = 6 ;}
                else if(text7 == "C-"){ grade1 = 5 ;}
                else if(text7 == "F"){ grade1= 0 ;}
                else if(text7 == "--SELECT--"){ grade1 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Spinner spinner8 = findViewById(R.id.spinner8);
        spinner8.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Grades));
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text8 = spinner8.getSelectedItem().toString();
                if(text8 == "A+"){ grade2 = 10;}
                else if(text8 == "A"){ grade2 = 10 ;}
                else if(text8 == "A-"){ grade2 = 9 ;}
                else if(text8 == "B"){ grade2= 8 ;}
                else if(text8 == "B-"){ grade2 = 7 ;}
                else if(text8 == "C"){ grade2 = 6 ;}
                else if(text8 == "C-"){ grade2 = 5 ;}
                else if(text8 == "F"){ grade2= 0 ;}
                else if(text8 == "--SELECT--"){ grade2 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Spinner spinner9 = findViewById(R.id.spinner9);
        spinner9.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Grades));
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text9 = spinner9.getSelectedItem().toString();
                if(text9 == "A+"){ grade3 = 10;}
                else if(text9 == "A"){ grade3 = 10 ;}
                else if(text9 == "A-"){ grade3 = 9 ;}
                else if(text9 == "B"){ grade3= 8 ;}
                else if(text9 == "B-"){ grade3 = 7 ;}
                else if(text9 == "C"){ grade3 = 6 ;}
                else if(text9 == "C-"){ grade3 = 5 ;}
                else if(text9 == "F"){ grade3= 0 ;}
                else if(text9 == "--SELECT--"){ grade3 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner10 = findViewById(R.id.spinner10);
        spinner10.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Grades));
        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text10 = spinner10.getSelectedItem().toString();
                if(text10 == "A+"){ grade4 = 10;}
                else if(text10 == "A"){ grade4 = 10 ;}
                else if(text10 == "A-"){ grade4 = 9 ;}
                else if(text10 == "B"){ grade4= 8 ;}
                else if(text10 == "B-"){ grade4 = 7 ;}
                else if(text10 == "C"){ grade4 = 6 ;}
                else if(text10 == "C-"){ grade4 = 5 ;}
                else if(text10 == "F"){ grade4= 0 ;}
                else if(text10 == "--SELECT--"){ grade4 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner11= findViewById(R.id.spinner11);
        spinner11.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Grades));
        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text11 = spinner11.getSelectedItem().toString();
                if(text11 == "A+"){ grade5 = 10;}
                else if(text11 == "A"){ grade5 = 10 ;}
                else if(text11 == "A-"){ grade5 = 9 ;}
                else if(text11 == "B"){ grade5= 8 ;}
                else if(text11 == "B-"){ grade5 = 7 ;}
                else if(text11 == "C"){ grade5 = 6 ;}
                else if(text11 == "C-"){ grade5 = 5 ;}
                else if(text11 == "F"){ grade5= 0 ;}
                else if(text11 == "--SELECT--"){ grade5 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        Spinner spinner12= findViewById(R.id.spinner12);
        spinner12.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Grades));
        spinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String text12 = spinner12.getSelectedItem().toString();
                if(text12 == "A+"){ grade6 = 10;}
                else if(text12 == "A"){ grade6 = 10 ;}
                else if(text12 == "A-"){ grade6 = 9 ;}
                else if(text12 == "B"){ grade6= 8 ;}
                else if(text12 == "B-"){ grade6 = 7 ;}
                else if(text12 == "C"){ grade6 = 6 ;}
                else if(text12 == "C-"){ grade6 = 5 ;}
                else if(text12 == "F"){ grade6= 0 ;}
                else if(text12 == "--SELECT--"){ grade6 = 0 ;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        //      Code to give output on screen
        button1 = findViewById(R.id.button1);
        textview4 = findViewById(R.id.textView4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                totalcredits=(credit1+credit2+credit3+credit4+credit5+credit6)*10;
                creditscored = ((credit1*grade1)+(credit2*grade2)+(credit3*grade3)+(credit4*grade4)+(credit5*grade5)+(credit6*grade6) )/10;
                CGPA= (creditscored/totalcredits)*100;
                textview4.setText("YOUR GPA IS " + String.format("%.2f",CGPA) );
                if(totalcredits==0 || creditscored ==0){
                    textview4.setText("Select the Subject or Grades Properly");

                }
                else {
                    CGPA= (creditscored/totalcredits)*100;
                    textview4.setText("YOUR GPA IS " + String.format("%.3f",CGPA) );
                        }

            }
        });


        mail=findViewById(R.id.mail);
        mail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","asingh33_be22@thapar.edu", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });



    }}

