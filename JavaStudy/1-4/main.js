// 3の倍数のとき、 Fizz! と出力します。
// 5の倍数のとき、 Buzz! と出力します。
// 3の倍数かつ5の倍数のとき、 FizzBuzz!! と出力します。(15の倍数、と考えるのはナシです。)
// 3の倍数でも、5の倍数でもない場合は、その数を出力します。
// それを1〜100まで実施してください

let a = 1 ;

while(a < 100){
    if (a % 3 === 0 && a % 5 === 0) {
        console.log("Fizz!Buzz!");
        a ++ ;
        continue ;
    }else if (a % 3 === 0) {
        console.log("Fizz!");
        a ++ ;
        continue ;
    }else if (a % 5 === 0) {
        console.log("Bizz!");
        a ++ ;
        continue ;
    }else{
        console.log(a);
        a ++ ;
        continue ;
    }
}