package com.example;

import javafx.fxml.FXML;
import java.io.File;
import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
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

    @FXML
    public Label printRes;
    @FXML
    public Slider sliderPrint;
    @FXML
    public Label printNumberLabel;

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
     * 作成ボタンを押した時のメソッドです。
     * 残念ながらまだ作れてはいませんけど。。
     * 一番後回しです。
     */
    @FXML
    private void makeStage() throws IOException {
        Stage makeStage = new Stage();
        Scene makeScene = new Scene(App.loadFXML("make"), 600, 400);
        makeStage.setScene(makeScene);
        makeStage.showAndWait();
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
            Const.showErrorAlert("ファイル読み込みに関するエラー", "JSONファイルを選択してください");
        }
        /*
         * ここで絞り込みのコントロールを配置するためのメソッド呼び出し。
         * 機能限定版を作り終えたので着々と着手していきます。
         */

        // いくつ表示するかのSliderの選択肢ぶちこみ
        sliderPrint.setMin(1);
        sliderPrint.setMax(Const.getJsonElementNumber(file));
        sliderPrint.setShowTickLabels(true);
        sliderPrint.setShowTickMarks(true);
        sliderPrint.setBlockIncrement(1);

        labelNow.setText("現在のシート : " + Const.getJsonSeatName(file));
        labelPath.setText(file.getAbsolutePath());
    }

    /*
     * 表示ボタンと対応してます。
     * 正直他のメソッドに飛ばすだけです。
     */
    @FXML
    private void printYeah() throws IOException {
        if (labelPath.getText().equals("Label")) {
            Const.showErrorAlert("ファイルがありません、", "ファイルを選択してください。");
            return;
        }
        com.example.print.PrintControl.printLabel(printRes, labelPath, sliderPrint);
    }

    @FXML
    private void setPrintNumberLabel() throws IOException {
        printNumberLabel.setText(String.valueOf((int) sliderPrint.getValue()));
    }
}
