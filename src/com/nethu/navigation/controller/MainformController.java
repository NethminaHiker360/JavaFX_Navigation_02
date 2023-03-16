package com.nethu.navigation.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainformController {
    public AnchorPane AchorPaneOption;
    public Button btnWindowA;
    public Button btnWindowB;
    public AnchorPane AchorPaneWindow;
    public AnchorPane mainAnchorPane;

    public void btnWindowAOnAction(ActionEvent actionEvent) throws IOException {
        AchorPaneWindow.getChildren().clear();
        AchorPaneWindow.getChildren().add(FXMLLoader.load(getClass().getResource("../view/windowA.fxml")));
    }

    public void btnWindowBOnAction(ActionEvent actionEvent) throws IOException {
        AchorPaneWindow.getChildren().clear();
        AchorPaneWindow.getChildren().add(FXMLLoader.load(getClass().getResource("../view/windowB.fxml")));
    }
}
