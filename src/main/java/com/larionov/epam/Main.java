package com.larionov.epam;

import com.larionov.epam.service.impl.DemoServiceImpl;

public class Main {
    public static void main(String[] args) {
        DemoServiceImpl service = new DemoServiceImpl();
        service.service();
    }
}
