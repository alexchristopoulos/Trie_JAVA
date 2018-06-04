
public class MainEntity {

	public static void main(String[] args) {
		Trie trie = new Trie();
		long start = System.nanoTime();
		trie.Insert("Alexander");
		trie.Insert("Alex");
		trie.Insert("Alexander");
		trie.Insert("alex");
		trie.Insert("Boom");
		trie.Insert("html");
		trie.Insert("css");
		trie.Insert("css");
		trie.Insert("cse");
		trie.Insert("java");
		trie.Insert("json");
		trie.Insert("java");
		trie.Insert("json");
		trie.Insert("json");
		trie.Insert("jjj");
		trie.Insert("java");
		trie.Insert("jjj");
		trie.Insert("ac");
		trie.Insert("ab");
		trie.Insert("ac");
		System.out.println(trie.Get("Alexander"));
		System.out.println(trie.Get("Alxandr"));
		System.out.println(trie.Get("Alex"));
		System.out.println(trie.Get("alexander"));
		System.out.println(trie.Get("alex"));
		System.out.println(trie.Get("css"));
		System.out.println(trie.Get("cse"));
		System.out.println(trie.Get("csr"));
		System.out.println(trie.Get("java"));
		System.out.println(trie.Get("json"));
		System.out.println(trie.Get("jjj"));
		System.out.println(trie.Get("ac"));
		System.out.println(trie.Get("ab"));
		System.out.println(trie.Get("abb"));
		
		
		double duration = (double)(System.nanoTime() - start);
		System.out.println("END AFTER: " + duration/1000000000);
	}

}
