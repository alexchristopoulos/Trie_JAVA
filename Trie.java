public class Trie
{
	private Node root;
	
	public Trie(){
		root = new Node();
	}
	public void Insert(String word)
	{
		char[] chars = word.toCharArray();
		int iter=0;
		if(chars.length>1)
		{
			if(root.edges.containsKey(chars[iter]))
			{
				Node temp = new Node();
				temp.edges.put(chars[iter], RecurseInsert(root.edges.get(chars[iter]),++iter,chars,word) );
				root.update(temp);
			}else
			{
				root.edges.put(chars[iter],this.RecurseInsert(root.edges.get(chars[iter]),++iter, chars, word));
			}
		}else
		{//of size 1
			root.AddNewWord(word);
		}
	}
	
	private Node RecurseInsert(Node current,int iter,char[] chars,String word)
	{
		
		if(current==null)
		{
			current = new Node();
			if(iter<chars.length-1)
			{
				Node temp = new Node();
				temp.edges.put(chars[iter], RecurseInsert(current.edges.get(chars[iter]),++iter,chars,word) );
				current.update(temp);
				return current;
			}else
			{
				current.AddNewWord(word);
				return current;
			}
		}else
		{
			if(current.edges.containsKey(chars[iter]))
			{
				
				if(iter<chars.length-1)
				{
					Node temp = new Node();
					temp.edges.put(chars[iter], RecurseInsert(current.edges.get(chars[iter]),++iter,chars,word) );
					current.update(temp);
					return current;
				}else
				{
					current.AddNewWord(word);
					return current;
				}
			}else
			{
				if(iter<chars.length-1)
				{
					Node temp = new Node();
					temp.edges.put(chars[iter], RecurseInsert(current.edges.get(chars[iter]),++iter,chars,word) );
					current.update(temp);
					return current;
				}else
				{
					current.AddNewWord(word);
					return current;
				}
			}
		}
	}
	
	public String Get(String word)
	{//returns in String of type 'word;word_frequency' the result
		String response=word+";0";
		char[] chars = word.toCharArray();
		Node current = root;
		for(int i=0;i<chars.length;i++)
		{
			if(i==chars.length-1)
			{
				if(current.words.contains(word))
				{
					response = word+";"+current.word_freq.get(word).toString();
				}
			}else
			{
				if(!current.edges.containsKey(chars[i]))
				{
					return word+";0";
				}
			}
			current = current.edges.get(chars[i]);
		}
		return response;
	}
	
}