package Spring.project.TodoList.dataAccess.abstracts;

import Spring.project.TodoList.entities.concretes.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoItem,Integer> {

}
