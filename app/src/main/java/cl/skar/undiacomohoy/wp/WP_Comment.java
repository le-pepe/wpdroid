package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Comment {
    private int id;
    private WP_Author author;
    private String content;
    private String date;
    private String link;
    private WP_Comment parent;
    private WP_Post post;

    public WP_Comment() {
    }

    public WP_Comment(int id, WP_Author author, String content, String date, String link, WP_Comment parent, WP_Post post) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.date = date;
        this.link = link;
        this.parent = parent;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WP_Author getAuthor() {
        return author;
    }

    public void setAuthor(WP_Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public WP_Comment getParent() {
        return parent;
    }

    public void setParent(WP_Comment parent) {
        this.parent = parent;
    }

    public WP_Post getPost() {
        return post;
    }

    public void setPost(WP_Post post) {
        this.post = post;
    }
}
