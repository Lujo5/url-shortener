package lm.shortener.model;

public class ShortenedUrl {

    private String shortUrlCode;
    private String fullUrl;
    private String redirectType;
    private int visits;

    public ShortenedUrl(String shortUrlCode, String fullUrl, String redirectType) {
        this.fullUrl = fullUrl;
        this.shortUrlCode = shortUrlCode;
        this.redirectType = redirectType;
        this.visits = 0;
    }

    public ShortenedUrl(String shortUrlCode, String fullUrl, String redirectType, int visits) {
        this.fullUrl = fullUrl;
        this.shortUrlCode = shortUrlCode;
        this.redirectType = redirectType;
        this.visits = visits;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getShortUrlCode() {
        return shortUrlCode;
    }

    public void setShortUrlCode(String shortUrl) {
        this.shortUrlCode = shortUrl;
    }

    public int getVisits() {
        return visits;
    }

    public String getVisitsString() {
        return String.valueOf(visits);
    }

    public String getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(String redirectType) {
        this.redirectType = redirectType;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public void incrementVisits() {
        this.visits++;
    }
}
