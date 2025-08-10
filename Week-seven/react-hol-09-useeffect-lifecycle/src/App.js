import React, { useState, useEffect } from 'react';

function App() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log('Component mounted or count changed:', count);

    return () => {
      console.log('Cleanup before next useEffect or unmount');
    };
  }, [count]);

  return (
    <div style={{ padding: '20px' }}>
      <h2>useEffect Lifecycle Demo</h2>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

export default App;
