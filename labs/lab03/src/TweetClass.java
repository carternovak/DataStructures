

public class TweetClass {

    private String content;
    private String author;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TweetClass(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public boolean contains(String s)
    {
        if(content.contains(s))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        TweetClass tweetOne = new TweetClass("This is my tweet", "Carter");


    }
}
