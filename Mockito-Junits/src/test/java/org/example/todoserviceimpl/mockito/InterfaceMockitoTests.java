package org.example.todoserviceimpl.mockito;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class InterfaceMockitoTests
{


       @Test
       public void mockWithListInterface()
       {
           List listedMock=mock(List.class);
           when(listedMock.size()).thenReturn(2);
           assertEquals(2,listedMock.size());
       }
       @Test
       public void testwithListOfIntegerValues()
       {
           List mockedList=mock(List.class);

           when(mockedList.get(0)).thenReturn(1).thenReturn(2);
           assertEquals(1,mockedList.get(0));
           assertEquals(2,mockedList.get(0));
       }
    @Test
    public void testwithListOfIntegerOfMatcherValues()
    {
        List mockedList=mock(List.class);
        //matchers of mockitos
        when(mockedList.get(anyInt())).thenReturn(1).thenReturn(2);
        assertEquals(1,mockedList.get(0));
        assertEquals(2,mockedList.get(10));
    }

    @Test
    public void testwithListOfIntegerOfThrowingExceptionValues()
    {
        List mockedList=mock(List.class);

        when(mockedList.get(anyInt())).thenReturn(1).thenReturn(new NullPointerException("PP"));
        mockedList.get(0);
        mockedList.get(152875390);
    }
       @Test
       public void testWithListOfElements()
       {
           List mockedList=mock(List.class);
           when(mockedList.get(anyInt())).thenReturn("Element").thenReturn("ElemetsOfElements");

           assertEquals("Element",mockedList.get(Integer.parseInt(String.valueOf("2"))));
           assertEquals("ElemetsOfElements",mockedList.get(Integer.parseInt(String.valueOf("3"))));
       }

}
