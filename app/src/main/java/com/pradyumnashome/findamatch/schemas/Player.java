package com.pradyumnashome.findamatch.schemas;

class Player {
    private String displayName;
    private String photoUri;
    private String emailAddress;

    public Player(String displayName, String photoUri, String emailAddress) {
        this.displayName = displayName;
        this.photoUri = photoUri;
        this.emailAddress = emailAddress;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
