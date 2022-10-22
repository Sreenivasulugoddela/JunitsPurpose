package com.example.api;

import java.util.List;

public interface ServiceToUser
{
    List<String> todoServiceForUsers(String user);

    void deleteServiceForUsers(String user);
}
