import { useEffect, useState } from "react";

const T1R = ( {current}) => {

  const [todo, setTodo] = useState(current)

  useEffect(() => {
    setTodo(current)
  }, [current])

  if(!todo){

    return <div>is NULL !</div>
  }


  return ( 
    <div>
    <div className="text-2xl">
      Todo Read
    </div>
    {todo.tno}
    <ul>
      
    </ul>
    </div>
   );
}
 
export default T1R;