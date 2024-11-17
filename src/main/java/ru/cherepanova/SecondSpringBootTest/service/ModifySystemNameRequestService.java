package ru.cherepanova.SecondSpringBootTest.service;

import org.apache.logging.log4j.util.Timer;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.cherepanova.SecondSpringBootTest.model.Request;

import java.lang.management.ThreadInfo;

@Service
public class ModifySystemNameRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {
        request.setSystemName("Service 1");
        request.setSource("Source Service 1");
        request.setSystemTime(String.valueOf(System.currentTimeMillis()));

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST, httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
