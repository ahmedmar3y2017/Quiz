package com.example.asd.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroup;
    TextView t ;
    TextView t2 ;
    Button b1 ;
    Button b2 ;
    int count = 0;
    int current = 0;
    ArrayList<question> qlist;
    ArrayList<String> correctAnswers;
    question q ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        radiogroup=(RadioGroup) findViewById(R.id.group);
        t=(TextView) findViewById(R.id.question);
        t2=(TextView) findViewById(R.id.t2);
        b1=(Button) findViewById(R.id.Next);
        b2=(Button) findViewById(R.id.Result);
        //
        qlist = new ArrayList<>();
        correctAnswers= new ArrayList<>();
        qlist.add(new question("what is the capital of egypt ?","alex","cairo","port_saied"));
        qlist.add(new question("what is the capital of france ?","rome","paris","tokyo"));
        correctAnswers.add("cairo");
        correctAnswers.add("paris");
        getquestion();

    }
    /////// load data ///////
    public  void getquestion() {
            q = qlist.get(current);
            t.setText(q.Question);
            ((RadioButton) radiogroup.getChildAt(0)).setText(q.op1);
            ((RadioButton) radiogroup.getChildAt(1)).setText(q.op2);
            ((RadioButton) radiogroup.getChildAt(2)).setText(q.op3);
        }

    ////  next question /////
     public  void next(View view){
         if (current == qlist.size()) {

             b1.setEnabled(false);
         }

         if (check(current)) {
             count = count + 1;

         }
         current++;
         getquestion();
     }

    ////// show result //////
    public void getResult (View view){


            t2.setText("correct answer : " + count );

        }

    //////// check if the answer is correct ////////
    boolean check(int x) {


        for (int i = 0; i < radiogroup .getChildCount(); i++){
            if (((RadioButton) radiogroup.getChildAt(i)).isSelected()) {
                if (((RadioButton) radiogroup.getChildAt(i)).getText().equals(correctAnswers.get(x)))
                {
                    return true;
                }
                else{
                    return false;

                }
            }
        }

        return false;
    }

     }



