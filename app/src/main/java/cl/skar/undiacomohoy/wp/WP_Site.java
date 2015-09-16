package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Site {
    private static final String SITE_URL = "http://www.diasfertiles.cl/";
    private static final String BASE_API = SITE_URL + "wp-json/wp/v2/";
    public static final String POSTS = BASE_API + "posts/";
    public static final String PAGES = BASE_API + "pages/";
    public static final String CATEGORIES = BASE_API + "terms/category/";
    public static final String TAGS = BASE_API + "terms/tag/";
    public static final String AUTHOR = BASE_API + "users/";
    public static final String COMMENTS = BASE_API + "comments/";

}
