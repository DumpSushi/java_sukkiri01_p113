package p113;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 4-2 インスタンスの文字列表現。
		{
			Hero h1 = new Hero("aaa");
			System.out.println(h1);
		}

		// 4-3 インスタンスの等価判定。
		{
			List<Hero> list = new ArrayList<Hero>();
			Hero h1 = new Hero("ミナト");
			list.add(h1);
			System.out.println("要素数=" + list.size());
			h1 = new Hero("ミナト");
			list.remove(h1);
			System.out.println("要素数=" + list.size());	// 要素が減っていない。
		}
	}

}
