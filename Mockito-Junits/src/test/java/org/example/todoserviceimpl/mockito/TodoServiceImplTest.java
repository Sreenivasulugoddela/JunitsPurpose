package org.example.todoserviceimpl.mockito;

import org.example.todoservice.mockito.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoServiceImplTest
{


       @Test
       public void todoServiceImplTest_UsingSizeOfReturnList()
       {
           TodoService service1=mock(TodoService.class);
           TodoService TodoService=new TodoServiceImpl();
           List<String> values=Arrays.asList("A","B","C");
           when(service1.retriveTodos("Dunny")).thenReturn(values);

           assertEquals(3,TodoService.retriveTodos("Dummy").size());
       }

       @Test(expected = NullPointerException.class)
       public void todoServiceImpl_UsingNullValuesTest()
       {
           TodoService service1=mock(TodoService.class);
           TodoService todoService=new TodoServiceImpl();
           List<String> values=Arrays.asList(null);
           when(service1.retriveTodos("ReprestingNull")).thenReturn(values);
           assertEquals(null,todoService.retriveTodos("").size());
       }
          @Test
          public void todoServiceImpl_UsingEmptyValuesTest()
          {
              TodoService service1=mock(TodoService.class);
              TodoService todoService=new TodoServiceImpl();
              List<String> values=Arrays.asList();
              when(service1.retriveTodos("ReprestingNull")).thenReturn(values);
              assertEquals(false,todoService.retriveTodos("").isEmpty());
           }

//       @Test
//       public void todoServiceImplTest_usingDummyValues()
//       {
//
//           TodoServiceImpl todoServiceImpl=new TodoServiceImpl(todoServiceStub);
//        List<String> filters1=todoServiceImpl.retrieveTodosRelatedToSpring("Junits");
//        assertEquals(true,filters1.add("Junits"));
//
//        }
//
//            @Test
//            public void todoServiceImplTest_usingDummyValuesUsingMock()
//            {
//                TodoService todoServiceMock= mock(TodoService.class);
//                List<String> todos= Arrays.asList("Junits","Stubbing","Mockitos");
//                when(todoServiceMock.retriveTodos("Dummmy")).thenReturn(todos);
//                TodoServiceImpl todoServiceImpl=new TodoServiceImpl(todoServiceMock);
//                List<String> filters1=todoServiceImpl.retrieveTodosRelatedToSpring("Junits");
//                assertEquals(0,filters1.size());
//
//            }
//
//
//    @Test(expected = NullPointerException.class)
//    public void todoServiceImplTest_usingNullValuesUsingMock()
//    {
//        TodoService todoServiceMock= mock(TodoService.class);
//        List<String> todos= Arrays.asList(null);
//        when(todoServiceMock.retriveTodos("Dummmy")).thenReturn(todos);
//        TodoServiceImpl todoServiceImpl=new TodoServiceImpl(todoServiceMock);
//        List<String> filters1=todoServiceImpl.retrieveTodosRelatedToSpring("Junits");
//        assertEquals(null,filters1.size());
//
//    }


         public static int x=10, y=10;
        @Test
        public void testOfAnSum()
        {
            int add=x+y;
            assertEquals(20,add);
        }

        @Test
        public void testOfNegative()
        {
            int x1=-10,y1=-10;
            int add=x1+y1;
            assertEquals(-20,x1+y1);
        }
}