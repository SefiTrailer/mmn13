import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class QuizUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        Quiz quiz = new Quiz();
        // Initialize quiz with questions
        quiz.addQuestion(new Question("What is the capital of France?", "Paris", "London", "Berlin", "Madrid"));
        // Add more questions as needed

        VBox layout = new VBox(10);
        Scene scene = new Scene(layout, 400, 300);

        // Add UI components to 'layout' for displaying questions and handling user interactions

        primaryStage.setScene(scene);
        primaryStage.setTitle("Multiple Choice Quiz");
        primaryStage.show();
    }
}
