
package com.apurv.demoapp.pojos;

import java.util.List;

import com.google.gson.annotations.Expose;


@SuppressWarnings("unused")
public class Photos {

    @Expose
    private Long page;
    @Expose
    private Long pages;
    @Expose
    private Long perpage;
    @Expose
    private List<Photo> photo;
    @Expose
    private Long total;

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getPerpage() {
        return perpage;
    }

    public void setPerpage(Long perpage) {
        this.perpage = perpage;
    }

    public List<Photo> getPhoto() {
        return photo;
    }

    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}
