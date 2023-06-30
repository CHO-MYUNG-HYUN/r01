import { useState } from "react";

const T1I = ({ addTodo }) => {

  const [todo, setTodo] = useState({ title: '' })

  return (
    <div className="bg-green-400">
      <div className="text-2xl">Todo Input</div>
      <input
        type="text"
        name="title"
        value={todo.title}
        className="m-2 p-2 bg-blue-300"
        onChange={(e) => {
          todo.title = e.target.value
          setTodo({ ...todo })
        }}
      ></input>
      <button
        className="m-1 p-1 bg-purple-700 text-white"
        onClick={() => addTodo(todo)}
      >
        submit
      </button>
    </div>
  );
}

export default T1I;