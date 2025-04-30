import java.util.ArrayList;

public class OriginalPost extends Post{
    private String title;
    private ArrayList<Reply> replies;
    public OriginalPost(String poster, String text, String title) {
        super(poster, text);
        this.title = title;
    }

    public void addReply(Reply reply){
        replies.add(reply);
    }

    @Override
    public ArrayList<String> compile(){
        ArrayList<String> post = new ArrayList<>();
        post.add(poster);
        post.add(title);
        post.add(text);
        post.add(String.format("%1$s⬆ | %2$s⬇ ", upVotes, downVotes));
        return post;
    }
}
