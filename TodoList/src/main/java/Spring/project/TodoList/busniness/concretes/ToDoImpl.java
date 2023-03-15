package Spring.project.TodoList.busniness.concretes;

import Spring.project.TodoList.busniness.abstracts.TodoService;
import Spring.project.TodoList.busniness.requests.CreateTaskRequest;
import Spring.project.TodoList.busniness.response.GetAllTaskResponse;
import Spring.project.TodoList.core.mapper.ModelMapperService;
import Spring.project.TodoList.dataAccess.abstracts.ToDoRepository;
import Spring.project.TodoList.entities.concretes.ToDoItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ToDoImpl implements TodoService {
    private ToDoRepository toDoRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllTaskResponse> getAll() {
        List<ToDoItem> toDoItems = toDoRepository.findAll();
        List<GetAllTaskResponse> getAllTaskResponses = toDoItems.stream().map(toDoItem -> this.modelMapperService.forResponse().map(toDoItem, GetAllTaskResponse.class)).collect(Collectors.toList());
        return getAllTaskResponses;
    }

    @Override
    public void completeTheTask(boolean complete,int id) {
        if (toDoRepository.existsById(id)){
            ToDoItem toDoItem = toDoRepository.getReferenceById(id);
            toDoItem.setComplete(true);
        }

    }

    @Override
    public void addTask(CreateTaskRequest createTaskRequest) {
        ToDoItem toDoItem = this.modelMapperService.forRequest().map(createTaskRequest,ToDoItem.class);
        this.toDoRepository.save(toDoItem);
    }
}
