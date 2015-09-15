package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Category {
    private String id = null;
    private String slug = null;
    private String title = null;
    private String description = null;
    private String parent = null;
    private String postCount = null;

    public WP_Category(String id, String slug, String title, String description, String parent, String postCount) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.parent = parent;
        this.postCount = postCount;
    }

    public WP_Category() {
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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPostCount() {
        return postCount;
    }

    public void setPostCount(String postCount) {
        this.postCount = postCount;
    }
}
