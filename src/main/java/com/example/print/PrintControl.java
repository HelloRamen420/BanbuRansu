package com.example.print;

import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//表示の時の処理をするコントローラーたちです。
public class PrintControl {

    /*
     * このメソッドを授業中に作りましょう。
     * なかなか出来てきているので。
     * 深夜の脳みそが一番働いてるわ。
     */
    public static void printLabel() {

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
