package cl.skar.undiacomohoy.wp;

/**
 * Created by INSATSA.S.A on 14-09-2015.
 */
public class WP_Site {
    private static String SITE_URL = "http://www.diasfertiles.cl/";
    private static String BASE_API = SITE_URL + "wp-json/wp/v2/";
    public static String POSTS = BASE_API + "posts/";
    public static String PAGES = BASE_API + "pages/";
    public static String CATEGORIES = BASE_API + "terms/category/";
    public static String TAGS = BASE_API + "terms/tag/";
    public static String AUTHOR = BASE_API+"author/";

}
