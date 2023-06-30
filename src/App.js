import Kiosk3 from "./components/kiosk3";
import Todo1 from "./components/todo1";
import Todo1New from "./components/todo1new";


function App() {

  const obj = {title: 'Title', content:'Content' }

  // console.log(obj.title)
  // console.log(obj['title']) // 동적이다.

  return (
    <div>
      {/* <Todo1></Todo1> */}
      <Todo1New></Todo1New>
    </div>

  );
}

export default App;
