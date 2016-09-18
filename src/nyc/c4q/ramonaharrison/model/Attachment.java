package nyc.c4q.ramonaharrison.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Attachment {

    // TODO: implement private fields for each of the following attachment JSON keys:
    private String fallback;
    private String color;
    private String pretext;
    private String authorName;
    private String authorLink;
    private String authorIcon;
    private String title;
    private String titleLink;
    private String text;
    private List<Field> fields;
    private String imageURL;
    private String thumbURL;
    private String footerIcon;
    private long ts;


    // "fallback"
    // "color"
    // "pretext"
    // "author_name"
    // "author_link"
    // "author_icon"
    // "title"
    // "title_link"
    // "text"
    // "fields"
    // "image_url"
    // "thumb_url"
    // "footer"
    // "footer_icon"
    // "ts"

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json
        if (json.containsKey("fallback"))
            this.fallback = (String) json.get("fallback"); //<--- parenthesis w/ "String" is casting

        if (json.containsKey("fields")) {
            JSONArray jsonFields = (JSONArray) json.get("fields");
            this.fields = new ArrayList<Field>();
            for (int i = 0; i < jsonFields.size(); i++) {
                Field field = new Field ((JSONObject) jsonFields.get(i));
                this.fields.add(field);
            }
        }

        if (json.containsKey("color"))
            this.color = (String) json.get("color");

        if (json.containsKey("pretext"))
            this.pretext = (String) json.get("pretext");

        if (json.containsKey("authorName"))
            this.authorName = (String) json.get("authorName");

        if (json.containsKey("authorLink"))
            this.authorLink = (String) json.get("authorLink");

        if (json.containsKey("authorIcon"))
            this.authorIcon = (String) json.get("authorIcon");

        if (json.containsKey("title"))
            this.title = (String) json.get("title");

        if (json.containsKey("titleLink"))
            this.titleLink = (String) json.get("titleLink");

        if (json.containsKey("text"))
            this.text = (String) json.get("text");

        if (json.containsKey("imageURL"))
            this.imageURL = (String) json.get("imageURL");

        if (json.containsKey("thumbURL"))
            this.thumbURL = (String) json.get("thumbURL");

        if (json.containsKey("footerIcon"))
            this.footerIcon = (String) json.get("footerIcon");

        if (json.containsKey("ts"))
            this.ts = (Long) json.get("ts");
    }


    // TODO add getters to access private fields

    public String getFallback() {
        return fallback;
    }

    public String getColor() {
        return color;
    }

    public String getPretext() {
        return pretext;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public String getText() {
        return text;
    }

    public List<Field> getFields() {
        return fields;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getThumbURL() {
        return thumbURL;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public long getTs() {
        return ts;
    }
}
