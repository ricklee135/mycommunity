package blog.rick.community.community.model;

import lombok.Data;

/**
 * Description: community
 * Created by lizhenguo on 2019/8/1 10:49
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
