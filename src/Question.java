import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private String questionText;
    private String correctAnswer;
    private List<String> options;

    public Question(String questionText, String correctAnswer, String... otherOptions) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.options = new ArrayList<>(Arrays.asList(otherOptions));
        this.options.add(correctAnswer);
        Collections.shuffle(this.options); // Randomize the order of options
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isCorrect(String answer) {
        return answer.equals(correctAnswer);
    }

    public List<String> getOptions() {
        return options;
    }
}
