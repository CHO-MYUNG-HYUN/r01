import Kiosk3 from "./components/kiosk3";
import Todo1 from "./components/todo1";
import Todo1New from "./components/todo1new";
import Todo2 from "./components/todo2";


function App() {

  const obj = {title: 'Title', content:'Content' }

  // console.log(obj.title)
  // console.log(obj['title']) // 동적이다.

  return (
    <div>
      <Todo2></Todo2>
    </div>

  );
}

export default App;
