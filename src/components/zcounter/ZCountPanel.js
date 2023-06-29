const ZCountPanel = ({ fn }) => {



  return (
    <div className="bg-red-400 flex p-6">
      <button
        className="m-6 p-2 bg-blue-400"
        onClick={() => { fn(1) }}
      >
        INC
      </button>

      <button
        className="m-6 p-2 bg-blue-400"
        onClick={() => { fn(-1) }}
      >
        DEC
      </button>
    </div>
  );
}

export default ZCountPanel;