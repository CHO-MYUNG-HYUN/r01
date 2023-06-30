const T1L = ({ todos, requestView }) => {
  return (
    <div className="bg-pink-300">
      <div className="text-2xl">
        Todo List
      </div>
      <ul>
        {todos.map(t =>
          <li key={t.tno} onClick={() => requestView(t.tno)}>
            {t.tno} - {t.title}
          </li>
        )}
      </ul>
    </div>
  );
}

export default T1L;