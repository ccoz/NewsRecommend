package csu.nr.operation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "csu.nr.api.client")
@MapperScan("csu.nr.operation.mapper")
@SpringBootApplication
public class OperationApplication {
    public static void main(String[] args) {
        SpringApplication.run(OperationApplication.class, args);
    }
}