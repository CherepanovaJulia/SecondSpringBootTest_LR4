package ru.cherepanova.SecondSpringBootTest.service;

import org.springframework.stereotype.Service;
import ru.cherepanova.SecondSpringBootTest.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
