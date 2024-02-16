package com.telecom.gestionservice.feign;

import com.telecom.gestionservice.response.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name = "administracion-service",url = "http://localhost:8001")
//@RequestMapping("/administracion")
@FeignClient(name = "administracion-service"/*,
        url = "http://localhost:8001"*/,
//        url = "http://backendgestion:8091",
        path = "/administracion")
public interface EmpresaClient {
    @GetMapping("/{empresaId}")
    ResponseEntity<Response> getOne(@PathVariable("empresaId") Integer empresaId);
}
