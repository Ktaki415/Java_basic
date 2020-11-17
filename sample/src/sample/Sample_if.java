package sample;

/**
//条件によって傘を持っていくかいかないかを出力するプログラム
//@author 株式会社アーキコアテクノ
*
*/
public class Sample_if {
	public static void main (String[] args) {
		/*
		 * int型変数percentを宣言する
		 * この変数は降水確率を設定する
		 */
		int percent = 30;
		
		// 降水確率が50%以上の場合
		if(percent >= 50) {
			System.out.println("傘を持っていきましょう！");
		}
		// それ以外の場合(50%未満の場合)
		else {
			System.out.println("傘は必要ありません！");
		}
	}

}
