public class Practice {
	public static void main (String[] agrs){
		System.out.println("メソッドを呼び出す");
		hello("かおり" );
	}
	
	public static void hello(String name){   //mainのかおり実引数が仮引数に値渡しされる
		System.out.println(name + "さんこんにちは");
	}
}
