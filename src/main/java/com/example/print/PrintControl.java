package com.example.print;

import java.util.Random;
import java.io.File;
import java.io.IOException;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import com.example.Const;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//表示の時の処理をするコントローラーたちです。
public class PrintControl {

    public static void printLabel(Label printLabel, Label pathLabel, Slider sliderPrint) throws IOException {
        File file = new File(pathLabel.getText());
        Random rm = new Random();
        JsonNode jsonNode = jsonJavaWalcome(file);

        /*
         * ここにJsonNodeをぶっこむと絞り込みに応じたElementクラス(未実装)を返してくれます。
         * ただまだなのでこっから先はJsonNodeで処理します。
         * まあ本番は変えるんで。
         *
         * 表示する要素数はシンプルにゲットします。
         * 出来次第引数に書きますんで。待機。晩成。じゃねえよ。は？
         */

        int printNumber = (int) sliderPrint.getValue();

        // 表示する要素数によってfor文回したりしますが、まあ今はええです。
        String printText = "";
        for (int i = 0; i < printNumber; i++) {
            printText += jsonNode.get("element").get(rm.nextInt(Const.getJsonElementNumber(file)))
                    .get("out_name").asText() + "\n";
        }
        printLabel.setText(printText);
    }

    /*
     * jsonファイルをJavaの世界へWelcomeするメソッドです。
     * ファイル名 or ファイル or 絶対パス をぶち込むとJsonNodeで返してくれます。
     * 一見しょぼいですが、やっぱ小分けにしたほうがいいかもじゃないですか!!(ガチギレ)
     */

    public static JsonNode jsonJavaWalcome(File jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);

        return jsonNode;
    }

    public static JsonNode jsonJavaWelcome(String json) throws IOException {
        File jsonFile = new File(com.example.Const.PATH_JSON + json + ".json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);
        return jsonNode;
    }

    public static JsonNode jsonJavaWelcomePath(String path) throws IOException {
        File jsonFile = new File(path);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);
        return jsonNode;
    }
}
