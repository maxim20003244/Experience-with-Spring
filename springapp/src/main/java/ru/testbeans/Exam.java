package ru.testbeans;

public class Exam {
  private AnswerChecker answerChecker;

    public Exam(AnswerChecker answeChecker) {
        System.out.println("Exam constructor");
        this.answerChecker = answeChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;

    }
    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
