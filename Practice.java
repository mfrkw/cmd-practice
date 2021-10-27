public class Practice {
	public static void main (String[] agrs){
		System.out.println("メソッドを呼び出す");
		hello("かおり", "よしこ" );
	}
	
	public static void hello(String name1, String name2){   //mainの実引数が仮引数に値渡しされる
		System.out.println(name1 + "さんこんにちは" + name2 + "さんもいたんですね！");
	}
}    //引数を複数にしてもhelloメソッドに順番に値渡しされる
