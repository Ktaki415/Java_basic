package sample;

public class Sample3_1 {
	public static void main(String[] args) {
		
		boolean a = true; // boolean型の値はtrueかfalseとなる
		char b = 'A'; // char型はシングルクオーテーションで囲まれた一文字(1バイト)を保持できる
		byte c = 0; // byte型は整数型。-128~127までを格納できる
		short d = 32767; // short型は整数型。-32768~32767までを格納できる
		int e = 2147483647; //int型は整数型。-2147483647~2147483647までを格納できる
		long f = 10000000000L; // long型は整数型。-9223372036854775808~9223372036854775808までを格納できる。末尾にLと付けることで宣言
		float g = 15; //単精度浮動小数点型
		double h = 555.55; //倍精度浮動小数点型
		
		// 変数の値を出力する
		System.out.println("変数aの値は" + a);
		System.out.println("変数bの値は" + b);
		System.out.println("変数cの値は" + c);
		System.out.println("変数dの値は" + d);
		System.out.println("変数eの値は" + e);
		System.out.println("変数fの値は" + f);
		System.out.println("変数gの値は" + g);
		System.out.println("変数hの値は" + h);
	}

}
