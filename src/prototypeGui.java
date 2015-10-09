import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Didoy on 10/9/2015.
 */
public class prototypeGui  extends Stage{

    private static prototypeGui adminWindow = new prototypeGui();

    private prototypeGui(){

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        BorderPane root = new BorderPane();

        // home tab layout
        BorderPane hometabLayout = new BorderPane();

        TabPane homeTabpane = new TabPane();

        Tab overAllreportTab = new Tab("OverALl report");
        Tab suggestionTab = new Tab("Task manager");
        homeTabpane.getTabs().addAll(overAllreportTab, suggestionTab);

        hometabLayout.setCenter(homeTabpane);


        // main tabpane
        TabPane mainTabpane = new TabPane();
        mainTabpane.setTabMinWidth(130);
        mainTabpane.setSide(Side.LEFT);

        //settings of tabs
        Tab homeTab = new Tab("Home");
        Tab workTab = new Tab("Work");
        Tab reportTab = new Tab("Reports");
        Tab managementTab = new Tab("Management");
        Tab helpTab = new Tab("Help");

        homeTab.setClosable(false);
        workTab.setClosable(false);
        reportTab.setClosable(false);
        managementTab.setClosable(false);
        helpTab.setClosable(false);

        homeTab.setContent(hometabLayout);



        mainTabpane.getTabs().addAll(homeTab,workTab,reportTab,managementTab,helpTab);

        root.setCenter(mainTabpane);

        Scene scene = new Scene(root,screen.getWidth(), screen.getHeight());
        setScene(scene);

        centerOnScreen();

    }

    public static prototypeGui getInstance(){
        return adminWindow;}
}
