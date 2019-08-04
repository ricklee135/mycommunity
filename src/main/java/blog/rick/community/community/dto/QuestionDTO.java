package blog.rick.community.community.dto;

import blog.rick.community.community.model.User;
import lombok.Data;

/**
 * Description: community
 * Created by lizhenguo on 2019/8/3 17:36
 */
@Data
public class QuestionDTO {
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
    private User user;
}
