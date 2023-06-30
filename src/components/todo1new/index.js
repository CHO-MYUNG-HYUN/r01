import { useState } from "react";
import T1I from "./T1I";
import T1L from "./T1L";
import T1R from "./T1R";
import uuid from "react-uuid";

const Todo1New = () => {

  const [todos, setTodos] = useState([])
  const [current, setCurrent] = useState(null)

  const addTodo = (todo) => {
    console.log(todo)
    setTodos([...todos, { tno: uuid(), ...todo }])
    console.log(todos)
  }

  const requestView = (tno) => {
    console.log(tno)
    const target = todos.filter(t => t.tno === tno)
    console.log(target)
    setCurrent({...target})
  }

  return (
    <>
      <div className="text-5xl bg-yellow-300">
        todo1
      </div>
      <T1I addTodo={addTodo}></T1I>
      <T1L todos={todos} requestView={requestView}></T1L>
      <T1R current={current}></T1R>
    </>
  );
}

export default Todo1New;