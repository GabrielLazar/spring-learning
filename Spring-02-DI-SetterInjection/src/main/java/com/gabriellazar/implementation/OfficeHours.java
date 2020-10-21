package com.gabriellazar.implementation;

import com.gabriellazar.services.ExtraHours;

public class OfficeHours implements ExtraHours {

    @Override
    public int getHours() {
        return 5;
    }
}
