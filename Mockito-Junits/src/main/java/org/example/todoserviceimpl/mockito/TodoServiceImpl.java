package org.example.todoserviceimpl.mockito;

import org.example.todoservice.mockito.TodoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoServiceImpl implements  TodoService
{



    @Override
    public List<String> retriveTodos(String user)
    {
        String values="FirstOne,SecondOne,ThirdOne";

        List<String> convertedList=new ArrayList<>(Arrays.asList(values.split(",")));
        for(String list:convertedList)
        {
            System.out.println(list);
        }
        return convertedList;
    }
}
