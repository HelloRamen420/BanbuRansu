# BanbuRansu

2 年の課題です。JavaFX を使う意味はあったんでしょうか。
基本的に上手く行ってません。

## 概要

ヵさんがどうやら JavaFX を使って GUI アプリを開発してくれとのことです。
しょうもねえなと思いつつ、まあ簡単に幅広く GUI アプリが作れるってんだから許してやるかとまた一つ。。。<br><br><br>
任意の文字列や写真、実装できれば音楽をランダムで表示するというアプリです。<br>
みんなにアイデアと熱量で勝てないのでなんとか対抗するために [SceneBuilder](https://www.tuyano.com/index3?id=12496003)とか [CSS](https://wa3.i-3-i.info/word11298.html) とか [Json ファイル](https://wa3.i-3-i.info/word13798.html)を絡めて作ってみたりとかするつもりです。乞うご期待。

## したいこと・すること

- 任意の文字列や写真をひとつのシートにまとめる。そのためのファイル生成、読み込みの処理。普通に必須。

  - そもそもどういう保存、階層構造にするのか。(個人的に扱いやすい json 形式なのは確)
  - ファイルを読み込んでどう処理するのか。絞り込みと対応させるのは確かだが、上手いこと処理できるのか。
  - 生成もどういう感じでやっていくか
    <br>**→ きっとここらへんは json の階層構造を作れば終わる話**

- テスト勉強モード。これできればほぼクイズアプリ。
- JsonNode で取得したのに Element クラスを作ってそれで動かしたいと思います。乱数で表示するだけなら JsonNode だけでええんですが、絞り込み結果を JsonNode で置いとくことなんてめんどいなので。~~そもそも JSON ファイルがないのにどうやって JsonNode に格納するねん。~~

## ひとりごとシリーズ

- どのバグにも半日かかってるのきつい
- モジュールってなんやねん
- 絞り込み作るどころか表示する数指定とかもできてないよ( ; \_ ; )
- コードよりコメントの方が多いの笑える(笑えない)
