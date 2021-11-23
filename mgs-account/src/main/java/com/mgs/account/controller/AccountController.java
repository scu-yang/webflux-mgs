package com.mgs.account.controller;

import com.mgs.account.api.AddEssayReq;
import com.mgs.account.api.AccountApi;
import com.tove.mgs.common.Response;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author user
 */
@RestController
public class AccountController implements AccountApi {

    @Override
    public Response<Boolean> addEssay(AddEssayReq req) {
        return Response.getFail();
    }

    @Override
    public Response<Boolean> addEssay2() {
        return Response.getFail();
    }
}
