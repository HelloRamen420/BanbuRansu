package com.example;

import javafx.fxml.FXML;
import java.io.File;
import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

public class AppController {

    @FXML
    public Label labelNow;

    /*
     * ファイルを保持させておく方法が思いつかないんで、この透明のラベルに書いておきたいと思います。
     * ずるいでしょ。
     */
    @FXML
    public Label labelPath;

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
     *
     * ちゃんとJSONファイルだけを選択させるように組んでます。
     */

    @FXML
    private void setFile() throws IOException {
        String fileName;
        File file;
        while (true) {
            FileChooser chooser = new FileChooser();
            file = chooser.showOpenDialog(new Stage());
            fileName = file.getName();
            if (fileName.substring(fileName.lastIndexOf(".")).equals(".json"))
                break;
            Const.jsonAlrat();
        }

        /*
         * ここで絞り込みのコントロールを配置するためのメソッド呼び出し。
         * ですが機能限定版なのでそんなものは作りません。
         */

        labelNow.setText("現在のシート : " + Const.getJsonSeatName(file));
        labelPath.setText(file.getAbsolutePath());
        System.out.println(labelPath.getText());
    }
}
