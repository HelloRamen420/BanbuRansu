package com.example;

import javafx.fxml.FXML;
import java.io.File;
import java.io.IOException;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

public class AppController {

    /*
     * ハイパーリンクと対応してます。
     * 「万物乱数ちゃん」とは何か、とかが書いてあります。
     */
    @FXML
    private void explanation() throws Exception {
        Stage explanStage = new Stage();
        Scene explanScene = new Scene(App.loadFXML("explanation"), 600, 400);
        explanStage.setScene(explanScene);
        explanStage.showAndWait();
    }

    /*
     * セットボタンと対応してます。
     * ファイルを選ぶようになってますがなんかめんどそうなので変えるかもです。
     */
    @FXML
    private void setFile() throws IOException {
        String fileName;
        while (true) {
            FileChooser chooser = new FileChooser();
            File file = chooser.showOpenDialog(new Stage());
            fileName = file.getName();
            if (fileName.substring(fileName.lastIndexOf(".")).equals(".json"))
                break;
            Const.jsonAlrat();
        }
    }
}
