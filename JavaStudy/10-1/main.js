// 問1:isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください。
let numbers = [2 , 5 , 12 , 13 , 15 , 18 , 22];

for (let i = 0; i < numbers.length; i++) {
    if(numbers[i] % 2 === 0){
        isEven(numbers[i]) ;
    }
    
}

function isEven(num){
    console.log(num + "は偶数です");
}

// 問2:以下の要件を満たすように実装してください。
// 【要件】
// ・インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
// ・「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する

class car{
    constructor(gas , num){
    this.gas = gas ;
    this.num  = num  ;
    }

    getNumGas(){
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です`);
    }
}

let memo = new car(1000 , 1500);
memo.getNumGas();
