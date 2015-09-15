package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Tag {

    private String id = null;
    private String slug = null;
    private String title = null;
    private String description = null;
    private String post_count = null;

    public WP_Tag() {
    }

    public WP_Tag(String id, String slug, String title, String description, String post_count) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.post_count = post_count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPost_count() {
        return post_count;
    }

    public void setPost_count(String post_count) {
        this.post_count = post_count;
    }
}
