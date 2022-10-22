package com.example.api;

import java.util.Arrays;
import java.util.List;

public class ServiceToUserImplementation implements ServiceToUser
{


    @Override
    public List<String> todoServiceForUsers(String user)
    {
        return Arrays.asList("Learn Spring quickly","Learn Spring MVC","Learn Spring AOC","Learning sake");
    }

    @Override
    public void deleteServiceForUsers(String user) {

    }
}
