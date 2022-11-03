package check_list_hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        {
//      問① 下記例の配列をString型しか格納できないように修正してください。
//      現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//         例List<Object> array = new ArrayList<>();
//      また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
      List<String> array = new ArrayList<String>();
            array.add("hoge");
            array.add("pos");
            array.add("foo");

//      問② arrayの二つ目の要素を"bar"にしましょう。
            array.remove(1);
            array.add(1 , "bar");
            
//      問③ fooが格納されているインデックスを出力してください。
            System.out.println("fooのインデックス : " + array.indexOf("foo"));
        }

        {
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
        Map<String, Object> info = new HashMap<String , Object>();
        info.put("address", "/////");
        info.put("name", "Kosuke");
        info.put("age", 29);

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
        for(String information : info.keySet()){
            System.out.println("key : " + information);
        }
//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
        for(Object personal : info.values()){
            System.out.println("value : " + personal);
    }
        }
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           int a = cal.get(Calendar.YEAR);
           int b = cal.get(Calendar.MONTH)+1;
           int c = cal.get(Calendar.DATE);
           
           Integer[] arrayDate = { a , b , c } ;

//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
           List<Integer> date = Arrays.asList(arrayDate);
//           System.out.println(date);

//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
           for (int time : date ) {
            System.out.println(time);
        }
        }
}