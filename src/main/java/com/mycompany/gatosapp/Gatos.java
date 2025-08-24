
package com.mycompany.gatosapp;

public class Gatos {
    private String id;
    private String url;
    private String image;
    private String apiKey = "live_AWt3ko8GipDW0vy0B0yw7OXbDnVqLJQKt3uSC5kr7wfi9dGdgyFxh1tk0429SMLo";

    public Gatos() {
    }

    public Gatos(String id, String url, String image) {
        this.id = id;
        this.url = url;
        this.image = image;
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getApikey() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
}
