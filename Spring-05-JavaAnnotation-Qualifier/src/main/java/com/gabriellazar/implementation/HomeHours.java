package com.gabriellazar.implementation;

import com.gabriellazar.services.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class HomeHours  implements ExtraSessions {

    @Override
    public int getHours() {
        return 6;
    }
}
