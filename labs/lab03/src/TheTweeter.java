import java.util.*;


public class TheTweeter {

    List<TweetClass> tweets = new ArrayList<>();

    public void add(TweetClass t) {
        tweets.add(t);
    }

    public void remove(String author) {
        for(int i = 0; i <= tweets.size() - 1; i++) {
            if (tweets.get(i).getAuthor().equals(author))
            {
                tweets.remove(i);
            }
        }

    }

    public TweetClass get(String author) {
        TweetClass temp = null;
        for (TweetClass t : tweets) {
            if (t.getAuthor().equals(author))
            {
                temp = t;
            }
        }
        return temp;
    }

    public String toString() {

        for (int i = 0; i <= tweets.size() - 1; i++)
        {
            System.out.println(tweets.get(i).getAuthor() + ": " + tweets.get(i).getContent());
        }
        return null;
    }

    public static void main(String[] args) {
        TheTweeter tweets = new TheTweeter();
        TweetClass tweetOne = new TweetClass("This is my tweet", "Carter");
        TweetClass tweetTwo = new TweetClass("My name is Bob", "Bob");
        TweetClass tweetThree = new TweetClass("I like cookies", "Jane");
        TweetClass tweetFour = new TweetClass("Orange is my favorite color", "Joe");
        TweetClass tweetFive = new TweetClass("Where's Jack", "Jill");
        TweetClass tweetSix = new TweetClass("I have a golden retriever", "Caleb");
        tweets.add(tweetOne);
        tweets.add(tweetTwo);
        tweets.add(tweetThree);
        tweets.add(tweetFour);
        tweets.add(tweetFive);
        tweets.add(tweetSix);
        tweets.toString();
        tweets.remove("Bob");
        System.out.println("--------------------------");
        tweets.toString();

    }

}
