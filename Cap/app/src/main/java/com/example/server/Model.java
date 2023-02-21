package com.example.server;

import com.example.cap.Cap;
import com.example.cap.Size;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Cap> caps;
    Model() {
        caps = new ArrayList<Cap>();
        caps.add(new Cap("Go CMU", Size.LARGE));
        caps.add(new Cap("Jackalopes!", Size.MEDIUM));
    }

    List<Cap> findAll() {
        return caps;
    }
}