//pagina corrente
let btn = document.getElementById("submit");
btn.addEventListener("click", function(evt){
    evt.preventDefault();
    console.log("bottone cliccato");
    let x = parseInt(document.querySelector("#x").value);
    let y = parseInt(document.querySelector("#y").value);
    let sum = x+y;
    console.log(sum);
    let result = document.querySelector("#result");
    result.innerHTML = `la somma dei due numeri è: ${sum}`;
    //`````
});

let z = {
    nome:"ciccio",
    cognome:"paticcio",
    saluta: function(){
        console.log("ciao da " + this.nome);
    }
};

z.saluta();

function loadData(){
    let xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
        console.log(this.responseText);
    };
    xhttp.open("get", "clients.json", false);
    xhttp.send();
    console.log(xhttp.responseText);
}
//loadData();

async function loadDataFetch(){
    // let pc = fetch("clients.json");
    // let pt = pc.then(function(response){
    //     return response.text();
    // });
    // pt.then(function(t){
    //     console.log(t);
    // });
    
    // fetch("clients.json")
    // .then(r=>r.json())
    // .then(t=>console.log(t));

    let response = await fetch("clients.json");
    let csArray = await response.json();
    console.log(csArray);
}

loadDataFetch();

//bottone su pagina tag button con scritto su carica dati quando si clicca su bottone parte la funzione che scarica i dati clients.json, 
//e inserisce in una tabella sulla pagina con questi dati