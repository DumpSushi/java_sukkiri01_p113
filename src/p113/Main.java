package p113;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 4-2 インスタンスの文字列表現。
		{
			System.out.println("<4-2>");
			Hero h1 = new Hero("aaa");
			System.out.println(h1);
		}

		// 4-3 インスタンスの等価判定。
		{
			System.out.println("<4-3>");
			List<Hero> list = new ArrayList<Hero>();
			Hero h1 = new Hero("ミナト");
			list.add(h1);
			System.out.println("要素数=" + list.size());
			h1 = new Hero("ミナト");
			list.remove(h1);
			System.out.println("要素数=" + list.size());
		}

		// 4-4 インスタンスの要約。
		{
			System.out.println("<4-4>");
			Set<Hero> list = new HashSet<Hero>();
			Hero h1 = new Hero("ミナト");
			list.add(h1);
			System.out.println("要素数=" + list.size());
			h1 = new Hero("ミナト");
			list.remove(h1);
			System.out.println("要素数=" + list.size());
		}
	}

}
