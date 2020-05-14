/*
You are given a class called Sentence, which takes a string such as "hello world". You need to provide a method called 
getWord() that returns a WordToken  which can be used to capitalize a particular word in the sentence.
*/


import java.util.*;

class Sentence
{
  private String [] words;
  private Map<Integer, WordToken> tokens = new HashMap<>();

  public Sentence(String plainText)
  {
    words = plainText.split(" ");
  }

  public WordToken getWord(int index)
  {
    WordToken wt = new WordToken();
    tokens.put(index, wt);
    return tokens.get(index);
  }

  @Override
  public String toString()
  {
    ArrayList<String> ws = new ArrayList<>();
    for (int i = 0; i < words.length; ++i)
    {
      String w = words[i];
      if (tokens.containsKey(i) && tokens.get(i).capitalize)
        w = w.toUpperCase();
      ws.add(w);
    }
    return String.join(" ", ws);
  }

  class WordToken
  {
    public boolean capitalize;
  }
}
