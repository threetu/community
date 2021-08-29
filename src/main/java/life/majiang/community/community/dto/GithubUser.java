package life.majiang.community.community.dto;

public class GithubUser {
    private String name;
    private  Long id;
    private  String bio;
    private String avatarurl;

    public String getAvatar_url() {
        return avatarurl;
    }

    public void setAvatar_url(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
