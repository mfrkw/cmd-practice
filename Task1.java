
 class Task1 {
	
	
	public static void main (String[] args) {
		
		int totalPrice = 0 ;                                 //購入した商品の合計金額
		
		//コマンドライン引数から購入した商品の合計金額（定価）を取得
		for(int i = 0 ; i < args.length ; i++ ){
			totalPrice += Integer.parseInt( args[i] );
		}
		
		//discountメソッドを使って値引きを適用し、値引き後の金額を取得
		int discountedPrice = discount( totalPrice );        //値引き後の金額
		
		//calcTaxPaymentメソッドを使って支払金額（税込）を取得
		int taxPayment = calcTaxPayment( discountedPrice );  //支払金額（税込）
		
		//支払金額（税込）を表示
		System.out.println("値引き後の支払金額：" + taxPayment + "円" );
		
	}
	
	
	/*
	
	**  - 引数として受け取った値の税込価格（消費税は8％とする）を計算して返す
	**  - 税込価格は整数（小数点以下切り捨て）で返す
	*/
	static int calcTaxPayment( int price ){       
		
		int tax = num1 * 1.08
		return 
	}
	
	
	/*
	
	**  - 引数として受け取った値が1000円以上5000円以下の場合、1000円より大きい分について10％割引にする
	**  - 引数として受け取った値が5000円より大きい場合、1000円より大きく5000円以下の分について10％割引、5000円より大きい分について20％割引にする
	**  - 値引き額は小数点以下切り捨てで計算する（キャストを使いましょう）
	**  - 割引金額の上限は5000円とする
 	*/
	static int discount( int pr ){            
		//仕様に書かれているマジックナンバー（リテラル）は定数で定義する
		final int discountBorder1 = 1000;   //値引き発生値段1000円
		final int discountBorder2 = 5000;   //値引き発生値段5000円           ①
		final double discountRate1 = 0.1;   //1000円以上5000円以下の割引率
		final double discountRate2 = 0.2;   //5000円以上の割引率
		final int discountPraiceMax = 5000; //割引金額の上限5000円           ②
																		// ①と②を使い回さない！  上限が変わる可能性もあるので変数をそれぞれ定義する
		int priceDowntemp = 0;      //仮の値引き額
		
		if(discountBorder1<= pr && pr <= discountBorder2){
			priceDowntemp = (int)((pr - discountBorder1) * discountRate1);   //1000円より大きい分について10％割引にする
		
		}else if(pr > discountBorder2){
			priceDowntemp = (int)(discountBorder2 - discountBorder1) * discountRate1 + discountBorder2
		}
	}
}
