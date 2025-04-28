abstract class Post{
    protected String poster;
    protected String text;
    protected int upVotes;
    protected int downVotes;
    public Post(String poster, String text){
        this.poster = poster;
        this.text = text;
        upVotes = 0;
        downVotes = 0;
    }

    public void upVote(){
        upVotes++;
    }

    public void downVote(){
        downVotes++;
    }

    public int getUpVotes(){
        return upVotes;
    }

    public int getDownVotes(){
        return downVotes;
    }

    public int getRating(){
        return upVotes - downVotes;
    }
}