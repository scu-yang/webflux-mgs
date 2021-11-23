package com.mgs.account.api;

import com.tove.mgs.common.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author user
 */
@Api(value = "Friend 好友关系")
public interface AccountApi {

    @ApiOperation("发布动态, 包括匿名和实名, 转发动态")
    @PostMapping(value = "/essay/add-essay", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> addEssay(@RequestBody @Validated AddEssayReq req);

    @ApiOperation("发布动态, 包括匿名和实名, 转发动态")
    @GetMapping(value = "/essay/add-essay-2", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> addEssay2();
}
