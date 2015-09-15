package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Post_Index {
    private String id;
    private String title;
    private String excerpt;
    private String featuredImage;

    public WP_Post_Index() {
    }

    public WP_Post_Index(String id, String title, String excerpt, String featuredImage) {
        this.id = id;
        this.title = title;
        this.excerpt = excerpt;
        this.featuredImage = featuredImage;
    }

    public WP_Post_Index(String id, String title, String excerpt) {
        this.id = id;
        this.title = title;
        this.excerpt = excerpt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }
}
