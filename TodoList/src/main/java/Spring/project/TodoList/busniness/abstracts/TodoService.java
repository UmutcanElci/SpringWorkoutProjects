package Spring.project.TodoList.busniness.abstracts;


import Spring.project.TodoList.busniness.requests.CreateTaskRequest;
import Spring.project.TodoList.busniness.response.GetAllTaskResponse;

import java.util.List;

public interface TodoService {
   List<GetAllTaskResponse> getAll();
   void completeTheTask(boolean complete , int id);
   void addTask(CreateTaskRequest createTaskRequest);

}
