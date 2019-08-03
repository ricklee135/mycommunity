package blog.rick.community.community.dto;

import lombok.Data;

/**
 * Description: community
 * Created by lizhenguo on 2019/7/31 10:57
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
