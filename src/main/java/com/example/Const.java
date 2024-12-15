package com.example;

import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

//めんどいいろいろの文字列とかがおいてます。資料置き場ということで。
public class Const {
    public static final String PATH_JSON = "demo1/src/main/resources/com/example/json/";

    /*
     * ファイル選択の時にJSON以外のファイルを読み込んだときに表示するウィンドウのやつ。
     * 煩雑になるのは嫌なのでここに置いてます。
     */
    public static void jsonAlrat() throws IOException {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("エラー");
        alert.setHeaderText("ファイル読み込みに関するエラー");
        alert.setContentText("JSONファイルを選択してください");
        alert.showAndWait();
    }
}
