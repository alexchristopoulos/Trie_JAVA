# Trie_JAVA
Trie/Digital Tree in java
# Operations
1) Insert. Called with Insert(String word). inserts the string in the trie.
if the string already exists it increments its word frequency by one otherwise puts the word as new word with frequency.

2) Get(String word). Returns: 
    a) the String "String value";"0" if word does not exist in Trie e.g.
    b) "word";"frequqncy of word in Trie" if word exists
# EXAMPLE

Trie t = new Trie();
t.Insert("my word");
String res = t.Get("my word"); // res = "my word;1"
res = t.Get("abc"); // res = "abc:0"

I mainly used it on tf-idf algorithm in order to optimize the operations there in order to not search through all of documents and terms in order to specify the tf and idf values for each candidate. Instead in O(String.length) to specify term and Idf on (Documents.size()*len(string)) can very fast compute those tf and idf values.
