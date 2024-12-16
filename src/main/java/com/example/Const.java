package com.example;

import java.io.File;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import com.fasterxml.jackson.databind.JsonNode;

//めんどいいろいろの文字列とかがおいてます。資料置き場ということで。
public class Const {

    // シンプルなjson置き場までのパスです。
    public static final String PATH_JSON = "demo1/src/main/resources/com/example/json/";

    /*
     * ファイル選択の時にJSON以外のファイルを読み込んだときに表示するウィンドウのやつ。
     * 煩雑になるのは嫌なのでここに置いてます。
     */
    public static void showErrorAlert(String headerText, String contentText) throws IOException {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("エラー");
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    /*
     * シートの名前のゲッタです。引数はFile型かString型です。
     * いちいちJsonNode作って云々するのめんどくさいんでね。
     * 楽でしょ。ね。ね。ね、ね、ね。
     */
    public static String getJsonSeatName(File file) throws IOException {
        JsonNode jsonNode = com.example.print.PrintControl.jsonJavaWalcome(file);
        return jsonNode.get("seat_name").asText();
    }

    public static String getJsonSeatName(String file) throws IOException {
        JsonNode jsonNode = com.example.print.PrintControl.jsonJavaWelcome(file);
        return jsonNode.get("seat_name").asText();
    }
}
