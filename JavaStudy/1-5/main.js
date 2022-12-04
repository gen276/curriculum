// ・「〇〇を受け取りました。ジュースにして返します」と出力
// ・受け取った果物に「ジュース」という文字列を結合する
// ・結合した結果を呼び出し元に返す
// ・呼び出し元で、返ってきたジュースを適当な変数に入れて、「〇〇ジュースが届きました」と出力する

function createJuice(fruits){
    console.log(fruits + "を受け取りました。ジュースにして返します");
    let Fruitsjuice = fruits + "ジュース";
    return Fruitsjuice ;
}

let orangejuice = createJuice("みかん");
console.log(orangejuice + "が届きました");

// 関数の定義方法
//関数を定義
// function japanese() {
//     console.log('おはよう');
//     console.log('こんにちは');
//     console.log('こんばんは');
//     console.log('日本語は時間帯によって挨拶が変わります');
//     console.log('ひらがな');
//     console.log('カタカナ');
//     console.log('漢字');
//     console.log('３種類も文字があります');
// }
//関数を呼び出す
// japanese();

