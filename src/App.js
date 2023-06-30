import Kiosk3 from "./components/kiosk3";
import Todo1 from "./components/todo1";


function App() {

  const obj = {title: 'Title', content:'Content' }

  // console.log(obj.title)
  // console.log(obj['title']) // 동적이다.

  return (
    <div>
      <Todo1></Todo1>
    </div>

  );
}

export default App;
