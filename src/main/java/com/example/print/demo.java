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
        File fi = new File(Const.PATH_JSON + "sample.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(fi);
        System.out.println(jsonNode.get("element").get(2).get("out_name").asText());
    }
}
