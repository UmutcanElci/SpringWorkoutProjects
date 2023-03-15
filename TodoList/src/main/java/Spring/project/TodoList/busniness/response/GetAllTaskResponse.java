package Spring.project.TodoList.busniness.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTaskResponse {
    private int id;
    private String taskName;
    private boolean complete;
}
