package com.example.msconfigserver.service.ServeService;

import com.example.msconfigserver.dto.DadosClienteDTO;
import com.example.msconfigserver.dto.ServeDTO;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServeService {


    public void registraServe(ServeDTO dto) {
        DadosClienteDTO clienteDTO = new DadosClienteDTO();
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange("http://localhost:9091/cliente/nome" + dto.getNomeCliente(),
                HttpMethod.GET, null, DadosClienteDTO.class);
    }

}
