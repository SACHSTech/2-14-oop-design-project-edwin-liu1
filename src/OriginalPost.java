public class OriginalPost extends Post{
    private String title;
    public OriginalPost(String poster, String text, String title) {
        super(poster, text);
        this.title = title;
    }

    @Override
    public String compile(){
        return "";
    }
}
