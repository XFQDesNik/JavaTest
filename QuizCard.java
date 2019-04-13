package QuizCardBuilder;

public class QuizCard {
    String question;
    String answer;
    QuizCard(String q, String a) {
        this.answer = a;
        this.question = q;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
