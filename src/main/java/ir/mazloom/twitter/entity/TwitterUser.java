package ir.mazloom.twitter.entity;

import lombok.Data;
import twitter4j.RateLimitStatus;
import twitter4j.Status;
import twitter4j.URLEntity;
import twitter4j.User;

import java.util.Date;

@Data
public class TwitterUser implements twitter4j.User {
    private Long id;
    private String screenName;
    private String name;
    private String biography;
    private Integer followersCount;
    private Integer friendsCount;
    private Date createdAt;

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getScreenName() {
        return this.screenName;
    }

    @Override
    public String getDescription() {
        return this.biography;
    }

    @Override
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public int getFollowersCount() {
        return this.followersCount;
    }

    @Override
    public int getFriendsCount() {
        return this.friendsCount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /*********************************/
    @Override
    public String getEmail() {
        return null;
    }


    @Override
    public String getLocation() {
        return null;
    }


    @Override
    public boolean isContributorsEnabled() {
        return false;
    }

    @Override
    public String getProfileImageURL() {
        return null;
    }

    @Override
    public String getBiggerProfileImageURL() {
        return null;
    }

    @Override
    public String getMiniProfileImageURL() {
        return null;
    }

    @Override
    public String getOriginalProfileImageURL() {
        return null;
    }

    @Override
    public String get400x400ProfileImageURL() {
        return null;
    }

    @Override
    public String getProfileImageURLHttps() {
        return null;
    }

    @Override
    public String getBiggerProfileImageURLHttps() {
        return null;
    }

    @Override
    public String getMiniProfileImageURLHttps() {
        return null;
    }

    @Override
    public String getOriginalProfileImageURLHttps() {
        return null;
    }

    @Override
    public String get400x400ProfileImageURLHttps() {
        return null;
    }

    @Override
    public boolean isDefaultProfileImage() {
        return false;
    }

    @Override
    public String getURL() {
        return null;
    }

    @Override
    public boolean isProtected() {
        return false;
    }


    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public String getProfileBackgroundColor() {
        return null;
    }

    @Override
    public String getProfileTextColor() {
        return null;
    }

    @Override
    public String getProfileLinkColor() {
        return null;
    }

    @Override
    public String getProfileSidebarFillColor() {
        return null;
    }

    @Override
    public String getProfileSidebarBorderColor() {
        return null;
    }

    @Override
    public boolean isProfileUseBackgroundImage() {
        return false;
    }

    @Override
    public boolean isDefaultProfile() {
        return false;
    }

    @Override
    public boolean isShowAllInlineMedia() {
        return false;
    }


    @Override
    public int getFavouritesCount() {
        return 0;
    }

    @Override
    public int getUtcOffset() {
        return 0;
    }

    @Override
    public String getTimeZone() {
        return null;
    }

    @Override
    public String getProfileBackgroundImageURL() {
        return null;
    }

    @Override
    public String getProfileBackgroundImageUrlHttps() {
        return null;
    }

    @Override
    public String getProfileBannerURL() {
        return null;
    }

    @Override
    public String getProfileBannerRetinaURL() {
        return null;
    }

    @Override
    public String getProfileBannerIPadURL() {
        return null;
    }

    @Override
    public String getProfileBannerIPadRetinaURL() {
        return null;
    }

    @Override
    public String getProfileBannerMobileURL() {
        return null;
    }

    @Override
    public String getProfileBannerMobileRetinaURL() {
        return null;
    }

    @Override
    public String getProfileBanner300x100URL() {
        return null;
    }

    @Override
    public String getProfileBanner600x200URL() {
        return null;
    }

    @Override
    public String getProfileBanner1500x500URL() {
        return null;
    }

    @Override
    public boolean isProfileBackgroundTiled() {
        return false;
    }

    @Override
    public String getLang() {
        return null;
    }

    @Override
    public int getStatusesCount() {
        return 0;
    }

    @Override
    public boolean isGeoEnabled() {
        return false;
    }

    @Override
    public boolean isVerified() {
        return false;
    }

    @Override
    public boolean isTranslator() {
        return false;
    }

    @Override
    public int getListedCount() {
        return 0;
    }

    @Override
    public boolean isFollowRequestSent() {
        return false;
    }

    @Override
    public URLEntity[] getDescriptionURLEntities() {
        return new URLEntity[0];
    }

    @Override
    public URLEntity getURLEntity() {
        return null;
    }

    @Override
    public String[] getWithheldInCountries() {
        return new String[0];
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public RateLimitStatus getRateLimitStatus() {
        return null;
    }

    @Override
    public int getAccessLevel() {
        return 0;
    }
}
