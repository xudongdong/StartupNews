/**
 * Copyright (C) 2013 HalZhang
 */

package com.halzhang.android.apps.startupnews.entity;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * StartupNews
 * <p>
 * </p>
 * 
 * @author <a href="http://weibo.com/halzhang">Hal</a>
 * @version Mar 7, 2013
 */
public class SNNew implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4629300319201201845L;

    private String url;

    private String title;

    private String urlDomain;

    private String voteURL;

    private int points;

    private int commentsCount;

    private String subText;

    private String discussURL;

    private SNUser user;

    private String postID;

    private boolean isDiscuss = false;// 是否是討論貼

    private String text;// 讨论帖内容

    private String createat;

    public SNNew() {
    }

    public SNNew(String url, String title, String urlDomain, String voteURL, int points,
            int commentsCount, String subText, String discussURL, SNUser user, String postID,
            boolean isDiscuss, String text, String createat) {
        super();
        this.url = url;
        this.title = title;
        this.urlDomain = urlDomain;
        this.voteURL = voteURL;
        this.points = points;
        this.commentsCount = commentsCount;
        this.subText = subText;
        this.discussURL = discussURL;
        this.user = user;
        this.postID = postID;
        this.isDiscuss = isDiscuss;
        this.text = text;
        this.createat = createat;
    }

    public SNNew(String url, String title, String urlDomain, String voteURL, int points,
            int commentsCount, String subText, String discussURL, SNUser user, String postID,
            String createat) {
        super();
        this.url = url;
        this.title = title;
        // this.urlDomain = urlDomain;
        setUrlDomain(urlDomain);
        this.voteURL = voteURL;
        this.points = points;
        this.commentsCount = commentsCount;
        this.subText = subText;
        this.discussURL = discussURL;
        this.user = user;
        this.postID = postID;
        this.createat = createat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComHead() {
        if (TextUtils.isEmpty(urlDomain)) {
            return null;
        }
        return urlDomain.substring(1, urlDomain.length() - 1);
    }

    public void setComHead(String comHead) {
        this.urlDomain = comHead;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public SNUser getUser() {
        return user;
    }

    public void setUser(SNUser user) {
        this.user = user;
    }

    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        // news里面的讨论帖
        this.isDiscuss = this.urlDomain != null && this.urlDomain.endsWith("dbanotes.net");
    }

    public String getVoteURL() {
        return voteURL;
    }

    public void setVoteURL(String voteURL) {
        this.voteURL = voteURL;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getDiscussURL() {
        return discussURL;
    }

    public void setDiscussURL(String discussURL) {
        this.discussURL = discussURL;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isDiscuss() {
        return isDiscuss;
    }

    public void setDiscuss(boolean isDiscuss) {
        this.isDiscuss = isDiscuss;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreateat() {
        return createat;
    }

    public void setCreateat(String createat) {
        this.createat = createat;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("URL: ").append(url).append(" Title: ").append(title).append(" SubText: ")
                .append(subText).append(" Comhead: ").append(urlDomain).append(" DiscussURL: ")
                .append(discussURL).append(" isDiscuss: ").append(isDiscuss);
        return builder.toString();
    }

}
