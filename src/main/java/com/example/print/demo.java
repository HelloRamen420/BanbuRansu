package com.example.print;

import com.example.Const;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * 試したいことがあった時にここに来ます。
 * 忘れないでね僕のこと。。
 * ちなみにここの階層にあるのは諸事情です。
 */
public class demo {
    public static void main(String[] args) throws IOException {
        JsonNode node = PrintControl.jsonJavaWelcomePath(
                "/Users/kirinokazuya/Library/CloudStorage/OneDrive-独立行政法人国立高等専門学校機構/2年プログラミング演習/demo1/src/main/resources/com/example/json/unko.json");
        System.out.println(node.get("seat_name").asText());
    }
}
