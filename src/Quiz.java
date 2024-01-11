import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        currentQuestionIndex = 0;
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Question getCurrentQuestion() {
        if (currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex);
        }
        return null;
    }

    public void submitAnswer(String answer) {
        if (getCurrentQuestion().isCorrect(answer)) {
            score++;
        }
        currentQuestionIndex++;
    }

    public boolean hasMoreQuestions() {
        return currentQuestionIndex < questions.size();
    }

    public int getScore() {
        return score;
    }

    public int getQuestionCount() {
        return questions.size();
    }
}
