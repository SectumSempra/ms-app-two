package com.be.apptwo.common.feignapi;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("app-one-services")
@RibbonClient("app-one-services")
public interface AppOneFeignApi {

    @GetMapping(value = "/api/region-list-all")
    public ResponseEntity< ? > regionListAll();

}
