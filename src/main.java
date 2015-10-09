import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Didoy on 10/9/2015.
 */
public class main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

            prototypeGui.getInstance().show();

    }


}
