package ru.sapteh;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Program extends Application {
    @Override
    public void start(Stage primaryStage){
//        Окно;
        primaryStage.setTitle("My Window");
        primaryStage.setMinWidth(1366);
        primaryStage.setMinHeight(768);
        primaryStage.setWidth(1366);
        primaryStage.setHeight(768);

//        Холст;
        Pane root = new Pane();
        Label label = new Label("Name");
        label.setFont(new Font(20));
        label.setLayoutX(primaryStage.getMinWidth()/2 - 60);

//        Поле ввода
        TextField textField = new TextField();
        textField.setLayoutX(primaryStage.getMinWidth()/2 - 85);
        textField.setLayoutY(75);

//        Кнопка;
        Button btn = new Button("ClickClack!");
        btn.setLayoutX(primaryStage.getMinWidth()/2 - 55);
        btn.setLayoutY(150);
        btn.setMaxSize(200,10);

            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent action) {
                    String tmp = textField.getText();
                    String text = !tmp.isEmpty() ? tmp : "Not found";
                    label.setText("Name: " + text);
                }
            });



        root.getChildren().add(btn);
        root.getChildren().add(textField);

        Scene scene = new Scene(root);

        root.getChildren().add(label);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
