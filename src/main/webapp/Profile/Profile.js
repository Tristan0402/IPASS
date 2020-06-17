document.getElementById("inloggen").onclick = Inloggen();
function Inloggen() {
    const options = {
        method: 'GET'
    };
    fetch("http://localhost:8080/profile" + document.getElementById("email").value, options)
        .then(function (resp) {
            return resp.json();
        })
        .then(function (data) {
            if (data.password == document.getElementById("password").value){
                document.getElementById("email").hidden
                document.getElementById("password").hidden
                document.getElementById("inloggen").hidden
            }
        })
}