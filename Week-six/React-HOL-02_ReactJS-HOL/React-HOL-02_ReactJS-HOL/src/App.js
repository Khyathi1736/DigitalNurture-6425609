import React, { useState } from "react";

function App() {
  const [message, setMessage] = useState("Hello from HOL 02");

  return (
    <div>
      <h1>{message}</h1>
      <button onClick={() => setMessage("You clicked the button!")}>
        Click Me
      </button>
    </div>
  );
}

export default App;
