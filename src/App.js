import Counter from "./components/Counter";
import Counter2 from "./components/Counter2";
import Todo from "./components/todo";
import TodoInput from "./components/todo/TodoInput";
import ZCounter from "./components/zcounter";
import SampleLayout from "./layout/SampleLayout";
import TemplatePage from "./layout/TemplatePage";


function App() {

  const obj = {title: 'Title', content:'Content' }

  // console.log(obj.title)
  // console.log(obj['title']) // 동적이다.

  return (
    <div>
      <Todo/>
    </div>

    // <div>
    //   <TemplatePage>
    //     <div className="text-6xl text-emerald-700">Logo Header</div>
    //     <ZCounter />
    //     <div className="text-6xl text-emerald-700">Logo Footer</div>
    //   </TemplatePage>
    // </div>

    // <div>
    //   <ZCounter/>
    // </div>

    // <div className="App flex">
    //   <Counter></Counter>
    //   <Counter2></Counter2>
    // </div>
  );
}

export default App;
