
package com.apurv.demoapp.pojos;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Photo {

    @Expose
    private Long farm;
    @SerializedName("height_s")
    private String heightS;
    @Expose
    private String id;
    @Expose
    private Long isfamily;
    @Expose
    private Long isfriend;
    @Expose
    private Long ispublic;
    @Expose
    private String owner;
    @Expose
    private String secret;
    @Expose
    private String server;
    @Expose
    private String title;
    @SerializedName("url_s")
    private String urlS;
    @SerializedName("width_s")
    private String widthS;

    public Long getFarm() {
        return farm;
    }

    public void setFarm(Long farm) {
        this.farm = farm;
    }

    public String getHeightS() {
        return heightS;
    }

    public void setHeightS(String heightS) {
        this.heightS = heightS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(Long isfamily) {
        this.isfamily = isfamily;
    }

    public Long getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(Long isfriend) {
        this.isfriend = isfriend;
    }

    public Long getIspublic() {
        return ispublic;
    }

    public void setIspublic(Long ispublic) {
        this.ispublic = ispublic;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlS() {
        return urlS;
    }

    public void setUrlS(String urlS) {
        this.urlS = urlS;
    }

    public String getWidthS() {
        return widthS;
    }

    public void setWidthS(String widthS) {
        this.widthS = widthS;
    }

}
