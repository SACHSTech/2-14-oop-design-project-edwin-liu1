import java.util.ArrayList;

public class Reply extends Post{
    private Post op;
    public Reply(String poster, String text) {
        super(poster, text);
    }

    @Override
    public ArrayList<String> compile(){
        ArrayList<String> post = new ArrayList<String>();
        post.add(String.format("%1$s - %2$s", poster, text));
        post.add(String.format("%1$s⬆ | %2$s⬇ ", upVotes, downVotes));
        return post;
    }
}