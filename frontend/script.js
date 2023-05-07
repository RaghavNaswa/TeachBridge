function getInitialResponse() {
    const inputValue = document.getElementById("search-input").value;
    console.log(inputValue);
    const name = inputValue
    const url = "http://localhost:5000/get_initial_response";
    const data = { name: name };
    console.log(data);

  axios.post(url, data)
  .then(response => {
    console.log(response.data);
  })
  .catch(error => {
    console.error(error);
  });
  }

  function getKeywords(){
    function getInitialResponse() {
        const inputValue = document.getElementById("search-input").value;
        console.log(inputValue);
        const name = inputValue
        const url = "http://localhost:5000/get_keywords";
        const data = { name: name };
        console.log(data);
    
      axios.post(url, data)
      .then(response => {
        console.log(response.data);
      })
      .catch(error => {
        console.error(error);
      });
      }
  }