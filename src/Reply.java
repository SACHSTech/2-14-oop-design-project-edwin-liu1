public class Reply extends Post{
    private Post op;
    public Reply(String poster, String text, Post originalPost) {
        super(poster, text);
        this.op = originalPost;
    }

}