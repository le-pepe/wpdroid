package cl.skar.undiacomohoy.wp;

import java.util.List;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Post {

    private String id = null;
    private String type = null;
    private String slug = null;
    private String url = null;
    private String status = null;
    private String title = null;
    private String titlePlain = null;
    private String content = null;
    private String excerpt = null;
    private String date = null;
    private String featuredImage = null;
    private List<WP_Category> categories = null;
    private List<WP_Tag> tags = null;
    private WP_Author author = null;

    public WP_Post() {
    }

    public WP_Post(String id, String type, String slug, String url, String status, String title, String titlePlain, String content, String excerpt, String date, String featuredImage, List<WP_Category> categories, List<WP_Tag> tags, WP_Author author) {
        this.id = id;
        this.type = type;
        this.slug = slug;
        this.url = url;
        this.status = status;
        this.title = title;
        this.titlePlain = titlePlain;
        this.content = content;
        this.excerpt = excerpt;
        this.date = date;
        this.featuredImage = featuredImage;
        this.categories = categories;
        this.tags = tags;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitlePlain() {
        return titlePlain;
    }

    public void setTitlePlain(String titlePlain) {
        this.titlePlain = titlePlain;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public List<WP_Category> getCategories() {
        return categories;
    }

    public void setCategories(List<WP_Category> categories) {
        this.categories = categories;
    }

    public List<WP_Tag> getTags() {
        return tags;
    }

    public void setTags(List<WP_Tag> tags) {
        this.tags = tags;
    }

    public WP_Author getAuthor() {
        return author;
    }

    public void setAuthor(WP_Author author) {
        this.author = author;
    }


}
