package com.example.print;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//表示の時の処理をするコントローラーたちです。
public class PrintControl {

    /*
     * jsonファイルをJavaの世界へWelcomeするメソッドです。
     * ファイル名をぶち込むとJsonNodeで返してくれます。
     * 一見しょぼいですが、やっぱ小分けにしたほうがいいかもじゃないですか!!(ガチギレ)
     */

    public static JsonNode jsonJavaWalcome(File jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);

        return jsonNode;
    }

    public static JsonNode jsonJavaWelcome(String json) throws IOException {
        File jsonFile = new File(json + ".json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonFile);
        return jsonNode;
    }
}
