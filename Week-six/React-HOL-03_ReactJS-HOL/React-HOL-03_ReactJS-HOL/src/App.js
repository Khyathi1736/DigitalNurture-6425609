import React from "react";

function App() {
  const items = ["React", "JavaScript", "HTML", "CSS"];

  return (
    <div>
      <h1>Technologies List</h1>
      <ul>
        {items.map((item, index) => (
          <li key={index}>{item}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
