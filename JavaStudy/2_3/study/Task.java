package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
class Task extends Calculator{
    
    public int a = 10 ;
    public int b = 20 ;
    public int c = 30 ;
    
    /**
     * タスクの実行
     */
    
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

      super.plus(a);
      super.plus(a , b);
      super.plus(a , b , c);
      
    }
}