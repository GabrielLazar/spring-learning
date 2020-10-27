package com.gabriellazar.implementation;

import com.gabriellazar.services.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 10;
    }
}
