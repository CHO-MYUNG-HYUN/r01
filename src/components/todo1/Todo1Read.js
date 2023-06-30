import { useEffect, useState } from "react";

const Todo1Read = ({ current, remove, modify }) => {

  const [todo, setTodo] = useState(current)

  useEffect(() => {
    setTodo(current)
  }, [current])

  if (!todo) {
    return <div>TODO IS NULL !</div>
  }

  return (
    <div className="w-full bg-pink-200">
      <div>Todo1 Read</div>
      <div>
        {todo.tno}
      </div>
      <div>
        <input
          type="text"
          name="title"
          value={todo.title}
          onChange={(e) => {
            todo.title = e.target.value
            setTodo({ ...todo }) // input박스 내용 바꾸기 위해 필요
          }}
        />
        <div>
          <button className="m-2 p-2 bg-blue-400"
          onClick={() => modify(todo)}
          >MOD</button>
          <button className="m-2 p-2 bg-red-500"
          onClick={() => remove(todo.tno)}
          >DEL</button>
        </div>
      </div>
    </div>
  );
}

export default Todo1Read;