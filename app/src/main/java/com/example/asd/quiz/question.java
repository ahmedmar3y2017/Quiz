package com.example.asd.quiz;



public class question {

    String Question, op1, op2, op3;

    public question( String Question, String op1, String op2, String op3) {

        this.Question = Question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;


    }


    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }





    public String getQuestion() {
        return Question;
    }

    public String getOp1() {
        return op1;
    }

    public String getOp2() {
        return op2;
    }

    public String getOp3() {
        return op3;
    }




}
