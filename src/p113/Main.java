package p113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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

		// 4-5 インスタンスの順序付け。
		{
			System.out.println("<4-5>");
			List<Account> list = new ArrayList<Account>();
			Account ac1 = new Account("123");
			list.add(ac1);
			Collections.sort(list);
			Iterator<Account> it = list.iterator();
			while(it.hasNext())
			{
				Account a = it.next();
				System.out.println(a.accountNo);
			}
		}

		// 4-6 インスタンスの複製。
		{
			System.out.println("<4-6>");
			Hero h1 = new Hero("ミナト");
			Sword s = new Sword("はがねのけん");
			h1.setSword(s);
			System.out.println("装備:" + h1.getSword().getName());
			System.out.println("clone()で複製します");
			Hero h2 = h1.clone();
			System.out.println("コピー元の勇者の剣の名前を変えます");
			h1.getSword().setName("ひのきのぼう");
			System.out.println("コピー元とコピー先の勇者の装備を表示します");
			System.out.println("コピー元:" + h1.getSword().getName() +
					" / コピー先:" + h2.getSword().getName());
		}
	}

}
