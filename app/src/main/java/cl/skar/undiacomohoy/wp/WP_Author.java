package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Author {
    public static final String KEY_ID = "id";
    public static final String KEY_SLUG = "slug";
    public static final String KEY_NAME = "name";
    public static final String KEY_FIRST_NAME = "first_name";
    public static final String KEY_LAST_NAME = "last_name";
    public static final String KEY_NICKNAME = "nickname";
    public static final String KEY_URL = "url";
    public static final String KEY_DESCRIPTION = "description";
    private String id = null;
    private String slug = null;
    private String name = null;
    private String firstName = null;

    public WP_Author() {
    }

    public WP_Author(String id, String slug, String firstName, String lastName,
                     String nickname, String url, String description) {
        this.id = id;
        this.slug = slug;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.url = url;
        this.description = description;
    }

    private String lastName = null;
    private String nickname = null;
    private String url = null;
    private String description = null;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
