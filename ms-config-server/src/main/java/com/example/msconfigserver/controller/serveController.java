package com.example.msconfigserver.controller;

import com.example.msconfigserver.dto.ServeDTO;
import com.example.msconfigserver.service.ServeService.ServeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class serveController {

    @Autowired
    private ServeService serveService;

    public void incluirServe(@RequestBody ServeDTO dto) {

        serveService.registraServe(dto);

    }

}
