package Spring.project.TodoList.webApi.Controllers;

import Spring.project.TodoList.busniness.abstracts.TodoService;
import Spring.project.TodoList.busniness.requests.CreateTaskRequest;
import Spring.project.TodoList.busniness.response.GetAllTaskResponse;
import Spring.project.TodoList.core.mapper.ModelMapperService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/todo")
public class ToDoController {
    private TodoService todoService;
    private ModelMapperService modelMapperService;
    @GetMapping("/getall")
    public List<GetAllTaskResponse> getAll(){
         return todoService.getAll();
    }
    @PostMapping("/complete")
    public void completeTask(boolean complete,int id){
        todoService.completeTheTask(complete,id);
    }
    @PostMapping("/add")
    public void add(CreateTaskRequest createTaskRequest){
        todoService.addTask(createTaskRequest);
    }
}
