package com.example.print;

import java.util.Random;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//表示の時の処理をするコントローラーたちです。
public class PrintControl {

    /*
     * とりあえずのメソッドなので絞り込み要素とか入れていくとメソッドごと無くなる可能性があります。
     * まあ許してや。
     */
    public static void setElementLabel(File file) throws IOException {
        JsonNode node = jsonJavaWalcome(file);
        Random ran = new Random();

        // 絞り込みの結果を
    }

    /*
     * jsonファイルをJavaの世界へWelcomeするメソッドです。
     * ファイル名orファイルをぶち込むとJsonNodeで返してくれます。
     * 一見しょぼいですが、やっぱ小分けにしたほうがいいかもじゃないですか!!(ガチギレ)
     */

    public static JsonNode jsonJavaWalcome(File jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);

        return jsonNode;
    }

    public static JsonNode jsonJavaWelcome(String json) throws IOException {
        File jsonFile = new File(com.example.Const.PATH_JSON + ".json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);
        return jsonNode;
    }
}
