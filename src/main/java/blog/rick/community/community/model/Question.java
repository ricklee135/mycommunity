package blog.rick.community.community.model;

import lombok.Data;

/**
 * Description: community
 * Created by lizhenguo on 2019/8/2 17:18
 */
@Data
public class Question {
    private int id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}

