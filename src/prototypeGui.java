import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

/**
 * Created by Didoy on 10/9/2015.
 */
public class prototypeGui  extends Stage{

    private static prototypeGui adminWindow = new prototypeGui();

    private prototypeGui(){
        // css settings

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        BorderPane root = new BorderPane();

        SlidePane sp = new SlidePane(400);
        root.setLeft(sp);

        Scene scene = new Scene(root,800,600);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        centerOnScreen();

    }

    public static prototypeGui getInstance(){
        return adminWindow;}
}
