package com.example.business;

import com.example.api.ServiceToUser;

import java.util.ArrayList;
import java.util.List;

public class ServiceToUserImpl
{
       ServiceToUser serviceToUser;

       public ServiceToUserImpl(ServiceToUser serviceToUser)
       {
           this.serviceToUser=serviceToUser;
       }

       public List<String> addingUserDetailsWithRelatedToSpring(String user)
       {
           List<String> customValues=new ArrayList<>();

           List<String> actualValues=serviceToUser.todoServiceForUsers(user);

           for(String todo:actualValues)
           {
               if(todo.contains("Spring"))
               {
                   customValues.add(todo);
               }
           }
           return customValues;
       }
      public void deletingUserDetailsWithRelatedToSpring(String user)
      {
        List<String> actualValues=serviceToUser.todoServiceForUsers(user);

        for(String todo:actualValues)
        {
            if(!todo.contains("Spring"))
            {
                serviceToUser.deleteServiceForUsers(todo);
            }
        }

    }
}
