// 問1：10、15、20、25を含む配列の変数scoresを用意して、画像のように偶数だけを出力してください。

let scores = [10 , 15 , 20 , 25];
for (let i = 0; i < scores.length; i++) {
    if (scores[i] % 2 === 0) {
        console.log(scores[i] + "は偶数です");
    }else{
        continue ;
    }
}

// 問2：ガソリンとナンバーのプロパティを持った「carオブジェクト」を作成して、ガソリンとナンバーを出力してください。
let car = {
    gass : 20.5 ,
    num  : 1234 
};

console.log("ガソリンは" + car.gass + "です");
console.log("ナンバーは" + car.num  + "です");



// let scores = [50, 60, 70, 80, 90];
// console.log(scores);

// console.log(scores[2]);
// console.log(scores.length);
// for (let i = 0; i < 5; i++) {
//     console.log("得点は" + scores[i] + "点です");
// }

// let human = {
//     name: 'yamada',
//     height: 170,
//     weight: 60,
//     gender: "男",
//     age: 30,
// };

// console.log(human.name);
// //以下の書き方もあります。
// console.log(human['name']);