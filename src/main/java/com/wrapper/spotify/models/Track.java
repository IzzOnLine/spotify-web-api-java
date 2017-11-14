package com.wrapper.spotify.models;

import java.util.List;

public class Track {

  private List<String> availableMarkets;
  private AlbumSimplified album;
  private List<ArtistSimplified> artists;
  private int discNumber;
  private int duration;
  private boolean explicit;
  private ExternalIds externalIds;
  private ExternalUrls externalUrls;
  private String href;
  private String id;
  private String name;
  private int popularity;
  private String previewUrl;
  private int trackNumber;
  private ObjectType type = ObjectType.TRACK;
  private String uri;

  public AlbumSimplified getAlbum() {
    return album;
  }

  public void setAlbum(AlbumSimplified album) {
    this.album = album;
  }

  public List<ArtistSimplified> getArtists() {
    return artists;
  }

  public void setArtists(List<ArtistSimplified> artists) {
    this.artists = artists;
  }

  public List<String> getAvailableMarkets() {
    return availableMarkets;
  }

  public void setAvailableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
  }

  public int getDiscNumber() {
    return discNumber;
  }

  public void setDiscNumber(int discNumber) {
    this.discNumber = discNumber;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public boolean isExplicit() {
    return explicit;
  }

  public void setExplicit(boolean explicit) {
    this.explicit = explicit;
  }

  public ExternalIds getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(ExternalIds externalIds) {
    this.externalIds = externalIds;
  }

  public ExternalUrls getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(ExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPopularity() {
    return popularity;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public int getTrackNumber() {
    return trackNumber;
  }

  public void setTrackNumber(int trackNumber) {
    this.trackNumber = trackNumber;
  }

  public ObjectType getType() {
    return type;
  }

  public void setType(ObjectType type) {
    this.type = type;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }
}
