//package nyc.c4q.ramonaharrison.model;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class User {
//
//    // TODO: implement private fields for each of the following user JSON keys:
//    private String id;
//    private String name;
//    private Boolean deleted;
//    private String color;
//    private List<profile> profile;
//    private Boolean is_admin;
//    private Boolean is_owner;
//    private Boolean is_primary_owner;
//    private Boolean is_restricted;
//    private Boolean is_ultra_restricted;
//    private Boolean has_2fa;
//    private String sms;
//    private Boolean has_files;
//
//    // "id"
//    // "name"
//    // "deleted"
//    // "color"
//    // "profile"
//    // "is_admin"
//    // "is_owner"
//    // "is_primary_owner"
//    // "is_restricted"
//    // "is_ultra_restricted"
//    // "has_2fa"
//    // "two_factor_type"
//    // "has_files"
//
//    public User(JSONObject json) {
//        // TODO: parse a user from the incoming json
//        if (json.containsKey("id"))
//            this.id = (String) json.get("id");
//
//        if (json.containsKey("name"))
//            this.name = (String) json.get("name");
//
//        if (json.containsKey("deleted"))
//            this.deleted = (Boolean) json.get("deleted");
//
//        if (json.containsKey("color"))
//            this.color = (String) json.get("color");
//
//        if (json.containsKey("profile")) {
//            JSONArray jsonFields = (JSONArray) json.get("profile");
//            this.profile = new ArrayList<Field>();
//            for (int i = 0; i < jsonFields.size(); i++) {
//                Field field = new Field((JSONObject) jsonFields.get(i));
//                this.profile.add(profile);
//            }
//        }
//
//        if (json.containsKey("is_admin"))
//            this.is_admin = (Boolean) json.get("is_admin");
//
//        if (json.containsKey("is_owner"))
//            this.is_owner = (Boolean) json.get("is_owner");
//
//        if (json.containsKey("is_primary_owner"))
//            this.is_primary_owner = (Boolean) json.get("is_primary_owner");
//
//        if (json.containsKey("is_restricted"))
//            this.is_restricted = (Boolean) json.get("is_restricted");
//
//        if (json.containsKey("is_ultra_retstricted"))
//            this.is_ultra_restricted = (Boolean) json.get("is_ultra_restricted");
//
//        if (json.containsKey("has_2fa"))
//            this.has_2fa = (Boolean) json.get("has_2fa");
//
//        if (json.containsKey("sms"))
//            this.sms = (String) json.get("sms");
//
//        if (json.containsKey("has_files"))
//            this.has_files = (Boolean) json.get("has_files");
//    }
//
//    // TODO add getters to access private fields
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Boolean getDeleted() {
//        return deleted;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public List<profile> getProfile() {
//        return profile;
//    }
//
//    public Boolean getIs_admin() {
//        return is_admin;
//    }
//
//    public Boolean getIs_owner() {
//        return is_owner;
//    }
//
//    public Boolean getIs_primary_owner() {
//        return is_primary_owner;
//    }
//
//    public Boolean getIs_restricted() {
//        return is_restricted;
//    }
//
//    public Boolean getIs_ultra_restricted() {
//        return is_ultra_restricted;
//    }
//
//    public Boolean getHas_2fa() {
//        return has_2fa;
//    }
//
//    public String getSms() {
//        return sms;
//    }
//
//    public Boolean getHas_files() {
//        return has_files;
//    }
//}
