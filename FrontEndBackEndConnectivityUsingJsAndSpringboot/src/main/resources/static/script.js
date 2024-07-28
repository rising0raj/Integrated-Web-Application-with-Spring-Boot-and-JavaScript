const submit = document.querySelector('#submit');

const callBackendApi = async() => {
	
	let clientName = document.getElementById("name").value;
	let response2 = await fetch("http://localhost:8080/save",{
		method:'POST',
		headers:{
			'Accept':'application/json',
			'Content-Type':'application/json'
		},
		body:JSON.stringify({
			name: clientName
		})
	})
	let response = await fetch("http://localhost:8080/getClients");
	console.log(response2);
	console.log(response);
}
submit.addEventListener('click', callBackendApi);