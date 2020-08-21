package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox root;
    private VBox root1;
    private Button UserButton;
    private Button btn1;
    private Label Labeler ;
    private Label passwordLabel;
    private HBox hBox;



    @Override
    public void start(Stage primaryStage) throws Exception{

        UserButton = new Button();
        UserButton.setText("Username Button");


         btn1 = new Button();
        btn1.setText("Password Button");


         Labeler = new Label("Username");
        passwordLabel = new Label("Password");


        root = new VBox();
        root.getChildren().addAll(Labeler,passwordLabel);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);

        root1= new VBox();
        root1.getChildren().addAll(UserButton,btn1);
        root1.setAlignment(Pos.CENTER);
        root1.setSpacing(20);

        Scene s = new Scene(root1 , 300 , 300);
        primaryStage.setScene(s);


        hBox = new HBox();//creat new hbox
        hBox.getChildren().addAll(root,root1);//add vbox1 and vbox2 in hbox
        hBox.setAlignment(Pos.CENTER);//set hbox position
        hBox.setSpacing(20);//set hbox spaceing


        Scene scene = new Scene(hBox,300,300);//creat scene
        primaryStage.setTitle("181380027");//create title
        primaryStage.setScene(scene);//add scene in stage
        primaryStage.show();//show stage
    }







    public static void main(String[] args) {
        launch(args);
    }
}
