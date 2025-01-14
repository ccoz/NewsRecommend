package csu.nr.api.client;

import csu.nr.api.config.DefaultFeignConfig;
import csu.nr.api.domain.dto.NewDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "news-service", configuration = DefaultFeignConfig.class)
public interface NewClient {
    @GetMapping("/news/{id}")
//    NewDTO queryNewById(@RequestParam("id") Long id);
    NewDTO queryNewById(@PathVariable("id") Long id);
}
