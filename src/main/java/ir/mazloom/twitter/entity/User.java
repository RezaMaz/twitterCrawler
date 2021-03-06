package ir.mazloom.twitter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TBL_USER")
public class User {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "C_SCREEN_NAME", unique = true)
    private String screenName;

    @Column(name = "C_NAME")
    private String name;

    @Column(name = "C_BIOGRAPHY")
    private String biography;

    @Column(name = "N_FOLLOWERS_COUNT")
    private Integer followersCount;

    @Column(name = "N_FRIENDS_COUNT")
    private Integer friendsCount;

    @Column(name = "N_RELATIONS_COUNT")
    private Integer relationCount;

    @Column(name = "D_CREATED_AT")
    private Date createdAt;

    @Column(name = "B_SEED")
    private Boolean seed;

    @Column(name = "B_FINISH")
    private Boolean finish;

    @Column(name = "B_TWEET_FINISH")
    private Boolean tweetFinish;

    @Column(name = "N_PAGE")
    private Integer page;

    @Column(name = "B_CRAWLING")
    private Boolean crawling;

    @Column(name = "N_FOLLOWER_CURSOR")
    private Long followerCursor;

    @Column(name = "N_FOLLOWING_CURSOR")
    private Long followingCursor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "follower")
    private List<Relationship> followers;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "following")
    private List<Relationship> following;

}
