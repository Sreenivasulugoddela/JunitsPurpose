package com.example.business;

import com.example.api.ServiceToUser;
import com.example.api.ServiceToUserImplementation;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceToUserImplTest
{
       @Test
       public void serviceToUserImplTestWithRelatedToSpring()
       {
           ServiceToUser serviceToUser= new ServiceToUserImplementation();

           ServiceToUserImpl service=new ServiceToUserImpl(serviceToUser);

           List<String> values=service.addingUserDetailsWithRelatedToSpring("Dummy");

           assertEquals(3,values.size());
       }
       @Test
       public void serviceToUserImplTestWithRelatedToSpringWithMocks()
       {
           ServiceToUser service=mock(ServiceToUser.class);

           List<String> values= Arrays.asList("Learn Spring quickly","Learn Spring MVC","Learn Spring AOC","Learning sake");

           when(service.todoServiceForUsers("dummy")).thenReturn(values);

           ServiceToUserImpl service1=new ServiceToUserImpl(service);

           List<String> values1=service1.addingUserDetailsWithRelatedToSpring("dummy");

           assertEquals(3,values1.size());

       }
}