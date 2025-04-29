public class Reply extends Post{
    private Post op;
    public Reply(String poster, String text, Post originalPost) {
        super(poster, text);
        this.op = originalPost;
    }

    public Post getOP(){
        return op;
    }

    @Override
    public String compile(){
        return "";
    }
}