package com.be.apptwo.common.feignapi;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-one-services", path = "app-one-api")
@RibbonClient(name = "app-one-services")
public interface AppOneFeignApi {

    @GetMapping(value = "/api/region-list-all")
    public ResponseEntity< ? > regionListAll();

}
