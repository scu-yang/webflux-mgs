package com.mgs.account.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class AddEssayReq  {

    @ApiModelProperty(value = "内容")
    @NotNull
    private String content;

    @ApiModelProperty(value = "topic")
    @NotNull
    private String topic;

    @ApiModelProperty(value = "original")
    private Long original;

    @ApiModelProperty(value = "hasSecret")
    @NotNull
    private Boolean hasSecret;

    @ApiModelProperty(value = "canPublic")
    @NotNull
    private Boolean canPublic;
}
