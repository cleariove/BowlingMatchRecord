package bowling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test extends Application
{
    public static void main(String[] args) throws Exception
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
       Parent root = FXMLLoader.load(getClass().getResource("views/BeginGame.fxml"));
        primaryStage.setTitle("开始游戏");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
