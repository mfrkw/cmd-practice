public class Practice {
	public static void main (String[] agrs){
		System.out.println("メソッドを呼び出す");
		hello("かおり", "よしこ" );
		print(item("ポテト","ハンバーガー"), 1000);
	}
	
	public static void hello(String name1, String name2){   //mainの実引数が仮引数に値渡しされる
		System.out.println(name1 + "さんこんにちは" + name2 + "さんもいたんですね！");
	}
   //引数を複数にしてもhelloメソッドに順番に値渡しされる
	
	public static String item(String itemname){     //item("ポテト","ハンバーガー")あくまで商品名だけここまで　　　　　オーバーロード
		return itemname ;
	}
	
	public static String item(String itemname, String itemname2){
		return itemname + "と" + itemname2 ;
	}
	
	public static void print(String  itemName, int price){
		System.out.println(itemName + "でお間違いないでしょうか？" + price + "円でございます。");
	}
}
