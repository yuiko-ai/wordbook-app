import { useState, useEffect } from "react";

function App(){
  // JSの計算や処理
  const [wordlist, setWordList] = useState([]);

useEffect(() => {
    fetch('http://localhost:8080/words')
      .then((response) => response.json()) // 返事をJSON（データ）として受け取る
      .then((data) => {
        // 受け取ったデータを、wordListの箱に入れる
        setWordList(data);
      })
      .catch((error) => {
        console.error("通信失敗:", error);
      });
  }, []);

  // retrunの中に画面に表示したいHTMLを記述
  return(
    <div>
      <h1>見出し</h1>
      
      <ul>
        {wordlist.map((word) =>(
          <li key={wordlist.id}>
            {word.term}:意味:{word.meaning}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;