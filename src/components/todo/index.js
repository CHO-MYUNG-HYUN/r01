import { useState } from "react";
import TodoInput from "./TodoInput";
import TodoList from "./TodoList";
import TemplatePage from "../../layout/TemplatePage";


const Todo = () => {

  const [todoArr, setTodoArr] = useState([])

  const addTodo = (newTodo) => {
    console.log("add Todo ! ", newTodo)

    setTodoArr([...todoArr, newTodo])
  }

  const removeTodo = (tno) => {
    console.log("removeTodo ! ", tno)

    setTodoArr(todoArr.filter(todo => todo.tno !== tno))
  }

  return (
    <TemplatePage>
      <TodoInput addTodo={addTodo}></TodoInput>
      <TodoList arr={todoArr} removeFn={removeTodo}></TodoList>
    </TemplatePage>
  );
}

export default Todo;