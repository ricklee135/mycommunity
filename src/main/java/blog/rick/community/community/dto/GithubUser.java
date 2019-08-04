package blog.rick.community.community.dto;

import lombok.Data;

/**
 * Description: community
 * Created by lizhenguo on 2019/7/31 15:31
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
